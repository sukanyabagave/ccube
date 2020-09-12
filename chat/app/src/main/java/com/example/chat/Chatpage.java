package com.example.chat;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Chatpage extends AppCompatActivity {
    //private TextView voiceInput;
    //private final int REQ_CODE_VOICE_INPUT=100;
    EditText userInput;
    RecyclerView recyclerView;
    List<ResponseMessage> responseMessageList;
    MessageAdapter messageAdapter;
  //  ImageButton button;
   // TextView textView;
   // ListView listView;
   // ArrayList<String> listItems=new ArrayList<String>();
    //ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatpage);
        userInput=findViewById(R.id.userInput);
        recyclerView=findViewById(R.id.conversation);
        responseMessageList = new ArrayList<>();
        messageAdapter = new MessageAdapter(responseMessageList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(messageAdapter);
        userInput.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(actionId == EditorInfo.IME_ACTION_SEND){
                    ResponseMessage message = new ResponseMessage(userInput.getText().toString(),true);
                    responseMessageList.add(message);
                    ResponseMessage message2=new ResponseMessage("welcome to ccube",false);
                    responseMessageList.add(message2);
                   // ResponseMessage message2 = new ResponseMessage(userInput.getText().toString(),true);
                   // responseMessageList.add(message2);
                    messageAdapter.notifyDataSetChanged();
                    if(!isVisible()){
                        recyclerView.smoothScrollToPosition(messageAdapter.getItemCount()-1);
                    }


                }
                return true;
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Chatpage.this,counsellorlist.class));

            }

        });

     //   Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
     //   setSupportActionBar(toolbar);
      //  addKeyListener();

      //  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
      //  fab.setOnClickListener(new View.OnClickListener() {
        //    @Override
          //  public void onClick(View view) {

             //    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
               //        .setAction("Action", null).show();

               // getVoiceInput();

            }
            public boolean isVisible(){
               LinearLayoutManager linearLayoutManager=(LinearLayoutManager) recyclerView.getLayoutManager();
               int positionOfLastVisibleItem=linearLayoutManager.findLastCompletelyVisibleItemPosition();
               int itemCount=recyclerView.getAdapter().getItemCount();
               return (positionOfLastVisibleItem>=itemCount);
            }


            }
      //  });
   // private void addKeyListener()
   // {
  //      edittext = (EditText) findViewById(R.id.edittext );
    //    button = (ImageButton) findViewById(R.id.button);
    //    textView = (TextView) findViewById(R.id.textView);
    //    listView = (ListView) findViewById(R.id.ListView1);
    //    button.setOnClickListener(new View.OnClickListener()
     //   {
      //      @Override
      //      public void onClick(View v){

        //    }
      //  });
   // }
   // private void getVoiceInput(){
     //   Intent intent=new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
       // intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
         //       RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        //intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        //intent.putExtra(RecognizerIntent.EXTRA_PROMPT,"please speak something!");
        //try{

          //  startActivityForResult(intent,REQ_CODE_VOICE_INPUT);
       // }
       // catch(ActivityNotFoundException a){


      //  }
   // }

    /*@Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        switch (requestCode){
            case REQ_CODE_VOICE_INPUT:{
                if(resultCode==RESULT_OK && null !=data){
                    ArrayList<String> result=data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    voiceInput.setText(result.get(0));

                }
                break;
            }
        }
    }
*/
 /*   @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    }

*/