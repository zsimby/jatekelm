
package jatekelm;

import java.io.*;
import java.util.*;


public class Jatekelm {
    
    
    public static double sorminmax(double tomb1[][]){
        
         double seged[] = new double[4];
          for (int i=0;i<tomb1.length;i++){
               double min = tomb1[i][0];
              
               for (int j=1;j<tomb1[i].length;j++){
                if (tomb1[i][j]<min){
                    min=tomb1[i][j];
                        
                             
                }
                 
          }  seged[i]=min; 
                                               
                   
               }
           double max=seged[0];
             for (int z=0;z<seged.length;z++){
                 
                 if (seged[z]>max){
                     max=seged[z];
                    
                 }
                    
          }   
             
        return max;       
    }
    
        public static double oszlopmaxmin(double tomb2[][]){
        double seged[] = new double[4];
           
          for (int i=0;i<tomb2.length;i++){
              double max= tomb2[0][i];
              
              for (int j=1;j<tomb2[i].length;j++){
                if (tomb2[j][i]>max){
                    max=tomb2[j][i];
                    
                }
                
                seged[i]=max;
        }
       
}  
           double min = seged[0];
             for (int z=0;z<seged.length;z++){
                 
                 if (seged[z]<min){
                     min=seged[z];
                 }
              
             }
                   
         return min;
    }


   
    public static void main(String[] args) throws IOException  {
        int n = 4;
        int m = 4;
        
        double matrix[][] = new double[n][m];
        
        try{
        File thefile = new File("input.txt");
        Scanner sc = new Scanner(thefile);
        
          while (sc.hasNextLine()) {
             for (int i=0;i<n;i++){
                
                 for (int j=0;j<m;j++){
                   
                     matrix[i][j]=sc.nextDouble();
                     System.out.print(matrix[i][j]+"  ");
                   
                 }
                  
                  System.out.println();
            }
            
            
        }
          
      
    
         sc.close();
        }catch(Exception e){
            
        }
        double x=sorminmax(matrix);
        System.out.println(x);
        
        double y=oszlopmaxmin(matrix);
        System.out.println(y);
      
     if(x==y){
         System.out.println("Van nyeregpontja: "+x);
     }else{
         System.out.println("Nincs nyeregpontja!");
     }
}
}
