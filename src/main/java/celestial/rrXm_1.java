/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXQ;
import celestial.rrXX;
import celestial.rrXc_1;
import celestial.rrXt_1;

public class rrXm_1
implements rrXX {
    @Override
    public rrXt_1 id_class(String string) {
        rrXQ rrXQ2 = rrXQ.id_class(string);
        if (rrXQ2 != null) {
            return rrXQ2;
        }
        rrXc_1 rrXc_12 = rrXc_1.id_class(string);
        return rrXc_12 != null ? rrXc_12 : null;
    }
}

