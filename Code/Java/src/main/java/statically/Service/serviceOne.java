/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statically.Service;

import statically.Queue.Queue;
import statically.Queue.sort_SmallestToLargest_BurstTime;

/**
 *
 * @author Ayyoub
 */
public class serviceOne extends service {

    // 1/3      1/3     1/3
    Queue queue;
    int size_3;

    public serviceOne(Queue q) {

        queue = q;
        int size_3 = queue.Size() / 3;
        sort_SmallestToLargest_BurstTime stlbt = new sort_SmallestToLargest_BurstTime(queue);
    }

    @Override
    public Queue getFirst() {

        Queue test = new Queue();

        for (int i = 0; i < size_3; i++) {
            test.enque(queue.deque());
        }
        test.sort_SmallestToLargest_ArrivalTime();
        return test;

    }

    @Override
    public Queue getSecond() {

        Queue test = new Queue();

        for (int i = 0; i < size_3; i++) {
            test.enque(queue.deque());
        }
        test.sort_SmallestToLargest_ArrivalTime();
        return test;
    }

    @Override
    public Queue getThird() {

        Queue test = new Queue();

        for (int i = 0; i < size_3 + (queue.Size() % 3); i++) {
            test.enque(queue.deque());
        }
        test.sort_SmallestToLargest_ArrivalTime();
        return test;
    }

}