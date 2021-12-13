package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        String path = "/Users/matiur/develop/aint/project8A/src/SampleTextFile.txt";
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(path);
        }catch(Exception ex1){
            System.out.println("File is not found on given path");
        }
        try{
            br = new BufferedReader(fr);
            String text = "";
            while((text = br.readLine())!=null){
                System.out.println(text);
            }
        }catch (Exception ex2){
            System.out.println("File is not readable, probably the text/data is corrupted");
        }
        finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
