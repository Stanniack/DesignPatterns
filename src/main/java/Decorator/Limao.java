
package Decorator;

public class Limao extends CoquetelDecorator {
    
    public Limao(Coquetel umCoquetel) {
        super(umCoquetel);
        nome = "Limao";
        preco = 0.5;
    }
    
}
