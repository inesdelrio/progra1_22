package interfaz;

import dominio.*;


public class Interfaz {
    private static String negrita = "\033[1m";
    private static String normal = "\033[0m";
    private static String subrayado = "\033[4m";
    private static String rojo = "\u001B[31m";
    private static String negro = "\u001B[30m";

    private static void mostrarAyuda() {
        System.out.println(negrita + "NOMBRE" + normal);
        System.out.println("\t" + subrayado + "inventario de productos" + normal);
        System.out.println(negrita + "\nSYNOPSIS" + normal);
        System.out.println("\tjava -jar zapatillas.jar" + subrayado + "[annadir <modelo color precio talla> | mostrar | ayuda ]" + normal);
        System.out.println(negrita + "\nDESCRIPCIÓN" + normal);
        System.out.println("\tGestiona un catálogo de Converse. Permite añadir y mostrar zapatillas Converse.");
        System.out.println(negrita + "\nEJEMPLOS" + normal);
        System.out.println("\tEjemplo 1. Añadido de unas zapatillas:\n");
        System.out.println(negrita + "\t\tjava -jar zapatillas.jar annadir Converse altas negras 70 37\n" + normal);
        System.out.println("\tEjemplo 2. Listado de zapatillas\n");
        System.out.println(negrita + "\t\tjava -jar zapatillas.jar mostrar" + normal);
        System.out.println("\t\nEjemplo 3. Muestra esta ayuda:\n");
        System.out.println(negrita + "\t\tjava -jar zapatillas.jar ayuda\n" + normal);
    }

    public static void ejecutar(String[] instruccion) {
        Inventario inventario = new Inventario();
        if (instruccion.length == 0) mostrarAyuda();
        else if (instruccion[0].equalsIgnoreCase("annadir")) {
            inventario.addZapatillas(instruccion[1], instruccion[2], Integer.parseInt(instruccion[3]), Integer.parseInt(instruccion[4]));
        } else if (instruccion[0].equalsIgnoreCase("mostrar")) System.out.print(inventario);
        else if (instruccion[0].equalsIgnoreCase("ayuda")) mostrarAyuda();
        else {
            System.out.println(rojo + "Error en la instrucción" + normal);
            mostrarAyuda();
        }
    }
}


