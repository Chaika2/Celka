/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.aA_2;
import celestial.iA_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.iX_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rjh_3;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rrH_2
extends rPm_1<aA_2> {
    private final float id_class;
    private final int id_byte;
    private final int id_protected;

    public rrH_2(float f) {
        this(f, 10, 7);
    }

    public rrH_2(float f, int n, int n2) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT)));
        this.id_class = f;
        this.id_byte = n;
        this.id_protected = n2;
    }

    private void id_class(aA_2 aA_22) {
        Optional<rjU_2> optional = Optional.ofNullable(iX_2.id_break(aA_22, this.id_byte, this.id_protected));
        aA_22.SF().id_class(il_3.id_volatile, optional.map(rjU_22 -> new iH_2((rjU_2)rjU_22, this.id_class, 0)));
    }

    protected void id_class(rrEm_1 rrEm_12, aA_2 aA_22, long l) {
        rfH_2 rfH_22 = aA_22.Bs();
        if (rrEm_12.id_throw(rfH_22)) {
            this.id_class(aA_22);
        } else {
            rjh_3 rjh_32 = rjh_3.id_class(rfH_22);
            rjh_3 rjh_33 = iA_2.id_class(rrEm_12, rjh_32, 2);
            if (rjh_33 != rjh_32) {
                this.id_class(aA_22, rjh_33);
            } else {
                this.id_class(aA_22);
            }
        }
    }

    private void id_class(aA_2 aA_22, rjh_3 rjh_32) {
        Optional<rjU_2> optional = Optional.ofNullable(iX_2.id_break(aA_22, this.id_byte, this.id_protected, rjU_2.id_protected(rjh_32.id_int())));
        aA_22.SF().id_class(il_3.id_volatile, optional.map(rjU_22 -> new iH_2((rjU_2)rjU_22, this.id_class, 0)));
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (aA_2)iB_22, l);
    }
}

