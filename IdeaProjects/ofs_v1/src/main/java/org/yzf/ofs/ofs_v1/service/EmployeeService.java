package org.yzf.ofs.ofs_v1.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yzf.ofs.ofs_v1.entity.Employee;
import org.yzf.ofs.ofs_v1.mapper.EmployeeMapper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    private static void praserTXT(String fileName, List<Employee> employees){
        // 读取文件
        BufferedReader br = null;
        try {
            // 这里可以控制编码
            br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            String line = null;
            while ((line = br.readLine()) != null) {
                StringBuffer sb = new StringBuffer();
                sb.append(line);
                Employee employee = strToBean(sb.toString());
                employees.add(employee);
                System.out.println(employee.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 字符串转Employee对象
     * @param str
     * @return
     */
    private static Employee strToBean(String str){
        String[] split = str.split("\\|");
        return new Employee(Integer.parseInt(split[0]), split[1], Integer.parseInt(split[2]));
    }

    public void batchAddEmployee(String fileName){
        ArrayList<Employee> employees = new ArrayList<>();
        praserTXT(fileName,employees);
        employeeMapper.insertBatch(employees);
    }

    public PageInfo<Employee> getEmployeesInfo(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);// limit pageNum pageSize
        List<Employee> employeesInfo = employeeMapper.getEmployeesInfo();
        PageInfo<Employee> employeePageInfo = new PageInfo<>(employeesInfo);
        return employeePageInfo;
    }


}
