/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.HashMap;
import org.jdom2.Element;

/**
 *
 * @author Rodrigo
 */
public class Contrato {

    private static Integer counter = 0;

    Element MainElement;

    public Contrato(HashMap<String, String> hashMap,String codMunicipio,String nomeMunicipio) {
        
        MainElement = new Element("contrato");
        MainElement.setAttribute("id", getId());
        MainElement.setAttribute("codMunicipio", codMunicipio);
        MainElement.setAttribute("nomeMunicipio", nomeMunicipio);
        

        for (int i = 0; i < Contratos.strings.length; i++) {

            String str = Contratos.strings[i];
            Element temp = new Element(str);
            temp.setText(hashMap.get(str).toString());
            MainElement.addContent(temp);
        }
    }

    public Element getElement() {
        return MainElement;
    }

    private synchronized String getId() {
        return (++counter).toString();
    }
}