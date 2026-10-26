/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.nW_2;

public class Ce_1
extends nW_2 {
    private final Ch_1 id_class;

    public Ce_1(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6, Ch_1 ch_1) {
        super(gm_32, d, d2, d3, d4, d5, d6);
        this.id_class = ch_1;
        this.id_protected(1.5f);
        this.id_break(ch_1);
    }

    @Override
    public CJ id_class() {
        return CJ.id_byte;
    }

    @Override
    public void id_case() {
        super.id_case();
        if (!this.id_package) {
            this.id_break(this.id_class);
        }
    }
}

