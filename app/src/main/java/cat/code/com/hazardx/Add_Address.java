package cat.code.com.hazardx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Add_Address extends AppCompatActivity {
    EditText etaddress,etname;
    String address,name;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__address);
        etaddress=(EditText)findViewById(R.id.et_add_address);
        etname=(EditText)findViewById(R.id.et_location_name);
        add=(Button)findViewById(R.id.btn_add_new);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                address=etaddress.getText().toString().trim();
                name=etname.getText().toString().trim();
                Intent intent=new Intent(Add_Address.this,State.class);
                intent.putExtra("address",address);
                startActivity(intent);
            }
        });
    }
}
