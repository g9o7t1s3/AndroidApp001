package com.testapp002.e2013051;

import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;

@SuppressWarnings("unused")
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        Button btn = (Button)findViewById(R.id.button1);
        		btn.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						//�I�u�W�F�N�g���擾
						EditText People = (EditText)findViewById(R.id.PeopleTxt);
						EditText Money = (EditText)findViewById(R.id.MoneyTxt);
						TextView txtresult = (TextView)findViewById(R.id.textView3);
						TextView txtnumP = (TextView)findViewById(R.id.TextView01);
						TextView txtyen = (TextView)findViewById(R.id.textView1);
						
						//���͓��e�擾
						String strPeople = People.getText().toString();
						String strMoney = Money.getText().toString();
						
						//���l�ɕϊ�
						int num = Integer.parseInt(strPeople);
						int money = Integer.parseInt(strMoney);
						
						//����Z
						int result = money / num;
						
						//���ʕ\���p�ɐݒ�
						txtresult.setText(Integer.toString(result));
						
						//���ʕ\��
						txtnumP.setVisibility(View.VISIBLE);
						txtresult.setVisibility(View.VISIBLE);
						txtyen.setVisibility(View.VISIBLE);
						
					}
    });
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
    

}
