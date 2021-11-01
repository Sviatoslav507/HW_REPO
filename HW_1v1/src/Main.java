import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Brick br = new Brick();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ведіть для початку число \"1\"");
            if (sc.hasNextDouble() & sc.nextDouble() > 0) {
                System.out.println("Введіть довжину отвору");
                br.sethLength(sc.nextDouble());
                System.out.println("Введіть висоту отвору");
                br.sethHeight(sc.nextDouble());
                System.out.println("Введіть довжину цегли");
                br.setbLength(sc.nextDouble());
                System.out.println("Введіть висоту цегли");
                br.setbHeigh(sc.nextDouble());
                System.out.println("Введіть ширину цегли");
                br.setbWidth(sc.nextDouble());
            } else System.out.println("Ви ввели від'ємне число або не число");
        }catch(InputMismatchException e){
            System.out.println("Ви ввели не дійсні данні");
        }
       if(br.CheckA(br)){
           System.out.println("Сторона А проходить в отвір");
       }else { System.out.println("Сторона А не проходить  в отвір"); }
        if(br.CheckB(br)){
            System.out.println("Сторона B проходить в отвір");
        }else { System.out.println("Сторона B не проходить  в отвір"); }
    }
}
