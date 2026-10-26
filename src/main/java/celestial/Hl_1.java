/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hn_1;

public class Hl_1
extends Hn_1 {
    private final boolean S;

    public Hl_1(String string, Runnable runnable, Runnable runnable2, boolean bl) {
        super(string, runnable, runnable2);
        this.S = bl;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Hl_1 hl_1 = (Hl_1)object;
            return this.S == hl_1.S;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.id_class + "[" + this.S + "]";
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.S);
    }
}

