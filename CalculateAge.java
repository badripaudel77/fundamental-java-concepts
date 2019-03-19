
package agecalculation;

import java.util.Scanner;
class LoadAge{
    public static void main(String[] args) {
   Scanner ip=new Scanner(System.in);
        int byr,bmth,bdy;
   
        int cyr,cmth,cdy;
        System.out.println("enter the Birth Year Birth Month Birth Day ");
        byr=ip.nextInt();
        bmth=ip.nextInt();
        bdy=ip.nextInt();
        System.out.println("Enter the Current Year Current Month  current Day :");
        cyr=ip.nextInt();
        cmth=ip.nextInt();
        cdy=ip.nextInt();
         System.out.println("Birth Year: "+byr +" Birth Month : "+bmth+" Birth Day : "+bdy);
         System.out.println("Current Year: "+cyr +" Current Month : "+cmth+" current Day : "+cdy);
         CalculateAge ca=new CalculateAge();
        ca.getBirthDate(byr,bmth, bdy);
        ca.getCurrentDate(cyr,cmth, cdy);
        ca.calculateAge();
    }
}
/**
 *
 * @author User
 */
 class CalculateAge {
    
    int cyr,cmth,cd;
    int dyr,dmth,dd;
    int totalday,totalmonth,totalyear;
    public void getCurrentDate(int cyear,int cmonth,int cday){
    cyr=cyear;
    cmth=cmonth;
    cd=cday;
    }
   
   public void getBirthDate(int dyear,int dmonth,int dday){
dyr=dyear;
dmth=dmonth;
dd=dday;   
}
   
   public void calculateAge(){
       
   if(dd>cd){
       cmth-=1;
       cd+=30;
       totalday=cd-dd;
   }
 if(dmth>cmth) {
     cyr-=1;
     cmth+=12;
     totalmonth=cmth-dmth;
     
 }
 if(cyr<dyr){
     System.out.println("enter date is not valid");
     System.exit(0);
 }
 else{
 totalday=cd-dd;
 totalmonth=cmth-dmth;
 totalyear=cyr-dyr;
 }
 System.out.println("Your Total Age is :");
 System.out.println(" Day : "+totalday + "\t Month : "+ totalmonth+"\t Year : "+totalyear);
   
   }
}

