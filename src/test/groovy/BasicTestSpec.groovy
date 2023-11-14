import org.mmonge.BasicTest
import spock.lang.*

class BasicTestSpec extends Specification {

    BasicTest testObj

    def setup() {
        testObj = new BasicTest()
    }

    def "it should return a given string in upper case form"() {

        when: "toUpper() is called with a given string"
        def result = testObj.toUpper("Hello world!")

        then:
        print("the result is $result")
        result == "HELLO WORLD!"
    }
}
