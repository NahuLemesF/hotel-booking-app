package example.hotel;

import java.util.Scanner;

public class Main {

    static String[][] hotels = {
            //{Nombre, Ciudad, Tipo Alojamiento, Cantidad de Estrellas, Precio, Servicios(en Dia de Sol)}
            {"Hotel Buenos Aires Plaza", "Buenos Aires", "Hotel", "5", "120"},
            {"Hotel Cordoba Heights", "Córdoba", "Hotel", "4.8", "90"},
            {"Apartamento Sky Mendoza", "Mendoza", "Apartamento", "4", "70"},
            {"Apartamento Terraza Salta", "Salta", "Apartamento", "3", "50"},
            {"Finca Los Andes", "Mendoza", "Finca", "4", "100"},
            {"Finca Cielo Salta", "Salta", "Finca", "3.5", "75"},
            {"Balneario Bariloche Relax", "Bariloche", "Día de Sol", "5", "40", "Piscina climatizada, spa, actividades acuáticas"},
            {"Resort Día de Sol Salta", "Salta", "Día de Sol", "4", "35", "Piscina, actividades al aire libre, almuerzo buffet"}
    };

    public static void main(String[] args) {
        System.out.println("Bienvenido al HotelApp");
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú principal:");
            System.out.println("1. Crear una reserva");
            System.out.println("2. Actualizar una reserva");
            System.out.println("3. Cancelar una reserva");
            System.out.println("4. Salir");

            option = scanner.nextInt();
            switch (option) {
                case 1 -> createReservation();
                case 2 -> updateReservation();
                case 3 -> cancelReservation();
                case 4 -> {
                    System.out.println("Gracias por utilizar HotelApp. Hasta la próxima! :)");
                    scanner.close();
                    exit = true;
                }
                default -> System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }
        }
    }

    public static void createReservation() {
        System.out.println("Crear una reserva");
    }

    public static void updateReservation() {
        System.out.println("Actualizar una reserva");
    }

    public static void cancelReservation() {
        System.out.println("Cancelar una reserva");
    }


}