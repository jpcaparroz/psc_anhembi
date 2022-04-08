package ExercicioTime;

public class Time {

    private int hora;
    private int minuto;
    private int segundo;

    public void setHora(int hora) {

        if (hora <= 23) {
            this.hora = hora;

        } else {

            System.out.println("Hora inválida");
        }
    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int minuto) {

        if (minuto <= 59) {
            this.minuto = minuto;

        } else {

            System.out.println("Minuto inválido");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundo(int segundo) {

        if (segundo <= 59) {

            this.segundo = segundo;
        } else {
            System.out.println("Segundo inválido");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public String visualizarHoraUniversal() {

        String horario = hora + ":" + minuto + ":" + segundo + " horas";

        return horario;
    }

    public String visualizarHoraAmPm() {

        String horarioAmPm = hora + ":" + minuto + ":" + segundo + " AM";

        if (hora > 12) {

            hora = hora - 12;
            horarioAmPm = hora + ":" + minuto + ":" + segundo + " PM";
        }

        return horarioAmPm;
    }
}
