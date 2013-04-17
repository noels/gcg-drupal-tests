//package pages

import geb.*

class DrupalPage extends Page {
	static url = "http://dgud7:10088/"
    static content = {
        theModule { module DrupalLoginModule }
    }
}