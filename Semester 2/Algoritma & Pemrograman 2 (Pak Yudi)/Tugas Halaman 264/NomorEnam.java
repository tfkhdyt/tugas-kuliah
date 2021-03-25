import java.util.Scanner;

class NomorEnam {
  static Scanner in = new Scanner(System.in);
  
  static void mengurangiJam(int jam, int menit, int detik, int p) {
    int jamS,menitS,timeS, pS;
    int jamNew = 0; int menitNew = 0; int detikNew = 0;
    jamS = jam * 3600;
    menitS = menit * 60;
    pS = p * 60;
    timeS = jamS + menitS + detik - pS;
    if(timeS >= 3600){
      jamNew = timeS / 3600;
      menitNew = timeS % 3600 / 60;
      detikNew = timeS % 3600 % 60;
    }else{
      menitNew = timeS / 60;
      detikNew = timeS % 60;
    }
    
    System.out.printf("\n%02d:%02d:%02d - %d menit",jam,menit,detik,p);
    System.out.printf("\nHasil : %02d:%02d:%02d",jamNew,menitNew,detikNew);
  }

  public static void main(String[] args) {
    //Scanner in = new Scanner(System.in);
    int jam, menit, detik, p;
    System.out.print("Masukkan waktu (jam) : ");
    jam = in.nextInt();
    System.out.print("Masukkan waktu (menit) : ");
    menit = in.nextInt();
    System.out.print("Masukkan waktu (detik) : ");
    detik = in.nextInt();
    System.out.print("Masukkan nilai P (menit) : ");
    p = in.nextInt();
    
    mengurangiJam(jam, menit, detik, p);
  }
}
