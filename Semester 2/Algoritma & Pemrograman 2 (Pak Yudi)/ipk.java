import java.util.Scanner;

class ipk{
  static int countAngkaMutu(float nilai){
    if(nilai >= 80 && nilai <= 100){
      return 4;
    }else if(nilai >= 68 && nilai <= 79){
      return 3;
    }else if(nilai >= 56 && nilai <= 67){
      return 2;
    }else if(nilai >= 45 && nilai <= 55){
      return 1;
    }else if(nilai < 45){
      return 0;
    }else{
      return 0;
    }
  }

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.println("=== PROGRAM MENAMPILKAN IPK MAHASISWA ===");

    System.out.print("Masukkan jumlah mata kuliah : ");
    int jumlahMataKuliah = in.nextInt();
    float[] nilai = new float[jumlahMataKuliah];
    int[] angkaMutu = new int[jumlahMataKuliah];
    int[] bobot = new int[jumlahMataKuliah];
    
    for(int i = 0; i < jumlahMataKuliah; i++){
      System.out.print("\nNilai mata kuliah " + (i + 1) + " : ");
      nilai[i] = in.nextFloat();
      angkaMutu[i] = countAngkaMutu(nilai[i]);

      System.out.print("Bobot mata kuliah " + (i + 1) + " : ");
      bobot[i] = in.nextInt();
    }

    float angkaMutuxBobot = 0;
    for(int j = 0; j < jumlahMataKuliah; j++){
      angkaMutuxBobot += angkaMutu[j] * bobot[j];
    }

    float sks = 0;
    for(int k = 0; k < jumlahMataKuliah; k++){
      sks += bobot[k];
    }

    float ipk = angkaMutuxBobot / sks;

    System.out.printf("\nIPK : %.2f", ipk); 

    in.close();
  }
}
