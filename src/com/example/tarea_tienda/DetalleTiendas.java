package com.example.tarea_tienda;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class DetalleTiendas extends Activity {
	public static final String DETALLE = "aa";
	TextView detalles;
	TextView lugar;
	TextView telefono;
	TextView hora;
	TextView web;
	TextView mail;
	String tel="";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detalle_tiendas);
		Intent intent=getIntent();
		String string=intent.getStringExtra(DETALLE).toString();
		
		
		
		
		detalles=(TextView) findViewById(R.id.textView1);
		lugar=(TextView) findViewById(R.id.textView2);
		telefono=(TextView) findViewById(R.id.textView3);
		hora=(TextView) findViewById(R.id.textView4);
		web=(TextView) findViewById(R.id.textView5);
		mail=(TextView) findViewById(R.id.textView6);
		
		
		if (string.equals("Tienda de Ropa")){

			detalles.setText(string);
			Linkify.addLinks(detalles, Linkify.ALL);
			lugar.setText("19 Interpro Road Madison, AL 35758");
			Linkify.addLinks(lugar, Linkify.ALL);
			telefono.setText("20205090");
			tel="20205090";
			Linkify.addLinks(telefono, Linkify.ALL);
			hora.setText("7:00 a 5:00");
			Linkify.addLinks(hora, Linkify.ALL);
			web.setText("www.ropa.com");
			Linkify.addLinks(web, Linkify.ALL);
			mail.setText("ropa@fina.com");
			Linkify.addLinks(mail, Linkify.ALL);
		
	
		}else {
			detalles.setText(string);
			Linkify.addLinks(detalles, Linkify.ALL);
			lugar.setText("17 Road Madison, AL 35650");
			Linkify.addLinks(lugar, Linkify.ALL);
			telefono.setText("78302598");
			tel="78302598";
			Linkify.addLinks(telefono, Linkify.ALL);
			hora.setText("7:00 a 5:00");
			Linkify.addLinks(hora, Linkify.ALL);
			web.setText("www.zapatos.com");
			Linkify.addLinks(web, Linkify.ALL);
			mail.setText("zapatos@rino.com");
			Linkify.addLinks(mail, Linkify.ALL);
					

		}
		Button llamar =(Button)findViewById(R.id.button1);
		llamar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent intent= new Intent(Intent.ACTION_DIAL);
			intent.setData(Uri.parse("tel:" + tel));
			startActivity(intent);
			}
		});
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.detalle_tiendas, menu);
		return true;
	}

}
