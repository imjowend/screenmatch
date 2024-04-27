import com.imjowend.screenmatch.Modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.evalua(10);
        miPelicula.evalua(8);

        miPelicula.muestraFichaTecnica();

        System.out.println(miPelicula.getTotalEvaluaciones());

        System.out.println(miPelicula.calculaMedia());
    }
}
