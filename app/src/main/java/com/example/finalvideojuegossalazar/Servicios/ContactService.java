package com.example.finalvideojuegossalazar.Servicios;


import com.example.finalvideojuegossalazar.Models.Contacto;
import com.example.finalvideojuegossalazar.Models.Contacts;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ContactService {
    @GET("n00033222/contacts")
    Call<Contacts> obtenerListaPokemon(@Query("limit") int limit, @Query("offset") int offset);
    @POST("n00033222/contacts")
    Call<Contacto> addcontact(@Body Contacto contacto);
}
