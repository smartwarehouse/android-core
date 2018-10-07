package smartwarehouse.smartwarehouse;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

public class BarangKosong extends AppCompatActivity {
    String[] listArray = {"Nama Barang"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang_kosong);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.activity_barang_kosong, listArray);
        ListView listview = (ListView) findViewById(R.id.barang_kosong);
        listview.setAdapter(adapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
