package com.example.retrofitnewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView theText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        theText = (TextView)findViewById(R.id.thetext);

        //Instância da interface de serviços
        RetrofitServices services = RetrofitClientInstance.getRetrofit().create(RetrofitServices.class);

        //Pegando os "usuários" da página e colocando em uma call
        Call<List<User>> call = services.getUsers();

        //O método abaixo "pega" os elementos da call um por um, e para cada um deles há um
        //"OnResponse" caso responda com sucesso e um "OnFailure" caso haja falhas

        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                //Caso haja sucesso

                //Pegue a lista de "Users" da página

                List<User> users = response.body();

                for(User us: users){

                    String textToAppend = "";

                    textToAppend += "userId: "+us.getUserId()+"\n";
                    textToAppend += "Id: "+us.getId()+"\n";
                    textToAppend += "Title: "+us.getTitle()+"\n";
                    textToAppend += "Text: "+us.getBody()+"\n";
                    textToAppend += "\n";

                    theText.append(textToAppend);

                }

            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                theText.setText(t.getMessage());
            }
        });
    }
}
