class Max_element 
  {
    public static void main(String[] args)
      {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) 
         {
            if (arr[i] > max) 
            {
                max = arr[i];
            }
         }

        System.out.println("The maximum element in the array is: " + max);
      }
  }
