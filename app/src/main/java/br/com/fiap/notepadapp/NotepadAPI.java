package br.com.fiap.notepadapp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by logonrm on 27/11/2017.
 */

public interface NotepadAPI {

    @GET(value = "/nota/titulo/{titulo}")
    Call<Nota> buscar(@Path(value = "titulo") String titulo);

    @POST(value = "/nota")
    Call<Void> salvar(@Body Nota nota);
}
