/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statically;

import statically.Queue.Queue;
import File.ReaderFile.ReaderFile;
import File.WriterFile.WriterFile;
import File.WriterFile.WriterFileFullRandomly;
import statically.Queue.sort_SmallestToLargest_ArrivalTime;
/**
 *
 * @author Ayyoub
 */
public class test__________________ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        Queue queue = new Queue();
        String FileLink = "C:\\Users\\Ayyoub\\Desktop\\test\\test1----\\queue.txt";
        
        //WriterFile WF = new WriterFileFullRandomly(50, 20, 20, FileLink); 
        //WF.criteFile();
        
        ReaderFile  RF = new ReaderFile(queue, FileLink);
        RF.generateQueue();
        
        
        queue.toStringArrivalTime();
        
        sort_SmallestToLargest_ArrivalTime sort = new sort_SmallestToLargest_ArrivalTime(queue);
        System.out.println("");
        queue.toStringArrivalTime();
    }
    
}
