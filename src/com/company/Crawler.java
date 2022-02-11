package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;

public class Crawler {

private static final int Max_Depth = 2;

private HashSet<String> links;

public Crawler(){
    links = new HashSet<>();
}

public void getPageLinks(String URL,int Depth){                  //URL i meji sax linkery talis a
    if((!links.contains(URL) && (Depth < Max_Depth))){
        System.out.println(">>Depth:: " + Depth +"["+ URL +"]");

        try {
            links.add(URL);

            Document document = Jsoup.connect(URL).get();
            Elements linksOnPage = document.select("a[href]");

            Depth++;
            for (Element page : linksOnPage) {
                getPageLinks(page.attr("abs:href"), Depth);
            }
        } catch (IOException e) {
            System.err.println("For '" + URL + "': " + e.getMessage());
        }


    }
}




}
