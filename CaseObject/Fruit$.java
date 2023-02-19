/*
 * Decompiled with CFR 0.144.
 * 
 * Could not load the following classes:
 *  scala.Product
 *  scala.collection.Iterator
 *  scala.deriving.Mirror
 *  scala.deriving.Mirror$Singleton
 *  scala.runtime.BoxesRunTime
 *  scala.runtime.ModuleSerializationProxy
 */
import java.io.Serializable;
import scala.Product;
import scala.collection.Iterator;
import scala.deriving.Mirror;
import scala.runtime.BoxesRunTime;
import scala.runtime.ModuleSerializationProxy;

public final class Fruit$
implements Product,
Serializable,
Mirror.Singleton {
    public static final Fruit$ MODULE$ = new Fruit$();

    private Fruit$() {
    }

    private Object writeReplace() {
        return new ModuleSerializationProxy(Fruit$.class);
    }

    public int hashCode() {
        return 68158452;
    }

    public String toString() {
        return "Fruit";
    }

    public boolean canEqual(Object that) {
        return that instanceof Fruit$;
    }

    public int productArity() {
        return 0;
    }

    public String productPrefix() {
        return "Fruit";
    }

    public Object productElement(int n) {
        int n2 = n;
        throw new IndexOutOfBoundsException(BoxesRunTime.boxToInteger((int)n).toString());
    }

    public String productElementName(int n) {
        int n2 = n;
        throw new IndexOutOfBoundsException(BoxesRunTime.boxToInteger((int)n).toString());
    }
}
