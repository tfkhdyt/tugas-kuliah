package Interface;

public class Pengendara {
  private Motor motor;
  
  public Pengendara(Motor motor) {
    this.motor = motor;
  }
  
  void menyalakanMotor() {
    this.motor.nyalakan();
  }
  
  void mematikanMotor() {
    this.motor.matikan();
  }
  
  void menggasMotor() {
    this.motor.gas();
  }
  
  void mengeremMotor() {
    this.motor.rem();
  }
}
