package edu.udem.tabhost;

import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TabHostActivity extends FragmentActivity {
    private FragmentTabHost mTabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabhost);
        mTabHost = (FragmentTabHost) findViewById(R.id.mi_tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.contenido);

        View tabIndicator = LayoutInflater.from(this).inflate(R.layout.icon_layout,
                mTabHost.getTabWidget(), false);
        TextView title = (TextView) tabIndicator.findViewById(R.id.tituloTab);
        title.setText("Pestaña 1");
        ImageView icon = (ImageView) tabIndicator.findViewById(R.id.icono);
        Drawable myIcon =
                getResources().getDrawable(R.drawable.icono1);
        icon.setImageDrawable(myIcon);
        mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator(tabIndicator),
                Tab2.class, null);

        tabIndicator = LayoutInflater.from(this).inflate(R.layout.icon_layout,
                mTabHost.getTabWidget(), false);
        title = (TextView) tabIndicator.findViewById(R.id.tituloTab);
        title.setText("Pestaña 2");
        icon = (ImageView) tabIndicator.findViewById(R.id.icono);
        myIcon =
                getResources().getDrawable(R.drawable.icono1);
        icon.setImageDrawable(myIcon);
        mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator(tabIndicator),
                Tab1.class, null);


        tabIndicator = LayoutInflater.from(this).inflate(R.layout.icon_layout,
                mTabHost.getTabWidget(), false);
        title = (TextView) tabIndicator.findViewById(R.id.tituloTab);
        title.setText("Pestaña 3");
        icon = (ImageView) tabIndicator.findViewById(R.id.icono);
        myIcon =
                getResources().getDrawable(R.drawable.icono1);
        icon.setImageDrawable(myIcon);
        mTabHost.addTab(mTabHost.newTabSpec("tab3").setIndicator(tabIndicator),
                Tab3.class, null);

    }
}


