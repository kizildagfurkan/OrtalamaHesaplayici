/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ortalamahesaplayici;

import java.util.Scanner;

/**
 *
 * @author Furkan
 */
public class OrtalamaHesaplayici {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Ortalam hesaplayıcıya hoşgeldin. Lütfen vize notunu gir : ");
        int vizeNotu = input.nextInt();
        
        System.out.print("Tamam, şimdi de final notunu gir, dersten geçtin mi kaldın mı ona bakalım: ");
        int finalNotu = input.nextInt();
        
        double ortalamaNot = (vizeNotu*(0.6)) + (finalNotu*(0.4));
        
        
        if (ortalamaNot>=40){
            
            System.out.println("Ortalaman = "+ortalamaNot);
            System.out.println("Dersi geçtin, tebrikler!");
            
        }
        
        else{
            
            System.out.println("Ortalaman = "+ortalamaNot);
            System.out.println("Dersten kaldın!");
        }
            
        
        System.out.print("HARF NOTUN = ");
        if (ortalamaNot>=90){
            System.out.println("AA");
        }
        
        else if (ortalamaNot>=80){
            System.out.println("BA");
        }
        
        else if (ortalamaNot>=70){
            System.out.println("BB");
        }
        
        else if (ortalamaNot>=60){
            System.out.println("CB");
        }
        
        else if (ortalamaNot>=50){
            System.out.println("CC");
        }
        
        else if (ortalamaNot>=40){
            System.out.println("DC");
        }
        
        else if (ortalamaNot>=0){
            System.out.println("FF");
        }
        
        else{
            System.out.println("Bir hata oluştu. Lütfen vize ve final notlarını 100'lük sisteme göre girin.");
        }
    }
}
