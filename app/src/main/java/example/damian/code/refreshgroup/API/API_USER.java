package com.example.andriatae.code_wars_project.API;

import com.example.andriatae.code_wars_project.Objects.User_Container;

/**
 * Created by Andria TAE on 16/05/2018.
 */

public interface API_USER {

        @GET("users/{userName}")

        Observable<User_Container>getPlayer(@Path("userName")String userName);
    }

