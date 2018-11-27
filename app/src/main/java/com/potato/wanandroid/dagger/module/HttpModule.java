package com.potato.wanandroid.dagger.module;

import com.potato.wanandroid.BuildConfig;
import com.potato.wanandroid.data.http.ApiServer;
import com.potato.wanandroid.data.DataManager;
import com.potato.wanandroid.data.http.HttpHelper;
import com.potato.wanandroid.utils.LogUtil;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class HttpModule {
    private String baseUrl;

    public HttpModule(String baseUrl) {
        this.baseUrl = baseUrl;
    }


    @Singleton
    @Provides
    public DataManager provideDataManager(ApiServer apiServer){
        return new DataManager(apiServer);
    }

//    @Singleton
    @Provides
    public ApiServer provideApiServer(Retrofit retrofit){
        return retrofit.create(ApiServer.class);
    }

    @Singleton
    @Provides
    public Retrofit provideRetrotif(Retrofit.Builder builder, OkHttpClient client){
        return createRetrofit(builder, client);
    }

    @Singleton
    @Provides
    public Retrofit.Builder provideoBuilder(){
        return new Retrofit.Builder();
    }

    @Singleton
    @Provides
    public OkHttpClient.Builder provideoOkhttpBuilder(){
        return new OkHttpClient.Builder();
    }

    @Singleton
    @Provides
    public OkHttpClient provideOkHttpClient(OkHttpClient.Builder builder){
        if(BuildConfig.DEBUG){
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                @Override
                public void log(String message) {
                    LogUtil.httpV(message);
                }
            });
            builder.addInterceptor(loggingInterceptor);
        }
        builder.writeTimeout(20, TimeUnit.SECONDS);
        builder.connectTimeout(20, TimeUnit.SECONDS);
        builder.readTimeout(20, TimeUnit.SECONDS);
        return builder.build();
    }

    private Retrofit createRetrofit(Retrofit.Builder builder, OkHttpClient client) {
        return builder
                .baseUrl(baseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }


}
