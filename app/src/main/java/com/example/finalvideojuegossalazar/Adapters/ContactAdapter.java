package com.example.finalvideojuegossalazar.Adapters;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalvideojuegossalazar.Models.Contacto;
import com.example.finalvideojuegossalazar.R;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.StringViewHolder>  {

    private List<Contacto> mData;

    public ContactAdapter(List<Contacto> getAnime) {
        mData=getAnime;

    }

    public class StringViewHolder extends RecyclerView.ViewHolder {
        private View mview;
        public StringViewHolder(@NonNull View itemView) {
            super(itemView);
            mview=itemView;
        }
    }

    @NonNull
    @Override
    public StringViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //permite manipular el xml
        LayoutInflater mLayoutInflater=LayoutInflater.from(parent.getContext());

        View view= mLayoutInflater.inflate(R.layout.item, parent , false);
        return new StringViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull StringViewHolder holder, int position) {
        //lleno los datos

        TextView mTextViewNombre = holder.mview.findViewById(R.id.tvNombre);

        ImageView mTextViewImagen = holder.mview.findViewById(R.id.tvimageView);

        Contacto text=mData.get(position);

        mTextViewNombre.setText(text.names);
        //mTextViewImagen.setImageURI(Uri.parse(text.avatar));


       // Picasso.get().load(Uri.parse(text.avatar)).into(mTextViewImagen);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
