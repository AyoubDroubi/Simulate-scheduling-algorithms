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
public class WriterFileNoRandomly extends WriterFile{

    private final long count;
    private final String LinkFile;



    public WriterFileNoRandomly(long count , String LinkFile) {
        this.count = count;
        this.LinkFile = LinkFile;

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

                int n = rand.nextInt(10);
                bw.write(" " + n +"\n");

            }
            bw.close();
        } catch (Exception ex) {
            System.out.println("Erorr in : {Writer File No Randomly} ");
        }
    }

}
