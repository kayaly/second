/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcsc311;


 
public class ProjectCSC311 {

    
  /*  public void non_rec_multi(int A[] , int B[]){
        
        
        int MultiOneNum = 0; int Carry = 0 ; 
        int[][] C = new int[B.length+1][(A.length*B.length) ];
       
        if (A.length > B.length){
            for (int i = 0 ; i <= B.length-1 ; i++){
                MultiOneNum = B[i];
                int j = 0;
                for ( j = 0 ; j <= A.length-1 ; j++){
                    MultiOneNum *= A[j] + Carry ;
                    C[i][j]= MultiOneNum % 10 ;
                    Carry = MultiOneNum/10;
                }
                
                for (j =0 ;j <=i ; j++ )
                     C[i][((A.length*B.length)-1) - j] = 0;
                
            }
            int Result = 0 ;
            for (int j = 0 ; j <= C[0].length; j ++){
                int i = 0;
                for( i = 0; i <= C.length;i++){
                   Result += C[i][j] ; 
                }
                C[i+1][(C[0].length -1) - j] = Result ;
                System.out.print(Result);
            }
        }
        
            
        
        
    }*/
    public static void main(String[] args) {
      
        int [] A = {5,4,3,2,1};
        int [] B = {5,4,3,2,1};
        
        int MultiOneNum = 0; int Carry = 0 ; int rows = B.length+1 ; int columns = (A.length+B.length) -1;
        int[][] C = new int[rows][columns];
 System.out.println(rows);
            int k = 0;
            for (int i = 0 ; i <= B.length-1 ; i++){
                MultiOneNum = B[i];
                int j = 0;  
 
                for ( j = 0 ; j <= A.length-1 ; j++){
                    MultiOneNum = MultiOneNum * A[j] + Carry ;
                    C[i][((columns -1 ) - j) - k]= MultiOneNum % 10 ;
                    Carry = MultiOneNum/10;
                     MultiOneNum = B[i];
                }
              
                 for (k=0 ;k <= i  ; k++ )
                 C[i +1][(columns-1) - k] = 0;
      
            }
           
            
            int Result = 0 ;
           
            int Carry2 = 0;
          
            for (int j = columns -1; j >= 0 ; j --){
                int i = 0;
                for( i = 0; i < rows-1 ;i++){
                   Result += C[i][j]  ;
                   
                }
             
                Result = Result+Carry2;
               C[i][j] = Result %10 ;
                Carry2 = Result/10;
                Result = 0 ;
                
            }
             System.out.println();
             System.out.println("*********");
             
           for(int i = 0; i<= C.length -1; i++){
             for(int j = 0; j<= C[0].length -1; j++){
                 System.out.print(C[i][j]);
             }
            System.out.println();
            }
             
        }
        
            
        
      
    }
    


