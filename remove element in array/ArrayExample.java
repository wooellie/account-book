//remove an element from an array
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



      for(int i : arrRemove){
        System.out.print(i + " ");
      }
      System.out.println(" ");
      
      }

}
