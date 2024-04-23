let ut;
let inn = 0;
let billetter = [];
function kjøp(){
    let bestill;
    let antall = $("#antall").val();
    let velgFilm = $("#velgFilm").val();
    let fornavn = $("#fornavn").val();
    let etternavn = $("#etternavn").val();
    let tlfnr = $("#tlfnr").val();
    let epost = $("#epost").val();
    let verifisering = [];
    verifisering.fill(0);

    if(antall <= 0||!antall.split("").every(char => /^\d+$/.test(char))){
        $("#antallFeil").html("Antall må være et tall større enn 0");
        verifisering.push(1);
    }else{
        $("#antallFeil").html("");
        verifisering.push(0);
    }
    if(velgFilm ==  "Velg Film"){
        $("#ikkeValgt").html("Du må velge en film");
        verifisering.push(1);
    }else{
        $("#ikkeValgt").html("");
        verifisering.push(0);
    }
    if(fornavn == ""){
        $("#ingenFornavn").html("Du må skrive inn fornavn");
        verifisering.push(1);
    }
    else{
        $("#ingenFornavn").html("");
        verifisering.push(0);
    }
    if(etternavn == ""){
        $("#ingenEtternavn").html("Du må skrive inn etternavn");
        verifisering.push(1);
    }
    else{
        $("#ingenEtternavn").html("");
        verifisering.push(0);
    }
    if(tlfnr.length !== 8||!tlfnr.split("").every(char => /^\d+$/.test(char))){
        $("#ingenTlfnr").html("Du må skrive et gyldig telefonnummer");
        verifisering.push(1);
    }else{
        $("#ingenTlfnr").html("");
        verifisering.push(0);
    }
    if(!/[a-z]/.test(epost)||!/[@]/.test(epost)||!/[.]/.test(epost)){
        $("#ingenEpost").html("Du må skrive en gyldig epost");
        verifisering.push(1);
    }
    else{
        $("#ingenEpost").html("");
        verifisering.push(0);
    }
    let verifiser;
    for(verifiser of verifisering){
        if(verifiser === 1){
            break;
        }
    }

    if(verifiser === 0) {
        if(inn === 0) {
            ut = "<table><tr>" +
                "<th>Film</th>" +
                "<th>Antall</th>" +
                "<th>Fornavn</th>" +
                "<th>Etternavn</th>" +
                "<th>Telefonnr</th>" +
                "<th>Epost</th>" +
                "</tr>";
            inn++;
        }
        const billett = {
            velgFilm : $("#velgFilm").val(),
            antall : $("#antall").val(),
            fornavn : $("#fornavn").val(),
            etternavn : $("#etternavn").val(),
            tlfnr : $("#tlfnr").val(),
            epost : $("#epost").val()
        };
        $.post("/lagre", billett, function(){
            hentAlle();
        })

        function hentAlle() {
            $.get("/hentAlle", function(data){
                formaterData(data);
            });
        }

        function formaterData(Billetter) {
            ut += "<tr>";
            ut += "<td>" + billett.velgFilm + "</td><td>" + billett.antall + "</td><td>" + billett.fornavn + "</td>" +
                "<td>" + billett.etternavn + "</td><td>" + billett.tlfnr + "</td><td>" + billett.epost + "</td>";
            ut += "</tr>";
            $("#bestillt").html(ut);
        }
    }
    let textboxes = document.querySelectorAll("input[type='text']");
    for (let textbox of textboxes) {
        textbox.value = "";
    }
}
function slett(){
    $.get("/slett", function(){
        hentAlle();
    });
    ut = null;
    $("#bestillt").html(ut);
    billetter = [];
    inn = 0;
}