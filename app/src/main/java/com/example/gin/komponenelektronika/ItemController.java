package com.example.gin.komponenelektronika;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class ItemController extends RecyclerView.ViewHolder implements View.OnClickListener {

    //Variable
    CardView cardItemLayout;
    ImageView icon; // Picture
    TextView title;
    TextView subTitle;
    Intent i;

    isitext isitext = new isitext();
    public ItemController(View itemView) {
        super(itemView);

        //Set id
        cardItemLayout = (CardView) itemView.findViewById(R.id.cardlist_item);

        //Tambahan untuk id Picture
        icon = (ImageView)itemView.findViewById(R.id.icon_item);

        //id Text
        title = (TextView) itemView.findViewById(R.id.listitem_name);
        subTitle = (TextView) itemView.findViewById(R.id.listitem_subname);

        //onClick
        itemView.setOnClickListener(this);

    }

    TextView textView;
    @Override
    public void onClick(View v) {
        //tampilkan toas ketika click
        int urut = Integer.parseInt(String.format("%d",getAdapterPosition()));
        i = new Intent(v.getContext(),Isi.class);
        //Toast.makeText(v.getContext(),String.format("%d", getAdapterPosition()),Toast.LENGTH_SHORT).show();
        //Toast.makeText(v.getContext(),""+MyRecyclerAdapter.titleOs.get(urut),Toast.LENGTH_LONG).show();

        switch (urut) {
            case 0:
                i.putExtra("judul",MyRecyclerAdapter.titleOs.get(urut));
                i.putExtra("isi",isitext.Resistor);
                i.putExtra("gambar",R.drawable.a);
                v.getContext().startActivity(i);
                break;
            case 1:
                i.putExtra("judul",MyRecyclerAdapter.titleOs.get(urut));
                i.putExtra("isi",isitext.kapasitor);
                i.putExtra("gambar",R.drawable.b);
                v.getContext().startActivity(i);
                break;
            case 2:
                i.putExtra("judul",MyRecyclerAdapter.titleOs.get(urut));
                i.putExtra("isi",isitext.induktor);
                i.putExtra("gambar",R.drawable.c);
                v.getContext().startActivity(i);
                break;
            case 3:
                i.putExtra("judul",MyRecyclerAdapter.titleOs.get(urut));
                i.putExtra("isi",isitext.transistor);
                i.putExtra("gambar",R.drawable.d);
                v.getContext().startActivity(i);
                break;
            case 4:
                i.putExtra("judul",MyRecyclerAdapter.titleOs.get(urut));
                i.putExtra("isi",isitext.dioda);
                i.putExtra("gambar",R.drawable.e);
                v.getContext().startActivity(i);
                break;
            case 5:
                i.putExtra("judul",MyRecyclerAdapter.titleOs.get(urut));
                i.putExtra("isi",isitext.relay);
                i.putExtra("gambar",R.drawable.f);
                v.getContext().startActivity(i);
                break;
            case 6:
                i.putExtra("judul",MyRecyclerAdapter.titleOs.get(urut));
                i.putExtra("isi",isitext.trafo);
                i.putExtra("gambar",R.drawable.g);
                v.getContext().startActivity(i);
                break;
            case 7:
                i.putExtra("judul",MyRecyclerAdapter.titleOs.get(urut));
                i.putExtra("isi",isitext.led);
                i.putExtra("gambar",R.drawable.h);
                v.getContext().startActivity(i);
                break;
            case 8:
                i.putExtra("judul",MyRecyclerAdapter.titleOs.get(urut));
                i.putExtra("isi",isitext.scr);
                i.putExtra("gambar",R.drawable.i);
                v.getContext().startActivity(i);
                break;
            case 9:
                i.putExtra("judul",MyRecyclerAdapter.titleOs.get(urut));
                i.putExtra("isi",isitext.tombol);
                i.putExtra("gambar",R.drawable.j);
                v.getContext().startActivity(i);
                break;
        }

    }

}