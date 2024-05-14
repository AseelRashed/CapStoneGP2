package tests.rolesAndPermissionsProcess;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.RolesAndPermissionsPage;
import utilities.Driver;

public class US0018 {
    HomePage homePage ;
    RolesAndPermissionsPage rolesAndPermissionsPage ;

    @Test
    public void TC01() {
        homePage = new HomePage();
        rolesAndPermissionsPage = new RolesAndPermissionsPage();
        homePage.roleClick();
        rolesAndPermissionsPage.printAllRoles();
        Driver.tearDown();

    }
}