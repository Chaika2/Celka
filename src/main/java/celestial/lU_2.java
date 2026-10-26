/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.jZ_2;
import celestial.rrxm_3;

public final class lU_2 {
    private final jZ_2 id_class;
    private final int id_break;
    public final int id_byte;
    private rrxm_3 id_protected;

    public int id_byte() {
        return this.id_break;
    }

    public lU_2(jZ_2 jZ_22, int n, int n2, rrxm_3 rrxm_32) {
        this(jZ_22, n, n2);
        this.id_protected = rrxm_32;
    }

    public lU_2(jZ_2 jZ_22, int n, int n2) {
        this.id_class = jZ_22;
        this.id_break = n;
        this.id_byte = n2;
    }

    public rrxm_3 id_class() {
        return this.id_protected;
    }

    public jZ_2 id_break() {
        return this.id_class;
    }

    public int id_protected() {
        return this.id_byte;
    }
}

