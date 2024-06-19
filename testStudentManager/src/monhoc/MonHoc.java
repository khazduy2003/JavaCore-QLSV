package monhoc;
import character.giaovien.GiaoVien;
import character.sinhvien.SinhVien;

public class MonHoc {
    private String subjectID;
    private String nameSubject;
    private GiaoVien giaoVien;

    public MonHoc(String subjectID, String nameSubject, GiaoVien giaoVien) {
        this.subjectID = subjectID;
        this.nameSubject = nameSubject;
        this.giaoVien = giaoVien;
    }

    //getter
    public String getsubId() {
        return subjectID;
    }
    public String getnameSubject() {
        return nameSubject;
    }
    public GiaoVien getGiaoVien() {
        return giaoVien;
    }

    //setter
    public void changeInfoMonHoc(String subjectID, String nameSubject, GiaoVien giaoVien) {
        this.nameSubject=nameSubject;
        this.subjectID=subjectID;
        this.giaoVien=giaoVien;
    }

    // add Teacher
    public void addTeacher(String teacherID, String teacherName) {
        this.giaoVien=GiaoVien.createNewTeacher(teacherID,teacherName);
    }

    // show Information
    public void showInfoMonHoc() {
        System.out.println("- Tên môn học: "+nameSubject+" - Mã môn học: "+subjectID+" - Giáo viên phụ trách: "+giaoVien.getFullName()+" - Mã giáo viên: "+giaoVien.getIDofTeacher());
    }

}
