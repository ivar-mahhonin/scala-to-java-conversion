/*
 * Decompiled with CFR 0.144.
 * 
 * Could not load the following classes:
 *  scala.Product
 *  scala.collection.Iterator
 *  scala.deriving.Mirror
 *  scala.deriving.Mirror$Singleton
 */
import scala.Product;
import scala.collection.Iterator;
import scala.deriving.Mirror;

public final class Fruit {
    public static boolean canEqual(Object object) {
        return Fruit$.MODULE$.canEqual(object);
    }

    public static Mirror.Singleton fromProduct(Product product) {
        return Fruit$.MODULE$.fromProduct(product);
    }

    public static int hashCode() {
        return Fruit$.MODULE$.hashCode();
    }

    public static int productArity() {
        return Fruit$.MODULE$.productArity();
    }

    public static Object productElement(int n) {
        return Fruit$.MODULE$.productElement(n);
    }

    public static String productElementName(int n) {
        return Fruit$.MODULE$.productElementName(n);
    }

    public static Iterator<String> productElementNames() {
        return Fruit$.MODULE$.productElementNames();
    }

    public static Iterator<Object> productIterator() {
        return Fruit$.MODULE$.productIterator();
    }

    public static String productPrefix() {
        return Fruit$.MODULE$.productPrefix();
    }

    public static String toString() {
        return Fruit$.MODULE$.toString();
    }
}
