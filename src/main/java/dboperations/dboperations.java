/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dboperations;

import Modelller.tblegitici;
import com.egitici.interfaces.BaseServices;
import com.egitici.interfaces.ICRUD;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vektorel
 */
public class dboperations implements ICRUD<tblegitici>{
    
     BaseServices<tblegitici> bs = new BaseServices<>();
    @Override
    public void Kaydet(tblegitici o) {
    bs.kaydet(o);
    }

    @Override
    public void Duzenle(tblegitici o) { 
    bs.duzenle(o);
    }

    @Override
    public void Sil(tblegitici o) {
        bs.sil(o);
    }

    @Override
    public List<tblegitici> Listele() {
    return bs.listele(tblegitici.class);
    }

    @Override
    public tblegitici Bul(int id) {
        Criteria cr = bs.getSession().createCriteria(tblegitici.class);
        cr.add(Restrictions.eq("id", id));
        return (tblegitici)cr.uniqueResult();
    }
    
    public tblegitici Bultckimlikten(String tckimlik){
    Criteria cr = bs.getSession().createCriteria(tblegitici.class);
    cr.add(Restrictions.eq("tckimlik", tckimlik));
    return (tblegitici)cr.uniqueResult();
    }

    
    
    
}
