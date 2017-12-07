package id.nawawi.appmovie.services;

import id.nawawi.appmovie.models.MovieTopRatedResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by nawaw on 12/7/2017.
 */

public interface ApiInterface {
    @GET("movie/top_rated")
    Call<MovieTopRatedResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MovieTopRatedResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
