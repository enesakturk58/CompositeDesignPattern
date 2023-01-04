import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements IEmpoyee{
    private List<IEmpoyee> empoyeeList = new ArrayList<IEmpoyee>();
    @Override
    public void showEmployeeDetails() {
        for (IEmpoyee emp:empoyeeList){
            emp.showEmployeeDetails();
        }
    }

    public void ekle(IEmpoyee empoyee){
        empoyeeList.add(empoyee);
    }
    public void sil(IEmpoyee empoyee){
        empoyeeList.remove(empoyee);
    }
}
