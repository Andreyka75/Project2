package FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    public static void main(String[] args) {

        String file = "LegionFile.txt";

        FileManager fileManager = new FileManager();
        fileManager.createFile(file);
        fileManager.writeToFile(file, "Andrey vorobey,\n" + "ne gonjay golubey");
        fileManager.readFromFile(file);
        fileManager.deleteFile(file);


    }

    public void createFile(String fileName) {

        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void writeToFile(String fileName, String text) {


        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readFromFile(String fileName) {

        File file = new File(fileName);

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                System.out.println(row);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public void deleteFile(String fileName) {

        File file = new File(fileName);
        if(file.exists()){
            file.delete();
        }


    }
}
