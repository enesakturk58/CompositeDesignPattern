public class Developer implements IEmpoyee{

    private String name;
    private int id;
    private String position;

    public Developer(String name,int id,String position){
        this.name=name;
        this.id=id;
        this.position=position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(name + " " + id + " " + position);
    }
}
