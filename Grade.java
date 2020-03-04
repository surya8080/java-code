public class Grade{
 float gp;
 char grade;
 void getgp(){}
 void calgrade(){
   if(gp<1.0) grade = 'F';
    else if(gp<2.3) grade = 'D';
      else if(gp<2.8) grade = 'C';
       else if(gp<4) grade = 'B';
        else grade = 'A';
   System.out.print("\n"+"Grade="+grade);  
 } 
 public static void main(String s[]){
   Float i = new Float(s[0]);
   Grade g = new Grade();
   g.gp=i;
   g.calgrade();
 }
}