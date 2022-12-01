package br.unicamp.helply;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import br.unicamp.helply.APIconfig.Aluno;

public class ChatHelper extends AppCompatActivity {
    TextView txtNome, txtMateria;
    ImageView avatar;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_helper);

        txtNome = (TextView) findViewById(R.id.nomeHelper);
        txtMateria = (TextView) findViewById(R.id.materiaHelper);
        avatar = (ImageView) findViewById(R.id.avatarHelper);

        Intent intent = getIntent();
        Aluno aluno = (Aluno) intent.getSerializableExtra("alunoSerializable");
        if(aluno != null){
            txtNome.setText(aluno.getNome());
            switch (aluno.getMateria()) {
                case 1: txtMateria.setText("Artes"); break;
                case 2: txtMateria.setText("Biologia"); break;
                case 3: txtMateria.setText("Geografia"); break;
                case 4: txtMateria.setText("História"); break;
                case 5: txtMateria.setText("Inglês"); break;
                case 6: txtMateria.setText("Matemática"); break;
                case 7: txtMateria.setText("Português"); break;
                case 8: txtMateria.setText("Química"); break;
            }
            // switch do aluno.getAvatar();
        }
    }
}