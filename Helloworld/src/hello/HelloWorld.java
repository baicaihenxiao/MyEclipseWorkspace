package hello;


import java.util.Scanner;


/**
 * 排序研究
 * @author benjamin(吴海旭)
 * @email benjaminwhx@sina.com / 449261417@qq.com
 *
 */
public class HelloWorld {
	/**
<span style="white-space:pre">	</span> * 奇偶排序
<span style="white-space:pre">	</span> * @param array
<span style="white-space:pre">	</span> */
	public static void batcherSort(int[] array) {
		int length = array.length ;
		boolean flag = true ;
		while(true) {
			flag = true ;
			for(int i=1;i<length-1;i+=2) {
				if(array[i] > array[i+1]) {
					swap(array, i, i+1) ;
					flag = false ;
				}
			}
			for(int i=0;i<length-1;i+=2) {
				if(array[i] > array[i+1]) {
					swap(array, i, i+1) ;
					flag = false ;
				}
			}
			if(flag) break ;
			printArr(array) ;
		}
	}
	/**
	 * 按从小到大的顺序交换数组
	 * @param a 传入的数组
	 * @param b 传入的要交换的数b
	 * @param c	传入的要交换的数c
	 */
	public static void swap(int[] a, int b, int c) {
		int temp = 0 ;
		if(b < c) {
			if(a[b] > a[c]) {
				temp = a[b] ;
				a[b] = a[c] ;
				a[c] = temp ; 
			}
		}
	}
	
	/**
	 * 打印数组
	 * @param array
	 */
	public static void printArr(int[] array) {
		for(int c : array) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] number={11,95,45,15,78,84,51,24,12} ;
		batcherSort(number) ;
	}
}

