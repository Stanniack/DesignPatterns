
package Decorator;

public abstract class CoquetelDecorator extends Coquetel {
    protected Coquetel coquetel;

    public CoquetelDecorator(Coquetel umCoquetel) {
        coquetel = umCoquetel;
    }
    
    @Override
    public String getNome () {
        return coquetel.getNome() + " + " + nome;
    }
    
    @Override
    public double getPreco() {
        return coquetel.getPreco() + preco;
    }
    
    
    
}
