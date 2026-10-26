/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.rqO_2;
import celestial.rrMv_1;
import celestial.rrWc_1;

public class rrMc_1
implements rrMv_1<String> {
    public static String id_class(an_3 an_32) {
        return an_32.BC().id_private();
    }

    public String id_class(rqO_2 rqO_22) {
        aI_2 aI_22 = rrWc_1.id_class(rqO_22);
        return aI_22 == null ? null : aI_22.id_private();
    }

    @Override
    public /* synthetic */ Object id_break(rqO_2 rqO_22) {
        return this.id_class(rqO_22);
    }
}

