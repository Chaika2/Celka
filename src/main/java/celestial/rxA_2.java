/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.iB_2;
import celestial.rOb_1;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rpm_3;
import celestial.rxL_2;
import celestial.ryZ_2;
import com.google.common.collect.Maps;
import java.util.Map;

public class rxA_2
extends rdb_3 {
    private static final Map<rxL_2, rxA_2> id_class = Maps.newEnumMap(rxL_2.class);
    private final rxL_2 id_break;

    public rxL_2 id_byte() {
        return this.id_break;
    }

    public rxA_2(rxL_2 rxL_22, rdO_2 rdO_22) {
        super(rdO_22);
        this.id_break = rxL_22;
        id_class.put(rxL_22, this);
    }

    public static rxA_2 id_class(rxL_2 rxL_22) {
        return id_class.get(rxL_22);
    }

    @Override
    public ryZ_2 id_class(rdn_3 rdn_32, rhd_3 rhd_32, iB_2 iB_22, rpm_3 rpm_32) {
        rOb_1 rOb_12;
        if (iB_22 instanceof rOb_1 && (rOb_12 = (rOb_1)iB_22).BM() && !rOb_12.sJ() && rOb_12.n() != this.id_break) {
            if (!((rYB)rhd_32.id_throws[7]).id_continue) {
                rOb_12.id_break(this.id_break);
                rdn_32.id_catch(1);
            }
            return ryZ_2.id_class(((rYB)rhd_32.id_throws[7]).id_continue);
        }
        return ryZ_2.PASS;
    }
}

