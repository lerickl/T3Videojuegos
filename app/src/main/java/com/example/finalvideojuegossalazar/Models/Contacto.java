package com.example.finalvideojuegossalazar.Models;

public class Contacto
{
    public int id;
    public String names;
    public String email;
    public String phone;
    public String imagen;

    public String getNames() {
        return names;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getImagen() {
        return imagen;
    }

    public Contacto(String names, String email, String phone, String imagen) {
        this.names = names;
        this.email = email;
        this.phone = phone;
        this.imagen = imagen;
    }
}
