import java.util.Arrays;
import java.util.Scanner;

public class Main {

  final static int TIME_WINDOW = 60;
  final static double sensorDist1 = 1, sensorDist2 = 2, sensorDist3 = 3;

  public static void main(String[] args) {
    double[] arr = new double[TIME_WINDOW * 3];
    double sensor1, sensor2, sensor3;
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < TIME_WINDOW; i++) {
      System.out.println("Enter sensor 1 value:");
      sensor1 = scanner.nextDouble();
      arr[3 * i] = sens1(sensor1);

      System.out.println("Enter sensor 2 value:");
      sensor2 = scanner.nextDouble();
      arr[3 * i + 1] = sens2(sensor2);

      System.out.println("Enter sensor 3 value:");
      sensor3 = scanner.nextDouble();
      arr[3 * i + 2] = sens3(sensor3);

      System.out.println("At Time " + i);
      System.out.println("Calculated Sensor Value 1: " + sens1(sensor1));
      System.out.println("Calculated Sensor Value 2: " + sens2(sensor2));
      System.out.println("Calculated Sensor Value 3: " + sens3(sensor3));
    }

    System.out.println(Arrays.toString(arr));
  }

  public static double sens1(double input) {
    return sensorDist1 + Math.sqrt((1 / input) - 1);
  }

  public static double sens2(double input) {
    return sensorDist2 + Math.sqrt((1 / input) - 1);
  }

  public static double sens3(double input) {
    return sensorDist3 + Math.sqrt((1 / input) - 1);
  }

}
