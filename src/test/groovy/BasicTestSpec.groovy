import org.mmonge.BasicTest
import spock.lang.*

class BasicTestSpec extends Specification {

    BasicTest testObj

    def setup() {
        // runs before every feature method
        testObj = new BasicTest()
    }

    def setupSpec() {}    // runs once -  before the first feature method
    def cleanup() {}      // runs after every feature method
    def cleanupSpec() {}  // runs once -  after the last feature method

    def "it should return a given string in upper case form"() {
        given: "setup block"

        when: "action block. When this happens..."
        def result = testObj.toUpper("Hello world!")

        then: "conditions to be met"
        print("the result is $result")
        result == "HELLO WORLD!"
    }


}
