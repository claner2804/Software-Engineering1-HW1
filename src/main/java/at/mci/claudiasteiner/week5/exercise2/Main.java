package at.mci.claudiasteiner.week5.exercise2;

public class Main {

    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();

        LocalTv proSieben = new LocalTv("ProSieben");
        LocalTv rtl = new LocalTv("RTL");
        LocalTv orf = new LocalTv("ORF");

        newsAgency.addObserver(proSieben);
        newsAgency.addObserver(rtl);
        newsAgency.addObserver(orf);

        Newspaper standard = new Newspaper("Standard");
        Newspaper krone = new Newspaper("Krone");
        Newspaper tt = new Newspaper("TT");

        newsAgency.addObserver(standard);
        newsAgency.addObserver(krone);
        newsAgency.addObserver(tt);

        Website google = new Website("Google");
        Website yahoo = new Website("Yahoo");
        Website msn = new Website("MSN");

        newsAgency.addObserver(google);
        newsAgency.addObserver(yahoo);
        newsAgency.addObserver(msn);

        newsAgency.notifyObservers();

    }
}
