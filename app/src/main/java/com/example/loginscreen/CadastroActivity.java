package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class CadastroActivity extends AppCompatActivity {

    TextView txt_title, txt_outros_acessos;
    EditText edt_usuario, edt_email, edt_senha, edt_senha_rety;
    LinearLayout linear_redes_sociais_icons;
    MaterialButton btn_cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        edt_usuario = findViewById(R.id.edt_usuario);
        edt_email = findViewById(R.id.edt_email);
        edt_senha = findViewById(R.id.edt_senha);
        edt_senha_rety = findViewById(R.id.edt_senha_retry);
        btn_cadastrar = findViewById(R.id.btn_cadastro);

        btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = edt_usuario.getText().toString();
                String email = edt_email.getText().toString();
                Toast.makeText(CadastroActivity.this,"Usuario: " + usuario + "\n" + "Email: " + email, Toast.LENGTH_SHORT).show();
            }
        });
    }
}