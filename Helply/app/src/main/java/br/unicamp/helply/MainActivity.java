package br.unicamp.helply;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.unicamp.helply.APIconfig.Session;
import br.unicamp.helply.APIconfig.Aluno;
import br.unicamp.helply.APIconfig.RetrofitConfig;
import br.unicamp.helply.APIconfig.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Button btnCadastro, btnLogin;
    EditText edtEmail, edtSenha;
    TextView testeget;
    Session session;

    private void setAlunoSession(Aluno aluno){

        session = new Session(this); //in oncreate
        //and now we set sharedpreference then use this like
        session.setEmail(aluno.getEmail());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSenha = (EditText) findViewById(R.id.edtSenha);
        edtEmail = (EditText) findViewById(R.id.edtEmail_login) ;
        btnCadastro = (Button) findViewById(R.id.btnCadastro);
        btnLogin = (Button) findViewById(R.id.btnEntrar);
        testeget = (TextView) findViewById(R.id.textView);

        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cadastro1.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edtEmail.getText().toString().equals("") || edtSenha.getText().toString().equals(""))
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Campos em branco");
                    builder.setMessage("Preencha todos os campos");

                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override public void onClick(DialogInterface dialogInterface, int i) {}});

                    builder.show();
                }


                else {
                    Aluno objAluno = new Aluno( "conseguimofabriciiooo.com", "fvuucckmonarquia", "122345", false, 3, 1, 5);
                    Service service = RetrofitConfig.getRetrofitInstance().create(Service.class);
                    Call<Aluno> call = service.pegarAluno(edtEmail.getText().toString());//pegarAluno("www.com.br@gmail.com");//inserirAluno(objAluno);//edtEmail.getText().toString());//!!!!!!!!!!!!

                    call.enqueue(new Callback<Aluno>() {
                        @Override
                        public void onResponse(Call<Aluno> call, Response<Aluno> response) {
                            if(response.isSuccessful())
                            {
                                if(response.body().getSenha().equals(edtSenha.getText().toString()))
                                {
                                    setAlunoSession(response.body());
                                   Intent intent = new Intent(MainActivity.this, HomePage.class);
                                   finish();
                                   startActivity(intent);
                                    Toast.makeText(MainActivity.this, session.getEmail(), Toast.LENGTH_SHORT).show();
                                }
                                else
                                    Toast.makeText(MainActivity.this, "Senha errada!", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<Aluno> call, Throwable t) {
                            Toast.makeText(MainActivity.this, "Este e-mail não está cadastrado =(", Toast.LENGTH_SHORT).show();
                        }
                    });


                }
            }
        });
    }
}