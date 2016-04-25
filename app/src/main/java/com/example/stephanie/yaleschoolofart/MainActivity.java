package com.example.stephanie.yaleschoolofart;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button calendarButton;
    private Button academicsButton;
    private Button admissionsButton;
    private Button studentButton;
    private Button facultyButton;
    private Button facilityButton;
    boolean academClick= false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find your views
        calendarButton = (Button) findViewById(R.id.calendarButton);

        //Assign a listener to your button
        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(intent);
            }
        });

        academicsButton = (Button) findViewById(R.id.academicsButton);


        OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                /** Instantiating PopupMenu class */
               // boolean temp;
//                if (academClick) {
//                    academicsButton.setBackgroundResource(R.color.navy);
//                    academClick = false;
//                }
//                else {
//                        academicsButton.setBackgroundResource(R.color.blue);
//                        academClick=true;
//                    }

                PopupMenu popup = new PopupMenu(MainActivity.this, v);

                /** Adding menu items to the popumenu */
                popup.getMenuInflater().inflate(R.menu.menu_academics, popup.getMenu());

                /** Defining menu item click listener for the popup menu */
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId()==R.id.undergrad) {
                            //Start your second activity
                            Intent intent = new Intent(MainActivity.this, UndergradActivity.class);
                            startActivity(intent);
                        }

                        Toast.makeText(getBaseContext(), "You selected the action : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });

                /** Showing the popup menu */
                popup.show();

            }
        };

        academicsButton.setOnClickListener(listener);

        admissionsButton = (Button) findViewById(R.id.admissionsButton);


        OnClickListener listenerAdmis = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                /** Instantiating PopupMenu class */
                //academicsButton.setBackgroundResource(R.color.blue);
                PopupMenu popup = new PopupMenu(MainActivity.this, v);

                /** Adding menu items to the popumenu */
                popup.getMenuInflater().inflate(R.menu.menu_admissions, popup.getMenu());

                /** Defining menu item click listener for the popup menu */
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId()==R.id.application) {
                            //Start your second activity
                            Intent intent = new Intent(MainActivity.this, ApplicationActivity.class);
                            startActivity(intent);
                        }
                  else      Toast.makeText(getBaseContext(), "You selected the action : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });

                /** Showing the popup menu */
                popup.show();

            }
        };

        admissionsButton.setOnClickListener(listenerAdmis);


        studentButton = (Button) findViewById(R.id.studentLifeButton);


        OnClickListener listenerStudent = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                /** Instantiating PopupMenu class */
                //academicsButton.setBackgroundResource(R.color.blue);
                PopupMenu popup = new PopupMenu(MainActivity.this, v);

                /** Adding menu items to the popumenu */
                popup.getMenuInflater().inflate(R.menu.menu_studentlife, popup.getMenu());

                /** Defining menu item click listener for the popup menu */
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(getBaseContext(), "You selected the action : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });

                /** Showing the popup menu */
                popup.show();

            }
        };

        studentButton.setOnClickListener(listenerStudent);

        facultyButton = (Button) findViewById(R.id.facultyButton);


        OnClickListener listenerFaculty = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                /** Instantiating PopupMenu class */
                //academicsButton.setBackgroundResource(R.color.blue);
                PopupMenu popup = new PopupMenu(MainActivity.this, v);

                /** Adding menu items to the popumenu */
                popup.getMenuInflater().inflate(R.menu.menu_faculty, popup.getMenu());

                /** Defining menu item click listener for the popup menu */
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(getBaseContext(), "You selected the action : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });

                /** Showing the popup menu */
                popup.show();

            }
        };

        facultyButton.setOnClickListener(listenerFaculty);

        facilityButton = (Button) findViewById(R.id.facilitiesButton);


        OnClickListener listenerFacility = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                /** Instantiating PopupMenu class */
                //academicsButton.setBackgroundResource(R.color.blue);
                PopupMenu popup = new PopupMenu(MainActivity.this, v);

                /** Adding menu items to the popumenu */
                popup.getMenuInflater().inflate(R.menu.menu_facilities, popup.getMenu());

                /** Defining menu item click listener for the popup menu */
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.galleries) {
                            //Start your second activity
                            Intent intent = new Intent(MainActivity.this, CalendarActivity.class);
                            startActivity(intent);
                        }
                        // Toast.makeText(getBaseContext(), "You selected the action : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });

                /** Showing the popup menu */
                popup.show();

            }
        };

        facilityButton.setOnClickListener(listenerFacility);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


//    public void changelayoutAcademics(View view){
//        setContentView(R.layout.activity_academics);
//    }
//    public void changelayoutAdmiissions(View view){
//        setContentView(R.layout.activity_admissions);
//    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
