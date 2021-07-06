public class disjungsi{
  public static void main (String[] args) {
    int w = 73;
    int x = 40;
    int y = 56;
    int z = 26;
    
    boolean a = w < x;
    boolean b = y > z;
    boolean c = a || b;
    
    System.out.println("    a = " + w + " < " + x + " = " + a);
    System.out.println("    b = " + y + " > " + z + " = " + b);
    System.out.println("a v b = (" + w + " < " + x + ") v (" + y + " > " + z + ") = " + c);
    
  }
}
