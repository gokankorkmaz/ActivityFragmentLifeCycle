# ActivityFragmentLifeCycle
  
Activity uygulamaların ön planında görülen her bir ekrana verdiğimiz kullanıcı ile etkileşim içinde bulunan sayfalardır.

Fragment ise Activity’ler içerinde bulunan ana activity’e bağlı kendine has yaşam döngüsüne sahip, ekranı daha verimli kullanmamızı sağlayan eklenip çıkarılabilen parçalardır.
Activity’ler genelde sabit bir tasarımın olduğu ekranlarda kullanılıyorken fragment’lar ise tasarımın etkileşimle değişebildiği birbirine benzer alanların bulunduğu tasarımlarda  kullanılmaktadır.
 
Fragment eklemenin 2 farklı yolu mevcuttur.
1-Statik (Java)
2-Dinamik (Xml İçerisinden)  
İki yönteminde birbirine göre avantaj ve dezavantajları bulunmaktadır.
Kullanım olarak kıyaslama yapacak olursak Java kodu kullanarak Fragment eklemenin avantajı istenildiğinde dinamik olarak Fragment eklenip çıkarılabilmesidir. Çalışma zamanı boyunca Fragment eklenip çıkarılması gerekiyorsa statik olarak eklenmesi gerekmektedir.
Xml ile Fragment eklendiğinde ise herhangi bir ekleme çıkarma işlemi yapılamıyor. Eklenen Fragment sabit olarak kalıyor.Çalışma zamanı boyunca çok fazla değişmeyecek bir tasarım tercih edilirse fragment’in dinamik olarak eklenmesi gerekmektedir.

 Aşağıda 2’si XML (Fragment A, Fragment B) bir tanesi de Java kodu kullanarak Activity’e eklenen 3 Fragment içeren uygulamaya ait loglar bulunmaktadır. Sırasıyla Fragment’ların oluşturulma aşamaları metotların çalışma sırasıyla görülebilmekte.

(https://github.com/gokankorkmaz/ActivityFragmentLifeCycle/tree/master/app/src/main/res/drawable/yasamdongusu.png)
 
Xml ile eklenen fragmentA ve fragmentB fragment’lara bağlı onCreateView metodları ile çizdirilirken, 
Java ile eklenen fragmentC’nin çizdirilmesi Mavi ile işaretli ana Activity’nin onCreate metodunun çalışmasından sonra tamamlanmakta.
Bu sebeple Xml üzerinden eklenen fragmentlar  java ile eklenen fragment’lara göre öncelikli olarak çalışır.
(https://github.com/gokankorkmaz/ActivityFragmentLifeCycle/tree/master/app/src/main/res/drawable/dikey.png)
(https://github.com/gokankorkmaz/ActivityFragmentLifeCycle/tree/master/app/src/main/res/drawable/yatay.png)