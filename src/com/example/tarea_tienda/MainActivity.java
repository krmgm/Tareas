package com.example.tarea_tienda;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	ArrayList<String> tiendas=null;
	ArrayAdapter<String> adapter;
	ListView lista=null;
	Intent intent=null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tiendas = new ArrayList<String>();
  
		
		
		tiendas.add("Tienda de Ropa");
		tiendas.add("Tienda de Zapatos");

 		
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tiendas);
        lista = (ListView)findViewById(R.id.listView1);
        
        lista.setAdapter(adapter);
        lista.setTextFilterEnabled(true);
        lista.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				
				intent= new Intent(getApplicationContext(), DetalleTiendas.class);
				intent.putExtra(DetalleTiendas.DETALLE, tiendas.get(arg2));
				startActivity(intent);
			}
        });
        
      
	}
	


	  
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
