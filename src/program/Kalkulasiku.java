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
public class Kalkulasiku extends Kalkulasi //untuk memanggil anak pewarisan
{
    public void perkalian(int x, int y){
    int z=x*y;
        System.out.println("Hasil perkalian : "+z);
        System.out.println("ini langsung akses");
        System.out.println("var aaa = "+aaa);
    }

    public Kalkulasiku()//consturctor 
    {
        x=10;
        y=5;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int a=10, b=5;
        Kalkulasiku tes = new Kalkulasiku();
        tes.perkalian(a, b);
        tes.penambahan(a, b);
        tes.pengurangan(a, b);
        
        System.out.println("Constructor x + y : "+tes.getTambah());
        System.out.println("Constructor x - y : "+tes.getKurang());
    }
    
}
