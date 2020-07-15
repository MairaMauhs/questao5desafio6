/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quesstao5desafio6;

import javax.swing.JOptionPane;

/**
 *
 * @author AliraMaria
 */
public class Quesstao5desafio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 5-	Escrever um algoritmo que leia N, inteiro e positivo, e calcule 
        //e mostre o termo de ordem N da sucessão abaixo:
	//ordem:	 1	2	3	4	 5	 6	 7	 8
	//termo:	-1	0	5	6	11	12	17	18

        
        int ordem, n, termo; String r="";String r1="";
        termo=-1; 
        n=Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor N:"));
        
        for(ordem=1; ordem<=n;ordem++){
           if(ordem==1){
            r1 = r1 + "Ordem:";   
            r = r   + "Termo: "+termo;
           }else{
             
               r = r + " "+termo;
           }
           if(ordem>n){
               r1 = r1 + "  "+ordem+"\n";
           }else{
            r1 = r1 + "  "+ordem;
           }
            if(ordem % 2 != 0){
                termo++;
            }else{
                termo+=5;
            };
 
        }
        JOptionPane.showMessageDialog(null,"Resultado\n"+r1+"\n"+r);
    }
    
}
