package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    TextView txt_title, txt_trocar_senha, txt_outros_acessos;
    EditText edt_usuario, edt_senha;
    LinearLayout linear_redes_sociais_icons;
    MaterialButton btn_logar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_usuario = findViewById(R.id.edt_usuario);
        edt_senha = findViewById(R.id.edt_senha);
        btn_logar = findViewById(R.id.btn_login);

        btn_logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Validações de acessos
                if (edt_usuario.getText().toString().equals("root") && edt_senha.getText().toString().equals("root")){
                    // Validação de dados correta
                    Toast.makeText(MainActivity.this,"ACESSO AUTORIZADO!!",Toast.LENGTH_SHORT).show();
                }else {
                    // Validação de dados Incorreta
                    Toast.makeText(MainActivity.this,"ACESSO NEGAGO!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}