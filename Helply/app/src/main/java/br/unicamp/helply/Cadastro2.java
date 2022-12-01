package br.unicamp.helply;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.Serializable;
import br.unicamp.helply.APIconfig.Aluno;
import br.unicamp.helply.APIconfig.RetrofitConfig;
import br.unicamp.helply.APIconfig.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Cadastro2 extends AppCompatActivity {
    ImageButton av1, av2, av3, av4, av5, av6, av7, av8, av9, av10, av11, av12;
    TextView txtteste;//TESTE

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro2);

        av1 = (ImageButton) findViewById(R.id.avatar1);
        av2 = (ImageButton) findViewById(R.id.avatar2);
        av3 = (ImageButton) findViewById(R.id.avatar3);
        av4 = (ImageButton) findViewById(R.id.avatar4);
        av5 = (ImageButton) findViewById(R.id.avatar5);
        av6 = (ImageButton) findViewById(R.id.avatar6);
        av7 = (ImageButton) findViewById(R.id.avatar7);
        av8 = (ImageButton) findViewById(R.id.avatar8);
        av9 = (ImageButton) findViewById(R.id.avatar9);
        av10 = (ImageButton) findViewById(R.id.avatar10);
        av11 = (ImageButton) findViewById(R.id.avatar11);
        av12 = (ImageButton) findViewById(R.id.avatar12);

        txtteste = (TextView) findViewById(R.id.textView7);//teste

       // Intent intent = getIntent();
        //Aluno aluno = (Aluno) intent.getSerializableExtra("sessaoNome");  teste
       // txtteste.setText(aluno.getNome());

        av1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoNome");
                objAluno.setAvatar(1);

                intent = new Intent(Cadastro2.this, Cadastro3.class);
                intent.putExtra("sessaoAvatar", (Serializable) objAluno);
                startActivity(intent);
            }
        });

        av2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoNome");
                objAluno.setAvatar(2);

                intent = new Intent(Cadastro2.this, Cadastro3.class);
                intent.putExtra("sessaoAvatar", (Serializable) objAluno);
                startActivity(intent);
            }
        });

        av3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoNome");
                objAluno.setAvatar(3);

                intent = new Intent(Cadastro2.this, Cadastro3.class);
                intent.putExtra("sessaoAvatar", (Serializable) objAluno);
                startActivity(intent);
            }
        });

        av4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoNome");
                objAluno.setAvatar(4);

                intent = new Intent(Cadastro2.this, Cadastro3.class);
                intent.putExtra("sessaoAvatar", (Serializable) objAluno);
                startActivity(intent);
            }
        });

        av5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoNome");
                objAluno.setAvatar(5);

                intent = new Intent(Cadastro2.this, Cadastro3.class);
                intent.putExtra("sessaoAvatar", (Serializable) objAluno);
                startActivity(intent);
            }
        });

        av6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoNome");
                objAluno.setAvatar(6);

                intent = new Intent(Cadastro2.this, Cadastro3.class);
                intent.putExtra("sessaoAvatar", (Serializable) objAluno);
                startActivity(intent);
            }
        });

        av7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoNome");
                objAluno.setAvatar(7);

                intent = new Intent(Cadastro2.this, Cadastro3.class);
                intent.putExtra("sessaoAvatar", (Serializable) objAluno);
                startActivity(intent);
            }
        });

        av8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoNome");
                objAluno.setAvatar(8);

                intent = new Intent(Cadastro2.this, Cadastro3.class);
                intent.putExtra("sessaoAvatar", (Serializable) objAluno);
                startActivity(intent);
            }
        });

        av9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoNome");
                objAluno.setAvatar(9);

                intent = new Intent(Cadastro2.this, Cadastro3.class);
                intent.putExtra("sessaoAvatar", (Serializable) objAluno);
                startActivity(intent);
            }
        });

        av10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoNome");
                objAluno.setAvatar(10);

                intent = new Intent(Cadastro2.this, Cadastro3.class);
                intent.putExtra("sessaoAvatar", (Serializable) objAluno);
                startActivity(intent);
            }
        });

        av11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoNome");
                objAluno.setAvatar(11);

                intent = new Intent(Cadastro2.this, Cadastro3.class);
                intent.putExtra("sessaoAvatar", (Serializable) objAluno);
                startActivity(intent);
            }
        });

        av12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoNome");
                objAluno.setAvatar(12);

                intent = new Intent(Cadastro2.this, Cadastro3.class);
                intent.putExtra("sessaoAvatar", (Serializable) objAluno);
                startActivity(intent);
            }
        });
    }
}