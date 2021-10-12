package com.webscrapping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Main {

    public static void main (String[] args) throws IOException {

        String url = "https://www.kabum.com.br/produto/85197/ssd-kingston-a400-240gb-sata-leitura-500mb-s-gravacao-350mb-s-sa400s37-240g";
        
        //System.out.println(String.format("conectando ao url: %s",url));
        
        //conectando na url
        Document doc = Jsoup.connect(url).get();

        //buscando as informações desejadas
        Element produto = doc.getElementsByTag("h1").first();
    
        Element valor = doc.getElementsByTag("h4").first();

        Element valorPrazo = doc.getElementsByTag("b").get(3);
        
        Element formato = doc.getElementsByTag("p").get(5);
        
        Element compatibilidade = doc.getElementsByTag("p").get(6);

        Element marca = doc.getElementsByTag("p").get(1);
        


        //imprimindo informações
        System.out.println("- Produto: " + produto.text());
        System.out.println(marca.text());
        System.out.println("- Valor: " + valor.text());
        System.out.println("- Valor a prazo: " + valorPrazo.text());
        System.out.println(formato.text());
        System.out.println(compatibilidade.text());
    }
    
}
