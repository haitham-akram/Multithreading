/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Haitham
 */
public class Read1 extends Thread{
   private int sleep;
    
    @Override
    public void run() {
      
        try {
           File file1 = new File("file1.txt");
            boolean create1 = file1.createNewFile();
             Scanner input1 = new Scanner(file1);
             while(input1.hasNext()){
              System.out.println(input1.nextLine());
              Thread.sleep(sleep);
             }
             input1.close();

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        } 
    }
     
      
    
    public Read1(int sleep) {
        super();
        this.sleep = sleep;
    }
}
