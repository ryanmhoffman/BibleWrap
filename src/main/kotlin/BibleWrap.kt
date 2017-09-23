import java.net.HttpURLConnection
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

	fun getPassage(passage: String): Boolean {
		// Connect to the URL.
		val connection = URL(baseURL + passage).openConnection() as HttpURLConnection
		// Set a user agent to fool the API into thinking it's a browser request.
		connection.addRequestProperty("User-Agent", "Mozilla/4.0")
		// Store the entire contents of the JSON data as a String.
		val data = connection.inputStream.bufferedReader().readText()

		println(data)
		return true
	}
}