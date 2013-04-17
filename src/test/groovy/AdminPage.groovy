//package pages

import geb.*

class AdminPage extends Page{
	static url = "http://dgud7:10088/admin"
	static at = {
		assert $("h1").text() == "Administration"
	}
}