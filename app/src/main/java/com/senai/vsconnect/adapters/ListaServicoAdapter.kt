package com.senai.vsconnect.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.senai.vsconnect.models.Servico
import com.senai.vsconnect.R

class ListaServicoAdapter(private val novaListaServicoAdapter: ArrayList<Servico>) :
    RecyclerView.Adapter<ListaServicoAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.activity_lista_servico, parent, false
        );
        return MyViewHolder(itemView);
    }

    override fun getItemCount(): Int {
        return novaListaServicoAdapter.size;
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = novaListaServicoAdapter[position];
        holder.titulo.text = currentItem.titulo;
        //holder.valor.n = currentItem.valor;
        holder.descricao.text = currentItem.descricao;

    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titulo: TextView = itemView.findViewById(R.id.titulo);
        val descricao: TextView = itemView.findViewById(R.id.descricao);
        val valor: TextView = itemView.findViewById(R.id.valor);
        //val techs: Recycler =  itemView.findViewById<>();
    }
}