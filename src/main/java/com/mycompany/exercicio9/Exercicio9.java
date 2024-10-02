/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio9;

/**
 *
 * @author Jhonatan Matos Schmitt
 * Escreva um programa em JAVA que solicite ao usuário o seu
peso(aqui entenda massa) em Kg (int) e a sua altura em metros
(Double). Com estes dados calcule o IMC – Índice de Massa
Corporal. Seguindo a seguinte fórmula.
IMC = massa / (altura * altura )
Mostre o resultado em uma mensagem. 
 */

import java.util.Scanner;
public class Exercicio9 {

    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
           System.out.print("Digite seu peso: ");
            double peso = scanner.nextDouble();
            System.out.print("Digite sua altura ");
            double altura = scanner.nextDouble();
            double imc = peso / (altura * altura);
            System.out.println("Seu IMC e: " + imc);
            scanner.close();
       }
    }
}
