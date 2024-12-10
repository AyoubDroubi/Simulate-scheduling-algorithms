/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statically.Queue;

/**
 *
 * @author Ayyoub
 */
public class sort_SmallestToLargest_BurstTime {

    public sort_SmallestToLargest_BurstTime(Queue q) {

        sort(q);
    }

    public void sort(Queue queue) {

        for (int i = 0; i < queue.Size(); i++) {

            for (int j = i + 1; j < queue.Size(); j++) {

                statically.Process temp = null;
                if (queue.getProcess(j).getBurstTime()< queue.getProcess(i).getBurstTime()) {

                    temp = queue.getProcess(i);
                    queue.setProcess(i, queue.getProcess(j));
                    queue.setProcess(j, temp);
                    

                }
            }

        }
    }
}