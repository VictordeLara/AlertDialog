package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abriDialog(View view){
        //Instanciar
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        //titulo e mensagem
        dialog.setTitle("Título da dialog");
        dialog.setMessage("Mensagem da dialog");
        //cancelamento
        dialog.setCancelable(false);
        //icone
        dialog.setIcon( android.R.drawable.ic_lock_idle_low_battery);
        //açoes- sim ou nao
        dialog.setPositiveButton("Concordo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {

                Toast.makeText(getApplicationContext(), "Executar ação ao clicar positivamente", Toast.LENGTH_SHORT).show();

            }
        });

        dialog.setNegativeButton("Discordo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {

                Toast.makeText(getApplicationContext(), "Executar ação ao clicar negativamente", Toast.LENGTH_SHORT).show();

            }
        });

        //criar alertdialog
        dialog.create();
        dialog.show();

    }

}