package hashcode;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
    private String isim;
    private String soyisim;
    private int yas;
    private String okulNo;


    public Student(String isim, String soyisim, int yas, String okulNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.okulNo = okulNo;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public int getYas() {
        return yas;
    }

    public String getOkulNo() {
        return okulNo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(okulNo, student.okulNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(okulNo);
    }

    @Override
    public String toString() {
        return "Student{" + "isim='" + isim + '\'' + ", soyisim='" + soyisim + '\'' + ", yas=" + yas +
                ", okulNo='" + okulNo + '\'' + '}';
    }
}
