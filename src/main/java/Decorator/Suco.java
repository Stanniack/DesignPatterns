package Decorator;

public class Suco extends CoquetelDecorator{
    
    public Suco(Coquetel umCoquetel) {
        super(umCoquetel);
        nome = "Suco";
        preco = 1.5;
    }
    
}
