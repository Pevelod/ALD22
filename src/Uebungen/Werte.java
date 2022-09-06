package Uebungen;

class Werte {

    String version = "Version";
    String token = "ALD22#";
    String fail = "Keine Berechtigung!";
    Werte(){

    }

    public String getVersion(String token) {

        if (token == this.token) {

            return this.version;
        }
        else{

            return fail;
        }

    }

}
