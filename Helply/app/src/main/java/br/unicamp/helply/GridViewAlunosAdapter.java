package br.unicamp.helply;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

import java.io.Serializable;
import java.util.List;

import br.unicamp.helply.APIconfig.Aluno;

public class GridViewAlunosAdapter extends BaseAdapter {
    private List<Aluno> listaAluno;
    private Context context;
    String materiaAluno = "";

    public GridViewAlunosAdapter(Context context, List<Aluno> recebeParametroListaAluno){
        this.listaAluno = recebeParametroListaAluno;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listaAluno.size();
    }

    @Override
    public Object getItem(int posicao) {
        return listaAluno.get(posicao);
    }

    @Override
    public long getItemId(int posicao) {
        return posicao;
    }

    @Override
    public View getView(int posicao, View view, ViewGroup viewGroup) {
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.layout_gridviewaluno, viewGroup,false);
        }

        TextView nomeHelper = view.findViewById(R.id.nomeHelper);
        TextView materiaHelper = view.findViewById(R.id.materiaHelper);
        TextView serieHelper = view.findViewById(R.id.serieHelper);

        Aluno aluno = listaAluno.get(posicao);

        nomeHelper.setText(aluno.getNome());
        switch (aluno.getMateria()) {
            case 1:
                materiaHelper.setText("Artes");
                materiaAluno = "Artes";
                break;
            case 2:
                materiaHelper.setText("Biologia");
                materiaAluno = "Biologia";
                break;
            case 3:
                materiaHelper.setText("Geografia");
                materiaAluno = "Geografia";
                break;
            case 4:
                materiaHelper.setText("História");
                materiaAluno = "História";
                break;
            case 5:
                materiaHelper.setText("Inglês");
                materiaAluno = "Inglês";
                break;
            case 6:
                materiaHelper.setText("Matemática");
                materiaAluno = "Matemática";
                break;
            case 7:
                materiaHelper.setText("Português");
                materiaAluno = "Português";
                break;
            case 8:
                materiaHelper.setText("Química");
                materiaAluno = "Química";
                break;
        }
        serieHelper.setText(Integer.toString(aluno.getSerie()) + "° ano E.M");
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, aluno.getNome(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, ChatHelper.class);

                Aluno objAluno = new Aluno(aluno.getEmail(), aluno.getNome(), aluno.getSenha(), true, aluno.getAvatar(),
                        aluno.getSerie(), aluno.getMateria());

                intent.putExtra("alunoSerializable",(Serializable) objAluno);
                context.startActivity(intent);
            }
        });
        return view;
    }
}
