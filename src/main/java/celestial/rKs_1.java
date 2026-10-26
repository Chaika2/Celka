/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rKs_1<T extends Throwable> {
    private T id_class;

    public void id_class(T t) {
        if (this.id_class == null) {
            this.id_class = t;
        } else {
            ((Throwable)this.id_class).addSuppressed((Throwable)t);
        }
    }

    public void id_class() throws T {
        if (this.id_class != null) {
            throw this.id_class;
        }
    }
}

