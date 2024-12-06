/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statically.Queue.Statistics;

import statically.Queue.Queue;

/**
 *
 * @author Ayyoub
 */
public class FindRange{

    double rang;
    public FindRange(Queue queue) {
        if (queue.isEmpty()) {
            System.out.println(" the Queue is empty");
        }
        else
        Calc(queue);
    }
    
    private void Calc(Queue queue){
        double max = -999999999;
        double min = 999999999;
        for (int i = 0; i < queue.Size(); i++) {
            
            if (queue.getProcess(i).getBurstTime() < min) {
                min = queue.getProcess(i).getBurstTime();
            }
            if (queue.getProcess(i).getBurstTime() > max) {
                max = queue.getProcess(i).getBurstTime();
            }
        }
        
        rang = (max - min);
    }
    
    public double getRange(){
        
        return rang;
    }
}