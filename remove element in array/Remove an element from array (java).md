### Remove an element from array (java)

```java
public class ArrayExample{
    public static void main(String[] args){
      int arr[] = {1, 2, 3, 4, 5};
      int removeValue = 2;
      int count = 0;
      for(int i : arr){
        if(i != removeValue){
            count++;
        }
      }

      //create a new array eith the size of count
      int[] arrRemove = new int[count];
      int index = 0;
      //copy elements to the new array
      for(int i : arr){//declare the type of i inside the for loop
        if(i != removeValue){
          arrRemove[index] = i;
          index++;
        }
      }
```

there are 3 key points:

1. count the number of elements in the array. that's because the array in java are fix-sized.
2. create a new array has the same number of elements except for the element to be removed.(If the element is not found, the new array will have the same element number as the old array)
3. use an index variable to track the elements. copy the old elements into the new array, except for the element to be removed.

