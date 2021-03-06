<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
   <xsl:output method="html" indent="yes" />
   <xsl:template match="/">
      <html>

      <head>
         <title>Brasões</title>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous" />

      </head>


      <body>
         <br />
         <br />
         <h2 class="text-primary text-center">Brasões dos Municípios</h2>

         <br />
         <br />
         <div class="table">
            <xsl:apply-templates select="municipios/municipio"/>
         </div>
      </body>

      </html>
   </xsl:template>


   <xsl:template match="municipios/municipio">
      <div style="display:inline">
         <img src="{brasao}" title="{nome}" class="m-4 img-thumbnail" />
      </div>
   </xsl:template>

</xsl:stylesheet>
