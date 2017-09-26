package mx.antonioyee.lazydi.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import mx.antonioyee.lazydi.R
import mx.antonioyee.lazydi.di.Config
import mx.antonioyee.lazydi.di.ConfigDelegate
import mx.antonioyee.lazydi.di.ImageLoader

class MainActivity : AppCompatActivity(), Config by ConfigDelegate() {

	private val myName: String by properties
	private val imageLoader: ImageLoader by properties

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		txtName.text = myName
		imageLoader.loadImage("https://avatars0.githubusercontent.com/u/2522430?v=4", imgPhoto)
	}
}
