package org.example.factories;

import org.example.button.Button;
import org.example.button.WindowsButton;
import org.example.checkbox.Checkbox;
import org.example.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() { //esse é o método que deverá ser implementado para cumprir o contrato da interface
        return new WindowsButton(); // retorna a instancia de uma classe que sera utilizada para implementar a interface button

    }

    @Override
    public Checkbox createCheckbox() { //esse é o método que deverá ser implementado para cumprir o contrato da interface
        return new WindowsCheckbox();// retorna a instancia de uma classe que sera utilizada para implementar a interface checkbox
    }
