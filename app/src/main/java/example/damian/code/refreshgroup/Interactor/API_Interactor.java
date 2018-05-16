package com.example.andriatae.code_wars_project.Interactor;

import com.example.andriatae.code_wars_project.API.API_USER;
import com.example.andriatae.code_wars_project.Interactor.Interactor_Interface.*;

/**
 * Created by Andria TAE on 16/05/2018.
 */

public class API_Interactor implements Interactor_A_Interface{

        Retrofit myAPI;


        public API_Interactor() {


            initialiseApi();


        }



        public void initialiseApi() {

            myAPI= new Retrofit.Builder()

                    //get the user profile initialisation
                    .baseUrl("https://www.codewars.com/api/v1/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();

        }


       @Override
        public void GetUserInfo(String userName)
        {

            API_USER thisUser=myAPI.create(API_USER.class);

            thisUser.getPlayer(userName).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Player_Container>() {


        }

    }
}
