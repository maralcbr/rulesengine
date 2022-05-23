package karate;

import com.intuit.karate.junit5.Karate;

class RulesRunner extends TestBase {
    
    @Karate.Test
    Karate testRules() {
        return Karate.run("rules").relativeTo(getClass());
    }    

}
