import java.util.Objects;

public class Animal {
    private static int contador;
    protected String especie;
    protected int peso;

    public Animal(String especie, int peso) {
        this.especie = especie;
        this.peso = peso;
    }

    public void alimentar(int peso){
       this.peso=this.peso+peso;
       contador++;
    }
    public static int getContador(){
        return contador;
    }
    @Override
    public boolean equals(Object o){
        if(this ==o){
            return true;
        }
        if(o==null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(this.especie,animal.especie)&& this.peso==animal.peso;
    }

    public int getPeso() {
        return peso;
    }
}
