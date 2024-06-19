package monhoc;
import character.giaovien.GiaoVien;
import character.sinhvien.SinhVien;

public class MonHoc {
    public String subjectID;
    public String nameSubject;
    public GiaoVien giaoVien;

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


    // show Information
    public void showInfoMonHoc() {
        System.out.println("Tên môn học: "+nameSubject+"\nMã môn học: "+subjectID+giaoVien.getInformation());
    }

}
