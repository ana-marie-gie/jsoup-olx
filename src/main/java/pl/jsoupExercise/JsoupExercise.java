package pl.jsoupExercise;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupExercise {
    public static void main(String[] args) throws IOException {
        String pageUrl = "https://www.olx.pl/dom-ogrod/meble/kujawsko-pomorskie/q-meble/";
        Document page = Jsoup
                .connect(pageUrl)
                .followRedirects(true)
                .get();

        Elements titles = page.select("#offers_table td.title-cell strong");

        for (Element title : titles) {
            System.out.println(title.text());
        }
    }

}
