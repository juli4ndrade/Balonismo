
public class Combustivel {

	//atrubutos

    String componentes;
    double precoLitro;
    double precoQuilo;
    String nome;
    
    //método
    
    
    
    //construtor padrão
    public Combustivel(){

        
    }
    public Combustivel(String componentes, double precoLitro, double precoQuilo, String nome) {
        this.componentes = componentes;
        this.precoLitro = precoLitro;
        this.precoQuilo = precoQuilo;
        this.nome = nome;
    }


    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public double getPrecoLitro() {
        return precoLitro;
    }

    public void setPrecoLitro(double precoLitro) {
        this.precoLitro = precoLitro;
    }

    public double getPrecoQuilo() {
        return precoQuilo;
    }

    public void setPrecoQuilo(double precoQuilo) {
        this.precoQuilo = precoQuilo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
