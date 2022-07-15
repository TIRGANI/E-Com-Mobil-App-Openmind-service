package emsi.pfa.pambouparis.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import emsi.pfa.pambouparis.R;
import emsi.pfa.pambouparis.beans.Vetement;

public class productAdapter extends ArrayAdapter<Vetement> {


    public productAdapter(Context context, List<Vetement> machines) {
        super(context, R.layout.itemvetement, machines);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Vetement vetement = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.itemvetement, parent, false);
        }
        TextView nom = convertView.findViewById(R.id.nom);
        TextView prixvent = convertView.findViewById(R.id.prixvent);

        TextView poid = convertView.findViewById(R.id.poid);
        TextView description = convertView.findViewById(R.id.description);
       // TextView image = convertView.findViewById(R.id.image);
        TextView qtt = convertView.findViewById(R.id.qtt);
        nom.setText(vetement.getNom());
        prixvent.setText(vetement.getPrixdevente()+"");

        poid.setText(vetement.getPoids()+"");
        description.setText(vetement.getDescription());
        qtt.setText(vetement.getStock()+"");

        return convertView;
    }
}
