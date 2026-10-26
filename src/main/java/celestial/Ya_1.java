/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.OT;
import celestial.Oj_1;
import celestial.YU;
import celestial.rhN_2;

public final class Ya_1
extends YU {
    public Ya_1(String string2) {
    }

    @Override
    protected boolean id_class(rhN_2 rhN_22, OT oT) {
        Oj_1 oj_1 = rhN_22.r().id_break(oT);
        if (!oj_1.id_break()) {
            return false;
        }
        for (String string : oj_1.id_case()) {
            rhN_22.r().id_break(oT, string);
        }
        return true;
    }

    @Override
    protected boolean id_class(rhN_2 rhN_22, OT oT, String string) {
        return rhN_22.r().id_break(oT, string);
    }
}

