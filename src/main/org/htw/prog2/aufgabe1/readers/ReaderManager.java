package org.htw.prog2.aufgabe1.readers;

import org.htw.prog2.aufgabe1.exceptions.NoValidReadersException;

public class ReaderManager <T extends HIVFileReader> {

    public void addReader(T reader){

    }

    public T getReaderForFile(String filename)throws NoValidReadersException{

        return null;
    };

}

