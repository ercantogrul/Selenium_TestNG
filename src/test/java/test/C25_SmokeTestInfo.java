package test;

public class C25_SmokeTestInfo {

    // build verification test- BVT,  build acceptance diger isimleri..
    // Yapı doğrulama testi veya yapı kabul testi olarak da adlandırılan SMOKE test

/*
1.SmokeTest ne zaman yapıyoruz?
yazılımın yeni işlevleri geliştirildiğinde ve QA/hazırlama ortamında dağıtılan mevcut yapı ile entegre edildiğinde yapılır.
Tüm kritik işlevlerin doğru çalışmasını veya çalışmamasını sağlar. Bu test yönteminde, geliştirme ekibi yapıyı QA'da dağıtır.
Test senaryolarının alt kümeleri alınır ve ardından test kullanıcıları yapı üzerinde test senaryolarını çalıştırır.
QA ekibi, uygulamayı kritik işlevlere karşı test eder.
Bu test senaryoları serisi, derlemedeki hataları ortaya çıkarmak için tasarlanmıştır.
Bu testler geçilirse QA ekibi Fonksiyonel Test ile devam eder .
Herhangi bir arıza, sistemi geliştirme ekibine geri götürme ihtiyacını gösterir.
Yapıda bir değişiklik olduğunda, kararlılığı sağlamak için Smoke Testi yapıyoruz.
Örnek: -Oturum açma penceresine yeni kayıt butonu eklendi ve yeni kod ile derleme devreye alındı.
Yeni bir yapı üzerinde Smoke testi yapıyoruz.

2.SmokeTest kim yapacak? QA mühendisleri/QA lideri tarafından gerçekleştirilir.

3.SmokeTest nicin yapıyoruz?
sistemin ilk aşamalarda doğruluğunu sağladığı için yazılım geliştirmede önemli bir rol oynar.
Bununla, test çabasından tasarruf edebiliriz.Sonuç olarak Smoke testleri sistemi iyi bir duruma getirir.
Smoke testini tamamladıktan sonra sadece fonksiyonel teste başlarız.
yeni kod tarafından ortaya çıkmış olabilecek uygulama işlevselliğindeki kusurları bulabilir.
kusurların çoğu yazılım geliştirmenin ilk aşamalarında belirlenir.
büyük kusurların tespitini ve düzeltilmesini kolaylaştırıyoruz.
Örnek :Kullanıcı web sayfasından çıkış yapamıyor.

4.SmokeTest nasıl yapılır?
 genellikle manuel olarak yapılır, ancak aynı şeyi otomasyon yoluyla gerçekleştirme olasılığı vardır.
Organizasyondan organizasyona değişebilir. Yapı QA'ya sunulduktan sonra, yüksek öncelikli işlevsellik
test senaryoları alınacak ve sistemdeki kritik kusurları bulmak için test edilecektir.
Test geçerse, fonksiyonel teste devam ederiz. Test başarısız olursa, yapı reddedilir ve düzeltme için
geliştirme ekibine geri gönderilir. 
QA, yeni bir yapı sürümüyle duman testini yeniden başlatır. Duman testi yeni yapı üzerinde gerçekleştirilir
ve sistemin doğruluğunu korumak için eski yapılarla entegre edilir. 
Smoke testi yapmadan önce, QA ekibi doğru yapı sürümlerini kontrol etmelidir.
Otomasyon testlerinin yardımıyla geliştiriciler, dağıtıma hazır yeni bir derleme olduğunda derlemeyi hemen
kontrol edebilir.
Yeni yazılım yapısı dağıtıldığında manuel olarak testi tekrarlamak yerine, yapıya karşı kaydedilen duman testi
durumları yürütülür.
Ana işlevlerin hala düzgün çalışıp çalışmadığını doğrular.Test başarısız olursa, yapıyı düzeltebilir ve yapıyı
hemen yeniden dağıtabilirler.
Bu sayede zamandan tasarruf edebilir ve QA ortamına kaliteli bir yapı sağlayabiliriz.
Test mühendisi, otomatik bir araç kullanarak, yazılım oluşturma işleminde gerçekleştirilen tüm manuel
adımları kaydeder.

5. Smoke Testi için listelenen birkaç avantaj.
Test yapmak kolay
Kusurlar erken aşamalarda tespit edilecektir.
Sistemin kalitesini artırır
Riski azaltır
İlerlemeye erişmek daha kolaydır.
Test çabasından ve zamandan tasarruf sağlar
Kritik hataları tespit etmek ve hataları düzeltmek kolaydır.
hızlı çalışır
Entegrasyon risklerini en aza indirir

6.smoke testi ne sıklıkla yapılır??
Everyday
In early morning about 8:00 am

7. smoke testinizin uygulanması ne kadar sürer?
Not too much - about 15 mins.

8.SMOKE test takımınızda kaç tane test case var?
About 20 test case

*** Erken aşamalarda Smoke testi yapmazsak, daha sonraki aşamalarda maliyet etkin olabilecek kusurlarla
karşılaşılabilir.

smoke teste team lead karar verir

ornekler
    Login
    Checkin
    Checkout
    Add to card
    Make payment
    Sign out
 */
}
