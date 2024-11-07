package TDB2024II.MsSecurity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class UsuarioModel {

    @Id
    @Column(name = "id_usuario")
    public Integer idUsuario;

    @Column(name = "nombres")
    public String nombres;

    @Column(name = "apellidos")
    public String apellidos;
}
