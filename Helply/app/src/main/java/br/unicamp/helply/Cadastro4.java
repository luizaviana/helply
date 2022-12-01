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

public class Cadastro4 extends AppCompatActivity {

    Button btnSeguinte;
    RadioButton rbArtes, rbBiologia, rbGeografia, rbHistoria, rbIngles, rbMatematica, rbPortugues, rbQuimica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro4);

        btnSeguinte = (Button) findViewById(R.id.btnSeguinte);

        rbArtes = (RadioButton) findViewById(R.id.rbArtes);
        rbBiologia = (RadioButton) findViewById(R.id.rbBiologia);
        rbGeografia = (RadioButton) findViewById(R.id.rbGeografia);
        rbHistoria = (RadioButton) findViewById(R.id.rbHistoria);
        rbIngles = (RadioButton) findViewById(R.id.rbIngles);
        rbMatematica =(RadioButton) findViewById(R.id.rbMatematica);
        rbPortugues = (RadioButton) findViewById(R.id.rbPortugues);
        rbQuimica = (RadioButton) findViewById(R.id.rbQuimica);

        btnSeguinte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!rbArtes.isChecked() && !rbBiologia.isChecked() && !rbGeografia.isChecked() && !rbHistoria.isChecked() && !rbMatematica.isChecked() && !rbIngles.isChecked() && !rbPortugues.isChecked() && !rbQuimica.isChecked()) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Cadastro4.this);
                    builder.setTitle("Campos em branco");
                    builder.setMessage("Selecione uma matéria");

                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });

                    builder.show();
                }

            else{
                if(rbArtes.isChecked())
                {
                    Intent intent = getIntent();
                    Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoSerie");
                    objAluno.setMateria(1);

                    intent = new Intent(Cadastro4.this, Cadastro5.class);
                    intent.putExtra("sessaoEmail", (Serializable) objAluno);
                    startActivity(intent);
                }
                else if(rbBiologia.isChecked()){
                    Intent intent = getIntent();
                    Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoSerie");
                    objAluno.setMateria(2);

                    intent = new Intent(Cadastro4.this, Cadastro5.class);
                    intent.putExtra("sessaoEmail", (Serializable) objAluno);
                    startActivity(intent);
                }
                else if(rbGeografia.isChecked())
                {
                    Intent intent = getIntent();
                    Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoSerie");
                    objAluno.setMateria(3);

                    intent = new Intent(Cadastro4.this, Cadastro5.class);
                    intent.putExtra("sessaoEmail", (Serializable) objAluno);
                    startActivity(intent);
                }
                else if (rbHistoria.isChecked())
                {
                    Intent intent = getIntent();
                    Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoSerie");
                    objAluno.setMateria(4);

                    intent = new Intent(Cadastro4.this, Cadastro5.class);
                    intent.putExtra("sessaoEmail", (Serializable) objAluno);
                    startActivity(intent);
                }
                else if (rbIngles.isChecked())
                {
                    Intent intent = getIntent();
                    Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoSerie");
                    objAluno.setMateria(5);

                    intent = new Intent(Cadastro4.this, Cadastro5.class);
                    intent.putExtra("sessaoEmail", (Serializable) objAluno);
                    startActivity(intent);
                }
                else if (rbMatematica.isChecked())
                {
                    Intent intent = getIntent();
                    Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoSerie");
                    objAluno.setMateria(6);

                    intent = new Intent(Cadastro4.this, Cadastro5.class);
                    intent.putExtra("sessaoEmail", (Serializable) objAluno);
                    startActivity(intent);
                }
                else if (rbPortugues.isChecked())
                {
                    Intent intent = getIntent();
                    Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoSerie");
                    objAluno.setMateria(7);

                    intent = new Intent(Cadastro4.this, Cadastro5.class);
                    intent.putExtra("sessaoEmail", (Serializable) objAluno);
                    startActivity(intent);
                }
                else if (rbQuimica.isChecked())
                {
                    Intent intent = getIntent();
                    Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoSerie");
                    objAluno.setMateria(8);

                    intent = new Intent(Cadastro4.this, Cadastro5.class);
                    intent.putExtra("sessaoEmail", (Serializable) objAluno);
                    startActivity(intent);
                }

            }
            }
        });

    }
}