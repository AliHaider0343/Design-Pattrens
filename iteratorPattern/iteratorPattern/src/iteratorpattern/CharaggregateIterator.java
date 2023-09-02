package iteratorpattern;


import iteratorpattern.StringAsCharAggregateIterartor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rizwan computers
 */
public class CharaggregateIterator {
    String Data="";
    public CharaggregateIterator(String dataInit)
    {
    this.Data=dataInit;
    }
    StringAsCharAggregateIterartor iterator=new StringAsCharAggregateIterartor(this.iterator);
    public StringAsCharAggregateIterartor getIterator()
    {
   return iterator;
    }
    
}
