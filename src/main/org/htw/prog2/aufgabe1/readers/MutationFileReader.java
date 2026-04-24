package org.htw.prog2.aufgabe1.readers;

import org.htw.prog2.aufgabe1.exceptions.FileFormatException;
import org.htw.prog2.aufgabe1.files.HIVFile;
import org.htw.prog2.aufgabe1.files.MutationFile;

import java.io.IOException;

public interface MutationFileReader extends HIVFileReader{

    @Override
    MutationFile readFile(String filename) throws IOException, FileFormatException;
}
