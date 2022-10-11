import java.util.ArrayList;

class Main {
   public static <E extends Comparable<E>> E max(E [] list){
    E max = list[0];

    for(int i = 0; i < list.length; i++){
      if (max.compareTo(list[i]) < 0 ) max = list[i];
    }
    return max;
  }
   public static <E> ArrayList<E> removeDuplicates (ArrayList<E> list){
     ArrayList<E> list2 = new ArrayList<>();
     for (int i = 0; i < list.size(); i++){
       if (list2.contains(list.get(i))) {
         
       }
       else list2.add(list.get(i));
     }
     return list2;
   }
  public static void main(String[] args) {
    Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 , 9 , 11};

    ArrayList<Character> charList = new ArrayList<>();
    charList.add('b');
    charList.add('r');
    charList.add('B');
    charList.add('g');
    charList.add('b');
    charList.add('A');
    charList.add('c');
    charList.add('b');

    System.out.println("The max of the array is " + max(arr));

    System.out.println("The nonduplicate list is" + removeDuplicates(charList));
  }
}
