/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBW;
import java.util.EnumSet;

public abstract class rBk_1 {
    private final EnumSet<rBW> id_class = EnumSet.noneOf(rBW.class);

    public void id_byte() {
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    public void id_class(EnumSet<rBW> enumSet) {
        this.id_class.clear();
        this.id_class.addAll(enumSet);
    }

    public abstract boolean id_class();

    public boolean id_break() {
        return this.id_class();
    }

    public void id_throws() {
    }

    public EnumSet<rBW> id_implements() {
        return this.id_class;
    }

    public void id_protected() {
    }

    public boolean J_() {
        return true;
    }
}

