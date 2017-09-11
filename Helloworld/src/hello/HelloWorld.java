package hello;


import java.util.Scanner;


/**
 * �����о�
 * @author benjamin(�⺣��)
 * @email benjaminwhx@sina.com / 449261417@qq.com
 *
 */
public class HelloWorld {
	/**
<span style="white-space:pre">	</span> * ��ż����
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
	 * ����С�����˳�򽻻�����
	 * @param a ���������
	 * @param b �����Ҫ��������b
	 * @param c	�����Ҫ��������c
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
	 * ��ӡ����
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

