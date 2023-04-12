/*
date: Oct 15, 2020
author: Asumi Mizoguchi
purpose: Demonstrate recursive algorithms using recursion
*/

class Recursion{
    private int[] a;
    
    //constructor
    public Recursion(int[] array){
        a = array;
    }


    //get and set methods for data members
    public int[] getA(){
	return a;
    }

    public void setA(int[] array){
	a = array;
    }
    
    //some recursive methods for arrays
    // n in these methods will be the number of elements to affect
  
    
    //print array forward
    // n in these methods will be the number of elements to affect
    public void printF(int n){
        if(n>0){
            printF(n-1);
            System.out.print(a[n-1]);
        }
    }
    
    //print array backward
    public void printB(int n){
        if(n>0){
            System.out.print(a[n-1]);
            printB(n-1);
        }
    }
    
    //smallest element
    public int minA(int n){
        if(n==1)
            return a[0];
        return Math.min(minA(n-1), a[n-1]);
    }
    
    //reversing an array
    public void reverseA(){
        reverseA(0, a.length-1);
    }
    
    private void reverseA(int l, int r){
        if(l<r){
            int t = a[l];
            a[l] = a[r];
            a[r] = t;
            reverseA(l+1, r-1);
        }
    }
    
    //mode of the int array - int that appears most often
    public int mode(int n){
        if (n==1)
            return a[0];
        int m = mode(n-1);
        int c1 = 0, c2 = 1;
        for (int i = 0; i < n-1; i++) {
            if(a[i]==m)
                c1++;
            else if(a[i]==a[n-1])
                c2++;
        }
        if(c1>c2)
            return m;
        return a[n-1];
        
    }
    
    public int rotateL(int n){
        int temp = a[0];
        if(n == 1)
            return a[0];
        if(n>1)
        for(int i=0; i<n-1; i++)
            a[i-1] = a[i];
            a[n-1]  = temp;            
        return rotateL(n-1);
    }
    
    public boolean isSorted(int l){
        if(a[l] > a[l+1])
            return false;       
        return isSorted(l-1);
    }
    
    public boolean isEqual(int n){
        return isEqual(n, a.length-1);
    }
    
    private boolean isEqual(int n, int l){
        if(n == 1)
            return true;
        else if(a[l]==a[l+1])
            return true;
        return isEqual(n, l-1);
    }
    
    public boolean isEven(int n){
        return isEqual(n, a.length-1);
    }
    
    private boolean isEven(int n, int l){
        if(n==1 && a[0]%2 == 0)
            return true;
        if(a[l]%2==0)
            return true;
	return isEven(n, l-1);
    }
    
}

public class recursive4 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        Recursion r = new Recursion(a);

        r.printF(5);
        System.out.println();
        r.printB(5);
        System.out.println();
        System.out.println(r.minA(5));
	System.out.println();
        r.reverseA();
        r.printF(7);
	System.out.println();
        System.out.println(r.rotateL(7));
        r.printB(7);
        System.out.println();
        System.out.println(r.isSorted(7));
        System.out.println();
        System.out.println(r.isEqual(7));
        System.out.println();
        System.out.println(r.isEven(7));
        System.out.println();
        

        int[] b = {1,1,2,2,3,4,2};
        Recursion r2 = new Recursion(b);
        
        System.out.println(r2.mode(7));
   }
    
}
