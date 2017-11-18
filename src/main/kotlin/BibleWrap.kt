import java.net.HttpURLConnection
import java.net.URL

/**
 * Created by RMH on 9/4/17.
 *
 * A wrapper around the getbible.net API designed for quick, easy access to the endpoints.
 */
class BibleWrap {

	/**
	 * The foundation of the URL used for every call to the API.
	 */
	private val baseURL = "http://getbible.net/json?p="

	/**
	 * Blanket function to get any passage with a valid endpoint. This should be used
	 * with caution because it can easily be the cause of an error if you attempt to
	 * call a non-existent endpoint.
	 */
	fun getPassage(passage: String): Boolean {
		// Store the entire contents of the JSON data as a String.
		val data = connectToAPI(passage).inputStream.bufferedReader().readText()

		println(data)
		return true
	}

	/**
	 * Function to get any single chapter from the specified book.
	 */
	fun getChapter(book: String, chapter: Int): Boolean {
		// TODO: get the chapter.
		return true
	}

	/**
	 * Get any book. Use carefully as the JSON response is typically quite large.
	 */
	fun getBook(book: String): Boolean {
		// TODO: get the book.
		return true
	}

	fun connectToAPI(endpoint: String) : HttpURLConnection {
		// Connect to the API with the specified endpoint.
		val connection = URL(baseURL + endpoint).openConnection() as HttpURLConnection
		// Spoof the user agent to fool the API into thinking the request came from a
		// browser.
		connection.addRequestProperty("User-Agent", "Mozilla/4.0")
		return connection
	}
}