package org.example.button;

public class MacOSButton implements Button{ // Essa classe implementa a interface button
    @Override //Override para sobreescrever o metodo
    public void paint() { //esse é o método que deverá ser implementado para cumprir o contrato da interface
        System.out.println("You have created MacOSButton."); // aqui printamos o resultado do metodo na tela.
    }
}
