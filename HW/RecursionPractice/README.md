1. Write a recursive method (that is, no loops of any kind: for, while, do-while or for-each) to reverse an array of integers in-place (that is, modify the array itself without returning a new array).

    Example: reverse([1,2,3,4,5]) will change the input array into [5,4,3,2,1].
    
        public static void reverse(int[] a){
            reverse(a, 0, a.length-1);
        }
        public static void reverse(int[] a, int low, int high){
            if(high<=low)
            return;
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            reverse(a, low+1, high-1);
        }
        
        reverse([1,2,3,4,5])
        reverse([1,2,3,4,5],0,4)
        reverse([5,2,3,4,1],1,3)
        reverse([5,4,3,2,1],2,2)
    
    Alternative solution:
        import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.*;
    
        public class Test {
            public static void main(String[] args) throws FileNotFoundException {
                int[] a = {1,2,3,4,5};
                reverse(a);
                printRec(a);
            }
            public static void reverse(int[] a){
                if(a.length<=1)
                    return;
                int temp = a[0];
                a[0] = a[a.length - 1];
                a[a.length - 1] = temp;
                int[] b = new int[a.length - 2];
                System.arraycopy(a, 1, b, 0, b.length);
                reverse(b);
                System.arraycopy(b,0,a,1,b.length);
            }
            public static void printRec(int[] a) {
                printRec(a, 0);
            }
            public static void printRec(int[] a, int pos) {
                if(pos<a.length) {
                    System.out.print(a[pos]);
                    printRec(a,pos+1);
                }
            }
        }

2. Write a recursive method to find out whether an array of integers is a palindrome. A palindrome can be read forward or backward; e.g. [r,a,c,e,c,a,r].
   Examples:
   palindrome([1,2,3,2,1]) returns true
   palindrome([1,2,3]) returns false

        public static boolean palindrome(int[] a){
            return palindrome(a, 0, a.length - 1);
        }
        public static boolean palindrome(int[] a, int low, int high){
            if(high<=low)
                return true;
            if(a[low] != a[high])
                return false;
            return palindrome(a,low+1,high-1);
        }
    
    Alternative solution:
   ```
   public class Test {
       public static void main(String[] args) throws FileNotFoundException {
           int[] a = {1,2,3,2,1};
           System.out.println(palindrome(a));
       }
       public static boolean palindrome(int[] a){
           if(a.length<=1)
               return true;
           if(a[0] != a[a.length - 1])
               return false;
           int[] b = new int[a.length - 2];
           System.arraycopy(a,1, b, 0, b.length);
           return palindrome(b);
       }
   }
   ```
    

3. Write a recursive method to eliminate consecutive duplicates of an array of integers and returns the result into an ArrayList. If an array contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
   Example:
   compress([1,1,1,2,2,1,3,3,4,4,4,4])
   returns ArrayList([1,2,1,3,4])
```
    import java.util.*;
    public class Test {
    public static void main(String[] args) {
        int[] a = {1,1,2};
        ArrayList b = compress(a); // {1,2}
        for(Object i:b)
        System.out.print(i);
    }
    public static ArrayList compress(int[] a){
        ArrayList b = new ArrayList();
        compress(a, b, 0);
        return b;
    }
    public static void compress(int[] a, ArrayList b, int pos){
        if(pos == a.length - 1) {
            b.add(a[a.length - 1]);
            return;
        }
        if(a[pos]!=a[pos+1])
            b.add(a[pos]);
        compress(a, b, pos+1);
    }
    }
```

