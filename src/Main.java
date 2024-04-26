import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入检索的语句个数：");
        int count = sc.nextInt();
        sc.nextLine();

        String []arr = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.println("请输入待检索语句"+(i+1)+"：");
            arr[i] = sc.nextLine();
        }

        /*String d1 = "I like to watch the sun set with my friend.";
        String d2 = "The Best Places To Watch The Sunset.";
        String d3 = "My friend watch the sun come up. ";
        */

        System.out.println("Please input the keyword to search:");
        String str = sc.next();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(str)){
                System.out.println("d"+(i+1)+".txt");
            }
        }
    }
}