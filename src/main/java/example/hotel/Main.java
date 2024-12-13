package example.hotel;

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
    }
}