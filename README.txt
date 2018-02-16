
Pre zostavenie a spustenie projektu je potrebné vytvoriť príslušnú MySQL databázu spustením scriptu dochadzky.sql.
Následne je potrebné spustiť script dochadzky_data.sql pre vloženie testovacích dát. 

Na týchto dátach je potrebné vykonávať testy pre server aj pre klienta!!!

Pre otestovanie správneho fungovania servera je možné spustiť testy na triede DochadzkyServiceTest.java v test packages/service.

Server sa spúšťa spustením triedy Server.java v package-i assets.
Server sa vypína zadaním EXIT do konzoly!

Pre otestovanie správneho fungovania klienta je možné spustiť testy na triede ClientTest.java v test packages/assets.

Java Platform: JDK 1.8

