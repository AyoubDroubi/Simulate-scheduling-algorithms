/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statically.Queue;

import statically.Process;

/**
 *
 * @author Ayyoub
 */
public class sort_SmallestToLargest_ArrivalTime {

    public sort_SmallestToLargest_ArrivalTime(Queue queue) {
        
        sort(queue);
    }

    
    
    public void sort(Queue queue) {

        for (int i = 0; i < queue.Size(); i++) {

            for (int j = i + 1; j < queue.Size(); j++) {

                Process temp = null;
                if (queue.getProcess(j).getArrivalTime() < queue.getProcess(i).getArrivalTime()) {

                    temp = queue.getProcess(i);
                    queue.setProcess(i, queue.getProcess(j));
                    queue.setProcess(j, temp);
                    

                }
            }

        }
    }
}
