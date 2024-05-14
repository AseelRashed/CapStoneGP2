package tests.rolesAndPermissionsProcess;


import org.testng.annotations.Test;
import pages.HomePage;
import pages.RolesAndPermissionsPage;
import utilities.Driver;

public class US0019  {
    HomePage homePage ;
    RolesAndPermissionsPage rolesAndPermissionsPage ;

    @Test
    public void TC02() {
        homePage = new HomePage();
        rolesAndPermissionsPage = new RolesAndPermissionsPage();
        homePage.roleClick();
        rolesAndPermissionsPage.verifyAllElementsEnabled();
        Driver.tearDown();

    }
}