
package examples;

import Decorator.Cachaca;
import Decorator.Coquetel;
import Decorator.CoquetelDecorator;
import Decorator.Refrigerante;
import Decorator.Rum;
import Decorator.Suco;


public class Main {
    
    public static void main(String[] args) {
        
        Coquetel meuCoquetel = new Cachaca();
        System.out.println(meuCoquetel.getNome() + " = " + meuCoquetel.getPreco());
        
        meuCoquetel = new Suco(meuCoquetel); 
        System.out.println(meuCoquetel.getNome() + " = " + meuCoquetel.getPreco());
        
        meuCoquetel = new Refrigerante(meuCoquetel); 
        System.out.println(meuCoquetel.getNome() + " = " + meuCoquetel.getPreco());
        

    }
}
