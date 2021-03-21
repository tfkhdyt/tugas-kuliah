import java.util.Scanner;

 // Compiler version JDK 11.0.2

 class Minimum
 {
   static void hitungMin(int jumlah){
     int array[], elemen, minimum, lokasi = 0;
     array = new int[jumlah];
     System.out.println("\nMasukkan " + jumlah + " angka");
     for(int i = 0; i < jumlah; i++){
       Scanner in = new Scanner(System.in);
       System.out.print("Masukkan elemen ke-"+(i+1)+" : ");
       elemen = in.nextInt();
       array[i] = elemen;
     }
     minimum = array[0];
     for(int i = 0; i < jumlah; i++){
       if(array[i] < minimum){
         minimum = array[i];
         lokasi = i+1;
       }
     }
     System.out.println();
     System.out.println("Nilai minimumnya adalah = "+minimum);
     System.out.println("Berada di elemen ke-"+lokasi);
   }
   
   public static void main(String args[])
   { 
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan jumlah elemen : ");
    int jumlah = in.nextInt();
    
    hitungMin(jumlah);
   }
 }
