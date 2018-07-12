package main;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* Esercizio: scaricare la homepage di Google e visualizzare il numero di byte. */

public class GoogleHomepage {

    public static void main(String[] args) {
        try {
            final URL url = new URL("https://www.google.com/");
            final InputStream is = url.openStream();
            final BufferedInputStream bis = new BufferedInputStream(is);
            int byteCounter = 0;

            while(bis.read() != -1) {
                ++byteCounter;
            }

            System.out.println("Google Homepage Size: " + byteCounter + " bytes");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
