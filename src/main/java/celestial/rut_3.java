/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmb_3;

public class rut_3<T> {
    private final int id_class;
    private final rmb_3<T> id_break;

    public rut_3(int n, rmb_3<T> rmb_32) {
        this.id_class = n;
        this.id_break = rmb_32;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rut_3 rut_32 = (rut_3)object;
            return this.id_class == rut_32.id_class;
        }
        return false;
    }

    public String toString() {
        return "<entity data: " + this.id_class + ">";
    }

    public int hashCode() {
        return this.id_class;
    }

    public int id_class() {
        return this.id_class;
    }

    public rmb_3<T> id_break() {
        return this.id_break;
    }
}

