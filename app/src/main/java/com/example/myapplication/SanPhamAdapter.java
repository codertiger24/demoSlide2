package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.time.Instant;
import java.util.ArrayList;

public class SanPhamAdapter extends RecyclerView.Adapter<SanPhamAdapter.SanPhamViewHolder> {

    private ArrayList<SanPham> sanPhamList;
    private Context ctx;

    // Constructor nhận danh sách sản phẩm
    public SanPhamAdapter(Context ctx, ArrayList<SanPham> sanPhamList) {
        this.sanPhamList = sanPhamList;
        this.ctx = ctx;
    }

    // ViewHolder chứa các thành phần của item_san_pham
    public static class SanPhamViewHolder extends RecyclerView.ViewHolder {
        public TextView txtTenSP, txtPrice;


        public SanPhamViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTenSP = itemView.findViewById(R.id.txtTenSP);
            txtPrice = itemView.findViewById(R.id.txtPrice);
        }
    }

    @NonNull
    @Override
    public SanPhamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);
        return new SanPhamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SanPhamViewHolder holder, int position) {
        SanPham sanPham = sanPhamList.get(position);
        holder.txtTenSP.setText(sanPham.getTensp());
        holder.txtPrice.setText(String.valueOf(sanPham.getPrice())); // Chuyển giá trị price thành String



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ctx, "Bạn chọn: " + sanPham.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return sanPhamList.size();
    }
}