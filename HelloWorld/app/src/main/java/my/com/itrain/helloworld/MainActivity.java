package my.com.itrain.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  Button myNewButton;
  Button myToastButton;
  EditText myName;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    myNewButton = (Button) findViewById(R.id.button2);
    myName = (EditText)findViewById(R.id.editText2);

    myNewButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Log.d("test", "Hello World");
      }
    });

    myToastButton = (Button) findViewById(R.id.button);
    myToastButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(getApplicationContext(),myName.getText().toString(),Toast.LENGTH_LONG).show();
      }
    });

    //AlertController
  }
}
