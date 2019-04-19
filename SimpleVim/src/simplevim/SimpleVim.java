/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplevim;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;



/**
 *
 * @author Thu Uyên
 */
public class SimpleVim {
    private String path;

    public String getPatth() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    Scanner sc = new Scanner(System.in);
    File f = new File(path);
    public void initContent() throws IOException{
        if(f.exists()){
            System.out.println(f.getPath());
        }
        else{
            f.createNewFile();
        }
    }
    
    
    
}
