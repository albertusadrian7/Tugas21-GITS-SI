package android.kotlin.bookstore.service

import android.kotlin.bookstore.model.BukuResponse
import android.kotlin.bookstore.model.DefaultResponse
import android.kotlin.bookstore.model.UserResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface UserApiInterface {
    @GET("penggunaApi.php")
    fun getUserList(
        @Query("function") function: String
    ): Call<UserResponse>

    @FormUrlEncoded
    @POST("penggunaApi.php")
    fun insertPengguna(
        @Field("id_user") idUser: String,
        @Field("username") username: String,
        @Field("email") email: String,
        @Field("nama") nama: String,
        @Field("alamat") alamat: String,
        @Field("gambar") gambar: String,
        @Query("function") function: String
    ): Call<DefaultResponse>

    @FormUrlEncoded
    @POST("penggunaApi.php")
    fun deleteUser(
        @Field("id_user") idUser: String,
        @Query("function") function: String
    ): Call<DefaultResponse>

}