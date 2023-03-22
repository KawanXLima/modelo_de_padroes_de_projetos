package org.example.factories;

import org.example.button.Button;
import org.example.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton(); //metodo que sera implementado e retorna a instancia de uma classe que será a implementação da interface button
    Checkbox createCheckbox(); //metodo que sera implementado e retorna a instancia de uma classe que será a implementação da interface chekbox
}
