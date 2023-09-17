package com.example.spinlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener,AdapterView.OnItemSelectedListener {
    ListView LV;
    Spinner S;
    TextView TV1;
    TextView TV2;
    TextView TV3;
    TextView TV4;
    int Pos;
    String [] Continents = {"Asia","Europe","North America","Africa","South America","Australia"};
    String[][] AllCon = { {"Japan","China","India","Indonesia","South Korea","Phillipinnes","Israel"},
            {"Italy","Spain","Portugal","Germany","Greece","France","NetherLands"},
            {"USA","Canada","Mexico","Cuba","Panama","Haiti","Costa Rica"},
            {"South Africa","Nigeria","Morocco","Ghana","Senegal","Sudan","Uganda"},
            {"Brazil","Argentina","Chile","Peru","Colombia","guinea","Venezuela"},
            {"Australia","New Zealand","Fiji","Solomon Island","Tonga","Papua New Guinea","Kiribati"}};
    String[][] Asia = {{"Tokyo","125.7M","Japanese","Kimi Ya Go"},
            {"Beijing","1.412B","Chinese","March of the Volunteers"},
            {"Mumbai","1.408B","Hindi","Jana Gana Mana"},
            {"Jakarta","273.8M","Indonesian","Indonesia Raya"},
            {"SEOUL","51.74M","Korean","Aegukga"},
            {"Manila","113.9M","Filipino","Lupang Hinirang"},
            {"Jerusalem","9.364M","Hebrew","Hatikva"}};
    String[][] Europe = {{"Roma","59.11M","Italian","Il Canto degli Italiani"},
            {"Madrid","47.42M","Spanish","Marcha Real"},
            {"Lisbon","10.33M","Portugese","A Portuguesa"},
            {"Berlin","83.2M","German","Deutschlandlied"},
            {"Athens","10.64M","Greek","Hymn to Liberty"},
            {"Paris","67.75M","french","La Marseillaise"},
            {"Amsterdam","17.53M","Dutch","Wilhelmus"}};
    String [][] NorthA = {{"D.C Washington","331.9M","English","The StarSpangled Banner"},
            {"Ottowa","38.25M","English","O Canada"},
            {"Mexico City","126.7M","Spanish","Himno Nacional Mexicano"},
            {"Havana","11.26M","Spanish","La Bayamesa"},
            {"Panama City","4.351M","Spanish","Himno Istmeño"},
            {"Port-au-Prince","11.45M","Haitian Creole","La Dessalinienne"},
            {"San Jose","5.154M","Spanish","Himno Nacional Costa Rica"}};
    String [][] Africa = {{"Cape Town","59.39M","Zulu,Xhosa,Afrikaans","Nkosi Sikelel' iAfrika"},
            {"Abuja","213.4M","English,Tiv","Arise, O Compatriots"},
            {"Rabat","37.08M","Arabic","Cherifian Anthem"},
            {"Accra","32.83M","Twi,English","God Bless Our Homeland Ghana"},
            {"Dakar","16.88M","Wolof,French","Le Lion rouge"},
            {"Khartoum","45.66M","Arabic,English","Naḥnu Jund Allāh Jund al-Waṭan"},
            {"Kampala","45.85M","Luganda,English","Oh Uganda, Land of Beauty"}};
    String[][] SouthA ={{"Brasilia","214.3M","Portugese","Hino Nacional Brasileiro"},
            {"Buenos Aires","45.81M","Spanish","Himno Nacional Argentino"},
            {"Santiago","19.49M","Spanish","Himno Nacional de Chile"},
            {"Lima","33.72M","Spanish","Himno Nacional del Perú"},
            {"Bogotá","51.52M","Spanish","Himno República de Colombia"},
            {"Conakry","13.53M","French,Pular","Liberté"},
            {"Caracas","28.2M","Spanish","Gloria al Bravo Pueblo"}};
    String[][] Australia = {{"Canberra","25.69M","English","Advance Australia Fair"},
            {"Wellington","5.123M","English, Māori","God Defend New Zealand"},
            {"Suva","924,610","Fijian,English","God Bless Fiji"},
            {"Honiara","707,851","Melanesian","God Save Our Solomon Islands"},
            {"Nukuʿalofa","106,017","Tongan","Koe fasi ʻoe tuʻi ʻoe Otu Tonga"},
            {"Port Moresby","10.329M","Tok Pisin,English","O Arise, All You Sons"},
            {"Tarawa","128,874","Gilbertese","Kunan Kiribati"}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        S = findViewById(R.id.spinner);
        LV = findViewById(R.id.ListView);
        TV1 = findViewById(R.id.textView1);
        TV2 = findViewById(R.id.textView2);
        TV3 = findViewById(R.id.textView3);
        TV4 = findViewById(R.id.textView4);


        S.setOnItemSelectedListener(this);
        LV.setOnItemClickListener(this);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Continents);
        S.setAdapter(adp);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (Pos==0){
            TV1.setText("Capital: "+Asia[position][0]);
            TV2.setText("Population: "+Asia[position][1]);
            TV3.setText("Language: "+Asia[position][2]);
            TV4.setText("National anthem: "+Asia[position][3]);
        }else if(Pos==1){
            TV1.setText("Capital: "+Europe[position][0]);
            TV2.setText("Population: "+Europe[position][1]);
            TV3.setText("Language: "+Europe[position][2]);
            TV4.setText("National anthem: "+Europe[position][3]);
        } else if (Pos==2) {
            TV1.setText("Capital: "+NorthA[position][0]);
            TV2.setText("Population: "+NorthA[position][1]);
            TV3.setText("Language: "+NorthA[position][2]);
            TV4.setText("National anthem: "+NorthA[position][3]);
        } else if (Pos==3) {
            TV1.setText("Capital: "+Africa[position][0]);
            TV2.setText("Population: "+Africa[position][1]);
            TV3.setText("Language: "+Africa[position][2]);
            TV4.setText("National anthem: "+Africa[position][3]);
        } else if (Pos==4) {
            TV1.setText("Capital: "+SouthA[position][0]);
            TV2.setText("Population: "+SouthA[position][1]);
            TV3.setText("Language: "+SouthA[position][2]);
            TV4.setText("National anthem: "+SouthA[position][3]);
        }else{
            TV1.setText("Capital: "+Australia[position][0]);
            TV2.setText("Population: "+Australia[position][1]);
            TV3.setText("Language: "+Australia[position][2]);
            TV4.setText("National anthem: "+Australia[position][3]);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        ArrayAdapter<String> adp2 = new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,AllCon[position]);
        LV.setAdapter(adp2);
        Pos = position;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}