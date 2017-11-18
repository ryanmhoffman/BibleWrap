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
	 * Get any book. Use carefully as the JSON response can be quite large depending on
	 * the book.
	 */
	fun getBook(book: String): Boolean {
		// TODO: get the book.
		return true
	}

	private fun connectToAPI(endpoint: String) : HttpURLConnection {
		// Connect to the API with the specified endpoint.
		val connection = URL(baseURL + endpoint).openConnection() as HttpURLConnection
		// Spoof the user agent to fool the API into thinking the request came from a
		// browser.
		connection.addRequestProperty("User-Agent", "Mozilla/4.0")
		return connection
	}

	private val bookMap = hashMapOf(
			Books.GENESIS to "Genesis",
			Books.EXODUS to "Exodus",
			Books.LEVITICUS to "Leviticus",
			Books.NUMBERS to "Numbers",
			Books.DEUTERONOMY to "Deuteronomy",
			Books.JOSHUA to "Joshua",
			Books.JUDGES to "Judges",
			Books.RUTH to "Ruth",
			Books.FIRST_SAMUEL to "1Sam",
			Books.SECOND_SAMUEL to "2Sam",
			Books.FIRST_KINGS to "1Kg",
			Books.SECOND_KINGS to "2Kg",
			Books.FIRST_CHRONICLES to "1Ch",
			Books.SECOND_CHRONICLES to "2Ch",
			Books.EZRA to "Ezra",
			Books.NEHEMIAH to "Neh",
			Books.ESTHER to "Est",
			Books.JOB to "Job",
			Books.PSALMS to "Psa",
			Books.PROVERBS to "Pro",
			Books.ECCLESIASTIES to "Ecc",
			Books.SONG_OF_SOLOMON to "Son",
			Books.ISAIAH to "Isa",
			Books.JEREMIAH to "Jer",
			Books.LAMENTATIONS to "Lam",
			Books.EZEKIEL to "Ezekiel",
			Books.DANIEL to "Dan",
			Books.HOSEA to "Hos",
			Books.JOEL to "Joel",
			Books.AMOS to "Amos",
			Books.OBADIAH to "Oba",
			Books.JONAH to "Jonah",
			Books.MICAH to "Micah",
			Books.NAHUM to "Nahum",
			Books.HABAKKUK to "Hab",
			Books.ZEPHANIAH to "Zep",
			Books.HAGGAI to "Hag",
			Books.ZECHARIAH to "Zec",
			Books.MALACHI to "Mal",
			Books.MATTHEW to "Mat",
			Books.MARK to "Mark",
			Books.LUKE to "Luke",
			Books.JOHN to "John",
			Books.ACTS to "Acts",
			Books.ROMANS to "Rom",
			Books.FIRST_CORINTHIANS to "1Cor",
			Books.SECOND_CORINTHIANS to "2Cor",
			Books.GALATIANS to "Gal",
			Books.EPHESIANS to "Eph",
			Books.PHILIPPIANS to "Philippians",
			Books.COLOSSIANS to "Col",
			Books.FIRST_THESSALONIANS to "1The",
			Books.SECOND_THESSALONIANS to "2The",
			Books.FIRST_TIMOTHY to "1Tim",
			Books.SECOND_TIMOTHY to "2Tim",
			Books.TITUS to "Titus",
			Books.PHILEMON to "Philemon",
			Books.HEBREWS to "Heb",
			Books.JAMES to "Jam",
			Books.FIRST_PETER to "1Pet",
			Books.SECOND_PETER to "2Pet",
			Books.FIRST_JOHN to "1Jn",
			Books.SECOND_JOHN to "2Jn",
			Books.THIRD_JOHN to "3Jn",
			Books.JUDE to "Jude",
			Books.REVELATIONS to "Rev"
	)
}