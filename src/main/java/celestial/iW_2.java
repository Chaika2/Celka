/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.iJ_2;
import celestial.ic_3;
import celestial.ix_3;
import celestial.iz_3;
import celestial.rVL;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;

public class iW_2 {
    private final Map<iJ_2, ic_3> id_class;

    public boolean id_byte(iJ_2 iJ_22) {
        return this.id_class.containsKey(iJ_22);
    }

    public iW_2(Map<iJ_2, ic_3> map) {
        this.id_class = ImmutableMap.copyOf(map);
    }

    public ic_3 id_class(Consumer<ic_3> consumer, iJ_2 iJ_22) {
        ic_3 ic_32 = this.id_class.get(iJ_22);
        if (ic_32 == null) {
            return null;
        }
        ic_3 ic_33 = new ic_3(iJ_22, consumer);
        ic_33.id_class(ic_32);
        return ic_33;
    }

    public double id_class(iJ_2 iJ_22, UUID uUID) {
        ix_3 ix_32 = this.id_protected(iJ_22).id_class(uUID);
        if (ix_32 == null) {
            throw new IllegalArgumentException("Can't find modifier " + uUID + " on attribute " + rVL.O.id_break(iJ_22));
        }
        return ix_32.id_protected();
    }

    public static iz_3 id_class() {
        return new iz_3();
    }

    public double id_class(iJ_2 iJ_22) {
        return this.id_protected(iJ_22).id_case();
    }

    public boolean id_break(iJ_2 iJ_22, UUID uUID) {
        ic_3 ic_32 = this.id_class.get(iJ_22);
        return ic_32 != null && ic_32.id_class(uUID) != null;
    }

    public double id_break(iJ_2 iJ_22) {
        return this.id_protected(iJ_22).id_break();
    }

    private ic_3 id_protected(iJ_2 iJ_22) {
        ic_3 ic_32 = this.id_class.get(iJ_22);
        if (ic_32 == null) {
            throw new IllegalArgumentException("Can't find attribute " + rVL.O.id_break(iJ_22));
        }
        return ic_32;
    }
}

