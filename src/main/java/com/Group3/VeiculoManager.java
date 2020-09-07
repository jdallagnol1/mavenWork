package com.Group3;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;


public class VeiculoManager {
    LinkedList<Veiculo> veiculos;

    public VeiculoManager() throws IOException {
        veiculos = new LinkedList<>();
        String path = "C:/Users/joaod/Desktop/mavenGroup3/mavenGroup3/src/main/java/com/Group3/veiculos.dat";

        try (
                Reader reader = Files.newBufferedReader(Paths.get(path));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
            ) {
                for (CSVRecord csvRecord : csvParser) {
                    // Accessing Values by Column Index
                    String plate = csvRecord.get(0);
                    String brand = csvRecord.get(1);
                    String color = csvRecord.get(2);
                    
                    veiculos.add(new Veiculo(plate, brand, color));

                    System.out.println("Record No - " + csvRecord.getRecordNumber());
                    System.out.println("---------------");
                    System.out.println("Placa : " + plate);
                    System.out.println("Marca : " + brand);
                    System.out.println("Cor : " + color);
                    System.out.println("---------------\n\n");
                }
            }

    }

    public Veiculo getCarByPlate(String plate){
        for(Veiculo v:veiculos){
            if (v.getLicensePlate().equalsIgnoreCase(plate))
                return v;
        }
        return null;
    }


}
