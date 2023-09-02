package iteratorpattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rizwan computers
 */
public class StringAsCharAggregateIterartor {
    String Data="";
    char item;
    public StringAsCharAggregateIterartor(StringAsCharAggregateIterartor AgrregateToWorkOn)
    {
   this.Data=AgrregateToWorkOn.Data;
    }
    //Iteration mechanism
    int IndexForIteration;
    public void First(){
    IndexForIteration=0;
    }
    public void Next(){
    if(!IsDone())
    {
        IndexForIteration++;
    }
    else IndexForIteration=0;
    }
    public boolean IsDone() {
        boolean flag=false;
        if(IndexForIteration>=this.Data.length())
            flag=true;
        else
            flag=false;
        return flag;
    }
    public char CurrentItem(){
    
        item=this.Data.charAt(IndexForIteration);
    return item;
    }
}
