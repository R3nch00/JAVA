public class Main {
  public static int sum(int k) {
    if (k > 0) {
      return(k*(k+1))/2;
    } else {
      return 0;
    }
  }
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
}