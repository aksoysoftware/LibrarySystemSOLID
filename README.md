
# LibrarySystemSOLID

SOLID Prensiplerine Uygun Kütüphane Sistemi
Bu proje, SOLID prensiplerini takip ederek Java dilinde yazılmış basit bir kütüphane sistemini içermektedir. SOLID, yazılımın sürdürülebilir ve genişletilebilir olması için gerekli prensiplerdir.

1. Tek Sorumluluk Prensibi (SRP)
Bu projede, Tek Sorumluluk Prensibi, kodu tek bir sorumluluğa sahip sınıflara düzenleyerek yerine getirilmiştir. Örneğin:
Book,EBook,User sınıfları
ek olarak;
MSMaterial sınıfı: Malzeme ile ilgili veritabanı işlemlerinden sorumlu.
MSSQLUser sınıfı: Kullanıcı ile ilgili veritabanı işlemlerinden sorumlu.


2. Açık/Kapalı Prensibi (OCP)
Açık/Kapalı Prensibi, kodu değiştirmeden genişletmeye olanak tanıyan sınıfların ve modüllerin tasarlanmasıyla sağlanmıştır. Örneğin:

IDBMaterial arayüzü: Malzeme veritabanı işlemleri için sözleşmeyi tanımlar.
MSMaterial sınıfı: IDBMaterial arayüzünü uygular, mevcut kodu değiştirmeden kolayca genişlemeye olanak tanır.

3. Liskov Yerine Koyma Prensibi (LSP)
Liskov Yerine Koyma Prensibi, türetilmiş sınıfların (Book, Ebook, Student) temel sınıflarla (User, IDBMaterial, vb.) değiştirilebilir olmasını sağlayarak yerine getirilmiştir.

4. Arayüz Ayırma Prensibi (ISP)
Arayüz Ayırma Prensibi, arayüzlerin belirli istemci ihtiyaçlarına odaklanarak tasarlanmasıyla sağlanmıştır. Örneğin:

IDBMaterial arayüzü: Malzeme veritabanı işlemleri ile ilgili metodları içerir.
IDBUser arayüzü: Kullanıcı ile ilgili veritabanı işlemleri ile ilgili metodları içerir.


5. Bağımlılıkların Tersine Çevrilmesi Prensibi (DIP)
Bağımlılıkların Tersine Çevrilmesi, somut uygulamalar yerine soyutlamalara dayanarak gerçekleştirilmiştir. Örneğin:

LibraryMain sınıfı: Ana uygulama sınıfı, doğrudan somut uygulamalar yerine arayüzleri (IDBMaterial, IDBUser) kullanır.



