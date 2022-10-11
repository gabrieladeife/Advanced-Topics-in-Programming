import java.lang.reflect.Array;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    GenericStackArray<String> stack1 = new GenericStackArray<>();
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");
        System.out.println(stack1.toString());
        stack1.pop();
        System.out.println(stack1.toString());
     GenericStackArray<Integer> stack2 = new GenericStackArray<>();
        stack2.push(1); // autoboxing 1 to an Integer object
        stack2.push(2);
        stack2.push(3);
        System.out.println(stack2.toString());
        stack2.pop();
        System.out.println(stack2.toString());
  }
}

class GenericStackArray<E> {
  private E[] genericArr;

  public GenericStackArray(){
    genericArr = (E[]) new Object[5];
    
  }
  
  public int getSize() {
    return genericArr.length;
    }

  //checks if arr is full, if true, it doubles the size of the array
  public E[] fullArr(E[] list){
    int j = list.length;
    if(list[j-1] != null)
    {
      E[] list2 = (E[]) new Object[j * 2];
      for(int i = 0; i < list.length; i++){
        list2[i] = list[i];
        }
      return list2;
    }
    return list;
  }
  
  public E peek() {
    return genericArr[genericArr.length-1];
    }

  //adds an element into array, uses fullArr function to expand the array if full.
  public void push(E o) {
    genericArr = fullArr(genericArr);
    for(int i = 0; i < genericArr.length; i++){
     {
       if(genericArr[i] == null){
        genericArr[i] = o;
         break;
        }
      }
    }
    }
  
  //removes last entered element in the array.
  public E pop() {
    E o = genericArr[0];
    for(int i = 0; i < genericArr.length; i++){
      if(genericArr[i] == null){
        o = genericArr[i-1];
        break;
      }
    }
    
    for(int i = 0; i < genericArr.length; i++){
      if(genericArr[i] == null){
        genericArr[i-1] = null;
        break;
      }
    }
    return o;
    }

  
  public boolean isEmpty() {
    boolean empty = true;
    for(int i = 0; i < genericArr.length; i++){
      if(genericArr[i] != null)
        empty = false;
    }
    return empty;
    }
  @Override
  public String toString() {
    return Arrays.toString(genericArr);
    }
  
}