import character.sinhvien.SinhVien;
import character.giaovien.GiaoVien;
import java.util.ArrayList;
import lophoc.Lop;
import monhoc.MonHoc;

public class Main {
    public static void main(String[] args) {

        //define teacher
        GiaoVien gv0 = GiaoVien.createNewTeacher("GVCN","Tran Hoang Mai");
        GiaoVien gv1 = GiaoVien.createNewTeacher("GV1","Hoang Thanh Nam");
        GiaoVien gv2 = GiaoVien.createNewTeacher("GV2","Nguyen Thi Ha");

        //define class
        Lop lop1 = new Lop("1A",gv0);

        //define subject
        MonHoc toan= new MonHoc("T1","Toán",gv1);
        MonHoc tiengAnh = new MonHoc("TA1","Tiếng Anh",gv2);
            // add teacher into subject
            toan.addTeacher("GV1","Hoang Thanh Nam");
            tiengAnh.addTeacher("GV2","Nguyen Thi Ha");

        // define student
        SinhVien sv1= SinhVien.createNewStudent("001","Nguyen Van A");
        SinhVien sv2= SinhVien.createNewStudent("002","Nguyen Van B");
        SinhVien sv3 = SinhVien.createNewStudent("003","Nguyen Van C");

        // add student into class
        lop1.addStudent(sv1);
        lop1.addStudent(sv2);
        lop1.addStudent(sv3);

        // add subject into class
        lop1.addSubject(toan);
        lop1.addSubject(tiengAnh);
        lop1.classInformation();



    }
}
