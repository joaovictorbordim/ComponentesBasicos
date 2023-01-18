package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoresultado;

    //CheckBox
    private CheckBox azul, verde, amarelo;

    //RadioButton
    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.inputNome);
        campoEmail = findViewById(R.id.inputEmail);
        textoresultado = findViewById(R.id.outputResultado);

        //CheckBox
        azul = findViewById(R.id.checkAzul);
        verde = findViewById(R.id.checkVerde);
        amarelo = findViewById(R.id.checkAmarelo);

        //RadioButton
        sexoMasculino = findViewById(R.id.radioButtonM);
        sexoFeminino = findViewById(R.id.radioButtonF);

        //RadioGroup
        opcaoSexo = findViewById(R.id.radioGroupSexo);

        //Ouvinte
        radiobutton();

    }
    public void radiobutton (){

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.radioButtonM){
                    textoresultado.setText("MASCULINO");
                }else if (i == R.id.radioButtonF){
                    textoresultado.setText("FEMININO");
            }
        };

        /*
        if (sexoMasculino.isChecked()){
            textoresultado.setText("MASCULINO");
        }else if (sexoFeminino.isChecked()){
            textoresultado.setText("FEMININO");
        }
        */

        });
    };

    public void enviar (View view){



        //radiobutton();
        //checkbox();

        /*
        //.toString (captura o que foi digitado, transforma em string e salva em nome)
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        textoresultado.setText("nome: "+nome+" E-mail: "+email);

         */
    }
    public void checkbox(){

        /* Teste de validação;

        boolean resultadoVerde = verde.isChecked();
        textoresultado.setText("verde " +resultadoVerde );

         */

        String texto = "";
        if (azul.isChecked()){
            //texto = " Azul selecionado -";
            String corSelecionada = azul.getText().toString();
            texto = texto +  corSelecionada;
        }
        if (verde.isChecked()){
            //texto = texto + " Verde selecionado -";
            String corSelecionada = verde.getText().toString();
            texto = texto + " - " + corSelecionada;
        }
        if (amarelo.isChecked()){
            //texto = texto + " Amarelo selecionado -";
            String corSelecionada = amarelo.getText().toString();
            texto = texto + " - " + corSelecionada;
        }

        textoresultado.setText(texto);
    }

    public void limpar (View view){
        campoNome.setText("");
        campoEmail.setText("");
    }

}