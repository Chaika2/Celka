/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.iJ_2;
import celestial.iW_2;
import celestial.ic_3;
import celestial.rVL;
import com.google.common.collect.Maps;
import java.util.Map;

public class iz_3 {
    private final Map<iJ_2, ic_3> id_class = Maps.newHashMap();
    private boolean id_break;

    public iz_3 id_class(iJ_2 iJ_22, double d) {
        ic_3 ic_32 = this.id_break(iJ_22);
        ic_32.id_class(d);
        return this;
    }

    public iW_2 id_class() {
        this.id_break = true;
        return new iW_2(this.id_class);
    }

    public iz_3 id_class(iJ_2 iJ_22) {
        this.id_break(iJ_22);
        return this;
    }

    private ic_3 id_break(iJ_2 iJ_22) {
        ic_3 ic_33 = new ic_3(iJ_22, ic_32 -> {
            if (this.id_break) {
                throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + rVL.O.id_break(iJ_22));
            }
        });
        this.id_class.put(iJ_22, ic_33);
        return ic_33;
    }
}

