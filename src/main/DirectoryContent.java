package main;

import java.io.File;
import java.util.Arrays;

public class DirectoryContent {

    public static void main(String[] args) throws Exception {
        if(args.length < 1)
            throw new Exception("Specificare la directory path.");

        final String dirPath = args[0];

        System.out.println("Directory: " + dirPath);

        File dir = new File(dirPath);

        if(!dir.isDirectory())
            throw new Exception("Non è una cartella.");

        File[] content = dir.listFiles();

        System.out.println();

        if(content == null)
            System.out.println("Cartella vuota.");
        else
            for(File f : content) {
                System.out.println("- " + f.getAbsolutePath());
            }
    }

}
