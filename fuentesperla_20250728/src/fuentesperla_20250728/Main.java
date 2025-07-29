 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuentesperla_20250728;

/**
 *
 * @author UFG
 */
public class Main {
    
    /*VARIABLES GLOBALES*/
    public static String nombres = "Karla Veronica";
    public static String apellidos = "Fuentes Perla";
    public static int anio_nacimiento = 2005;
    public static int mes_nacimiento = 9;
    public static float estatura = 1.67f; //ESTATURA EN MT
    public static float peso = 114.8f;  //PESO EN LIBRAS
    public static char genero = 'F';
    public static String estado_familiar = "Soltero";
    public static double salario_mensual = 500d;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double imc = 0.0d;
        float tasa_kilogramos = 0.453592f; //1 libra equivale a 0.453592 kg
        int dias_laborales = 22; // 22 DIAS LABORALES AL MES
        int horas_laborales = 8; //8 HORAS LABORALES AL DIA
        
        //CONVERTIR EL PESO A KG
        float peso_kilogramos = Main.peso * tasa_kilogramos;
        
        //ELEVANDO LA ESTATURA AL CUADRADO
        float estatura_al_cuadrado = Main.estatura * Main.estatura; 
        
        //CALCULA IMC
        imc = peso_kilogramos / estatura_al_cuadrado;
        
        //CALCULANDO EL SALARIO DIARIO
        double salario_diario = Main.salario_mensual/dias_laborales;
        
        //CALCULANDO EL SALARIO POR HORA
        double salario_hora = salario_diario/horas_laborales;
        
        /*************************/
        /*****SALIDA DE DATOS*****/
        /*************************/
        
        System.out.println("Saludos " +Main.nombres+ " "+Main.apellidos);
        System.out.println("Su peso en libras es: "+Main.peso+ ", pero en kilogramos es: "+peso_kilogramos);
        System.out.println("Su indice de Masa Corporal es: "+imc);
        System.out.println("Su salario mensual es: "+Main.salario_mensual);
        System.out.println("Su salario diario es: "+salario_diario);
        System.out.println("Su salario por hora es: "+ salario_hora);
        
        
    }
    
}
