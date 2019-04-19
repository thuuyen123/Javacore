/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileUtils;

import java.io.File;


/**
 *
 * @author Thu Uyên
 */
public class FileUtils {
    
    public File[] getFolderByPath(String path){
        File file = new File(path);
        if(file.exists()){
            if(file.isDirectory()){
                //File la 1 thu muc
                File[] listFile = file.listFiles();
                File[] resultArray = new File[listFile.length];
                int indexArray = 0;
                for (File f : listFile) {
                    if(f.isDirectory()){
                        resultArray[indexArray] =f;
                        indexArray++;
                    }
                  
                }
                return resultArray;
            }else{
                //file la file
                return null;
            }
        }else{
            return null;
        }
    }
    public File[] getFileByPath(String path){
        File file = new File(path);
        if(file.exists()){
            if(!file.isDirectory()){
                //File la 1 thu muc
                File[] listFile = file.listFiles();
                File[] resultArray = new File[listFile.length];
                int indexArray = 0;
                for (File f : listFile) {
                    if(!f.isDirectory()){
                        resultArray[indexArray] = f;
                        indexArray++;
                    }
                  
                }
                return resultArray;
            }else{
                //file la file
                return null;
            }
        }else{
            return null;
        }
    }

    public File[] getFileAnhByPath(String path){
        File file = new File(path);
        if(file.exists()){
            if(!file.isDirectory()){
                File[] listFile = file.listFiles();
                File[] resultArray = new File[listFile.length];
                int indexArray = 0;
                for(File f : listFile){
                    if(f.getName().endsWith(".jpg") || f.getName().endsWith("png")||f.getName().endsWith("jpeg")){
                        resultArray[indexArray] = f;
                        indexArray++;
                    }
                }
                return resultArray;
            }else{
                return null;
            }
        }else{
            return null;
        }
    } 
    public File[] getFileExt(String path, String exe){
        File file = new File(path);
        if(file.exists()){
           if(!file.isDirectory()){
               File[] listFile = file.listFiles();
               File[] resultArray = new File[listFile.length];
               int indexArray = 0;
               for(File f : listFile){
                   if(f.getName().endsWith(exe)){
                       resultArray[indexArray] =f;
                       indexArray++;
                   }
               }
               return resultArray;
           }else{
               return null;
           }
        }else{
            return null;
        }
    }
    
}
   
//        public File[] getFile
//    File file = new File("F:\\NetBeans\\");
//    File[] files = file.listFiles();
//    Scanner sc = new Scanner(System.in);
//  
//    public void Folder(){
//       
//        for (File file : files) {
//            if(file.isDirectory()){
//                System.out.println(file.getPath());
//            } 
//         }
//    }
//    public void file(){
//        
//        for (File file : files) {
//            if(!file.isDirectory())
//                System.out.println(file.getPath());
//            }
//        }
//        
//    
//    public void fileAnh(){
//        int dem = 0;
//        for (File file : files) {
//            if(file.getName().endsWith(".jpg") || file.getName().endsWith(".png")|| file.getName().endsWith(".jpeg")){
//                System.out.println(file.getPath());
//                dem++;
//            }
//            
//        }
//        if(dem == 0 ) System.out.println("Khong  co file nay");
//    }
//    public void fileMR(String path){
//        int dem = 0;
//        System.out.println("Nhap duoi file mo rong");
//        String  exe = sc.nextLine();
////        System.out.println("Nhap path:");
////        String path = sc.nextLine();
//        File filess = new File(path);
//        File[] filel = filess.listFiles();
//        for (File f : filel) {
//            if(f.getName().endsWith(exe)){
//                System.out.println(f.getPath());
//                dem++;
//            }
//        }
//        if(dem == 0 ) System.out.println("Khong  co file nay");
//    }
//    public void Time(String path){
////        System.out.println("Nhap path:");
////        String path = sc.nextLine();
//        File filess = new File(path);
//        File[] filel = filess.listFiles();
//        if(filess.exists()){
//            for (File file : filel) {
//            System.out.println(file.lastModified());
//            }
//        }
//        else {
//            System.out.println("File khong ton tai");
//            System.out.println(filess.mkdir());
//            try {
//                System.out.println(filess.createNewFile());
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
//    public void Size(){
//        for (File file : files) {
//            System.out.println(file.getPath());
//            System.out.println(file.length());
//        }
//    }
 
    

