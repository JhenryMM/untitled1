public class main {
    public static void main(String args[]){
        Animal e= new Animal("gato",4);
        Animal s = new Animal("gato",4);
        Animal z = new Animal("gatubela", 7);
        Perro c = new Perro("nose",6,"canino");
        Perro a = new Perro("nose",6,"canino");
        Perro m = new Perro ("toshi",8,"canino");
        System.out.println(e.equals(s));
        System.out.println(e.equals(z));
        System.out.println(c.equals(a));
        System.out.println( c.equals(m));
       e.alimentar(5);
       s.alimentar(6);
       c.alimentar(4);
       System.out.println(e.getPeso());
       System.out.println(Animal.getContador());
       e.alimentar(7);
       System.out.println(Animal.getContador());
       System.out.println("nose");
                        System.out.println("para");
    }

}
