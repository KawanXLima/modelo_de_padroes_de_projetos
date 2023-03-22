package org.example.app;

import org.example.factories.GUIFactory;
import org.example.factories.MacOSFactory;
import org.example.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication(){
        Application app; //utilizamos uma variavel que futuramente sera uma referencia a uma intancia do tipo application
        GUIFactory factory; //criamos esta variavel da interface para receber a instancia de sua implementação
        String osName = System.getProperty("os.name").toLowerCase(); //pega a propriedade de system e referencia o nome do sistema operacional deixando tudo em caixa baixa
        if (osName.contains("mac")){ //verifica se o valor é mac
            factory = new MacOSFactory(); //se a condição for verdadeira, a variavel factory recebe a instancia MacOSFcatory que esta implementando os metodos da interface
        }else{
            factory = new WindowsFactory(); // senão recebe a interface windowsfactory, que tambem esta implementando o GUIFactory.
        }
        app = new Application(factory); //aqui estamos instanciando um application que esta recebendo como parametro a variavel factory com valor
        return app; //aqui retornamos a variavel app.
    }

    public static void main(String[] args) {
        Application app = configureApplication(); //chamamos o metodo e atribuimos o retono dele na variavel app.
        app.paint(); //aqui chamamos um método que esta dentro de app para retornar uma mensagem
    }
}
