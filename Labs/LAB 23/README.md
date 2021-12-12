1. (**Occurrences.java**) Occurrences of a specified character in an array) Write a recursive method that finds the number of occurrences of a specified character in an array. You need to declare the following two methods. The second one is a recursive helper method.
               
               public static int count(char[ ] chars, char ch){...}

               public static int count(char[ ] chars, char ch, int high){...}
               

2. (**LargestArray.java**) Define a recursive method named findLargest(), which locates and returns the largest value in an array of integers. For the sake of efficiency, your method should use the max() helper method below:

        public static int max(int a, int b){
            if (a > b) 
                return a;
            else 
                return b;
        }

Your method header should look like the following:

`public static int findLargest (int [ ] list, int currentIndex)`

3. (**SelectionSortRecursive.java**) Implement the selection sort method recursively.

4. (**BinarySearchRecursive.java**) Implement the binary search method recursively.
