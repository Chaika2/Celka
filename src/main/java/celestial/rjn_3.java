/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
package celestial;

import celestial.rjC_2;
import celestial.rjL_2;
import celestial.rjW_2;
import celestial.rjp_3;
import celestial.rpB_2;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class rjn_3
extends rjC_2 {
    private final rjC_2 id_break;
    private final rpB_2 id_byte;
    private static final DoubleList id_protected = new rjW_2(1);

    public rjn_3(rjC_2 rjC_22, rpB_2 rpB_22, int n) {
        super(rjn_3.id_class(rjC_22.id_class, rpB_22, n));
        this.id_break = rjC_22;
        this.id_byte = rpB_22;
    }

    private static rjp_3 id_class(rjp_3 rjp_32, rpB_2 rpB_22, int n) {
        return new rjL_2(rjp_32, rpB_22.id_class(n, 0, 0), rpB_22.id_class(0, n, 0), rpB_22.id_class(0, 0, n), rpB_22.id_class(n + 1, rjp_32.id_class, rjp_32.id_class), rpB_22.id_class(rjp_32.id_break, n + 1, rjp_32.id_break), rpB_22.id_class(rjp_32.id_byte, rjp_32.id_byte, n + 1));
    }

    @Override
    protected DoubleList id_class(rpB_2 rpB_22) {
        return rpB_22 == this.id_byte ? id_protected : this.id_break.id_class(rpB_22);
    }
}

