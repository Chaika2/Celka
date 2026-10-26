/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rFy_1;
import celestial.rxL_2;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xb_3;

public class rHJ
extends ryO_2 {
    private rxL_2 id_class;

    public rHJ() {
        super(ryW_2.id_public);
    }

    public rHJ(rxL_2 rxL_22) {
        this();
        this.id_class(rxL_22);
    }

    public rxL_2 id_class() {
        if (this.id_class == null) {
            this.id_class = ((xb_3)this.id_abstract().id_break()).id_break();
        }
        return this.id_class;
    }

    public void id_class(rxL_2 rxL_22) {
        this.id_class = rxL_22;
    }

    @Override
    public rFy_1 Y_() {
        return new rFy_1(this.id_native, 11, this.Z_());
    }
}

