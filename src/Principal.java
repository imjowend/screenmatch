import com.imjowend.screenmatch.Modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;

        miPelicula.evalua(10);
        miPelicula.evalua(8);

        miPelicula.muestraFichaTecnica();

        System.out.println(miPelicula.getTotalEvaluaciones());

        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 180;

        otraPelicula.muestraFichaTecnica();

        System.out.println(otraPelicula.getTotalEvaluaciones());
    }
}
