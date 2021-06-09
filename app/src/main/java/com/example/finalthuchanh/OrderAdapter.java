package com.example.finalthuchanh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class OrderAdapter extends BaseAdapter {
    private Context context;
    private List<Order> listOrder;
    private int layout;
    public OrderAdapter(Context context, List<Order> listOrder, int layout)  {
        this.context = context;
        this.listOrder = listOrder;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return listOrder.size();
    }

    @Override
    public Object getItem(int position) {

        return listOrder.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listOrder.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = LayoutInflater.from(this.context).inflate(this.layout, parent, false);
        TextView customerName = view.findViewById(R.id.customerName);
        TextView address = view.findViewById(R.id.address);
        TextView phoneNumber = view.findViewById(R.id.phoneNumber);
        TextView product = view.findViewById(R.id.product);
        TextView cod = view.findViewById(R.id.cod);

        double value = listOrder.get(position).getCOD();
        cod.setText(String.valueOf(value));
        address.setText(listOrder.get(position).getAddress());
        phoneNumber.setText(listOrder.get(position).getCustomerPhoneNumber());
        product.setText(listOrder.get(position).getProduct());
        customerName.setText(listOrder.get(position).getCustomerName());
        return view;

    }
}
