package com.andresm.notekeeper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val myDataset: List<NoteInfo>):
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val courseId: TextView = view.findViewById(R.id.courseIdTextView)
        val courseTitle: TextView = view.findViewById(R.id.courseTitleTextView)
        val noteTitle: TextView = view.findViewById(R.id.noteTitleTextView)
        val noteDescription: TextView = view.findViewById(R.id.noteTextTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.note_card, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.courseId.text = myDataset[position].course.courseId
        holder.courseTitle.text = myDataset[position].course.title
        holder.noteTitle.text = myDataset[position].title
        holder.noteDescription.text = myDataset[position].text
    }

    override fun getItemCount() = myDataset.size
}