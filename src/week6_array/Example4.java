/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week6_array;

//multidimensional array

import java.util.Random;

public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        int count=1;
        
        //declare size of multidimensional array
        int[][] scoreTable = new int[4][5];
        
        for (int[] scoreTable1 : scoreTable) {
            for (int j = 0; j < scoreTable1.length; j++) {
                scoreTable1[j] = rand.nextInt(500)+50;
            }
        }
      
        for(int i=0; i<scoreTable.length; i++)
            for(int j=0; j<scoreTable[i].length; j++)
                System.out.printf("Position [%d][%d] is %d\n",count++,i,j,scoreTable [i][j]);
        
                }
    
}
