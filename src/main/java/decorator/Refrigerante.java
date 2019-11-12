
package Decorator;


public class Refrigerante extends CoquetelDecorator {
    
    public Refrigerante(Coquetel umCoquetel) {
        super(umCoquetel);
        nome = "Refrigerante";
        preco = 2.5;
    }
    
}
