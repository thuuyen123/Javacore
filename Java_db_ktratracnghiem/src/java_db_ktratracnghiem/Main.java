/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_db_ktratracnghiem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author Thu Uyên
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("    QUIZ ONLINE      ");
            System.out.println("---------------------");
            System.out.print("Enter email: ");
            String email = sc.nextLine();
            System.out.print("Enter pass: ");
            String pass = sc.nextLine();
            StudentManager stm = new StudentManager();
            Student s = stm.login(email, pass);
            if(s != null){
                System.out.println("LOGIN SUCCESS! PRESS ANY KEY TO START QUIZ");
                sc.nextLine();
                System.out.println("------------------------");
                QuestionManager qm = new QuestionManager();
                List<Questions> questions = qm.getQuestions();
                int countCorr = 0;
                int index = 1;
                for (Questions q : questions) {
                    System.out.printf("Question %d/%d", index++, questions.size());
                    System.out.println("");
                    System.out.println(q);
                    System.out.print("Your Answer > ");
                    String answer = sc.nextLine();
                    stm.addAnswer(s, q, answer);
                    if(answer.toLowerCase().equals(q.getCorrect().toLowerCase())){
                        countCorr++;
                    }
                }
                System.out.println("Congratulation! ");
                System.out.printf("Your result: %d/%d", countCorr, questions.size());
                System.out.println("See Detail(Y/N)");
                stm.printResult();
            }else{
                System.out.println("LOGIN FAIL");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
