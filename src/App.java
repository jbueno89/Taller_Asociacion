public class App {
    public static void main(String[] args) throws Exception {
     Lector lector1 = new Lector("Juan", "123456789");
     Lector lector2 = new Lector("Maria", "987654321");
     Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", true);
     Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", true);

     lector1.tomarPrestado(libro1);
     lector1.mostrarEstado();
     
    }
}
