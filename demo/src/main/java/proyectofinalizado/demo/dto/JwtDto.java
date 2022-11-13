package proyectofinalizado.demo.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtDto {

    private String token;

    private String bearer = "Bearer";

    private String nombreUsuario;


    public JwtDto(String token, String nombreUsuario ) {
        this.token = token;
        this.nombreUsuario = nombreUsuario;
    }
}
