/*
 * Decompiled with CFR 0.144.
 * 
 * Could not load the following classes:
 *  scala.Predef$
 */
import scala.Predef$;

public interface Animal {
    public static void walk$(Animal $this) {
        $this.walk();
    }

    default public void walk() {
        Predef$.MODULE$.println((Object)"making steps");
    }
}
