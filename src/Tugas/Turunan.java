/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Lely
 */
public class Turunan extends Induk 
{
    public void test(String s)
    {
        System.out.println("Method Overload Di Dalam Kelas Turunan");
        System.out.println("S : \""+s+"\"");
    }
    
    public void test()
    {
        System.out.println("Method Override Di Dalam Kelas Turunan");
    }
}
