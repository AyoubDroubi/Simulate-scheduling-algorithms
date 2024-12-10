/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package statically.Service;

import statically.Queue.Queue;

/**
 *
 * @author Ayyoub
 */
public abstract class service {

    protected Queue queue;

    protected abstract Queue getFirst();

    protected abstract Queue getSecond();

    protected abstract Queue getThird();
}