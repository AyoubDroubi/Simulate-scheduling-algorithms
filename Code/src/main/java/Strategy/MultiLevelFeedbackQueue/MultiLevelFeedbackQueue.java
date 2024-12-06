/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Strategy.MultiLevelFeedbackQueue;

import statically.Process;
import statically.Queue.Queue;


/**
 *
 * @author Ayyoub
 */
abstract class MultiLevelFeedbackQueue {

    protected double averageTurnaroundTime = 0;
    protected double averageWaitingTime = 0;
    protected double averageResponseTime = 0;
    protected double time = 0;
    protected double nonWorkTime = 0;

    protected double length;

    protected Queue queue = new Queue();

    protected abstract void Processing();

    @Override
    public abstract String toString();

    public abstract String toStringString();
}
