import org.mmonge.Account
import spock.lang.Specification

class WithExampleSpec extends Specification {

    void verify(Account account) {
        assert account.accountNo == "123"
        assert account.balance == 60.0 as long
    }

    def "simple test"() {
        when:
        def account = new Account(accountNo: "123", balance: 60.0 as long)

        then:
        verify(account)
    }




    def "working with WITH"() {
        given:
        def account = new Account(accountNo: "123", balance: 60.0 as long)

        expect:
        with(account) {
            accountNo == "123"
            balance == 60.0
        }
    }
}