/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.eX_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rfI_2;
import celestial.rfK_2;
import celestial.rrEm_1;
import celestial.rsq_3;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rPW
extends rPm_1<rsq_3> {
    private long id_class;

    public rPW() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_byte, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_final, (Object)((Object)iC_2.REGISTERED)));
    }

    @Override
    protected /* synthetic */ boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        return this.id_break(rrEm_12, (rsq_3)iB_22);
    }

    @Override
    protected /* synthetic */ boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        return this.id_break(rrEm_12, (rsq_3)iB_22, l);
    }

    protected void id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
    }

    protected void id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        iZ_2<rsq_3> iZ_22 = rsq_32.SF();
        iZ_22.id_class(il_3.id_float, Long.valueOf(l));
        iZ_22.id_byte(il_3.id_byte).ifPresent(rfK_22 -> iZ_22.id_class(il_3.id_final, new rfI_2(rfK_22.id_break())));
        rsq_32.sc();
        this.id_class(rrEm_12, rsq_32);
        if (rsq_32.sN()) {
            rsq_32.sQ();
        }
    }

    protected boolean id_break(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        Optional<rfK_2> optional = rsq_32.SF().id_byte(il_3.id_byte);
        if (!optional.isPresent()) {
            return false;
        }
        rfK_2 rfK_22 = optional.get();
        return rfK_22.id_class() == rrEm_12.E() && rfK_22.id_break().id_class((eX_2)rsq_32.Ps(), 1.73);
    }

    protected boolean id_break(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        if (rrEm_12.r() - this.id_class < 300L) {
            return false;
        }
        if (rrEm_12.id_int.nextInt(2) != 0) {
            return false;
        }
        this.id_class = rrEm_12.r();
        rfK_2 rfK_22 = rsq_32.SF().id_byte(il_3.id_byte).get();
        return rfK_22.id_class() == rrEm_12.E() && rfK_22.id_break().id_class((eX_2)rsq_32.Ps(), 1.73);
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rsq_3)iB_22, l);
    }
}

