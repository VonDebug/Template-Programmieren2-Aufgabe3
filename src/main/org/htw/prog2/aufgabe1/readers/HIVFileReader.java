package org.htw.prog2.aufgabe1.readers;

import org.htw.prog2.aufgabe1.exceptions.FileFormatException;
import org.htw.prog2.aufgabe1.files.HIVFile;

import java.io.IOException;

public interface HIVFileReader {

    HIVFile readFile(String filename) throws IOException, FileFormatException;

    boolean canReadFile(String filename);
}