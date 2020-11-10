package apps.droid.dagger2.network;



import java.util.concurrent.Callable;
import okhttp3.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MainApi
{
    @GET("data")
    Callable<Response> getData(
            @Query("q") String q
    );

}