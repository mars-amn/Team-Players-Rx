package elamien.abdullah.teamplayersrx.rest;

import elamien.abdullah.teamplayersrx.model.TeamPlayers;
import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by AbdullahAtta on 7/10/2019.
 */
public interface TeamApi {
    @GET("api/v1/json/1/searchplayers.php")
    Flowable<TeamPlayers> getTeamPlayers(@Query("t") String team);
}
