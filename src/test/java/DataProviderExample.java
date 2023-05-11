import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    //primitivni i referentni tipovi
    // niza - referntni tipovi na podatoci;
    // matrica - primitivni tipovi na podatoci)
    // [][] - matrica
    // [] - niza

    @Test(dataProvider = "LoginDataProvider")
    public void loginTest(String email, String pass){
        System.out.println("name and password: " + email +"/"+ pass);
    }

    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData(){
        Object[][] data = {{"zoki@gmail.com","zoki"}, {"zoran@gmail.com","zoran"}, {"mali@gmail.com","mali"}};
                return data;
    }
}
