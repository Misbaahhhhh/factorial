public class Factorial {
  public static void main(String[] args){
    int n = args.length > 0 ? Integer.parseInt(args[0]) : 5;
    BigInteger f = BigInteger.ONE;
    for(int i=1;i<=n;i++) f = f.multiply(BigInteger.valueOf(i));
    System.out.println("Factorial of " + n + " = " + f.toString());
  }
}
