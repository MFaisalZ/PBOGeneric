package pbogeneric;

public class PBOGeneric {

    public static void main(String[] args) {
        
        Mahasiswa<String, String, Integer> mahasiswa = new Mahasiswa<>("20220040171", "Muhammad Faisal Zulmaulidin", 22);
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>("20220040052", "maulidan", 22);

        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Nama: " + mahasiswa.getName());
        System.out.println("Kelas: " + mahasiswa.getClassYear()); 
        
        System.out.println("------------------------");
        
        System.out.println("NIM:" + m.getNim());
        System.out.println("Nama: " + m.getName());
        System.out.println("Kelas: " + m.getClassYear()); 
        
    }
}

class Mahasiswa<NimT, NameT, ClassYearT> {

    private final NimT nim;
    private final NameT name;
    private final ClassYearT classYear;

    public Mahasiswa(NimT nim, NameT name, ClassYearT classYear) {
        this.nim = nim;
        this.name = name;
        this.classYear = classYear;
    }

    public NimT getNim() {
        return nim;
    }

    public NameT getName() {
        return name;
    }
    
    public ClassYearT getClassYear() {
        return classYear;
    }

}
