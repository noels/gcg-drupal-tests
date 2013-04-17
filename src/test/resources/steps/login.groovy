import geb.*


this.metaClass.mixin(cucumber.runtime.groovy.Hooks)
this.metaClass.mixin(cucumber.runtime.groovy.EN)

Given(~'^I have entered (\\w+) into the user box$') { String user ->
    // Express the Regexp above with the code you wish you had
    Browser.drive {
        to HomePage
        at HomePage
        page.ll.user.value(user)
    }
}

Given(~'^I have entered (\\w+) into the password$') { String Pass ->
    page.ll.pass.value(Pass)
}

When(~'^I press (\\w+)$') { String action ->
    // Express the Regexp above with the code you wish you had
    //throw new PendingException()
}

Then(~'^I can see the admin menu$') { ->
    // Express the Regexp above with the code you wish you had
    //throw new PendingException()
}