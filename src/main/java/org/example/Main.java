package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        int senha,senhaUsuario;

        System.out.println("Digite a senha para cadastro:");
        senha = numero.nextInt();

        System.out.println("Digite a senha novamente para confirmacao:");
        senhaUsuario = numero.nextInt();

        while(senhaUsuario != senha){

            System.out.println("Senha invalidade");
            System.out.println("Digite a senha novamente");
            senhaUsuario = numero.nextInt();

        }

        System.out.println("Senha correta");

    }
}