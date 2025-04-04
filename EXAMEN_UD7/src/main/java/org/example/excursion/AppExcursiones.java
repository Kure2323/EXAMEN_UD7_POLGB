package org.example.excursion;

public class AppExcursiones {
    public static void main(String[] args) {


        Excursion terramitica = new Excursion("Terra Mítica", "Benidorm", 23.55);

        terramitica.inscribirAsistente(new Estudiante("Pérez", "Pepito", "1DAM", 17));
        terramitica.inscribirAsistente(new Estudiante("García", "Juanillo", "2DAM", 22));
        terramitica.inscribirAsistente(new Estudiante("Bermejo", "Abdul", "1DAW", 19));
        terramitica.inscribirAsistente(new Estudiante("Bermejo", "Abdul", "1DAW", 15));
        terramitica.inscribirAsistente(new Estudiante("Gorrindo", "Joselito", "1DAM", 15));

        terramitica.verAsistentes();
        System.out.println(terramitica.calcularImporteIngreso());
        terramitica.eliminarAsistentesPorEdad(16);

//        System.out.println("******* APP EXCURSIONES *******");
//        Excursion terra_mitica = new Excursion("Terra Mítica","Benidorm",30.0);
//        terra_mitica.insertarProfesor();
//        terra_mitica.inscribirAsistente();
//        terra_mitica.inscribirAsistente();
//        terra_mitica.inscribirAsistente();
//        terra_mitica.inscribirAsistente();
//        terra_mitica.verAsistentes();
//        terra_mitica.eliminarAsistentesPorEdad(16);
//        System.out.println("\nDespués de eliminar a los menores de 16 años: ");
//        terra_mitica.verAsistentes();
//        System.out.println("\nImporte a ingresar para la actividad " +
//                        terra_mitica.getNombre_actividad() + " en " + terra_mitica.getLocalidad() + ": "
//                + terra_mitica.calcularImporteIngreso() + " €.");




    }
}
