public class konjungsi{
  public static void main (String[] args) {
    int w = 35;
    int x = 15;
    int y = 72;
    int z = 34;
    
    boolean a = w > x;
    boolean b = y < z;
    boolean c = a && b;
    
    System.out.println("    a = " + w + " > " + x + " = " + a);
    System.out.println("    b = " + y + " < " + z + " = " + b);
    System.out.println("a ^ b = (" + w + " > " + x + ") ^ (" + y + " < " + z + ") = " + c);
    
  }
}
