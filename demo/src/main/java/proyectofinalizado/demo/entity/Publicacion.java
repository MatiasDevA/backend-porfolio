package proyectofinalizado.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String header;
    private String imagen;
    private String body;

    public Publicacion(String header, String imagen, String body, List<Comentario> comentario) {
        this.header = header;
        this.imagen = imagen;
        this.body = body;
        this.comentario = comentario;
    }

    @OneToMany(mappedBy = "publicacion",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Comentario> comentario = new ArrayList<>();


}