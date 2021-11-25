import java.util.Objects;

public class Perro extends Animal{
    protected String raza;

    public Perro(String especie, int peso, String raza) {
        super(especie, peso);
        this.raza=raza;
    }

    @Override
    public boolean equals(Object o){
        if(!super.equals(o)) return false;
        Perro perro =(Perro) o;
        return Objects.equals(this.raza,perro.raza);
    }
}
