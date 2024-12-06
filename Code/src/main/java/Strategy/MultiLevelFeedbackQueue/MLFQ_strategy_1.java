/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy.MultiLevelFeedbackQueue;

import statically.Queue.Queue;
import statically.Service.serviceOne;
import statically.Queue.Statistics.FindMedian;

/**
 *
 * @author Ayyoub
 */
public class MLFQ_strategy_1 extends MultiLevelFeedbackQueue {
    //  1/3   1/3   1/3

    private double averageTurnaroundTime = 0;
    private double averageWaitingTime = 0;
    private double averageResponseTime = 0;
    private double time = 0;
    private double nonWorkTime = 0;

    private final double length;

    private Queue queue1 = new Queue();
    
    private Queue queue2 = new Queue(); 
    private double Quantum2  ;
    
    private Queue queue3 = new Queue();
    private double Quantum3 ;

    public MLFQ_strategy_1(Queue queue) {
        length = queue.Size();
        serviceOne SOne = new serviceOne(queue);
        queue1 = SOne.getFirst();
        queue2 = SOne.getSecond();
        queue3 = SOne.getThird();
        
        
        setQuantum();   // to set the Quantome value
    }

    private void setQuantum() {
    
        
        FindMedian FMedian = new FindMedian(queue2);
        Quantum2 = FMedian.getMedian();

        FMedian  = new FindMedian(queue3);
        Quantum3 = FMedian.getMedian();
        
        FMedian = null;
}
@Override
protected void Processing() {

        statically.Process pro;
        while (!queue1.isEmpty() && !queue1.isEmpty() && !queue1.isEmpty()) {

            if (queue1.next().getArrivalTime() <= time) {

                pro = queue1.deque();

                if (pro.getArrivalTime() <= time) {
                    if (!pro.ProcessingStatus()) {
                        pro.setProcessingStatus(true);
                        averageResponseTime = averageResponseTime + (time - pro.getArrivalTime());
                    }

                    time = time + pro.getRemainingProcessingTime();

                    averageWaitingTime = averageWaitingTime + ((time - pro.getBurstTime()) - pro.getArrivalTime());
                    averageTurnaroundTime = averageTurnaroundTime + (time - pro.getArrivalTime());

                } else {
                    time++;
                    nonWorkTime++;
                }

            } else if ((queue2.next().getArrivalTime() <= time)) {
                pro = queue2.deque();
                if (!pro.ProcessingStatus()) {
                    pro.setProcessingStatus(true);
                    averageResponseTime = averageResponseTime + (time - pro.getArrivalTime());
                }
                if (pro.getRemainingProcessingTime() > Quantum2) {

                    time = time + Quantum2;
                    pro.setRemainingProcessingTime(pro.getRemainingProcessingTime() - Quantum2);
                    queue2.enque(pro);

                } else if (pro.getRemainingProcessingTime() == Quantum2) {
                    time = time + Quantum2;

                    averageWaitingTime = averageWaitingTime + ((time - pro.getBurstTime()) - pro.getArrivalTime());
                    averageTurnaroundTime = averageTurnaroundTime + (time - pro.getArrivalTime());
                } else if (pro.getRemainingProcessingTime() < Quantum2) {
                    time = time + pro.getRemainingProcessingTime();

                    averageWaitingTime = averageWaitingTime + ((time - pro.getBurstTime()) - pro.getArrivalTime());
                    averageTurnaroundTime = averageTurnaroundTime + (time - pro.getArrivalTime());
                }
            } else if ((queue3.next().getArrivalTime() <= time)) {

                pro = queue3.deque();
                if (!pro.ProcessingStatus()) {
                    pro.setProcessingStatus(true);
                    averageResponseTime = averageResponseTime + (time - pro.getArrivalTime());
                }
                if (pro.getRemainingProcessingTime() > Quantum3) {

                    time = time + Quantum3;
                    pro.setRemainingProcessingTime(pro.getRemainingProcessingTime() - Quantum2);
                    queue2.enque(pro);

                } else if (pro.getRemainingProcessingTime() == Quantum3) {
                    time = time + Quantum3;

                    averageWaitingTime = averageWaitingTime + ((time - pro.getBurstTime()) - pro.getArrivalTime());
                    averageTurnaroundTime = averageTurnaroundTime + (time - pro.getArrivalTime());
                } else if (pro.getRemainingProcessingTime() < Quantum2) {
                    time = time + pro.getRemainingProcessingTime();

                    averageWaitingTime = averageWaitingTime + ((time - pro.getBurstTime()) - pro.getArrivalTime());
                    averageTurnaroundTime = averageTurnaroundTime + (time - pro.getArrivalTime());
                }

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
        return "";
    }

    @Override
public String toStringString() {
        return "";
    }
    
}
