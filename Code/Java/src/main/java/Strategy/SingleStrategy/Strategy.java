package Strategy.SingleStrategy;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import statically.Queue.Queue;
/**
 *
 * @author Ayyoub
 */
public abstract class Strategy {

    private double averageTurnaroundTime = 0;
    private double averageWaitingTime = 0;
    private double averageResponseTime = 0;
    private double time = 0;
    private double nonWorkTime = 0;
    private double Quantum;

    private final double length = 0;

    private Queue queue = new Queue();
    private Queue test = new Queue();

    protected abstract void Processing();

    @Override
    public abstract String toString();

    public abstract String toStringString();
}

