package AulasJava.AulasJava.JavaCore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
//            boolean isDeleted = file.delete();

            boolean isCreated = file.createNewFile();
            System.out.println("Created: " +isCreated);
            System.out.println("Path: "+file.getPath());
            System.out.println("Path Absolute : "+file.getAbsolutePath());
            System.out.println("Is Diretory: "+file.isDirectory());
            System.out.println("Is File: "+file.isFile());
            System.out.println("Last modified: "+new Date(file.lastModified()));


            boolean exists = file.exists();
            if (exists){
                System.out.println("Deleted: " +file.delete());
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
