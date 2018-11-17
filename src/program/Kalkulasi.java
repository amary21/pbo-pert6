/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author Taufik amaryansyah
 */
public class Kalkulasi {
    private int z;
    protected int x, y;
    protected int aaa=20;
    
    public void penambahan(int x, int y){
        z=x+y;
        System.out.println("Hasil penambahan : "+z);
    }
    public void pengurangan (int x, int y){
        z=x-y;
        System.out.println("Hasil pengurangan : "+z);
    }
    protected int getTambah(){
        return x+y;}
    protected int getKurang(){
        return x-y;}
    
    
}
