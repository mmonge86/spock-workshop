import org.mmonge.Account
import spock.lang.Specification

class WithExampleSpec extends Specification {

    def "working with with"() {
        given:
        def account = new Account(accountNo: "123", balance: 60.0)

        expect:
        with(account) {
            accountNo == "123"
            balance == 50.0
        }
    }
}