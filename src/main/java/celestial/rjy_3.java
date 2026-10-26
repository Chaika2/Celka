/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
package celestial;

import celestial.rfU_2;
import celestial.rjC_2;
import celestial.rjW_2;
import celestial.rjp_3;
import celestial.rpB_2;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class rjy_3
extends rjC_2 {
    protected rjy_3(rjp_3 rjp_32) {
        super(rjp_32);
    }

    @Override
    protected DoubleList id_class(rpB_2 rpB_22) {
        return new rjW_2(this.id_class.id_byte(rpB_22));
    }

    @Override
    protected int id_class(rpB_2 rpB_22, double d) {
        int n = this.id_class.id_byte(rpB_22);
        return rfU_2.id_class(rfU_2.id_byte(d * (double)n), -1, n);
    }
}

