package edu.fra.uas.v2setter;

public class MasterV2 {
    Journeyman journeyman;

    public void setJourneymanAndWork(Journeyman journeyman, Work work) {
        this.journeyman = journeyman;
        this.journeyman.setWork(work);
    }

    public void delegateWork() {
        journeyman.performWork();
    }
    public static void main(String[] args) {
        MasterV2 master = new MasterV2();
        master.setJourneymanAndWork(new Journeyman(), new Drilling());
        master.delegateWork();
    }
}
