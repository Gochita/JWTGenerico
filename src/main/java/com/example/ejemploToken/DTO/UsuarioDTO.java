package com.example.ejemploToken.DTO;

import lombok.*;

public class UsuarioDTO {


    @Getter
    @Setter
    @ToString

    public class Usuario {

        private String username;
        private String contraseña;
        private String token;



    }

}
