package statically.Queue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import statically.Process;

public class Queue {

    protected Process A[];
    protected int front, rear, size, capacity;

    // constructor for auto queue
    public int Size() {

        return size;

    }

    public Queue() {
        capacity = 5;
        front = 0;
        rear = -1;
        size = 0;
        A = new Process[capacity];
    }

    // constructor for static size queue
    public Queue(int x) {

        front = 0;
        rear = -1;
        size = 0;
        capacity = x;
        A = new Process[x];

    }

    public Process getProcess(int index) {
        return A[index];
    }
    public void setProcess(int index , Process process ) {
        A[index] = process;
    }
    
    public boolean isEmpty() {

        return size == 0;
    }

    public boolean isFull() {

        return (size == capacity - 1) || (rear == capacity - 1);
    }

    // add size for queue , add 5 for size
    private void addSizd() {

        Process[] A2 = new Process[A.length + 15];

        for (int i = 0; i < A.length; i++) {
            A2[i] = A[i];
        }
        A = A2;
        this.capacity = this.capacity + 15;

    }

    // enter the value  
    public void enque(Process pro) {

        if (rear == capacity - 1) {
            rear = 0;
        } else {
            rear++;
        }

        A[rear] = pro;
        size++;

        if (isFull()) {
            addSizd();
        }
    }

    // take the value and delete it
    public Process deque() {

        Process pro;
        try {

            pro = this.A[front];
            this.A[front] = null;
            if (front < capacity) {
                front++;
            } else {
                front = 0;
            }

            size--;

            return pro;
        } catch (Exception e) {
            System.out.println("the rear " + rear + "\n"
                    + "the front" + front + "\n"
                    + "the capacity" + capacity + "\n"
                    + "the size" + size + "  the length" + A.length);
            return null;
        }
    }
// take the value 

    public Process next() {

        return this.A[front];
    }

    public void sort_SmallestToLargest_ArrivalTime() {

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                double temp = 0;
                if (A[j].getArrivalTime() < A[i].getArrivalTime()) {

                    temp = A[i].getArrivalTime();
                    A[i].setArrivalTime(A[j].getArrivalTime());
                    A[j].setArrivalTime(temp);

                }
            }

        }
    }

    

    @Override
    public String toString() {
        return "Queue{" + "A=" + Arrays.toString(A) + ", capacity=" + capacity + '}';
    }

    public String toStringArrivalTime() {
        System.out.print("Queue{" + "A=");
        for (int i = 0; i < size; i++) {
            System.out.print(A[i].toStringArrivalTime() + "\t , ");
        }
        return " }";

    }
    
    public void toStringID() {
        System.out.print("Queue{" + "A=");
        for (int i = 0; i < size; i++) {
            System.out.print(A[i].getID() + "\t , ");
        }
        System.out.println(" }");

    }

    public void toStringBurstTime() {
        System.out.print("Queue{" + "A=");
        for (int i = 0; i < size; i++) {
            System.out.print(A[i].toStringBurstTime() + "\t , ");
        }
        System.out.println(" }");

    }

    public void toStringRemainingProcessingTime() {
        System.out.print("Queue{" + "A=");
        for (int i = 0; i < size; i++) {
            System.out.print(A[i].toStringRemainingProcessingTime() + "\t , ");
        }
        System.out.println(" }");

    }

}



/*

 public void MakeQueue(String Link) {

        try {

            BufferedReader br = new BufferedReader(new FileReader(Link));

            int numL = Integer.parseInt(br.readLine());

            StringTokenizer tok;
            for (int i = 0; i < numL; i++) {
                tok = new StringTokenizer(br.readLine());
                Process p0 = new Process(Integer.parseInt(tok.nextToken()), Integer.parseInt(tok.nextToken()));
                this.enque(p0);

            }

        } catch (Exception ex) {
            System.out.println("Error in MakeQueue");
        }

    }


public double GetArithmaticMean() {
        double mean = 0;
        for (int i = 0; i < size; i++) {
            mean = mean + A[i].getBurstTime();
        }

        return (mean / size);
    }

    public double GetHarmonicMean() {
        double mean = 0;
        for (int i = 0; i < size; i++) {
            mean = mean + (1 / A[i].getBurstTime());
        }

        return (size / mean);
    }

    public double GetMedian() {
        double Median = 0;

        if (size % 2 != 0) {
            Median = A[size / 2].getBurstTime();
        } else {
            Median = (A[size / 2].getBurstTime() + A[(size / 2) + 1].getBurstTime()) / 2;

        }

        return Median;
    }

    public double GetRang() {
        double max = 0;
        double min = 0;

        for (int i = 0; i < size; i++) {
            if (A[i].getBurstTime() > max) {
                max = A[i].getBurstTime();
            }
            if (A[i].getBurstTime() < min) {
                min = A[i].getBurstTime();
            }

        }

        return max - min;
    }

*/





