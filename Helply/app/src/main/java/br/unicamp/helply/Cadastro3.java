package br.unicamp.helply;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.io.Serializable;

import br.unicamp.helply.APIconfig.Aluno;

public class Cadastro3 extends AppCompatActivity {
    Button btnSeguinte;
    RadioButton rb1o, rb2o, rb3o;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro3);

        btnSeguinte = (Button) findViewById(R.id.btnSeguinte);
        rb1o = (RadioButton) findViewById(R.id.rb1o);
        rb2o = (RadioButton) findViewById(R.id.rb2o);
        rb3o = (RadioButton) findViewById(R.id.rb3o);

        btnSeguinte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!rb1o.isChecked() && !rb2o.isChecked() && !rb3o.isChecked())
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Cadastro3.this);
                    builder.setTitle("Campos em branco");
                    builder.setMessage("Selecione uma série");

                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override public void onClick(DialogInterface dialogInterface, int i) {}});

                    builder.show();
                }

                else {
                    if(rb1o.isChecked())
                    {
                        Intent intent = getIntent();
                        Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoAvatar");
                        objAluno.setSerie(1);

                        intent = new Intent(Cadastro3.this, Cadastro4.class);
                        intent.putExtra("sessaoSerie", (Serializable) objAluno);
                        startActivity(intent);
                    }
                    else if(rb2o.isChecked())
                    {
                        Intent intent = getIntent();
                        Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoAvatar");
                        objAluno.setSerie(2);

                        intent = new Intent(Cadastro3.this, Cadastro4.class);
                        intent.putExtra("sessaoSerie", (Serializable) objAluno);
                        startActivity(intent);
                    }
                    else if (rb3o.isChecked())
                    {
                        Intent intent = getIntent();
                        Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoAvatar");
                        objAluno.setSerie(3);

                        intent = new Intent(Cadastro3.this, Cadastro4.class);
                        intent.putExtra("sessaoSerie", (Serializable) objAluno);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}