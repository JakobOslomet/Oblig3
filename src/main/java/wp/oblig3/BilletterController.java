package wp.oblig2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BilletterController {
    private final List<Billetter> alleBilletter = new ArrayList<>();
    @PostMapping("/lagre")
    public void lagreBilletter(Billetter innBilletter){
        alleBilletter.add(innBilletter);
    }
    @GetMapping("/hentAlle")
    public List<Billetter> hentAlle(){
        return alleBilletter;
    }
    @GetMapping("/slett")
    public
    void slett(){
        alleBilletter.clear();
    }
}
