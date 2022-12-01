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

import br.unicamp.helply.APIconfig.Aluno;
import br.unicamp.helply.APIconfig.RetrofitConfig;
import br.unicamp.helply.APIconfig.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Cadastro5 extends AppCompatActivity {
    TextView txtTitulo;//teste
    Button btnCadastro;
    EditText edtEmail, edtSenha, edtConfirmaSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro5);

        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
        edtConfirmaSenha = (EditText) findViewById(R.id.edtConfirmarSenha);
        btnCadastro = (Button) findViewById(R.id.btnCadastro);
        txtTitulo = (TextView) findViewById(R.id.textView4);//teste

        
        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!edtSenha.getText().toString().equals(edtConfirmaSenha.getText().toString()))
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Cadastro5.this);
                    builder.setTitle("Confrimação de senha inválida");
                    builder.setMessage("O campo de confrimação de senha está difrente do campo de senha");

                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                    builder.show();
                }
                else{
                    Intent intent = getIntent();
                    Aluno objAluno = (Aluno) intent.getSerializableExtra("sessaoEmail");

                    objAluno.setEmail(edtEmail.getText().toString());
                    objAluno.setSenha(edtSenha.getText().toString());

                    Service service = RetrofitConfig.getRetrofitInstance().create(Service.class);
                    Call<Aluno> call = service.inserirAluno(objAluno);

                    call.enqueue(new Callback<Aluno>() {
                        @Override
                        public void onResponse(Call<Aluno> call, Response<Aluno> response) {
                            if(response.isSuccessful())
                            {
                               Intent intent = new Intent(Cadastro5.this, MainActivity.class);
                                finish();
                                startActivity(intent);
                            }
                        }

                        @Override
                        public void onFailure(Call<Aluno> call, Throwable t) {
                            Toast.makeText(Cadastro5.this, "aaiin nobru apelauun", Toast.LENGTH_SHORT).show();
                        }
                    });




                }
            }
        });

    }
}