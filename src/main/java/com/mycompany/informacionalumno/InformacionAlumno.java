
package com.mycompany.informacionalumno;

import java.util.Scanner;

public class InformacionAlumno {

    Scanner entrada= new Scanner(System.in);
    String nombre,fecha,direccion,telefono;
    
    public int cuenta,semestrecursa;
    
    public String CDI,CE,I,P,TA,TS;    
    
    public void InformacionPersonal(){
        System.out.print("Dame los siguientes datos\n");
        System.out.print("Nombre completo : ");
        nombre = entrada.nextLine();
        System.out.print("Fecha de nacimiento : ");
        fecha = entrada.next();
        System.out.print("Número de telefono : ");
        telefono=entrada.next();
        System.out.print("Dirección : ");
        direccion=entrada.next();
        
    }

    public void InformacionAcademica(){
        System.out.println("Dame los datos de tu situacion académica");
        System.out.print("Numero de cuenta : ");
        cuenta=entrada.nextInt();
        System.out.print("Semestre que está cursando : "); 
        semestrecursa=entrada.nextInt();
    }

    public void Horarios(){
        System.out.println("Dame el horaio de los dias que te toca la materia y de que hora a que hora tomas esa clase");
        System.out.print("Calculo Diferencial e Integral :");
        CDI=entrada.nextLine();
        System.out.print("Circuitos Electricos : ");
        CE=entrada.nextLine();
        System.out.print("Ingles : ");
        I=entrada.nextLine();
        System.out.print("Programación : ");
        P=entrada.nextLine();
        System.out.print("Teoría de Algorítmos : ");
        TA=entrada.nextLine();
        System.out.print("Teoría de Sistemas : ");
        TS=entrada.next();
    }

    public void IPC(){
        System.out.println("\" Tu nombre es "+nombre+" naciste el "+fecha+",tu numero de telefono es "+telefono+" y tu direccion es "+direccion);   
    }
    
    public void IA(){
        System.out.println("\" Tu número de cuenta es "+cuenta+" y el semestre que estas cursando es el "+semestrecursa);
    }
            
    public void h(){
        System.out.println("Tus horarios son los siguientes : \n"+CDI+"\n"+CE+"\n"+I+"\n"+P+"\n"+TA+"\n"+TS);
    }
    public static void main(String[] args) {
        InformacionAlumno informacionp= new InformacionAlumno();
        informacionp.InformacionPersonal();
        
        InformacionAlumno informaciona=new InformacionAlumno();
        informaciona.InformacionAcademica();
        
        InformacionAlumno horarios=new InformacionAlumno();
        horarios.Horarios();
        
        informacionp.IPC();
        informaciona.IA();
        horarios.h();
    }
}
//1.Nombre completo del alumno.
//2.Fecha de nacimiento.
//3.Teléfono.
//4.Dirección.

//5.Número de cuenta.
//6.Semestre que cursa.

//7.Materias que cursa (Horario).