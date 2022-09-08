import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz: ");
        int girilen=scanner.nextInt();
        int min = list[0];
        int max = list[0];


        Arrays.sort(list);

        for(int i:list)
        {
            if(i<girilen) min=i;
        }

        for(int i=list.length-1;i>=0;i--)
        {
            if(list[i]>girilen) max=list[i];

        }
        System.out.println(min);
        System.out.println(max);
    }
}