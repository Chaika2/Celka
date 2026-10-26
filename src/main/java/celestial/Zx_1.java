/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.Ml_1;
import celestial.ZJ;
import celestial.Zd_1;
import celestial.Zu_1;
import celestial.cN_2;
import celestial.rRm_1;
import celestial.rgP_2;
import celestial.rnW_2;
import java.util.List;

public class Zx_1
extends Zu_1 {
    private final LF id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public Zx_1(ZJ zJ, rgP_2 rgP_22, List list, String string, rRm_1 rRm_12) {
        super(zJ, list, rgP_22);
        this.id_class = new Zd_1(this, 10, 5, 44, 20, cN_2.id_class(rRm_12.id_class()), lF -> {
            boolean bl = !rRm_12.id_class();
            rRm_12.id_class(bl, (rnW_2)null);
            lF.id_break(cN_2.id_class(rRm_12.id_class()));
        }, zJ, rgP_22, rRm_12, string);
        this.id_break.add(this.id_class);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        this.id_class(ml_1, n2, n3);
        this.id_class.id_volatile = n3 + n4 - 45;
        this.id_class.id_final = n2;
        this.id_class.id_class(ml_1, n6, n7, f);
    }
}

