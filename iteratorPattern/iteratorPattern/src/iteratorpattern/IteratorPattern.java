/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern;

/**
 *
 * @author Rizwan computers
 */
public class IteratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CharaggregateIterator str1=new CharaggregateIterator ("Hello Class");
     StringAsCharAggregateIterartor str=str1.getIterator();
        while(!str.IsDone())
             {
             System.out.print(str.CurrentItem());
                     str.Next();
             }
    }
    
}
