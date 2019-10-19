package cat.code.com.hazardx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Dangerous extends AppCompatActivity {
    ImageView yes,no;
    String address=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangerous);
        final EditText editText=findViewById(R.id.send_danger);
        ImageButton send=findViewById(R.id.btn_send_send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
        Intent i=getIntent();
        address=i.getStringExtra("address");
        yes=findViewById(R.id.img_yes);
        no=findViewById(R.id.img_no);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dangerous.this,ChatBot.class);
                intent.putExtra("address",address);
                startActivity(intent);
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Dangerous.this,KeepCalm.class);
                startActivity(i);
            }
        });
    }
}
