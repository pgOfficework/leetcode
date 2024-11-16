package test;

//coding in database 3 columns are id ,cat ,txt using stream api get the data ascending order for cat column and  id should be in descending order  but cat value 00 should be at last.
//input
//id,cat,txt
//01,01,abc
//02,05,cde
//03,02,gugu
//04,01,gud
//05,00,hdiwhdiu
//06,04,gdd
//07,02,diwdiw
//08,01,djwjd
//09,02,rurytu
//10,03,ytti
//output:-
//---------
//08,01,ueu
//04,01,hvdhjsf
//01,01,yr
//09,02,eiu
//07,02,uiu
//03,02,uhefu
//10,03,ui
//06,04,UIU
//02,05,UHUHF
//05,00,HAH
//04,00,hvklv

 
 
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Record {
    int id;
    String cat;
    String txt;
    public Record(int id, String cat, String txt) {
        this.id = id;
        this.cat = cat;
        this.txt = txt;
    }
   public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCat() {
        return cat;
    }
    public void setCat(String cat) {
        this.cat = cat;
    }
    public String getTxt() {
        return txt;
    }
    public void setTxt(String txt) {
        this.txt = txt;
    }
    @Override
    public String toString() {
        return id + "," + cat + "," + txt;
    }

}
public class LTIMindetreeTest {
    public static void main(String[] args) {
        List<Record> records = Arrays.asList(
            new Record(1, "01", "abc"),
            new Record(2, "05", "cde"),
            new Record(3, "02", "gugu"),
            new Record(4, "01", "gud"),
            new Record(5, "00", "hdiwhdiu"),
            new Record(6, "04", "gdd"),
            new Record(7, "02", "diwdiw"),
            new Record(8, "01", "djwjd"),
            new Record(9, "02", "rurytu"),
            new Record(10, "03", "ytti")
        );





        records.stream().sorted(Comparator.comparing(Record::getCat)
                        .thenComparing(r -> r.getCat().equals("00") ? 1 : 0, Comparator.reverseOrder())
                .thenComparing(Record::getId, Comparator.reverseOrder())).forEach(System.out::println);

    }}