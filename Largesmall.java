public class Largesmall{
  public static void main(String s[]){
   
    int a[] =new int[]{12,34,11,10,35};
    int i,t;

   for(i=0;i<4;i++){
      for(int j=i+1;j<5;j++){

        if (a[i]>=a[j]){
            t=a[i];
	   a[i]=a[j];
           a[j]=t;
           
        }
      }
    }

   System.out.println("Largest ="+a[4]+"Smallest="+a[0]);

  }
}