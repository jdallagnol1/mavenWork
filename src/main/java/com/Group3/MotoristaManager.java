package com.Group3;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;

public class MotoristaManager {
    LinkedList<Motorista> motoristas;

    public MotoristaManager() throws IOException {
        motoristas = new LinkedList<>();

        String path = "C:/Users/joaod/Desktop/mavenGroup3/mavenGroup3/src/main/java/com/Group3/motoristas.dat";

        try (
                Reader reader = Files.newBufferedReader(Paths.get(path));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
            ) {
                for (CSVRecord csvRecord : csvParser) {
                    // Accessing Values by Column Index
                    String cpf = csvRecord.get(0);
                    String name = csvRecord.get(1);
                    
                    
                    motoristas.add(new Motorista(cpf, name));

                    System.out.println("Record No - " + csvRecord.getRecordNumber());
                    System.out.println("---------------");
                    System.out.println("CPF : " + cpf);
                    System.out.println("NOME : " + name);
                    System.out.println("---------------\n\n");
                }
            }
    }

    public Motorista getByCPF(String cpf){
        for(Motorista m:motoristas){
            if (m.getCpf().equalsIgnoreCase(cpf))
                return m;
        }
        return null;
    }

}
