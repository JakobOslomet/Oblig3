package wp.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BilletterRepo {

    @Autowired
    private JdbcTemplate db;

    public void lagreBillett(Billetter innBilletter){
        String sql = "insert into Billetter(velgFilm, antall, fornavn, etternavn, tlfnr, epost) values(?,?,?,?,?,?)";
        db.update(sql,innBilletter.getVelgFilm(),innBilletter.getAntall(),innBilletter.getFornavn(),innBilletter.getEtternavn(),innBilletter.getTlfnr(),innBilletter.getEpost());
    }
    public List<Billetter> hentAlleBilletter(){
        String sql = "select * from Billetter order by etternavn desc   ";
        List<Billetter> alleBilletter = db.query(sql, new BeanPropertyRowMapper<>(Billetter.class));
        return alleBilletter;
    }
    public void slettAlleBillett(){
        String sql = "delete from Billetter";
        db.update(sql);
    }
}
