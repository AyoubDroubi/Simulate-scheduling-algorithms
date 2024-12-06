/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statically;

/**
 *
 * @author Ayyoub
 */
public  class Process {
    
    private double ArrivalTime;
    private double BurstTime;
    private double remainingProcessingTime ;
    private final int ID;
    private static int numberOfObject = 0;
    
    private boolean statusOfProcessing ;
    

    public Process(int ArrivalTime, int BurstTime) {
        this.ArrivalTime = ArrivalTime;
        this.BurstTime = BurstTime;
        this.remainingProcessingTime = BurstTime; 
        this.ID = numberOfObject;
        numberOfObject++;
        
    }

    public int getID() {
        return ID;
    }

    public boolean ProcessingStatus() {
        return statusOfProcessing;
    }

     /**
     * true = is processed . false = is not processed.
     *
     * @param  statusProcessing   the set
     *
     * @throws IllegalArgumentException  If {@code sz <= 0}
     */
    public void setProcessingStatus(boolean statusProcessing) {
        this.statusOfProcessing = statusProcessing;
    }
    
    public static int getNumperOfObject() {
        return numberOfObject;
    }

    public double getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(double ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }

    public double getBurstTime() {
        return BurstTime;
    }

    public void setBurstTime(double BurstTime) {
        this.BurstTime = BurstTime;
    }

    public double getRemainingProcessingTime() {
        return remainingProcessingTime;
    }

    public void setRemainingProcessingTime(double remainingProcessingTime) {
        this.remainingProcessingTime = remainingProcessingTime;
    }

    @Override
    public String toString() {
        return "Process "+ID+"{" + "ArrivalTime=" + ArrivalTime + ", BurstTime=" + BurstTime + ", remainingProcessingTime=" + remainingProcessingTime +" }";
    }

    public String toStringArrivalTime() {
        return"Process "+ID+"{" + "ArrivalTime=" + ArrivalTime +" }";
    }
   
    public String toStringBurstTime() {
        return"Process "+ID+"" + "BurstTime=" + BurstTime +" }";
    }
    
    public String toStringRemainingProcessingTime() {
        return"Process "+ID+"{" + "remainingProcessingTime=" + remainingProcessingTime +" }";
    }
    
    
}
