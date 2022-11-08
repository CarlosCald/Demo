public class Main {
    public static void main(String[] args) {
        Puerta miPuerta = new Puerta();
        miPuerta.AumentarPuerta();
        miPuerta.AumentarPuerta();
        miPuerta.AumentarPuerta();
        System.out.println(miPuerta.Puerta);
    }

    public static int suma(int a, int b){
        return a + b;

    }
}
class Puerta {
    public int Puerta = 0;

    public void AumentarPuerta() {
        this.Puerta++;

    }
}
