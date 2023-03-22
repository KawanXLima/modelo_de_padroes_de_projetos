package org.example.checkbox;

public class MacOSCheckbox implements Checkbox{ // Essa classe implementa a interface Checkbox
    @Override //Override para sobreescrever o metodo
    public void paint() { //esse é o método que deverá ser implementado para cumprir o contrato da interface
        System.out.println("You have created MacOSCheckbox.");  // aqui printamos o resultado do metodo na tela.
    }
}
