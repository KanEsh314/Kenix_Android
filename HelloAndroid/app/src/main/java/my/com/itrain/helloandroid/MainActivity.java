package my.com.itrain.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


  Button mynewbutton;
  Button mynewbutton2;
  Button mynewbutton3;
  TextView textView;
  EditText mynewedittext;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mynewedittext=(EditText)findViewById(R.id.editText);
    mynewbutton2=(Button) findViewById(R.id.button2);
    mynewbutton3=(Button) findViewById(R.id.button3);

      textView=(TextView)findViewById(R.id.textView2);
    mynewbutton3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        textView.setText("Hello "+ mynewedittext.getText().toString());
      }
    });

    mynewbutton2.setOnClickListener(new View.OnClickListener() {




      @Override
      public void onClick(View view) {
        Toast.makeText(getApplicationContext(),mynewedittext.getText().toString(),Toast.LENGTH_LONG).show();
      }
    });

    mynewbutton= (Button) findViewById(R.id.button);
    mynewbutton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Log.d("Test","This is my second apps");
        Toast.makeText(getApplicationContext(),"You cannot learn new thing..Revise first",Toast.LENGTH_LONG).show();
      }
    });
  }
}
