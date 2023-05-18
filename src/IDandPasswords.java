import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords(){
        logininfo.put("Denis","Vitelaru");
        logininfo.put("John","PASSWORD");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }

}
