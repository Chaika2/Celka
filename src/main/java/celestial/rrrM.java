/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrrQ;

public class rrrM {
    public final Class<? extends rrrQ> id_class;
    public final int id_break;
    public int id_byte;
    public final int id_protected;

    public rrrM(Class<? extends rrrQ> clazz, int n, int n2) {
        this.id_class = clazz;
        this.id_break = n;
        this.id_protected = n2;
    }

    public boolean id_class(int n) {
        return this.id_protected == 0 || this.id_byte < this.id_protected;
    }

    public boolean id_class() {
        return this.id_protected == 0 || this.id_byte < this.id_protected;
    }
}

