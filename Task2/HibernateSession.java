import java.util.List;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSession {
    private static SessionFactory factory;
    public static void main(String[] args) {

        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        HibernateSession hibernateSession = new HibernateSession();

        String mID1 = hibernateSession.addMarket("Magnit","64");
        String mID2 = hibernateSession.addMarket("Lenta","65");
        String mID3 = hibernateSession.addMarket("Perekrestok","66");

        hibernateSession.updateCorpIdInStockTradeAction("Gazprom",20);

        hibernateSession.deleteStockTradeAction(29);

        hibernateSession.listStockTradeAction();
    }

    public String addMarket(String name, String code){
        Session session = factory.openSession();
        Transaction tx = null;
        String marketID = null;
        try {
            tx = session.beginTransaction();
            Market employee = new Market(name,code);
            marketID = (String) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return marketID;
    }

    public void listStockTradeAction(){
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            List stockTradeActions = session.createQuery("FROM stocktradeacts").list();
            for (Iterator iterator = stockTradeActions.iterator(); iterator.hasNext();){
                Stocktradeacts tradeAct = (Stocktradeacts) iterator.next();
                System.out.print("marketName: " + tradeAct.getmarketName());
                System.out.print("  tradingVolume: " + tradeAct.gettrading_volume());
                System.out.println("  close_price: " + tradeAct.getclose_price());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void updateCorpIdInStockTradeAction(String marketname, int corpId ){
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Stocktradeacts act = (Stocktradeacts)session.get(Stocktradeacts.class, marketname);
            act.setcorpid(corpId);
            session.update(act);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void deleteStockTradeAction(int corpId){
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Stocktradeacts act = (Stocktradeacts)session.get(Stocktradeacts.class, corpId);
            session.delete(act);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