4. Write a method to compute all the permutations of an ArrayList.

    Explanation:
    Permutations([1,2,3])=[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    
    Permutations([2,3])=[[2,3],[3,2]]
    
    For each Permutation in Permutations([2,3]) insert 1 in each position:
    [[1,2,3],[2,1,3],[2,3,1]] Union
    [[1,3,2],[3,1,2],[3,2,1]] = Permutations([1,2,3])
```
    import java.util.*;
    public class Permutations {
        public static void main(String[] args) {
            ArrayList<Object> a = new ArrayList<Object>();
            a.add("NYC"); a.add("Washington"); a.add("Chicago");
            // query for all permutations
            ArrayList<ArrayList<Object>> perms = permutations(a);
            for(ArrayList<Object> onePerm:perms){
            for(Object e:onePerm) // print all permutations
            System.out.println(e);
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Object>> permutations(ArrayList<Object> a) {
        ArrayList<ArrayList<Object>> perms = new ArrayList<ArrayList<Object>>();
        if(a.isEmpty()){
            ArrayList<Object> onePerm = new ArrayList<Object>();
            perms.add(onePerm);
            return perms;
        }
        for(Object oneElem:a){ // take an element from the list
            ArrayList<Object> b = (ArrayList<Object>)(a.clone());
            b.remove(oneElem);
            // construct all permutations of the list without that element
            ArrayList<ArrayList<Object>> perms2 = permutations(b);
            // add the element that you took out back to the list
            for(ArrayList<Object> onePerm:perms2){
                onePerm.add(oneElem);
                perms.add(onePerm);
            }
        }
        return perms;
    }
    }
```
----

Similar solution for Powerset:

Powerset([1,2,3])=[[],[1],[2],[3],[1,2],[2,3],[1,3],[1,2,3]]

Powerset([2,3])=[[],[2],[3],[2,3]]

Insert 1 in each of the sets in the Powerset([2,3]) =
[[1],[1,2],[1,3],[1,2,3]]

Powerset([1,2,3])=Powerset([2,3]) Union [[1],[1,2],[1,3],[1,2,3]]

5. A Scottish tartan is a pattern consisting of cross-crossed horizontal and vertical colors.

- You have to implement a method that prints the tartan of the Young McJava clan. The method takes a number n as input and prints a matrix of n rows and n columns of interleaved vertical and horizontal n and n-1 separated with spaces, starting with n. Implement the YoungMcJava method using for-loops. Implement the whole program that tests your printing method.

    Examples:
    
    tartan(3) prints:
    
    3 2 3
    
    2 3 2
    
    3 2 3
    
    tartan(4) prints:
    
    4 3 4 3
    
    3 4 3 4
    
    4 3 4 3
    
    3 4 3 4


```
public class YoungMcJava {

    public static void main(String[] args) {
        tartan(3);
        tartan(4);
    }
    public static void tartan(int n){
        for(int i = 1; i<=n; i++){ // iterates over rows
            for(int j = 1; j<=n; j++) // columns
                System.out.print(((i+j)%2==0?n:n-1)+" ");
            System.out.println();
        }
    }
}
```


6. Implement the YoungMcJava program without using loops. You are allowed to use only recursion.

```
public class YoungMcJava {

    public static void main(String[] args) {
        tartan(3);
        tartan(4);
    }
    
    public static void tartan(int n){
        tartan_rec(1,n);
    }
    
    public static void tartan_rec(int i, int n){
        if(i == n+1) // Base case
            return;    
        else{   
            tartan_one_row_rec(i,1,n);   
            tartan_rec(i+1,n);  
        }
    }

    public static void tartan_ one_row_rec(int i,int j,int n){
        if(j>n){ // Base case
            System.out.println();
            return;
        }else{
            System.out.print(((i+j)%2==0?n:n-1)+" ");
            tartan_ one_row_rec(i,j+1,n);
        }
    }
}
```

7. Implement the Ackermann Function with a recursive method:

A(0, n) = n + 1 for all nonnegative integers n

A(m, 0) = A(m − 1, 1) for all positive integers m

A(m, n) = A(m − 1, A(m, n − 1)) for all positive integers m and n
```
    public class Ackermann {
    
        public static int Ackermann(int m, int n){     
            if(m==0)       
                return n + 1;       
            if(n==0)       
                return Ackermann(m-1,1);       
            return Ackermann(m-1,Ackermann(m,n-1));       
        }
        
        public static void main(String[] args) {        
            int m=-1, n=-1;        
            Scanner input = new Scanner(System.in);       
            while(m<0 || n<0){       
                m=input.nextInt();       
                n=input.nextInt();        
                if(m>=0 && n>=0)        
                    System.out.println(Ackermann(m,n));        
            }       
        }
    }
```
8. Implement the McCarthy’s 91 Function: M : Z+ → Z as a recursive method:

M(n) = n − 10 if n > 100

M(n) = M(M(n + 11)) if n ≤ 100

```
public class McCarthy91 {
    public static int McCarthy91(int n){
        if(n>100)       
            return n-10;
        else
            return McCarthy91(McCarthy91(n+11));
    }
    
    public static void main(String[] args) {
        System.out.println(McCarthy91(10));
    }
}
```
9. The object of the Teddy Bear Game is to end up with a number of bears equal to some value goal that we choose ahead of time. Your friend gives you a number of stuffed bears we will call initial. There are two other parameters: increment and n. During each step of the game you game you may: (a) ask for and receive from your friend increment more bears; or (b) if you have an even number of bears, give your friend exactly half your bears. You must have in your possession exactly goal bears after at most n steps in order to win

    For example, let initial be 99, goal be 91 and increment be 53. If n is a least 4, then the following sequence of steps will result in a win for you: <br>
    Get 53 bears from friend (99 &#8594; 152) <br>
    Give half of bears to friend (152 &#8594; 76) <br>
    Give half of bears to friend (76 &#8594; 38) <br>
    Get 53 from friend (38 &#8594; 91)
    
    Write a recursive method that tells us whether we can reach a desired goal starting with an initial number of bears and given an increment and maximum number of steps, n
   ```
    public static boolean bears(int initial, int goal, int increment, int n){
        if (initial == goal)
            return true;
        else if (n == 0)
            return false;
        else if (bears(initial + increment, goal, increment, n-1))
            return true;
        else if ((initial % 2 == 0) && bears(initial/2, goal, increment, n-1))
            return true;
        else
            return false;
    }
   ```