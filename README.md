## Java Streams

<p><h4>Java 8, verimli ve temiz uygulamalar oluşturmak için birçok yeni model getirdi.  Java Stream API
Java 8'e diğer birçok işlevsel programlama özelliğiyle eklendi. Listeler ve Dizilerde çok daha kolay ve temiz kod yazılarak işlem yapılabilmektedir.</h4></p>

<h3><b><i>stream()</i> nedir? </b></h3>
<p><h4>Ardışık düzeni işlemek için tek bir iş parçacığı kullanan paralel olmayan stream.
Açıkça paralel olarak belirtilmeyen herhangi bir stream işlemi, sıralı bir stream olarak değerlendirilir.
Sıralı stream nesneleri, aynı işleme sistemi üzerine tek bir stream pipeline bağlanır,
bu nedenle temel sistem paralel yürütmeyi desteklese bile, çok çekirdekli sistemin avantajından asla yararlanamaz.
Sıralı stream işlemi tek tek gerçekleştirir.</h4></p>

<h3>Stream API Örnekleri </h3>
<p><h4><b>Bu kısımda çeşitli Stream API metodları ile küçük uygulamalar yer almaktadır.</b></h4> </p>

`forEach() :`
<br><b>Stream içerisindeki yığınsal veriyi tek tek tüketmek için yapılandırılmıştır. Consumer arayüzü türünden bir parametre bekler.</b>

`filter() :`
<br><b>Filtreleme işlemi yapmamızı sağlar, verilen kriterlere göre arama yapar. Bu filtreleme birden fazla şekilde de yapabilir. startsWith baş harfine göre arama yaparken contains kelime içerisinde ki harfe göre arama yapmaktadır.</b>

`sorted() :`
<br><b>Sıralama yapmamızı sağlar. Yazı ise harf sırası ( sözlük mantığı şeklinde ) sayı ise küçükten büyüğe.</b>

`reduce() :`
<br><b>Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.</b>

`map() :`
<br><b>Stream içerisinde ki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak için Map kullanılmaktadır.</b>

`map() & reduce() :`
<br><b>Map ve reduce işlemleri birlikte kullanımı çok fazla tercih edilen iki operasyondur. Bu operasyonları önemli kılan ise, bu iki operasyonun dağıtık sistemler için çok uygun olmasıdır.</b>

`distinct() :`
<br><b>Bir Stream içerisinden tekrarlı veriler çıkarılmak isteniyorsa distinct metodundan faydalanılabilir.</b>

`count() :`
<br><b>Stream içerisindeki eleman sayısını hesaplar.</b>



