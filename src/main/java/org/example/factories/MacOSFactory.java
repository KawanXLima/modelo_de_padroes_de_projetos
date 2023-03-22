package org.example.factories;

import org.example.button.Button;
import org.example.button.MacOSButton;
import org.example.checkbox.Checkbox;

public class MacOSFactory implements GUIFactory{ // Essa classe implementa a interface GUIfactory
    @Override //Override para sobreescrever o metodo
    public Button createButton() { //esse é o método que deverá ser implementado para cumprir o contrato da interface
        return new MacOSButton(); // retorna a instancia de uma classe que sera utilizada para implementar a interface button
    }

    @Override
    public Checkbox createCheckbox() {//esse é o método que deverá ser implementado para cumprir o contrato da interface
        return new org.example.checkbox.MacOSCheckbox(); //retorna a instancia de uma classe que sera utilizada para implementar a interface button
    }
}
