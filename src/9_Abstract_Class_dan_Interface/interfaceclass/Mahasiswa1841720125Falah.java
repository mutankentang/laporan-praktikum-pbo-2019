/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbojssembilan.interfaceclass;

/**
 *
 * @author sepuluh
 */
public class Mahasiswa1841720125Falah implements ICumlaude1841720125Falah{
        protected String nama;

    public Mahasiswa1841720125Falah(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void lulusFalah() {
        System.out.println("BISMILLAH TERBAIK"); 
    }

    @Override
    public void meraihIPKTinggiFalah() {
        System.out.println("LEBIH DARI 3,5"); 
    }
    
    
    public void kuliahDikampusFalah(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }
    
}
