package art.arc.fragmenty

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView.OnChildClickListener
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class DataAdapter(var list: ArrayList<String>) :
    RecyclerView.Adapter<DataAdapter.RowViewHolder>(){

    private var s : String = ""

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_row, parent, false)

        return RowViewHolder(view)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: RowViewHolder, position: Int) {
        holder.rowView.text = list[position]
        holder.rowView.setOnClickListener {
            Log.i("LISTA", list[position])
        }
    }

    inner class RowViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val rowView : TextView = view.findViewById(R.id.recyclerRow)
    }



}
