package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReader {
    public static void main(String[] args)
    {
        File file = new File("G:\\My Drive\\IT\\Epam\\MJC School\\stage1-module6-io-task1\\src\\main\\resources\\Profile.txt");
        System.out.println(new FileReader().getDataFromFile(file));
    }

    public Profile getDataFromFile(File file) {
        String str = null;
        try (FileInputStream fileInputStream = new FileInputStream(file)){
            int ch;
            while ((ch = fileInputStream.read()) != -1){
                str = str + (char)ch;
            }
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        str = str.replace("null","");
        String[] keyValuePairs = str.split("\r\n");

        for (int i = 0; i < keyValuePairs.length; i++)
        {
            keyValuePairs[i] = keyValuePairs[i].split(": ")[1];
        }
        String name = keyValuePairs[0];
        int age = Integer.parseInt(keyValuePairs[1]);
        String email = keyValuePairs[2];
        Long phone = Long.parseLong(keyValuePairs[3]);

        return new Profile(name, age, email, phone);
    }
}
