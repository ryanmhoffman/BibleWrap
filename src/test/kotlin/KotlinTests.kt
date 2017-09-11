import org.junit.Test
import kotlin.test.assertTrue

/**
 * Created by RMH on 9/4/17.
 */
class KotlinTests {

	// Test cases

	@Test
	fun printResults(){
		val bw = BibleWrap()
		assertTrue { bw.getPassage("John1") }
	}

}