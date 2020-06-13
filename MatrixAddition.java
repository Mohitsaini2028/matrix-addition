

public class MatrixAddition{  
public static void main(String args[]){  
//creating two matrices    
int a[][]={{9,2,1},{4,6,3},{2,4,7}};    
int b[][]={{1,0,4},{6,4,1},{3,2,2}};    
        
int c[][]=new int[3][3];    
        
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];    
System.out.print(c[i][j]+" ");    
}    
System.out.println();  
}    
}}  
