/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File.WriterFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

/**
 *
 * @author Ayyoub
 */
public class WriterFileFullRandomly extends WriterFile{

    private final long count;
    private final String LinkFile;
    private final int randomBurtTime ;
    private final int randomArivalTime ;

    public WriterFileFullRandomly(long count, int randomBurtTime , int randomArivalTime , String LinkFile) {
        this.count = count;
        this.LinkFile = LinkFile;
        this.randomBurtTime = randomBurtTime;
        this.randomArivalTime = randomArivalTime;
        
       
    }
    
    
    
    @Override
    public void criteFile(){
    
        try {
        // =========================   make value============================================================   
            BufferedWriter bw = new BufferedWriter(new FileWriter(LinkFile));

            Random rand = new Random();
            
            bw.write(count + "\n");
            for (int i = 0; i < count; i++) {

                int n = rand.nextInt(randomArivalTime);
                bw.write(n + "");

                n = rand.nextInt(randomBurtTime);
                bw.write(" " + n +"\n");

            }
            bw.close();
        } catch (Exception ex) {
            System.out.println("Erorr in : {Writer File Full Randomly} ");
        }
    }

}