package proyectofinalizado.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_publicacion")
    private Publicacion publicacion;

    public Comentario(String description, Publicacion publicacion) {
        this.description = description;
        this.publicacion = publicacion;
    }
}