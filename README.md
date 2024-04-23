Oppgaven:

Oblig 3: Bestilling av kinobilletter med databaselagring
Ta utgangspunkt i koden fra obligatorisk oppgave 2 og erstatt arrayet på tjener/server med en tabell i en relasjonsdatabase. Det holder å bruke H2-"in-memory"-database, men H2-konsollet skal fungere også på Heroku ved å legge inn følgende konfigurasjon i "src/main/resources/application.properties":

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.h2.console.settings.web-allow-others=true

Vær obs på at konfigurasjonen ovenfor også vil gjelde lokalt, slik at du nå finner H2-konsollet på http://localhost:8080/h2-console

~Dersom du ønsker bruke Heroku Postgres-database, så må du teste at løsningen din fungerer som den skal på Heroku. Se siste del av første time av forelesningen Relasjonedatabaser 1 for mer informasjon om PostgreSQL-løsning

Listen med innlagte bestillinger som sendes fra server til klient når alle bestillinger hentes skal være sortert på etternavn. Uten noen form for sortering så vil denne listen være ordnet etter rekkefølgen bestillingene ble lagt inn på. Sorteringen skal skje på server.

Ellers skal applikasjonen ha den samme funksjonaliteten som i oblig 1 og 2.

Levering:

Opprett et personlig «oblig-repo» ved å følge denne lenken: https://classroom.github.com/a/_e360DIgLinks to an external site.  
Lag et nytt prosjekt i IntelliJ med Spring Initializr og sett det under versjonskontroll (init repo)
Sett ditt personlige "oblig-repo" fra steg 1 som remote og fetch+pull
Lag en commit og push
Sjekk at alt ser riktig ut på GitHub
Fortsett å jobbe mot Git-repoet og husk å pushe alle endringer før du leverer på Canvas
Det eneste som skal leveres på Canvas er en lenke til GitHub-repoet ditt
Ikke levér denne lenken på Canvas før koden som ligger i GitHub-repoet ditt er klar for retting og webapplikasjonen er deployert/publisert på Heroku.com (se detaljer ved å følge den nederste lenken)
Du må la Heroku få vite hvilken Java-versjon du ønsker å bygge din webapp med. (Heroku bruker Java 8 som standard.) Det gjør du ved å lage filen system.properties på rot i prosjektet ditt, med innholdet java.runtime.version=17
MERK: Fordi GitHub-repoet er privat, så har ikke Canvas tilgang til det. Derfor vil det vises en "ikke funnet"-side i Canvas. Det kan trygt ignoreres! Så lenge du selv kan følge lenken og komme til GitHub-repoet for innleveringen din så kan også studentassistentene det. Grunnen til at studentassistentene har tilgang til ditt private GitHub-repo er fordi det ble opprettet ved hjelp av GitHub Classroom under organisasjonen "DATA1700" på GitHub. Vi har naturligvis ikke tilgang til andre eventuelle andre private repoer dere lager på GitHub.

Detaljene finner du i denne gjennomgangen: $WIKI_REFERENCE$/pages/oppsett-av-git-og-github-i-intellij-for-oblig-1 

Deployering/publisering av oblig som webapplikasjon på Heroku.com: $WIKI_REFERENCE$/pages/opptak-av-forelesning-javascript-3 

 

!!!NB: some final adjustments to this Oblig. As you well know, we can't be using Heroku so you can ignore that part. 

You can use any method that you like to connect to the DB, you can even use a DB we did not talk about. The most important thing is to be able to process the purchase of those cinema tickets via the DB. So if you create a new ticket we have to see it on the data base. The same goes for updating or deleting a ticket. 

This time istead of screenshots I would like you to upload a video of your project: 

-You can upload the video on youtube and add a link in your git repo. The video does not need to be long and you can even film it with your phone if you like. I would like to see the server started, and you adding a cinema ticket that is visible on the DB. Also I would like to see in that video how you delete it.

 

Thank you!

 

 

 


Thank you,

Cosmin
