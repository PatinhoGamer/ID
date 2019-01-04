package trabalho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ThreadContratos extends Thread {

    private String link;
    private String num;
    private String nomeMunicipio;
    private ArrayList<Contrato> contratos;

    public ThreadContratos(String link, String num,String nomeMunicipio) {

        this.link = link;
        this.num = num;
        this.nomeMunicipio = nomeMunicipio;
        contratos = new ArrayList<>();
    }

    @Override
    public void run() {
        super.run();
        String siteString = null;
        while (siteString == null) {
            siteString = Util.httpRequestToString(link + num, "UTF-8");
        }

        Pattern pat = Pattern.compile("class=\"plusSign\".*href=\".*=(\\d+)\" t");
        Matcher mat = pat.matcher(siteString);

        if (mat.find()) {
            String[] superLink = {"http://www.base.gov.pt/Base/pt/ResultadosPesquisa?range=", "&type=contratos&query=adjudicanteid%3D" + mat.group(1) + "&ordering=sort%28-publicationDate%29"};
            
            ThreadGetContratos thread;
            ArrayList<ThreadGetContratos> threads = new ArrayList<>();
            for (int last = 0, i = 1200, counter = 1; true; last = ++i, i += 1199, counter++) {
                // este loop serve para entrar na lista dos contratos 
                //a partir do numero que recolhi da pagina que tem o Mais depois da procura
                try {
                    thread = new ThreadGetContratos(superLink[0] + last + '-' + i + superLink[1]);
                    thread.start();
                    threads.add(thread);

                    if ((counter % 2) == 0) {
                        thread.join();
                        if (thread.NothingMore()) {
                            break;
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            for (int i = 0; i < threads.size(); i++) {
                try {
                    thread = threads.get(i);
                    thread.join();
                    ArrayList<Contrato> contratosThread = thread.getContratos();

                    contratos.addAll(contratosThread);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public ArrayList<Contrato> getContratos() {
        return contratos;
    }

    public class ThreadGetContratos extends Thread {

        private String link;
        private ArrayList<Contrato> contratos;
        private boolean found = false;

        public ThreadGetContratos(String link) {
            this.link = link;
            contratos = new ArrayList<>();
        }

        public void run() {
            super.run();
            String siteString = null;
            while (siteString == null) {
                siteString = Util.httpRequestToString(link, "UTF-8");
            }
            Pattern pattern = Pattern.compile("<tr>\\r\\n.*<td title=\"(?<objetoContrato>.*)\">.*<\\/td>\\r\\n.*<td.*>(?<preco>.*) €<\\/td>\\r\\n.*<td.*>(?<publicacao>\\d{2}-\\d{2}-\\d{4})<\\/td>\\r\\n.*\\r\\n.*<td>(?<adjudicatario>.*)<\\/td>", Pattern.MULTILINE);
            Matcher matcher = pattern.matcher(siteString);

            while (matcher.find()) {
                found = true;

                HashMap<String, String> hashMap = new HashMap<>(25);

                for (String elemento : Contratos.strings) {

                    hashMap.put(elemento, matcher.group(elemento));
                }

                Contrato contrato = new Contrato(hashMap);
                this.contratos.add(contrato);
            }
        }

        public ArrayList<Contrato> getContratos() {
            return this.contratos;
        }

        public boolean NothingMore() {
            return !found;
        }
    }

}
