package cat.code.com.hazardx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class KeepCalm extends AppCompatActivity {
    TextView textView ;
    ImageButton send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keep_calm);
        textView=(TextView)findViewById(R.id.tv_clam);
        final EditText editText=findViewById(R.id.editText);
        send=findViewById(R.id.btn_send_calm);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

    }

        }

