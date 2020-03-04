public class Matmul{

  public static void main(String s[]){
     int a[][] = {{1,2,3},{1,2,3},{1,2,3}};
     int b[][] = {{1,0,0},{0,1,0},{0,0,1}};
     int c[][] = new int[3][3];
     int i=3,j=3,k=3; 
     for(i=0;i<3;i++){
       for(j=0;j<3;j++){
         c[i][j]=0;
         for(k=0;k<3;k++){
           c[i][j] = c[i][j]+a[i][k]*b[k][j];
         } 
       }
     }
     for(i=0;i<3;i++){
       for(j=0;j<3;j++){
          System.out.print(c[i][j]+"  ");
     }
       System.out.println();
    }

  }
}