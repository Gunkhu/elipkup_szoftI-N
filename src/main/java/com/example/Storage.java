package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Storage {
    public void writeFile(String line){
        try {
            tryWriteFile(line);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    private void tryWriteFile(String line)throws IOException{
        FileWriter fw = new FileWriter("data.txt",true);
        fw.write(line);
        fw.close();
    }
}
