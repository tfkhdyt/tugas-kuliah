package Interface;

public interface Motor {
  int MAX_SPEED = 140;
  int MIN_SPEED = 0;
  
  void nyalakan();
  void matikan();
  void gas();
  void rem();
}
