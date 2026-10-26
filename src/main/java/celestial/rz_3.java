/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.EA;
import celestial.rn_3;
import celestial.rrTq_1;

public interface rz_3 {
    public static final double id_class = -1.0;

    public boolean id_byte();

    public rn_3 id_class(boolean var1, boolean var2);

    public String id_class();

    default public void id_class(EA eA) {
    }

    default public String id_break() {
        if (!this.id_byte()) {
            return "INACTIVE";
        }
        return this.id_class();
    }

    default public rrTq_1 id_throws() {
        return null;
    }

    public boolean id_catch();

    default public double id_case() {
        return -1.0;
    }

    public void id_protected();
}

