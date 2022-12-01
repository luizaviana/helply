package br.unicamp.helply.APIconfig;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface Service {


    /******************* CRUD Usuarios ****************************/

    @GET("api/aluno/{email}/")
    Call<Aluno> pegarAluno(@Path("email") String email);//path ou body?

    @GET("/api/aluno/")
    Call<List<Aluno>> pegarTodosAlunos();

    @POST("api/aluno/")
    Call<Aluno> inserirAluno(@Body Aluno objAluno);
/*
    @GET("api/usuario/{username}/")
    Call<Aluno> getUsuario(@Path("username") String username);

    @POST("/api/aluno/")
    Call<Aluno> postUsuario(@Body Aluno usuario);

    @PUT("/api/aluno/{username}/")
    Call<Aluno> alterarUser(@Path("username") String username, @Body Usuario usuario);


    @GET("/api/dog/get")
    Call<List<Dog>> getDog();

    @DELETE("/api/dog/delete/{id}")
    Call<Dog> excluirDog(@Path("id") String id);

    @POST("/api/dog/post")
    Call<Dog> incluirDog(@Body Dog dog);


*/


}