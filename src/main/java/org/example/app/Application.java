package org.example.app;

import org.example.button.Button;
import org.example.checkbox.Checkbox;
import org.example.factories.GUIFactory;

public class Application {
    private Button button; // é criado uma variavel do tipo Button que é uma interface
    private Checkbox checkbox; //é criado uma variavel do tipo checkbox que é uma interface

    public Application(GUIFactory factory){ //O contrutor que esta recebendo a interface GUIFactory, porque a partir dela é possível instanciar as suas implementações
        button = factory.createButton(); // Ao receber o metodo desta interface, torna-se possível receber o retorno desta implementação que sera a instancia de um button
        checkbox = factory.createCheckbox(); // Da mesma forma que na linha de cima, quando a implementação desta interface faz o uso desses métodos ela retornará uma instancia de um checkbox
    }

    public void paint(){ //O método paint é criado no application porque será através dele que os metodos da interface button e checkbox serão chamados
        button.paint(); // Chamamos o metodo que esta na interface e que foi implementada pela instancia que foi atribuida dentro do construtor
        checkbox.paint(); //Aqui ocorre o mesmo na linha de cima, quando atribuimos dentro do construtor a instancia de button e de checkbox, podemos usar os metodos implementados por essas classes
    }
}
