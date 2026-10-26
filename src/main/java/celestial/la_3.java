/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;

public class la_3
implements Comparable<la_3> {
    private final int id_class;
    private final rfH_2 id_break;
    private int id_byte;
    private int id_protected;

    public int id_byte() {
        return this.id_protected;
    }

    public la_3(int n, rfH_2 rfH_22) {
        this.id_class = n;
        this.id_break = rfH_22;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            la_3 la_32 = (la_3)object;
            return this.id_class == la_32.id_class;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.id_class);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.id_class((la_3)object);
    }

    public int id_class(la_3 la_32) {
        return this.id_byte != la_32.id_byte ? Integer.compare(this.id_byte, la_32.id_byte) : Integer.compare(this.id_class, la_32.id_class);
    }

    public void id_class(int n) {
        if (n > 10) {
            n = 10;
        }
        this.id_byte = n;
    }

    public rfH_2 id_class() {
        return this.id_break;
    }

    public void id_break(int n) {
        this.id_protected = n;
    }

    public int id_break() {
        return this.id_byte;
    }
}

