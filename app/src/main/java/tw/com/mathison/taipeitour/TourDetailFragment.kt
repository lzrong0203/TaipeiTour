package tw.com.mathison.taipeitour

import android.os.Binder
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import model.Tour
import tw.com.mathison.taipeitour.databinding.ActivityTourDetailBinding
import java.util.*

class TourDetailFragment: Fragment() {

    private lateinit var binding: ActivityTourDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var tour = Tour(
           id = UUID.randomUUID(),
           title = "金融研訓院",
           addDate = Date(),
           isVisited = true
        )

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivityTourDetailBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}