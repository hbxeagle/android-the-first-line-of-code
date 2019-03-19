package name.hbx.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//public class FirstActivity extends AppCompatActivity {
public class FirstActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

//        Button button1 = (Button) findViewById(R.id.button_1);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Toast.makeText(FirstActivity.this, "You clicked Button 1", Toast.LENGTH_SHORT).show();
//
////                finish();
//
////                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
////                startActivity(intent);
//
////                Intent intent = new Intent("name.hbx.activitytest.ACTION_START");
////                intent.addCategory("name.hbx.activitytest.MY_CATEGORY");
////                startActivity(intent);
//
////                Intent intent = new Intent(Intent.ACTION_VIEW);
////                intent.setData(Uri.parse("http://www.baidu.com"));
////                startActivity(intent);
//
////                Uri web = Uri.parse("http://www.baidu.com");
////                Intent intent = new Intent(Intent.ACTION_VIEW,web);
////                startActivity(Intent.createChooser(intent, "Choose Application"));
//
////                Uri tel = Uri.parse("tel:100086");
////                Intent intent = new Intent(Intent.ACTION_DIAL,tel);
////                startActivity(Intent.createChooser(intent, "Choose Application"));
//
////                String data = "Hello SecondActiovity";
////                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
////                intent.putExtra("extra_data", data);
////                startActivity(intent);
//
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                startActivityForResult(intent, 1);
//            }
//        });

//        Log.d("FirstActivity", this.toString());
        Log.d("FirstActivity", "Task id is " + getTaskId());

        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(FirstActivity.this, FirstActivity.class);
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                startActivity(intent);
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                intent.putExtra("param1", "data1");
//                intent.putExtra("param2", "data2");
//                startActivity(intent);
                SecondActivity.actionStart(FirstActivity.this, "data1", "data2");
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnData = data.getStringExtra("data_return");
                    Log.d("FirstActivity", returnData);
                }
                break;
                default:
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You clicked add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You clicked remove", Toast.LENGTH_SHORT).show();
                break;
                default:
        }
        return true;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("FirstActivity", "onRestart");
    }
}
