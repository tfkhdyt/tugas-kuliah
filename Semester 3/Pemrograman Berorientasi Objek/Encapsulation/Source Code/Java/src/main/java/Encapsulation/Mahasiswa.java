package Encapsulation;

public class Mahasiswa {
  private String nama, nim, prodi, email;
  
  public void setNama(String nama) {
    this.nama = nama;
  }
  
  public void setNim(String nim) {
    this.nim = nim;
  }
  
  public void setProdi(String prodi) {
    this.prodi = prodi;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getNama() {
    return this.nama;
  }
 
  public String getNim() {
    return this.nim;
  }
 
  public String getProdi() {
    return this.prodi;
  }
 
  public String getEmail() {
    return this.email;
  }
}
