import java.util.Random;

public class smllk{

  public static void main(String[] args) {
    int[] d = {42,2,5,23,56,12};
    int a = partition(d,0,d.length-1);
    System.out.println("a + " + a);
    System.out.println(check(d,a));
    String as = "";
    for (int x = 0; x < d.length; x++) {
      as += d[x] + " ";
    }
    System.out.println(as);
  }

  public static int partition (int [] data, int start, int end) {

    Random r = new Random();
    int starter = start;
    int ender = end;
    int pivot = r.nextInt(data.length-1);
    int storage;

    System.out.println(pivot);

    storage = data[pivot];
    data[pivot] = data[starter];
    data[starter] = storage;

    for (int x = starter+1; x < data.length ; x++) {
      if (x == ender) {
        if (data[x] <= data[starter]) {
          storage = data[x];
          data[x] = data[starter];
          data[starter] = storage;
          return x;
        }
        else {
          storage = data[x-1];
          data[x-1] = data[starter];
          data[starter] = storage;
          return x-1;
        }

      }
      if (data[x] > data[starter]) {
        storage = data[ender];
        data[ender] = data[x];
        data[x] = storage;
        ender--;
        x--;
      }
      
    }
    return -1;
  }

  public static boolean check(int data[], int index) {
    for (int x = 0 ; x < index; x++) {
      if (data[x] > data[index]) {
        return false;
      }
    }
    for (int y = data.length -1; y > index; y--) {
      System.out.println("y + " + y);
      System.out.println("index + " + index);
      if (data[y] < data[index]) {
        return false;
      }
    }
    return true;
  }
}
