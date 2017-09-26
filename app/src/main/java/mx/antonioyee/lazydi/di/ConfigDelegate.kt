package mx.antonioyee.lazydi.di

import mx.antonioyee.lazydi.App

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> (http://antonioyee.mx/) on 26/09/17.
 */

class ConfigDelegate() : Config {

	override val properties: Map<String, Any?> by lazy {
		App.getConfig()
	}

}