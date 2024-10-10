package id.ac.binus.tugas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView edtNumber;
    Button satu, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan, nol, plus, minus, kali, bagi, equal;
    String inputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtNumber = findViewById(R.id.edtNumber);
        satu = findViewById(R.id.satu);
        dua = findViewById(R.id.dua);
        tiga = findViewById(R.id.tiga);
        empat = findViewById(R.id.empat);
        lima = findViewById(R.id.lima);
        enam = findViewById(R.id.enam);
        tujuh = findViewById(R.id.tujuh);
        delapan = findViewById(R.id.delapan);
        sembilan = findViewById(R.id.sembilan);
        nol = findViewById(R.id.nol);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);
        equal = findViewById(R.id.equal);

        inputText ="";
        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText += "1";
                edtNumber.setText(inputText);
            }
        });
        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText += "2";  // Append "2" to inputText
                edtNumber.setText(inputText);
            }
        });
        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText += "3";  // Append "3" to inputText
                edtNumber.setText(inputText);
            }
        });
        empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText += "4";
                edtNumber.setText(inputText);
            }
        });
        lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText += "5";
                edtNumber.setText(inputText);
            }
        });
        enam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText += "6";
                edtNumber.setText(inputText);
            }
        });
        tujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText += "7";
                edtNumber.setText(inputText);
            }
        });
        delapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText += "8";
                edtNumber.setText(inputText);
            }
        });
        sembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText += "9";
                edtNumber.setText(inputText);
            }
        });
        nol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText += "0";
                edtNumber.setText(inputText);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText += " + ";  // Append " + " to inputText
                edtNumber.setText(inputText);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText += " - ";  // Append " - " to inputText
                edtNumber.setText(inputText);
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText += " * ";  // Append " * " to inputText
                edtNumber.setText(inputText);
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText += " / ";  // Append " / " to inputText
                edtNumber.setText(inputText);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] variable = inputText.split(" ");

                int number1 = Integer.parseInt(variable[0]);
                int number2 = Integer.parseInt(variable[2]);

                String operand = variable[1];
                int hasil = 0;
                switch (operand) {
                    case "+":
                        hasil = number1 + number2;
                        break;
                    case "-":
                        hasil = number1 - number2;
                        break;
                    case "*":
                        hasil = number1 * number2;
                        break;
                    case "/":
                        hasil = number1 / number2;
                        break;
                }
                edtNumber.setText(String.format("%d", hasil));
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


}