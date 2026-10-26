/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.raz_3;

public class raQ_2 {
    public final Class<? extends raz_3> id_class;
    public final int id_break;
    public int id_byte;
    public final int id_protected;
    public final boolean id_throws;

    public raQ_2(Class<? extends raz_3> clazz, int n, int n2, boolean bl) {
        this.id_class = clazz;
        this.id_break = n;
        this.id_protected = n2;
        this.id_throws = bl;
    }

    public raQ_2(Class<? extends raz_3> clazz, int n, int n2) {
        this(clazz, n, n2, false);
    }

    public boolean id_class() {
        return this.id_protected == 0 || this.id_byte < this.id_protected;
    }

    public boolean id_class(int n) {
        return this.id_protected == 0 || this.id_byte < this.id_protected;
    }
}

