package Day1_Arrays;
//https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1
import java.util.HashSet;

public class UnionArray {
    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i:a)
            hash.add(i);
        for(int i:b)
            hash.add(i);

        return hash.size();
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3};
        int res = doUnion(a,5,b,3);
        System.out.println(res);
    }
}
