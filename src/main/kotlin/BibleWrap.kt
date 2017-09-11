import java.net.URL

/**
 * Created by RMH on 9/4/17.
 *
 * A wrapper around the getbible.net API designed for quick easy access to the endpoints.
 */
class BibleWrap {

	/**
	 * The foundation of the URL used for every call to the API.
	 */
	private val baseURL = "http://getbible.net/json?p="

	fun getPassage(chapter: String): Boolean {
		val result = URL(baseURL + chapter).readText()
		println(result)
		return true
	}
}