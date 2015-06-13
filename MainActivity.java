package tk.saiprasadm.bingo;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button b[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        initButtons();
    }

    private void initButtons() {
        b=new Button[26];
        b[0]=null;
        b[1] = (Button)findViewById(R.id.b1);
        b[2] = (Button)findViewById(R.id.b2);
        b[3] = (Button)findViewById(R.id.b3);
        b[4] = (Button)findViewById(R.id.b4);
        b[5] = (Button)findViewById(R.id.b5);
        b[6] = (Button)findViewById(R.id.b6);
        b[7] = (Button)findViewById(R.id.b7);
        b[8] = (Button)findViewById(R.id.b8);
        b[9] = (Button)findViewById(R.id.b9);
        b[10] = (Button)findViewById(R.id.b10);
        b[11] = (Button)findViewById(R.id.b11);
        b[12] = (Button)findViewById(R.id.b12);
        b[13] = (Button)findViewById(R.id.b13);
        b[14] = (Button)findViewById(R.id.b14);
        b[15] = (Button)findViewById(R.id.b15);
        b[16] = (Button)findViewById(R.id.b16);
        b[17] = (Button)findViewById(R.id.b17);
        b[18] = (Button)findViewById(R.id.b18);
        b[19] = (Button)findViewById(R.id.b19);
        b[20] = (Button)findViewById(R.id.b20);
        b[21] = (Button)findViewById(R.id.b21);
        b[22] = (Button)findViewById(R.id.b22);
        b[23] = (Button)findViewById(R.id.b23);
        b[24] = (Button)findViewById(R.id.b24);
        b[25] = (Button)findViewById(R.id.b25);

       

        buttonListener();



    }

    private void buttonListener() {

        Brains logic=new Brains(b);
        logic.CheckAllCols();
        b[1].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                b[1].setEnabled(true);
                Toast.makeText(getApplicationContext(),"Long click",Toast.LENGTH_SHORT).show();

                return false;
            }
        });
        b[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[1].setEnabled(false);
            }
        });

        b[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[2].setEnabled(false);
            }
        });

        b[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[3].setEnabled(false);
            }
        });
        b[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[4].setEnabled(false);
            }
        });
        b[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[5].setEnabled(false);
            }
        });
        b[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[6].setEnabled(false);
            }
        });
        b[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[7].setEnabled(false);
            }
        });
        b[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[8].setEnabled(false);
            }
        });
        b[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[9].setEnabled(false);
            }
        });
        b[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[10].setEnabled(false);
            }
        });
        b[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[11].setEnabled(false);
            }
        });
        b[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[12].setEnabled(false);
            }
        });
        b[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[13].setEnabled(false);
            }
        });
        b[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[14].setEnabled(false);
            }
        });
        b[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[15].setEnabled(false);
            }
        });
        b[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[16].setEnabled(false);
            }
        });
        b[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[17].setEnabled(false);
            }
        });
        b[18].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[18].setEnabled(false);
            }
        });
        b[19].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[19].setEnabled(false);
            }
        });
        b[20].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[20].setEnabled(false);
            }
        });
        b[21].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[21].setEnabled(false);
            }
        });
        b[22].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[22].setEnabled(false);
            }
        });
        b[23].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[23].setEnabled(false);
            }
        });
        b[24].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[24].setEnabled(false);
            }
        });
        b[25].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b[25].setEnabled(false);
            }
        });
    }

    public void playBingoOnclick(View v) {
        Toast.makeText(getApplicationContext(), "Back Button Clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.settings) {
            return true;
        }
        switch (item.getItemId()) {
            case R.id.settings:

                break;
            case R.id.help:

                break;
            case R.id.exit:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }


}
