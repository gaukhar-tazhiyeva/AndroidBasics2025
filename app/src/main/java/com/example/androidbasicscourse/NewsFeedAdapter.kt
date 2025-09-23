package com.example.androidbasicscourse

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class NewsFeedAdapter(
    private val posts: List<Pair<String, String>>, // (текст, url)
    private val likes: MutableList<Boolean>
) : RecyclerView.Adapter<NewsFeedAdapter.PostViewHolder>() {

    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val postText: TextView = itemView.findViewById(R.id.NewsText)
        val postImage: ImageView = itemView.findViewById(R.id.NewsImage)
        val likeButton: Button = itemView.findViewById(R.id.likeButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val (text, imageUrl) = posts[position]

        holder.postText.text = text
        Glide.with(holder.itemView.context).load(imageUrl).into(holder.postImage)

        holder.likeButton.text = if (likes[position]) "♥" else "<3"
        holder.likeButton.setOnClickListener {
            likes[position] = !likes[position]
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int = posts.size
}
