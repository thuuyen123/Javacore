/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author pc
 */
public class Main {
    
    public void read() throws FileNotFoundException, IOException {
        String path = "/Users/pc/java-core/index.html";
        File f = new File(path);
        
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(f)));
        
//        BufferedReader reader1 = new BufferedReader(
//                new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//        double parseDouble = Double.parseDouble(reader.readLine());


        String line = reader.readLine();
        do {
            System.out.println(line);    
            line = reader.readLine();
        } while (line != null);
    }
    
    public void writeObject() throws FileNotFoundException, IOException {
//        Student s = new Student("hoang", 22);
//        String path = "/Users/pc/java-core/save.dat";
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
//        oos.writeObject(s);
//        oos.flush();
//        oos.close();
    }
    
    public void readObject() throws FileNotFoundException, IOException, ClassNotFoundException {
//        String path = "/Users/pc/java-core/save.dat";
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
////        Student stud = (Student) ois.readObject();
//        System.out.println(stud.toString());
//        ois.close();
    }
    
    public void write() throws FileNotFoundException {
        String path = "/Users/pc/java-core/demo.mp3";
        PrintWriter writer = new PrintWriter(path);
        writer.println(123);
        writer.println(123.54);
        writer.printf("%d + %d = %d", 1,1,2);
        writer.println("<a href='google.com'>Click here</a>");
        writer.println("</html>");
        
        writer.flush();
        writer.close();
    }
    
    public void readText() throws FileNotFoundException, IOException {
        String path = "/Users/pc/java-core/index.html";
        File f = new File(path);
        if (f.exists()) {
            FileInputStream fis = new FileInputStream(f);
            int size = fis.available();
            for (int i = 0; i < size; i++) {
                System.out.print((char) fis.read());
            }
            fis.close();
        } else {
            System.out.println("Khong ton tai");
        }
    }
}