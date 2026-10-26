/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrdn_1;
import celestial.rrdr_1;
import celestial.rrkV;
import celestial.rrkg_1;
import celestial.rrko_1;

public class rrdH
implements rrdr_1 {
    private String id_class;

    public rrdH(String string) {
        this.id_class = string;
    }

    @Override
    public rrko_1 id_class(rrdn_1 rrdn_12) {
        return rrdn_12 == rrdn_1.SPECULAR ? new rrkV() : new rrkg_1();
    }

    @Override
    public String id_class() {
        return "LAB_PBR";
    }

    @Override
    public boolean id_break(rrdn_1 rrdn_12) {
        return rrdn_12 != rrdn_1.SPECULAR;
    }

    @Override
    public String id_break() {
        return this.id_class == null ? null : this.id_class.replace('.', '_');
    }
}

