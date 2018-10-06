import java.util.*;
class npz {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    //System.out.println("Enter any integer number:");
    num=sc.nextInt();
    if(num>0)
    System.out.println("POSITIVE");
    else if(num<0)
    System.out.println("negative");
    else if(num==0)
    System.out.println("ZERO");
  }
}
