/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto2threads;

import java.util.Random;

/**
 *
 * @author Raphael Mathias
 */
public class Objeto2Threads {
        
         static Random random = new Random();
         static int linhaChegada = 300;
          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("A linha de chegada é em " + linhaChegada);
        new Thread(grilo1).start();
        new Thread(grilo2).start();
        new Thread(grilo3).start();
         
         
    
        
    }
    
    
    private static Runnable grilo1 = new Runnable(){
        public void run(){
            int posicao =0;   
            int numeroPulos=0;
            do{
                
                int pulo = random.nextInt(30);
                posicao += pulo;
                numeroPulos++;
                System.out.println("O Grilo_01 pulou "+ pulo + "cms e já percorreu " + posicao +"cms");
            }while (posicao<=linhaChegada);
            if(posicao>linhaChegada){
                  System.out.println(" O Grilo_01 alcançou a linha de chegada com "+ numeroPulos + " pulos");
            }
           
        }
    };
    private static Runnable grilo2 = new Runnable(){
         public void run(){
            int posicao =0;   
            int numeroPulos=0;
            do{
                
                int pulo = random.nextInt(30);
                posicao += pulo;
                numeroPulos++;
                System.out.println("O Grilo_02 pulou "+ pulo + "cms e já percorreu " + posicao +"cms");
            }while (posicao<=linhaChegada);
            if(posicao>linhaChegada){
                  System.out.println(" O Grilo_02 alcançou a linha de chegada com "+ numeroPulos + " pulos");
            }
           
        }
    };
       
        private static Runnable grilo3 = new Runnable(){
        public void run(){
            int posicao =0;   
            int numeroPulos=0;
            do{
                
                int pulo = random.nextInt(30);
                posicao += pulo;
                numeroPulos++;
                System.out.println("O Grilo_03 pulou "+ pulo + "cms e já percorreu " + posicao +"cms");
            }while (posicao<=linhaChegada);
            if(posicao>linhaChegada){
                  System.out.println(" O Grilo_03 alcançou a linha de chegada com "+ numeroPulos + " pulos");
            }
           
        }
    };
        
          
    
}
