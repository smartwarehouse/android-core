package smartwarehouse.smartwarehouse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BarangRetur extends AppCompatActivity {
    String items[] = new String[] {"Barang 1", "Barang 2", "Barang 3", "Barang 4", "Barang 5",
                                    "Barang 6", "Barang 7", "Barang 8", "Barang 9"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang_retur);

        ListView listView = (ListView) findViewById(R.id.barang_retur);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
    }
}
