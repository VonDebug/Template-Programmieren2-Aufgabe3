package org.htw.prog2.aufgabe1.readers;

import org.htw.prog2.aufgabe1.exceptions.FileFormatException;
import org.htw.prog2.aufgabe1.files.MutationFile;

import java.io.IOException;

public class CSVFileReader implements MutationFileReader{
    @Override
    public MutationFile readFile(String filename) throws IOException, FileFormatException {
        return null;
    }

    @Override
    public boolean canReadFile(String filename) {
        return false;
    }
}
