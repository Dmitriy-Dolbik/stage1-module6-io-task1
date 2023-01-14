package com.epam.mjc.io;

public class ReadingFileException extends Exception
{
    public ReadingFileException(String message, Throwable exc){
        super(message, exc);
    }
}
