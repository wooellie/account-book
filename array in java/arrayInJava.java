//array in java
//create an array class,initialize an array, access/modify an element in an array, iterate over an array, append an elementt in an array, remove an element in an array.
//public class should be of the same name as the file name
public class arrayInJava{
  public static void main(String[] args){
    //initialize an array
    int[] arr = {1, 2, 3, 4, 5};

    //access an element in an array
    System.out.println("Element at first index:" + arr[0]);
    System.out.println("Element at 2nd index:" + arr[1]);

    //modify an element in an array
    arr[2] = 10;
    System.out.println("Elements in the array");
    for(int i : arr){
      System.out.println(i);
    }
    System.out.println();

    //iterate over an array
    System.out.println("Iterating over the array using for loop:");
    for(int i=0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
    System.out.println();

  //appens an element in an array(java arrays are fixed size, so we need to create a new array)
  //create a newarray one size larger than the original array.copy old elements into the new array. add tha last element. give the new elements to the old array.
  int[] newArr = new int[arr.length + 1];
  for(int i = 0; i < arr.length; i++){
    newArr[i] = arr[i];
  } 
  newArr[arr.length] = 6; //appending 6 to the array
  arr = newArr;
  System.out.println("Elements in the appened array: ");
  for(int i : arr){
    System.out.println(i);
  }
  System.out.println();

  //remove an element from an array
  //the for loop and index are important.
  int removeValue = 5; //value to be removed
  int count = 0;
  for(int i : arr){
    if(i != removeValue){
      count++;//use count to count the number of certain element to avoid wrong length for the new array.
    }
  }
  int index = 0;//use an index to confirm where to insert element in the new array.
  int[] newArr2 = new int[count];//if the length of the new array should be the same as the old array without certain element.

  for(int i = 0; i < arr.length; i++){//iterate through the length of the old array to include all the elements.
    if(arr[i] != removeValue){
      newArr2[index] = arr[i];
      index++;
    }
    
  }
  arr = newArr2;
  System.out.println("Elements in the array after removing " + removeValue + ": ");
  for(int i : arr){
    System.out.println(i);
  }
  }
}
//notice: for(int i : arr)means i goes through each element in the array arr.
//for(int i=0; i < arr.length; i++) means i goes from 0 to the length of the array arr.
/*
the for(i : arr) loop makes i the value of arr's element, not the index of arr's element. 
if the values are 5,2,3,7, then i is 5,2,3,7. it's unsuitable in a for loop. 
I need to use the for loop based on the index of each element, 
so I need to use a for loop like this: for(int i = 0; i < arr.length; i++).
and I need to confirm where to insert element in newArr, so newArr[index] = arr[i]; index++
*/