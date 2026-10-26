/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrdD;
import celestial.rrdZ;

public class rrdi_1
extends rrdD {
    @Override
    public String id_byte() {
        return rrdZ.id_break("screen." + this.id_class() + ".comment", (String)null);
    }

    public rrdi_1(String string) {
        super(string, null, null, new String[0], null, null);
    }

    @Override
    public String id_volatile() {
        return rrdZ.id_break("screen." + this.id_class(), this.id_class());
    }
}

