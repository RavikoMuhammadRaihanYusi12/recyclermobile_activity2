package id.ac.uin.suska.recyclermobile;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapterMobile extends RecyclerView.Adapter<viewHolder> {


    public adapterMobile(Context defin, List<itemRec> items) {
        this.defin = defin;
        this.items = items;
    }

    Context defin;
    List<itemRec> items;
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(defin).inflate(R.layout.item_lay,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.name.setText(items.get(position).getName());
        holder.email.setText(items.get(position).getEmail());
        holder.imageView.setImageResource(items.get(position).getImage());

        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(defin, "Items : " + items.get(position).getName(),
                    Toast.LENGTH_SHORT).show();
            if(items.get(position).getName().equals("RESIDENT EVIL")){
                Intent intent = new Intent(defin, MainActivity2.class);
                intent.putExtra("Gambar Default", R.drawable.re1);
                intent.putExtra("Text Default" , "Resident Evil is a 1996 survival horror video game developed and published by Capcom originally for the PlayStation");
                defin.startActivity(intent);
            }
            if(items.get(position).getName().equals("RESIDENT EVIL 2")){
                Intent intent = new Intent(defin, MainActivity2.class);
                intent.putExtra("Gambar Default", R.drawable.re2);
                intent.putExtra("Text Default", "Resident Evil 2 is a 1998 survival horror video game developed and published by Capcom for the PlayStation");
                defin.startActivity(intent);
            }
            if(items.get(position).getName().equals("RESIDENT EVIL 3 : NEMESIS")){
                Intent intent = new Intent(defin, MainActivity2.class);
                intent.putExtra("Gambar Default" , R.drawable.re3);
                intent.putExtra("Text Default" ,"Resident Evil 3: Nemesis is a 1999 survival horror video game developed and published by Capcom originally for the PlayStation");
                defin.startActivity((intent));
            }
            if(items.get(position).getName().equals("RESIDENT EVIL 4")){
                Intent intent = new Intent(defin, MainActivity2.class);
                intent.putExtra("Gambar Default" , R.drawable.re4);
                intent.putExtra("Text Default" , "Resident Evil 4 is a survival horror game developed by Capcom Production Studio 4 and published by Capcom for the GameCube in 2005");
                defin.startActivity(intent);
            }
            if(items.get(position).getName().equals("RESIDENT EVIL 5")){
                Intent intent = new Intent(defin, MainActivity2.class);
                intent.putExtra("Gambar Default" , R.drawable.re5);
                intent.putExtra("Text Default" , "Resident Evil 5 is a 2009 third-person shooter video game developed and published by Capcom.");
                defin.startActivity(intent);
            }
            if(items.get(position).getName().equals("RESIDENT EVIL 6")){
                Intent intent = new Intent(defin, MainActivity2.class);
                intent.putExtra("Gambar Default" , R.drawable.re6);
                intent.putExtra("Text Default" , "A major installment in the Resident Evil series, Resident Evil 6 was released for the PlayStation 3 and Xbox 360 in October 2012, and for Windows in March 2013.");
                defin.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
