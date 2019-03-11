import java.util.Random;

public class smllk{


  public int partition (int [] data, int start, int end) {

    Random r = new Random();
    int starter = start;
    int ender = end;
    int pivot = r.nextInt(data.length);
    int compare;
    int storage;

    compare = data[pivot];
    data[pivot] = data[starter];
    data[starter] = compare;

    starter++;

    for (int x = starter; starter < data.length ; starter++) {
      if (x == ender) {
        if (data[x] <= compare) {
          storage = data[x];
          data[x] = data[start];
          data[start] = data[x];
          return x;
        }
        else {
          storage = data[x-1];
          data[x-1] = data[start];
          data[start] = data[x-1];
          return x-1;
        }

      }
      if (data[x] > compare) {
        storage = data[ender];
        data[ender] = data[x];
        data[x] = storage;
        ender--;
      }
    }
    return -1;
  }
}
