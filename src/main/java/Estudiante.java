
public class Estudiante {

    private String nombre;
    private Integer identificacion;
    private Double nota;
        public Estudiante(String nombre, Integer identificacion, Double nota) {
            this.nombre = nombre;
            this.identificacion = identificacion;
            this.nota = nota;
        }
        public String getnombre() {
            return nombre;
        }
        public Integer getidetificacion() {
            return identificacion;
        }
        public Double getnota() {
            return nota;
        }
    }
