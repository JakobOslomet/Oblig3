package wp.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BilletterController {

    @Autowired
    private BilletterRepo rep;

    @PostMapping("/lagre")
    public void lagreBilletter(Billetter innBilletter){
        rep.lagreBillett(innBilletter);
    }

    @GetMapping("/hentAlle")
    public List<Billetter> hentAlle(){
        return rep.hentAlleBilletter();
    }

    @GetMapping("/slett")
    public
    void slett(){
        rep.slettAlleBillett();
    }
}
