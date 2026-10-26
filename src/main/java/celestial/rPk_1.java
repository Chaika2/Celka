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
import celestial.iq_3;
import celestial.rPm_1;
import celestial.rfH_2;
import celestial.rfK_2;
import celestial.rls_3;
import celestial.rrEm_1;
import celestial.rrg_3;
import celestial.xb_3;
import celestial.xc_3;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rPk_1
extends rPm_1<iB_2> {
    private long id_class;

    public rPk_1() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_break, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_long, (Object)((Object)iC_2.REGISTERED)));
    }

    @Override
    protected boolean id_class(long l) {
        return false;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        Optional<rfK_2> optional = iB_22.SF().id_byte(il_3.id_break);
        if (!optional.isPresent()) {
            return false;
        }
        rfH_2 rfH_22 = optional.get().id_break();
        return iB_22.SF().id_byte(iq_3.id_throws) && iB_22.re() > (double)rfH_22.c_() + 0.4 && rfH_22.id_class((eX_2)iB_22.Ps(), 1.14);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        long l;
        if (iB_22.Pm()) {
            return false;
        }
        iZ_2<?> iZ_22 = iB_22.SF();
        rfK_2 rfK_22 = iZ_22.id_byte(il_3.id_break).get();
        if (rrEm_12.E() != rfK_22.id_class()) {
            return false;
        }
        Optional<Long> optional = iZ_22.id_byte(il_3.id_long);
        if (optional.isPresent() && (l = rrEm_12.r() - optional.get()) > 0L && l < 100L) {
            return false;
        }
        xc_3 xc_32 = rrEm_12.id_byte(rfK_22.id_break());
        return rfK_22.id_break().id_class((eX_2)iB_22.Ps(), 2.0) && xc_32.id_break().id_class(rls_3.id_short) && xc_32.id_byte(xb_3.id_final) == false;
    }

    @Override
    protected void id_break(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        if (iB_22.Sc()) {
            iB_22.SQ();
            this.id_class = l + 40L;
        }
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        if (l > this.id_class) {
            rrg_3.id_class(rrEm_12, iB_22, null, null);
            iB_22.id_case(iB_22.SF().id_byte(il_3.id_break).get().id_break());
        }
    }
}

