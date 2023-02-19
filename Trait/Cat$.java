/*
 * Decompiled with CFR 0.144.
 * 
 * Could not load the following classes:
 *  scala.runtime.ModuleSerializationProxy
 */
import java.io.Serializable;
import scala.runtime.ModuleSerializationProxy;

public final class Cat$
implements Animal,
Serializable {
    public static final Cat$ MODULE$ = new Cat$();

    private Cat$() {
    }

    private Object writeReplace() {
        return new ModuleSerializationProxy(Cat$.class);
    }
}
