package com.apreciasoft.mobile.RemisCentro.Services;

import com.apreciasoft.mobile.RemisCentro.Entity.Company;
import com.apreciasoft.mobile.RemisCentro.Entity.DriverCurrentAcountEntity;
import com.apreciasoft.mobile.RemisCentro.Entity.DriverFull;
import com.apreciasoft.mobile.RemisCentro.Entity.InfoTravelEntity;
import com.apreciasoft.mobile.RemisCentro.Entity.RequetClient;
import com.apreciasoft.mobile.RemisCentro.Entity.acountCompany;
import com.apreciasoft.mobile.RemisCentro.Entity.costCenterCompany;
import com.apreciasoft.mobile.RemisCentro.Entity.dataAddPlusDriverEntity;
import com.apreciasoft.mobile.RemisCentro.Entity.driver;
import com.apreciasoft.mobile.RemisCentro.Entity.fleetType;
import com.apreciasoft.mobile.RemisCentro.Entity.modelEntity;
import com.apreciasoft.mobile.RemisCentro.Entity.resp;
import com.apreciasoft.mobile.RemisCentro.Entity.responseFilterVehicle;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by Admin on 19/1/2017.
 */

public interface ServicesDriver {

    @Headers("Content-Type: application/json")
    @GET("driver/getAllTravel/{id}")
    Call<List<InfoTravelEntity>> getAllTravel(@Path("id") int id);

    @Headers("Content-Type: application/json")
    @GET("travel/travelsByIdUser/{id}")
    Call<List<InfoTravelEntity>> getAllTravelClient(@Path("id") int id);

    @Headers("Content-Type: application/json")
    @GET("driver/inactive/{id}")
    Call<Boolean> inactive(@Path("id") int id);

    @Headers("Content-Type: application/json")
    @GET("driver/active/{id}")
    Call<Boolean> active(@Path("id") int id);

    @Headers("Content-Type: application/json")
    @GET("invoice/listLiquidationDriver/{id}")
    Call<DriverCurrentAcountEntity> listLiquidationDriver(@Path("id") int id);

    @Headers("Content-Type: application/json")
    @POST("driver/updateLiteMobil")
    Call<driver> updateLiteMobil(@Body driver dr);


    @Headers("Content-Type: application/json")
    @GET("driver/find/{id}")
    Call<DriverFull> find(@Path("id") int id);

    @Headers("Content-Type: application/json")
    @GET("Brand")
    Call<List<modelEntity>> filterForm();

    @Headers("Content-Type: application/json")
    @GET("fleetType")
    Call<List<fleetType>> filterFormfleetType();


    @Headers("Content-Type: application/json")
    @GET("model/byidBrand/{id}")
    Call<responseFilterVehicle> getModelDetail(@Path("id") int id);

    @Headers("Content-Type: application/json")
    @POST("driver/plusLite")
    Call<Integer> addPluDriver(@Body dataAddPlusDriverEntity data);

    @Headers("Content-Type: application/json")
    @POST("client")
    Call<resp> addClient(@Body RequetClient data);

    @Headers("Content-Type: application/json")
    @GET("company/validatorDomaint/{mail}")
    Call<List<Company>> validatorDomaint(@Path("mail") String mail);

    @Headers("Content-Type: application/json")
    @GET("company/costCenterByidAcount/{id}")
    Call<List<costCenterCompany>> costCenterByidAcount(@Path("id") int id);

    @Headers("Content-Type: application/json")
    @GET("company/getAcountByidCompany/{id}")
    Call<List<acountCompany>> getAcountByidCompany(@Path("id") int id);



}
