# ruander_jjb_vizsga_2021_08_03_FeladatSor01
## Java Backend Gyakorlati Vizsga 2021_08_03_FeladatSor01
----------------------------------------------------
> ### Feladat01 - *Java programozási nyelv alapjai*: A task_01 package-ben egy felhasználónév létrehozó alkalmazást kell folytatnia a következő szempontok figyelembevételével:
> A felhasználónév létrehozása a vezetéknév és keresztnév alapján, valamint egy véletlen szám generálásával(1-100) között történik! A felhasználónév első 2 karaktere nagybetű a vezetéknév első 2 karaktere, majd ezt követi a keresztnév első 3 karaktere kisbetűvel, majd egy alulvonás, végül egy véletlen szám 1-100 között!
Egy lehetséges bemenet: Teszt (vezetéknév) Elek (keresztnév) -> TEele_35
 
> a. Jelenleg egyik teszteset sem fut le sikeresen, javítsa ki a megfelelő metódust vagy metódusokat!

> b. Bővítse az alkalmazást, a véletlen szám intervallumait a felhasználótól kérje be!

> c. Bővítse az alkalmazást 2 újabb teszteset létrehozásával!

------------------------------------------------------
> ### Feladat02 - *Java objektumorientált programozás*: A task_02 package-ben egy kerékpár adatait (azonosító, gyártó,model, nettó ár, elérhető) kezelő alkalmazást kell folytatnia.
> A Bicycle osztályon belüli setSaleNetPrice(double percent) metódus feladata, hogy a bemenő paraméter alapján(százalékos érték - az akció mértéke) beállítsa a nettó árat.  

> a. A tests package-ben lévő egységteszt nem fut le sikeresen. Javítsa ki a megfelelő metódust vagy metódusokat!

> b. Osztályok és objektumok felhasználásával bővítse az alkalmazást! Kérje be a kerékpár adatait és az akció százalékos értékét!
	Írja ki a kerékpár minden adatát!

> c. Bővítse az alkalmazást 2 újabb teszteset létrehozásával!
------------------------------------------------------
> ### Feladat03 - *Java kollekciók*: A task_03 package-ben egy számítógép alkatrészek adatait (azonosító,név, leltárszám, gyártó, model, raktármennyiség, nettó ár, elérhető) kezelő alkalmazást kell folytatnia.
> A PcParts osztályon belüli isAvailable() metódusnak false-al kell visszatérnie, ha a raktármennyiség 0 vagy annál kisebb, true-val ha elérhető, tehát van belőle legalább 1 darab.  

> a. A tests package-ben lévő egységteszt nem fut le sikeresen. Javítsa ki a megfelelő metódust vagy metódusokat!

> b. Osztályok és objektumok felhasználásával bővítse az alkalmazást! Kérjünk be 3 darab PC alkatrész adatait, melyet egy lista adatszerkezetben tároljunk!
	Metódus segítségével írjuk ki az összes alkatrész minden adatát!
	
> c. Melyik a legdrágább alkatrész? A válaszban jelenítsük meg az alkatrész minden adatát!

> d. Bővítse az alkalmazást 2 újabb teszteset létrehozásával!

------------------------------------------------------
> ### Feladat04 - *Fájlkezelés Java-ban*: A task_04 package-ben egy pizzéria heti eladási adatait kezelő alkalmazást kell készítenünk. Az src-vel egy szinten található task04_data mappában van a feldololgozandó, UTF-8 kódolású csv állomány, melyben az adatok a következő sorrendben helyezkednek el: azonosító (karaktereket is tartalmaz),név, egységár (nettó), eladott darabszám, akciós (logikai típus)).
> Az azonosító kötelezően 9 karakter. Ennek ellenőrzésére a Pizza osztályon belül talál egy isIdLenghtValid() metódust.   

> a. A tests package-ben lévő egységteszt nem fut le sikeresen. Javítsa ki a megfelelő metódust vagy metódusokat!

> b. Osztályok és objektumok felhasználásával bővítse az alkalmazást! Olvassuk be a fájlt egy olyan adatszerkezetbe, hogy a további feladatok megoldhatóak legyenek!
	Metódus segítségével írjuk ki az összes pizza minden adatát ( akciós/nem akciós szövegesen jelenjen meg a kiírásnál)!
	
> c. Melyik a legolcsóbb pizza? A válaszban jelenítsük meg a pizza vagy pizzák minden adatát!

> d. Bővítse az alkalmazást 2 újabb teszteset létrehozásával!
------------------------------------------------------
> ### Feladat05 - *Adatbáziskezelés Java-ban*: A task_05 package-ben egy félkész ablakos(Swing) alkalmazást talál, amely ingatlanok adatait listázza!
> Futassa a data package-ben található best_estate_install.sql-t. A script létrehozza az adatbázist, táblákat és néhány beszúrást is tartalmaz. 
> Az estate_category tábla tartalmazza az ingatlan kategóriáját -> családi ház, ikerház stb. 
> Az estate tábla tartalmazza az ingatlanok adatait sorrendben -> azonosítóját, nevét, méretét (négyzetméterben), szobák számát, címét - város, címét - irányítószám, címét,
> árát (MFt), kategóriáját (idegen kulcs), akciós -e (alapértelmezetten 0-as) és állapota (alapértelmezetten 1-es).    
> Az adatbáziskapcsolódáshoz szükséges mysql driver a drivers mappában található, melyet állítson be a projekthez!  

> a. Jelenleg egyik teszteset sem fut le sikeresen, javítsa ki a megfelelő metódust vagy metódusokat!

> b. A táblázat alatt hozzon létre egy gombot, amelyre kattintva egy másik ablakban adatbázisba rögzíti az új ingatlan adatait! A logikai tipusú adatokat pipálható beviteli mező segítségével kérjük be (aktív alapértelmezetten legyen kipipálva)!  Az adattáblában kötelező mezőket a felületen is kötelező legyen megadni! Tájékoztassa a felhasználót az esetleges hibás megadásról!
  A felvitelre szolgáló ablak bezárásával az alkalmazás (főablak) fusson tovább!  

> c. Bővítse az alkalmazást 2 újabb teszteset létrehozásával!
