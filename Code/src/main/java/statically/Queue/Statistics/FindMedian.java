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
public class FindMedian{

    double median;
    public FindMedian(Queue queue) {
        if (queue.isEmpty()) {
            System.out.println(" the Queue is empty");
        }
        else
        Calc(queue);
    }
    
    private void Calc(Queue queue){
        
        if (queue.Size() % 2 != 0) {
            median = queue.getProcess(queue.Size()/2).getBurstTime();
        } else {
            median = (queue.getProcess(queue.Size()/2).getBurstTime() + queue.getProcess((queue.Size()/2)+1).getBurstTime())/2;

        }
    }
    
    public double getMedian(){
        
        return median;
    }
}