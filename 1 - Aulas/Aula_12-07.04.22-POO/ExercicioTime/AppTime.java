package ExercicioTime;

import java.util.Scanner;

public class AppTime {
    public static void main(String[] args) {
        Time time = new Time();
        Scanner scanner = new Scanner(System.in);

        time.setHora(12);
        time.setMinuto(04);
        time.setSegundo(40);

        System.out.println(time.visualizarHoraUniversal());
        System.out.println(time.visualizarHoraAmPm());        

        scanner.close();
    }
}
