package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
       // new Crawler().getPageLinks("https://rau.am/",0);

      //  new Parser().parse("https://rau.am/");

new Parser().getTextFromHtml("https://rau.am/");



    }
}
