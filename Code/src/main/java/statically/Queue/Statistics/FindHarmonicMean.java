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
public class FindHarmonicMean{

    double AMean;
    public FindHarmonicMean(Queue queue) {
        if (queue.isEmpty()) {
            System.out.println(" the Queue is empty");
        }
        else
        Calc(queue);
    }
    
    private void Calc(Queue queue){
       
        
        statically.Process pro;
        for (int i = 0; i < queue.Size(); i++) {
            pro = queue.deque();
            AMean = 1/AMean + pro.getBurstTime();
        }
        AMean = AMean/queue.Size();
    }
    
    private double getHarmonicMean(){
        
        return AMean;
    }
}