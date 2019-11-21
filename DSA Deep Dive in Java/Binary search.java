package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Binary Search


    public static int rank(int key, int[] arr){

        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low/2);
            if(key<arr[mid])
                high=mid-1;
            else if (key>arr[mid])
                low=mid+1;
            else
                return mid;

        }
        return -1;
    }

    public static void sort(int[] array1){

        for(int i= array1.length-1 ; i>0;i--){
            for (int j=0 ; j< i;j++){
                swap( array1, j, j+1);
            }
        }

    }
    public static void swap(int[] array2, int ind1, int ind2){
        if ( array2[ind1] > array2[ind2]) {
            int temp = array2[ind2];
            array2[ind2] = array2[ind1];
            array2[ind1] = temp;
        }

    }
    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter Array Size:");
        Scanner scn=new Scanner(System.in);

        int count=scn.nextInt();
        scn.nextLine();

        int[] arr1=new int[count];
        System.out.println("Enter Array elements with spaces: ");
        Scanner scn1=new Scanner(scn.nextLine());

        for (int i=0; i<count;i++){
            if(scn1.hasNextInt()){
                arr1[i]=scn1.nextInt() ;

            }
            else{
                System.out.println("Didnt provide input");
                break;
            }
        }
        System.out.println("UnSorted Array is:  "+ Arrays.toString(arr1));
        sort(arr1);
        System.out.print("Sorted Array is:  [");
        for(int k=0;k<arr1.length;k++){
            if(k!=0)
                System.out.print(" ");
            System.out.print(arr1[k]);
            if(!(k==arr1.length-1)){
                System.out.print(",");
            }
//            System.out.println("]");
        }
        System.out.print("]");
        System.out.println(" ");

        System.out.println("Enter the number to be searched: ");

        Scanner scn3=new Scanner(System.in);
        int key1=scn.nextInt();
//        int key1=5;
        if(rank(key1,arr1)<0)
            System.out.println("Given number not in the array.");
        else
            System.out.println("Given number is in the array.");



    }
}

