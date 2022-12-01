package br.unicamp.helply;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;
import br.unicamp.helply.APIconfig.Aluno;
import br.unicamp.helply.APIconfig.RetrofitConfig;
import br.unicamp.helply.APIconfig.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomePage extends AppCompatActivity {
    private GridView alunoGridView;
    private GridViewAlunosAdapter adapter;

    ImageButton btnLigacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        btnLigacao = (ImageButton) findViewById(R.id.btnLigacao);

        btnLigacao.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, IniciarLigacao.class);
                finish();
                startActivity(intent);
            }
        });

        Service service = RetrofitConfig.getRetrofitInstance().create(Service.class);
        Call<List<Aluno>> call = service.pegarTodosAlunos();//Call<Aluno> call = service.pegarTodosAlunos();

        call.enqueue(new Callback<List<Aluno>>() {
            @Override
            public void onResponse(Call<List<Aluno>> call, Response<List<Aluno>> response) {

                if(response.isSuccessful()){
                    Toast.makeText(HomePage.this, "deu certo", Toast.LENGTH_LONG).show();

                    populateGridView(response.body());
                }else{
                    String errorMessage = response.errorBody().toString();
                    Toast.makeText(HomePage.this, errorMessage, Toast.LENGTH_LONG).show();
                    Toast.makeText(HomePage.this, "entrou no else do response", Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<List<Aluno>> call, Throwable t) {
                String messageProblem = t.getMessage().toString();
                Toast.makeText(HomePage.this, messageProblem, Toast.LENGTH_SHORT).show();
                Toast.makeText(HomePage.this, "entrou no else do Failure", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void populateGridView(List<Aluno> listaDog){
        alunoGridView = (GridView) findViewById(R.id.alunoGridView);
        adapter = new GridViewAlunosAdapter(this,listaDog);
        alunoGridView.setAdapter(adapter);
    }
}