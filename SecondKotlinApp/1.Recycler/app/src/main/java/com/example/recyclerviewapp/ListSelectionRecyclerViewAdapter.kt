package com.example.recyclerviewapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class ListSelectionRecyclerViewAdapter : RecyclerView.Adapter<ListSelectionViewHolder>() {


//    val listTitles = arrayOf("Shopping List", "Chores", "Android Tutorials")

    fun getListStuff() : MutableList<String> {
        val listTitles = mutableListOf<String>()

        var count = 0
        while (count < 55) {
            listTitles.add("Shit$count")
            count ++
        }
        return listTitles
    }




    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ListSelectionViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.list_selection_view_holder, p0, false)
        return ListSelectionViewHolder(view)
    }

    override fun getItemCount(): Int {
        val listTitles = getListStuff()
        return listTitles.size
    }

    override fun onBindViewHolder(p0: ListSelectionViewHolder, p1: Int) {
        val listTitles = getListStuff()

        p0.listPosition.text = (p1 + 1).toString()
        p0.listTitle.text = listTitles[p1]
    }


}

