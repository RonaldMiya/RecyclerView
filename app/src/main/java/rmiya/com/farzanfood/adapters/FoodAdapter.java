package rmiya.com.farzanfood.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import rmiya.com.farzanfood.R;
import rmiya.com.farzanfood.models.Food;

/**
 * Created by Ronald Miya de la Cruz on 27/03/2018.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder>{

    private List<Food> food;

    public void setFood(List<Food> food) { this.food = food ;}

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView nameFood;
        TextView timeFood;
        TextView categoryFood;
        TextView priceFood;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_back);
            nameFood = itemView.findViewById(R.id.nameFood);
            timeFood = itemView.findViewById(R.id.timeFood);
            categoryFood = itemView.findViewById(R.id.categoryFood);
            priceFood = itemView.findViewById(R.id.priceFood);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_product, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final Food comida = food.get(position);

        int resID = holder.itemView.getContext().getResources().getIdentifier(comida.getPicture(), "drawable", holder.itemView.getContext().getPackageName());
        holder.imageView.setImageResource(resID);

        holder.nameFood.setText(comida.getName());
        holder.timeFood.setText(comida.getTiempo());
        holder.categoryFood.setText(comida.getCategory());
        holder.priceFood.setText(String.valueOf(comida.getPrice()));

    }

    @Override
    public int getItemCount() {
        return food.size();
    }
}
