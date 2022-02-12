package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
       // new  Crawler().getPageLinks("https://tun.am/am/",0);
        Set<String>set = new Crawler().findLinks("https://rau.am/");

        for(String el: set){
            System.out.println(el);
        }



     //  System.out.println(new Parser().parse("https://tun.am/am/"));

      //new Parser().getTextFromHtml("https://tun.am/am/");


    }
}
