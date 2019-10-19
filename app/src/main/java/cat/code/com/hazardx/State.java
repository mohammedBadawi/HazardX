package cat.code.com.hazardx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class State extends AppCompatActivity {
    Button change_location;
    String address=null;
    ImageButton send;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);
        Intent intent=getIntent();
        address=intent.getStringExtra("address");
        change_location=(Button)findViewById(R.id.btn_change_location);
        change_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(State.this,MainActivity.class);
                startActivity(intent);
            }
        });
        editText=findViewById(R.id.editText2);
        send=findViewById(R.id.btn_send_state);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Do something after 10s = 10000ms
               Intent intent=new Intent(State.this,Dangerous.class);
               intent.putExtra("address",address);
               startActivity(intent);
            }
        }, 7000);

    }
}
