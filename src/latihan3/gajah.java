/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author Lely
 */
public class gajah extends hewan
{
    public static void testClassMethod()
    {
        System.out.println("The Class Method In Hewan...");
    }
    
    public void testInstanceMethod()
    {
        System.out.println("The Instance Method In Gajah...");
    }
    
    public static void main (String [] args)
    {
        gajah myGajah = new gajah();
        hewan myHewan = myGajah;
        hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
