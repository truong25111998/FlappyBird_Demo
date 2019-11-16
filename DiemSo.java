package gameflappybird;


public class DiemSo {
    private static int diem = 0;
    private ConChim conChimD = new ConChim();
    private OngNuoc ongNuocD = new OngNuoc();
    private static boolean b = false;

    public static int getDiem() {
        return diem;
    }
  
    public void congDiem(){
        
        {
        if((conChimD.getX() +45) > ongNuocD.getX1() && conChimD.getX() < (ongNuocD.getX1() +55))
        {
            b = true;
        }
        if((conChimD.getX() +45) > ongNuocD.getX2() && conChimD.getX() < (ongNuocD.getX2() +55))
        {
            b = true;
        }
        if((conChimD.getX() +45) > ongNuocD.getX3() && conChimD.getX() < (ongNuocD.getX3() +55))
        {
            b = true;
        }
        if(b == true && conChimD.getX() >ongNuocD.getX1() + 55){
            diem ++;
            b = false; 
        }
        if(b == true && conChimD.getX() >ongNuocD.getX2() + 55){
            diem ++;
            b = false; 
        }
        if(b == true && conChimD.getX() >ongNuocD.getX3() + 55){
            diem ++;
            b = false; 
        }
        }
        
    }
}
