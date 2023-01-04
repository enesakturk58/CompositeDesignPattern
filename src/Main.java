public class Main {
    public static void main(String[] args) {

        Developer developer1 = new Developer("Enes",58,"java");
        Developer developer2 = new Developer("Ozgur",16,"C#");

        CompanyDirectory devMenu = new CompanyDirectory();
        devMenu.ekle(developer1);
        devMenu.ekle(developer2);

        Manager manager1 = new Manager("Sevgi",53,"SEO Manager");
        Manager manager2 = new Manager("Saliha",06,"Ankara's Manager");

        CompanyDirectory manMenu = new CompanyDirectory();
        manMenu.ekle(manager1);
        manMenu.ekle(manager2);

        AssistantManager assistantManager = new AssistantManager("Tuba",61,"Boss HR");
        CompanyDirectory assistantManagerMenu = new CompanyDirectory();
        assistantManagerMenu.ekle(assistantManager);

        CompanyDirectory menu = new CompanyDirectory();

        menu.ekle(devMenu);
        menu.ekle(manMenu);
        manMenu.ekle(assistantManagerMenu);

        menu.showEmployeeDetails();

    }
}