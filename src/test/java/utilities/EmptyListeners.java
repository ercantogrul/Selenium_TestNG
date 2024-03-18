package utilities;

import org.testng.ITestListener;

public class EmptyListeners implements ITestListener {
    /*
    TestNG 7.0 ve sonraki versiyonlarında ITestListener interface'nin methodlarını bu classda ayrıca implement etmeye gerek yoktur.
    Ancak ITestListener interface'nin methodlarını modifiye etmek istiyorsanız, yani methodların içerisinde değişiklik yapmak veya
    ek yapmak istiyorsanız, o zaman methodları buraya implement ederek getirmek gerekir. Aynı Listener classında olduğu gibi.

    Bu class bu şekilde boş kaldığında listenerlar yine çalışır ama biz herhangi bir bildirim alamayız. Bildirim almak istiyorsak
    methodların içerisinde gerekli configurations yapmamız lazım.
     */
}
