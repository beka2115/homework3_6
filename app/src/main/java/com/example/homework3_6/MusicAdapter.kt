package com.example.homework3_6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework3_6.databinding.ItemMusicBinding

class MusicAdapter(
    val musicList: List<Music>,
    val onClick: (position: Int) -> Unit
) : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(
            ItemMusicBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = musicList.size


    inner class MusicViewHolder(private val binding: ItemMusicBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val item = musicList[adapterPosition]
            itemView.setOnClickListener {
                onClick(adapterPosition)

            }
            binding.textMusic.text = item.music
            binding.textName.text = item.name
            binding.textNumber.text = item.num
            binding.textTime.text = item.time

        }

    }

}