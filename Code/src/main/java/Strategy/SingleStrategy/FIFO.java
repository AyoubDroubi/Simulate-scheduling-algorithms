/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy.SingleStrategy;

import statically.Process;
import statically.Queue.Queue;

/**
 *
 * @author Ayyoub
 */
public class FIFO extends Strategy {

    private double averageTurnaroundTime = 0;
    private double averageWaitingTime = 0;
    private double averageResponseTime = 0;
    private double time = 0;
    private double nonWorkTime = 0;

    private final double length;

    private Queue queue = new Queue();
    private Queue test = new Queue();

    public FIFO(Queue QP) {
        this.queue = QP;
        this.test = QP;
        this.length = QP.Size();
    }

    public void Processing() {
        queue.sort_SmallestToLargest_ArrivalTime();
        Process pro = this.test.deque();

        while (pro != null) {

            if (pro.getArrivalTime() <= time) {
                if (!pro.ProcessingStatus()) {
                    pro.setProcessingStatus(true);
                    averageResponseTime = averageResponseTime + (time - pro.getArrivalTime());
                }

                time = time + pro.getRemainingProcessingTime();

                averageWaitingTime = averageWaitingTime + ((time - pro.getBurstTime()) - pro.getArrivalTime());
                averageTurnaroundTime = averageTurnaroundTime + (time - pro.getArrivalTime());

                pro = this.test.deque();
            } else {
                time++;
                nonWorkTime++;
            }

        }
        averageWaitingTime = averageWaitingTime / length;
        averageTurnaroundTime = averageTurnaroundTime / length;
        averageResponseTime = averageResponseTime / length;
    }

    @Override
    public String toString() {
        return "RR_1{" + "averageTurnaroundTime=" + averageTurnaroundTime + ", averageWaitingTime=" + averageWaitingTime + ", averageResponseTime=" + averageResponseTime + ", time=" + time + ", nonWorkTime=" + nonWorkTime + '}';
    }

    public String toStringString() {
        return averageTurnaroundTime + " " + averageWaitingTime + " " + averageResponseTime + " " + time + " " + nonWorkTime;
    }
}