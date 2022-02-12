package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;
import java.util.ArrayList;

public class Parser {

    public static String parse(String list) throws IOException {                //html cody pahum a stringi mej
        String HTML;
            Document document = Jsoup.connect(String.valueOf(list)).get();
      //System.out.println(document.toString());
    HTML = document.toString();
    return  HTML;
    }

/*public static void getTextFromHtml(String list) throws IOException {

        String newList = parse(list);
Document document = Jsoup.parse(String.valueOf(newList));
    Element link = document.select("a").first();
    System.out.println("Text: " + ((Element) link).text());

}*/
/*Document document = Jsoup.parse(html);
Element link = document.select("a").first();
System.out.println("Text: " + link.text());
*/




        /*
public static void ParseTitlesAndLinks(String list) throws IOException {

    Document document = Jsoup.connect(String.valueOf("https://4pda.to/")).get();
    Elements titleElements = document.getElementsByAttributeValue("itemprop","url");
    titleElements.forEach(titleElement -> System.out.println(titleElement.attr("title")+"|" +titleElement.attr("href")));

    }*/



}

/*
    public static void parse(ArrayList<String>list) throws IOException {
        for(String ur : list) {

            Document document = Jsoup.connect(ur).get();
        }
    }*/