/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author Haitham
 */
public class Multithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Read1 read1 = new Read1(1);
        read1.setPriority(Thread.NORM_PRIORITY);
        Read2 read2 = new Read2(1);
        read2.setPriority(Thread.NORM_PRIORITY);
        read1.start();
        read2.start();
    }

}
