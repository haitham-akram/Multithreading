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
public class Read2 extends Thread{
  private int sleep;
  
  
    @Override
    public void run() {
        synchronized("file2.txt") {try {
          File file2 = new File("file2.txt");   
            boolean create2 = file2.createNewFile();
             Scanner input2 = new Scanner(file2);
             while(input2.hasNext()){
              System.out.println(input2.nextLine());
              Thread.sleep(sleep);
             }
             input2.close();

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        } 
        }
       
}
    
      public Read2(int sleep) {
        super();
        this.sleep = sleep;
    }
}

