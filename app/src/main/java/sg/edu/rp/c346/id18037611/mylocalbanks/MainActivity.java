package sg.edu.rp.c346.id18037611.mylocalbanks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDBS;
    TextView tvOCBC;
    TextView tvUOB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDBS = findViewById(R.id.textViewDBS);
        tvOCBC = findViewById(R.id.textViewOCBC);
        tvUOB = findViewById(R.id.textViewUOB);

        registerForContextMenu(tvDBS);
        registerForContextMenu(tvOCBC);
        registerForContextMenu(tvUOB);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        if(v == tvDBS){
            menu.add(0,0,0,"Website");
            menu.add(0,1,1,"Contact the bank");
        }
        else if(v == tvOCBC)
        {
            menu.add(0,2,0,"Website");
            menu.add(0,3,1,"Contact the bank");
        }
        else if(v == tvUOB)
        {
            menu.add(0,4,0,"Website");
            menu.add(0,5,1,"Contact the bank");
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        return super.onContextItemSelected(item);

        if(item.getItemId() == 0)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dbs.com.sg"));
            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == 1)
        {
            String number = "18001111111";
            Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("Tel: " + number));
            startActivity(intentCall);
            return true;
        }

        if(item.getItemId() == 2)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ocbc.com"));
            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == 3)
        {
            String number = "18003633333";
            Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("Tel: " + number));
            startActivity(intentCall);
            return true;
        }

        if(item.getItemId() == 4)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://uob.com.sg"));
            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == 5)
        {
            String number = "18002222121";
            Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("Tel: " + number));
            startActivity(intentCall);
            return true;
        }
    }


   

}
