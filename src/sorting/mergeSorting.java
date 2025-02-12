package sorting;

import java.util.Stack;

public class mergeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int []nums2 = {2,5,6};
		int n = 3;
		merge(nums1, m, nums2, n);
	}

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=0, j=0,k=0;
        int [] newArrary = new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                newArrary[k]=nums1[i];
                k++;
                i++;
            }else{
                newArrary[k]=nums2[j];
                k++;
                j++;
            }
        }
        while (i < m) {
            newArrary[k++] = nums1[i++];
        }

        
        while (j < n) {
            newArrary[k++] = nums2[j++];        
        }

        for(int a=0; a<newArrary.length; a++){        	
            nums1[a]=newArrary[a];
            System.out.println(nums1[a]);
        }
       
    }
}
