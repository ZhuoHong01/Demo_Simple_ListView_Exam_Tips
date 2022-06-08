package sg.edu.rp.c346.id21018193.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    ArrayList<String> examTipsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);

        examTipsList = new ArrayList<>();
        examTipsList.add("Don't just read the code, code it as much as possible during each practical session");
        examTipsList.add("Seek help from the lecturer ASAP, don't wait till you lost in the jungle");
        examTipsList.add("Prepare your template source code for each topic");
        examTipsList.add("Create a few empty Android projects to speed up your coding during the exam");
        examTipsList.add("Ensure that your Android Studio is up and running before the exam");

        ArrayAdapter adapter = new ArrayAdapter<>(this,
                                                android.R.layout.simple_list_item_1, examTipsList);
        lvExamTips.setAdapter(adapter);
    }
}