package edu.fra.uas.v2setter;

public class MasterController {
    public static void main(String[] args) {
        MasterV2 master = new MasterV2();
        master.setJourneymanAndWork(new Journeyman(), new Drilling());
        master.delegateWork();
    }
}
