package com.company;

public class Main {

    public static void main(String[] args) {
	    int idade = 25;

	    if(idade <= 12){
	        System.out.println("Criança");
        }
	    else if(idade >=12 && idade<=18){
	        System.out.println("Adolescente");
        }
	    else {
	        System.out.println("Adulto");
        }
    }
}
