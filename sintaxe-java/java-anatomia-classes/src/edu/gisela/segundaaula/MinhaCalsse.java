package edu.gisela.segundaaula;
public class MinhaCalsse {
    
public static void main (String [] args) {   
    
    String primeiroNome = "Gisela";
    String segundoNome = "Soares";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    System.out.print(nomeCompleto);

}

public static String nomeCompleto (String primeiroNome, String segundoNome) {

    return "Resultado do Método " + primeiroNome.concat(" ").concat(segundoNome);

}

}
