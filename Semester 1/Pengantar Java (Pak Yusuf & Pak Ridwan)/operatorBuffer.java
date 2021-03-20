import java.io.*;

 // Compiler version JDK 11.0.2

 class buffer
 {
   public static void main(String args[])
   { 
    int n1,n2,h1,h2;
    boolean b1,b2,b3,b4,b5;
    BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
    
    try{
    System.out.print("Masukkan angka (n1)  : ");
    n1 = Integer.parseInt(inp.readLine());
    System.out.print("Masukkan angka (n2)  : ");
    n2 = Integer.parseInt(inp.readLine());
    
    System.out.println("\n======Aritmatika======");
    h1 = (n1+n2)*(n2+n1);
    h2 = (n1 % 4) * n2;
    System.out.println("h1 = ("+n1+" + "+n2+") x ("+n2+" + "+n1+") = "+h1);
    System.out.println("h2 = ("+n1+" % 4) x "+n2+" = "+h2);

    System.out.println("\n=====Perbandingan=====");
    b1 = h1 >= h2;
    b2 = h2 >= h1;
    System.out.println("b1 = "+h1+" >= "+h2+" = "+b1);
    System.out.println("b2 = "+h2+" >= "+h1+" = "+b2);
    
    System.out.println("\n========Logika========");
    b3 = (h1 % 4) == (++h2 % 5);    
    b4 = (b1 ^ b3) && (b2 || b3);
    b5 = b2 || (b3  && (b2 ^ b1));
    System.out.println("b3 = ("+h1+" % 4) == ("+h2+" % 5) = "+b3);
    System.out.println("b4 = ("+b1+" ^ "+b3+") && ("+b2+" || "+b3+") = "+b4);
    System.out.println("b5 = "+b2+" || ("+b3+"  && ("+b2+" ^ "+b1+")) = "+b5);
    }catch(IOException ex){
      System.out.print("Error");
    }
   }
 }
