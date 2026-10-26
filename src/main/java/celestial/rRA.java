/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRC;
import celestial.rRZ;

public final class rRA<T extends rRC<T>> {
    public final String id_class;
    private final rRZ id_break;

    public rRZ id_byte() {
        return this.id_break;
    }

    public rRA(String string, rRZ rRZ2) {
        this.id_class = string;
        this.id_break = rRZ2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof rRA && ((rRA)object).id_class.equals(this.id_class);
    }

    public String toString() {
        return this.id_class;
    }

    public int hashCode() {
        return this.id_class.hashCode();
    }

    public String id_class() {
        return this.id_class;
    }

    public String id_break() {
        return "gamerule." + this.id_class;
    }
}

