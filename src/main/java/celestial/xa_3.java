/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRg_1;
import celestial.rXA;
import celestial.rXF;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.xU_2;
import celestial.xc_3;

public class xa_3
extends rXA
implements rXF {
    private final xc_3 id_class;
    private final rRg_1 id_break;
    private final rfH_2 id_byte;
    private boolean id_protected;

    public xa_3(xc_3 xc_32, rRg_1 rRg_12, rfH_2 rfH_22, rdn_3 rdn_32) {
        super(rdn_32);
        this.id_class = xc_32;
        this.id_break = rRg_12;
        this.id_byte = rfH_22;
    }

    @Override
    public boolean id_class(int n, rdn_3 rdn_32, rpr_3 rpr_32) {
        return false;
    }

    @Override
    public int[] id_class(rpr_3 rpr_32) {
        int[] nArray;
        if (rpr_32 == rpr_3.DOWN) {
            int[] nArray2 = new int[1];
            nArray = nArray2;
            nArray2[0] = 0;
        } else {
            nArray = new int[]{};
        }
        return nArray;
    }

    @Override
    public boolean id_break(int n, rdn_3 rdn_32, rpr_3 rpr_32) {
        return !this.id_protected && rpr_32 == rpr_3.DOWN && rdn_32.id_break() == rdy_3.Xg;
    }

    @Override
    public void id_break() {
        xU_2.id_byte(this.id_class, this.id_break, this.id_byte);
        this.id_protected = true;
    }

    @Override
    public int ab_() {
        return 1;
    }
}

