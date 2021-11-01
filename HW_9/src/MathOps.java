import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MathOps {
    public static void div() throws IOException {
        String first;
        String secound;
        double fstnum;
        double secnum;
        double result;
        boolean stop = true;
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для ділення, введіть два числа:");
        try {
            while (stop) {
                first = rd.readLine();
                secound = rd.readLine();
                fstnum = Double.parseDouble(first);
                secnum = Double.parseDouble(secound);
                if(secnum == 0){throw new ArithmeticException();}
                result = fstnum / secnum;
                System.out.println("Результат ділення\n" + fstnum + " / " + secnum + " = " + result);
                stop = false;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ви ввели не числове значення...");
        }catch (ArithmeticException e) {
            System.out.println("На нуль ділити неможна ");
        }
    }

    public static void readNumber(int start, int end) throws IOException {
        int num;
        int counter = 0;
        int[] nums = new int[10];
        String input;
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть ціле число в діапазоні від " + start + " до " + end + " включно...");
        //таймер, який зупиняє цикл, коли було введено 10 чисел в діапазоні, числа записуються в масив і в кінці сортуються та виводяться
        while (counter < 10) {
            try {
                input = rd.readLine();
                num = Integer.parseInt(input);
                if (num >= start & num <= end) {
                    System.out.println("Ви ввели число: " + num);
                    nums[counter] = num;
                    counter++;
                } else System.out.println("Введене вами число не лежить у вказаному діапазоні, спробуйте ще раз");
            } catch (NumberFormatException e) {
                System.out.println("Ви ввели не числове значення...");
            }
            Arrays.sort(nums);
            System.out.println("Введені вами числа...");
            System.out.println(Arrays.toString(nums));
        }
    }
}

