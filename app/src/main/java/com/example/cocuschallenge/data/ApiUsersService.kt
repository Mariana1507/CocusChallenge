package com.example.cocuschallenge.data

import androidx.constraintlayout.solver.state.State
import com.example.cocuschallenge.data.response.Members
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY = "jTWz2dKBNbgnzkCEj9qD";

//https://www.codewars.com/api/v1/users/:id_or_username?access_key=jTWz2dKBNbgnzkCEj9qD


interface ApiUsersService {

    @GET(value = "users/:id_or_username")
    fun getMembers(
        @Query(value = "q") username: String
    ): Deferred<Members>

    companion object {
        operator fun invoke(): ApiUsersService {

            val requestInterceptor = Interceptor { chain ->
                val url = chain.request()
                    .url()
                    .newBuilder()
                    .addQueryParameter("access_key", API_KEY)
                    .build()
                val request = chain.request()
                    .newBuilder()
                    .url(url)
                    .build()

                return@Interceptor chain.proceed(request)
            }

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(requestInterceptor)
                .build()

            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://www.codewars.com/api/v1/")
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiUsersService::class.java)

        }
    }
}
