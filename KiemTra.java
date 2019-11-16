
package gameflappybird;

public class KiemTra {
    private ConChim conChimK = new ConChim();
    private OngNuoc ongNuocK = new OngNuoc();
    public boolean chet()
    {
        if((conChimK.getY() + 45) >= 400)
        {
            return true;
        }
        //////////cotnuoc so 1
        if(conChimK.getY() <= ongNuocK.getH1() && conChimK.getX() + 45 >= ongNuocK.getX1()
                && conChimK.getX() <= ongNuocK.getX1() + 55)
        {
            return true;
        }
        if(conChimK.getY() + 45 >=(ongNuocK.getH1() + 100) && (conChimK.getX() +45) >= ongNuocK.getX1() 
                && conChimK.getX() <= ongNuocK.getX1() + 5)
        {
            return true;
        }
        ////////cotnuoc so 2
        if(conChimK.getY() <= ongNuocK.getH2() && (conChimK.getX() + 45) >= ongNuocK.getX2()
                && conChimK.getX() <= (ongNuocK.getX2() + 55))
        {
            return true;
        }
        if((conChimK.getY() + 45) >=(ongNuocK.getH2() + 100) && (conChimK.getX() +45) >= ongNuocK.getX2() 
                && conChimK.getX() <= (ongNuocK.getX2() + 55))
        {
            return true;
        }
        ///////cotnuoc so 3
        if(conChimK.getY() <= ongNuocK.getH3() && (conChimK.getX() + 45) >= ongNuocK.getX3()
                && conChimK.getX() <= (ongNuocK.getX3() + 55))
        {
            return true;
        }
        if((conChimK.getY() + 45) >=(ongNuocK.getH3() + 100) && (conChimK.getX() +45) >= ongNuocK.getX3() 
                && conChimK.getX() <= (ongNuocK.getX3() + 55))
        {
            return true;
        }

        return false;
    }
}
