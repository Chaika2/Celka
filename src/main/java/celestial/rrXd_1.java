/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.rrXf_1;
import celestial.rrXk_1;

public class rrXd_1
implements rrXf_1 {
    private String id_class;
    private Iq_1 id_break;
    private rrXk_1 id_byte;

    public rrXd_1(String string, Iq_1 iq_1, rrXk_1 rrXk_12) {
        this.id_class = string;
        this.id_break = iq_1;
        this.id_byte = rrXk_12;
    }

    public String toString() {
        return this.id_class;
    }

    @Override
    public float id_class() {
        return this.id_break();
    }

    public void id_class(float f) {
        this.id_byte.id_class(this.id_break, f);
    }

    public float id_break() {
        return this.id_byte.id_class(this.id_break);
    }
}

