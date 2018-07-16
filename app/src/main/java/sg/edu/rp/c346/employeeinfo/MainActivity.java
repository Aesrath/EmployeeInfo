package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;

    ArrayList<EmployeeList> alEmployeeList;
    CostumAdapter caEmployeeList;
    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvEmployee = findViewById(R.id.listViewEmployee);
        alEmployeeList = new ArrayList<>();
        EmployeeList eList1 = new EmployeeList("John","Software Technical Leader",3400);
        EmployeeList eList2 = new EmployeeList("May","Programmer",2200);
        EmployeeList eList3 = new EmployeeList("John","Software Technical Leader",3400);
        EmployeeList eList4 = new EmployeeList("May","Programmer",2200);
        EmployeeList eList5 = new EmployeeList("John","Software Technical Leader",3400);
        EmployeeList eList6 = new EmployeeList("May","Programmer",2200);
        EmployeeList eList7 = new EmployeeList("John","Software Technical Leader",3400);
        EmployeeList eList8 = new EmployeeList("May","Programmer",2200);
        EmployeeList eList9 = new EmployeeList("John","Software Technical Leader",3400);
        EmployeeList eList10 = new EmployeeList("May","Programmer",2200);
        EmployeeList eList11 = new EmployeeList("John","Software Technical Leader",3400);
        EmployeeList eList12 = new EmployeeList("May","Programmer",2200);
        EmployeeList eList13 = new EmployeeList("John","Software Technical Leader",3400);
        EmployeeList eList14 = new EmployeeList("May","Programmer",2200);
        EmployeeList eList15 = new EmployeeList("John","Software Technical Leader",3400);
        EmployeeList eList16 = new EmployeeList("May","Programmer",2200);
        EmployeeList eList17 = new EmployeeList("John","Software Technical Leader",3400);
        EmployeeList eList18 = new EmployeeList("May","Programmer",2200);
        EmployeeList eList19 = new EmployeeList("John","Software Technical Leader",3400);
        EmployeeList eList20 = new EmployeeList("May","Programmer",2200);

        alEmployeeList.add(eList1);
        alEmployeeList.add(eList2);
        alEmployeeList.add(eList3);
        alEmployeeList.add(eList4);
        alEmployeeList.add(eList5);
        alEmployeeList.add(eList6);
        alEmployeeList.add(eList7);
        alEmployeeList.add(eList8);
        alEmployeeList.add(eList9);
        alEmployeeList.add(eList10);
        alEmployeeList.add(eList11);
        alEmployeeList.add(eList12);
        alEmployeeList.add(eList13);
        alEmployeeList.add(eList14);
        alEmployeeList.add(eList15);
        alEmployeeList.add(eList16);
        alEmployeeList.add(eList17);
        alEmployeeList.add(eList18);
        alEmployeeList.add(eList19);
        alEmployeeList.add(eList20);


        caEmployeeList = new CostumAdapter(this,R.layout.employee_list,alEmployeeList);

        lvEmployee.setAdapter(caEmployeeList);

    }
}
