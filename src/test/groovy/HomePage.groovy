//package pages
import geb.* 

//import modules.*

class HomePage extends Page{
	static url = "http://dgud7:10088/"
	static at = { title == "DGU"}
    static content = {
        ll { 
        	module( DrupaLoginModule  )
        }
    }

}