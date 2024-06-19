import character.sinhvien.SinhVien;
import character.giaovien.GiaoVien;
import java.util.ArrayList;
import lophoc.Lop;
import monhoc.MonHoc;

public class Main {
    public static void main(String[] args) {
        GiaoVien gv1 = GiaoVien.createNewTeacher("GV1","Hoang Thanh Nam");
        MonHoc toan= new MonHoc("T1","Toán",gv1);
        Lop lop1 = new Lop("1A",gv1);
        SinhVien sv1= SinhVien.createNewStudent("001","Nguyen Van A");
        SinhVien sv2= SinhVien.createNewStudent("002","Nguyen Van B");
        SinhVien sv3 = SinhVien.createNewStudent("003","Nguyen Van C");
        lop1.addStudent(sv1);
        lop1.addStudent(sv2);
        lop1.addStudent(sv3);
        lop1.addSubject(toan);
        lop1.classInformation();



    }
}
