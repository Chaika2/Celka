/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXA;
import celestial.rrXd_1;
import celestial.rrXf_1;
import celestial.rrXh_1;
import celestial.rrXo_1;
import celestial.rrbb_3;

public class rrXz_1 {
    private String id_class;
    private String id_break;
    private rrXd_1 id_byte;
    private rrXf_1 id_protected;

    public rrXz_1(String string, String string2) {
        this.id_class = string;
        this.id_break = string2;
    }

    public boolean id_class(rrXh_1 rrXh_12) {
        this.id_byte = rrXh_12.id_break(this.id_class);
        if (this.id_byte == null) {
            rrbb_3.id_protected("Model variable not found: " + this.id_class);
            return false;
        }
        try {
            rrXA rrXA2 = new rrXA(rrXh_12);
            this.id_protected = rrXA2.id_class(this.id_break);
            return true;
        }
        catch (rrXo_1 rrXo_12) {
            rrbb_3.id_protected("Error parsing expression: " + this.id_break);
            rrbb_3.id_protected(rrXo_12.getClass().getName() + ": " + rrXo_12.getMessage());
            return false;
        }
    }

    public void id_class() {
        float f = this.id_protected.id_class();
        this.id_byte.id_class(f);
    }
}

