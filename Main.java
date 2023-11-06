import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//   esep 1
        double jas=12;
        if (jas>18){
            System.out.println("бере алады");
        }else{
                System.out.println("бере алмайды");
            }
 //  2 esep
 int ball=6;
        if (ball>2){
            System.out.println("өтеді");
        }else{
            System.out.println("өтпейді");
        }
// 3 esep
int san1=12;
int san2=34;
if (san1>san2){
    System.out.println("san1 үлкен ");
}else{
    System.out.println("san2 үлкен ");
}
// 4 esep
        int kurs=4;
if (kurs==1){
    System.out.println("Php");
}else if (kurs==2){
    System.out.println("Ағылшын");
}else if(kurs==3){
    System.out.println("Web зазработчик");
        }else if(kurs==4){
    System.out.println("HTML");
        }else if(kurs==5){
    System.out.println("Java");
        }else if(kurs==6){
    System.out.println("Python");
}else if (kurs==7) {
    System.out.println("Алгоритмы");
} else{
    System.out.println("Бүгінге курс жоқ");
        }
// 5 esep а
int  yes=1;
int n=45;
int m=-1;
if(yes==1){
    int көбейту=n*m;
    System.out.println("көбейту="+көбейту);
}else if(yes==2){
    int бөлу=n/m;
    System.out.println("бөлу"+бөлу);
}else if(yes==3){
    int азайту=n-m;
    System.out.println("азайту"+азайту);
}else if (yes==4) {
    int қосу=n+m;
    System.out.println("қосу"+қосу);
}else {
    System.out.println("символ жоқ");
        }
// 5 esep b
 if(m>0){
     System.out.println("m үлкен");
 }else{
     System.out.println("m кіші");
 }
 // 6 esep
        int procent=35;
 if( procent>=100||procent>=85){
     System.out.println("Mark=5");
 }else if( procent>=84||procent>=70) {
     System.out.println("Mark=4");
 }else if( procent>=69||procent>=50){
     System.out.println("Mark=3");
 }else if( procent>=49||procent>=0) {
     System.out.println("Mark=2");
 }else if( procent==0) {
     System.out.println("Mark=1");
 }else {
     System.out.println("procent дұрыс емес");
 }
 // esep= 6
 double top=3;
 int PI=32;
 int IST=21;
 int Admin=18;
 if( top>=1){
     int Android=(IST-15)+(Admin-10)+(PI-22);
     System.out.println("Android developer kurs student="+Android);
 }else if(top>=2) {
     int Web=(PI-12)+(IST-5)-(Admin-15);
     System.out.println("Web developer kurs student="+Web);
 }else if (top>=3){
     int Mobile=(PI-30)+(IST-7)+(Admin-3);
     System.out.println(" Mobile games developer kurs studnt="+Mobile);
 }else {
     System.out.println("No kurs");
 }
 // taks 1

    }}
