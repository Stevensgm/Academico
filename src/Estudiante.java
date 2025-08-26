public class Estudiante {

    private String nombre;
    private int semestreActual, idEstudiante;


    public Estudiante ()  {}

    public Estudiante (String nombre, int semestreActual, int idEstudiante){
     this.nombre = nombre;
     this.semestreActual = semestreActual;
     this.idEstudiante = idEstudiante;

    }


    public void mostrarInformacion () {
        System.out.println("Nombre: " + nombre);
        System.out.println("Semestre Actual: " + semestreActual);
        System.out.println("ID del Estudiante: " + idEstudiante);
    }
    
}

