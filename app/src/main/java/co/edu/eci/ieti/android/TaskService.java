package co.edu.eci.ieti.android;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TaskService {
    @GET("api/task/user/{userId}")
    Call<List<TaskService>> userTasks(@Path("userId") String userId);
}
