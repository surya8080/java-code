public class Player{
 float avg,runs,inn,notout;
 String pname;

 void calavg(){
   avg = runs/(inn-notout); 
 }

 void showdata(){
  System.out.println(pname+"  "+runs+"  "+avg);
 }  

 public static void main(String s[]){
   
   String pn = new String(s[0]);
   Float r = new Float (s[1]);
   Float innn = new Float (s[2]);
   Float nout = new Float (s[3]);
   
   Player p = new Player();
   p.pname = pn;
   p.runs = r;
   p.notout = nout;
   p.inn = innn; 
   p.calavg();
   p.showdata();
 }
}