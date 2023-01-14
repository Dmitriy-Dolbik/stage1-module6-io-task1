package com.epam.mjc.io;

import java.io.FileNotFoundException;

public class ReadingFileException extends Exception
{
    public ReadingFileException(String message, Throwable exc){
        super(message, exc);
    }
}
