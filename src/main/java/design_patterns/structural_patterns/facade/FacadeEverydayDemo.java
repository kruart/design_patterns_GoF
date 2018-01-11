package design_patterns.structural_patterns.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeEverydayDemo {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http", "www.football.ua", 80, "/newsarc/");

        BufferedReader buffer = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;

        while ((inputLine = buffer.readLine())  != null) {
            System.out.println(inputLine);
        }
    }
}
