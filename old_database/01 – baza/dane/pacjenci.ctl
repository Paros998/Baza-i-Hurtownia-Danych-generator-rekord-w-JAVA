LOAD DATA
INFILE 'pacjenci.csv'
BADFILE 'bad/pacjenci.bad'
DISCARDFILE 'dsc/pacjenci.dsc'
REPLACE INTO TABLE pacjenci
FIELDS TERMINATED BY ","
TRAILING NULLCOLS
(pacjent_id,imie,nazwisko,login,haslo,pesel_id,kontakt_id,adres_id)