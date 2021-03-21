import java.util.Scanner;

 // Compiler version JDK 11.0.2

 class JumlahBilanganGenap
 {
   static void hitungJumlah(int n){
    int genap = 0;
    int j = 0;
    System.out.println();
    for(int i = 0; i < n; i++){
      genap += j;
      System.out.print(j +" ");
      j += 2;
    }
    System.out.println("\n\nJumlah " + n + " bilangan genap pertama adalah : " + genap);
   }
   
   public static void main(String args[])
   { 
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan nilai N : ");
    int n = in.nextInt();
    
    hitungJumlah(n);
   }
 }
