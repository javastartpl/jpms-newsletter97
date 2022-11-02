package pl.javastart.baz;

//Moduł foo nie eksportuje pakietu pl.javastart.foo do modułu baz,
//więc nie możemy użyć klasy FooClazz, nawet jeżeli jest publiczna
//import pl.javastart.foo.FooClazz;

class BazClazz {
    public static void main(String[] args) {
//        FooClazz fooClazz = new FooClazz();
//        fooClazz.execute();
    }
}
