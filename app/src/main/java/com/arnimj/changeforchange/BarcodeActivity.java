package com.arnimj.changeforchange;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.reimaginebanking.api.java.Constants.AccountType;
import com.reimaginebanking.api.java.Models.Account;
import com.reimaginebanking.api.java.Models.RequestResponse;
import com.reimaginebanking.api.java.NessieClient;
import com.reimaginebanking.api.java.NessieException;
import com.reimaginebanking.api.java.NessieResultsListener;


public class BarcodeActivity extends Activity {

    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barcode);

        final Button donate = (Button)findViewById(R.id.donatebutton);
        final Button deposit = (Button)findViewById(R.id.depositbutton);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Charities,android.R.layout.activity_list_item);


        donate.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        donateToCharity(donate);
                    }

                }


        );

        deposit.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        depositToBank(deposit);
                    }

                }


        );


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
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void donateToCharity(View donate){

        Intent intent = new Intent(this, DonatedToCharity.class);

        startActivity(intent);


//        NessieClient nessieClient = NessieClient.getInstance();
//        nessieClient.setAPIKey("71b84ccfb38cca73865a4c218e2350e6");
//
//
//
//        Account account3 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("American National Red Cross")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account4 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("Make a Wish Foundation")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account5 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("United Way")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account6 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("Salvation Army")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account7 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("Feeding America")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account8 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("YMCA")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account9 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("Task Force for Global Health")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account10 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("Goodwill")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account11 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("Food for the Poor")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account12 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("St. Jude's Hospital")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account13 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("American Cancer Society")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account14 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("World Vision")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account15 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("Boys & Girls Clubs")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account16 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("Catholic Charities USA")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account17 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("Compassion International")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account18 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("AmeriCares Foundation")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account19 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("Habitat for Humanity")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account20 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("UNICEF")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account21 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("American Heart Association")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account22 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("Save the Children USA")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account23 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("Catholic Medical Mission Board")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account24 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("Save the Children Federation")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account25 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("Multiple Sclerosis Foundation")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account26 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("FeedMore America")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account27 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("Families of Disabled Veterans")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account28 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("Animal Abuse Prevention Association")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account29 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("National Cancer Foundation")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//        Account account30 = new Account.Builder()
//                .type(AccountType.CHECKING)
//                .nickname("Cross International")
//                .rewards(10)
//                .balance(10)
//                .build();
//
//
//
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account3, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account4, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account5, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account6, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account7, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account8, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account9, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account10, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account11, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account12, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account13, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account14, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account15, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account16, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account17, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account18, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account19, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account20, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account21, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });
//
//        nessieClient.createAccount("555bed95a520e036e52b20cc",account22, new NessieResultsListener() {
//            @Override
//            public void onSuccess(Object o, NessieException e) {
//                if(e == null){
//                    RequestResponse response = (RequestResponse) o;
//                    Log.v("DEBUG", response.getMessage());
//                }
//                else {
//                    Log.e("ERROR", e.getMessage());
//                }
//
//            }
//        });


    }

    public void depositToBank(View deposit){

        Intent intent = new Intent(this, DepositMadeActivity.class);

        startActivity(intent);

    }

}
