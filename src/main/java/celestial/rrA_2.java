/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.iA_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.rLC;
import celestial.rPm_1;
import celestial.rRP;
import celestial.rfH_2;
import celestial.rfK_2;
import celestial.rrEm_1;
import celestial.rsT_2;
import celestial.rsq_3;
import celestial.ruP_2;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rrA_2
extends rPm_1<rsq_3> {
    private final float id_class;

    public rrA_2(float f) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_protected, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_byte, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_catch, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_class = f;
    }

    private void id_class(rsq_3 rsq_32) {
        rsq_32.SF().id_break(il_3.id_volatile);
        rsq_32.SF().id_break(il_3.id_final);
        rsq_32.SF().id_break(il_3.id_protected);
    }

    private boolean id_class(rsq_3 rsq_32, rfH_2 rfH_22, rRP rRP2) {
        rLC rLC2 = rsq_32.id_public().id_class(rfH_22, rRP2.id_byte());
        return rLC2 != null && rLC2.id_finally();
    }

    protected void id_class(rrEm_1 rrEm_12, rsq_3 rsq_34, long l) {
        rfH_2 rfH_22 = rsq_34.SF().id_byte(il_3.id_protected).get().id_break();
        Optional<rRP> optional = rrEm_12.d().id_byte(rfH_22);
        if (optional.isPresent()) {
            iA_2.id_class(rsq_34, rsq_32 -> this.id_class((rRP)optional.get(), (rsq_3)rsq_32, rfH_22)).findFirst().ifPresent(rsq_33 -> this.id_class(rrEm_12, rsq_34, (rsq_3)rsq_33, rfH_22, rsq_33.SF().id_byte(il_3.id_byte).isPresent()));
        }
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        if (rsq_32.n_()) {
            return false;
        }
        return rsq_32.su().id_break() == rsT_2.id_class;
    }

    private boolean id_class(rRP rRP2, rsq_3 rsq_32, rfH_2 rfH_22) {
        boolean bl = rsq_32.SF().id_byte(il_3.id_protected).isPresent();
        if (bl) {
            return false;
        }
        Optional<rfK_2> optional = rsq_32.SF().id_byte(il_3.id_byte);
        rsT_2 rsT_22 = rsq_32.su().id_break();
        if (rsq_32.su().id_break() != rsT_2.id_class && rsT_22.id_class().id_break().test(rRP2)) {
            return !optional.isPresent() ? this.id_class(rsq_32, rfH_22, rRP2) : optional.get().id_break().equals(rfH_22);
        }
        return false;
    }

    private void id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, rsq_3 rsq_33, rfH_2 rfH_22, boolean bl) {
        this.id_class(rsq_32);
        if (!bl) {
            iA_2.id_class((iB_2)rsq_33, rfH_22, this.id_class, 1);
            rsq_33.SF().id_class(il_3.id_protected, rfK_2.id_class(rrEm_12.E(), rfH_22));
            ruP_2.id_byte(rrEm_12, rfH_22);
        }
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rsq_3)iB_22, l);
    }
}

