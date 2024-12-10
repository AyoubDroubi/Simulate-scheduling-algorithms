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
public class WriterFileHalfRandomly extends WriterFile{

    private final long count;
    private final String LinkFile;
    private final int randomBurtTime ;


    public WriterFileHalfRandomly(long count, int randomBurtTime , String LinkFile) {
        this.count = count;
        this.LinkFile = LinkFile;
        this.randomBurtTime = randomBurtTime;
    }
    
    
    
    @Override
    public void criteFile(){
    
        try {
        // =========================   make value============================================================   
            BufferedWriter bw = new BufferedWriter(new FileWriter(LinkFile));

            Random rand = new Random();
            
            bw.write(count + "\n");
            for (int i = 0; i < count; i++) {

                
                bw.write(0 + "");

                int n = rand.nextInt(randomBurtTime);
                bw.write(" " + n +"\n");

            }
            bw.close();
        } catch (Exception ex) {
            System.out.println("Erorr in : {Writer File Half Randomly} ");
        }
    }

}