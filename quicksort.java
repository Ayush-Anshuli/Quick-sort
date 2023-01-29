import java.util.*;
import java.util.Scanner;
public class quicksort {
    public static void quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pi=partition(arr,si,ei);
        quicksort(arr, si, pi-1); // left
        quicksort(arr, pi+1, ei); // right
    }
    public static int partition(int arr[],int si,int ei){
        int piviot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=piviot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=piviot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        quicksort(arr, 0, arr.length-1);
        print(arr);
    }
}
