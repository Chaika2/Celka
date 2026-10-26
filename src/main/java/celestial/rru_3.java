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
import celestial.rRP;
import celestial.rfH_2;
import celestial.rfK_2;
import celestial.rls_3;
import celestial.rrEm_1;
import celestial.ruP_2;
import celestial.xb_3;
import celestial.xc_3;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Predicate;

public class rru_3
extends rPm_1<iB_2> {
    private final il_3<rfK_2> id_class;
    private final Predicate<rRP> id_byte;

    public rru_3(rRP rRP2, il_3<rfK_2> il_32) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_32, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_byte = rRP2.id_break();
        this.id_class = il_32;
    }

    private boolean id_class(rrEm_1 rrEm_12, rfH_2 rfH_22, iB_2 iB_22) {
        xc_3 xc_32 = rrEm_12.id_byte(rfH_22);
        return xc_32.id_break().id_class(rls_3.id_short) && xc_32.id_byte(xb_3.id_final) != false && !iB_22.Sc();
    }

    @Override
    private boolean id_class(rrEm_1 rrEm_12, rfH_2 rfH_22) {
        return !rrEm_12.d().id_class(rfH_22, this.id_byte);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        rfK_2 rfK_22 = iB_22.SF().id_byte(this.id_class).get();
        return rrEm_12.E() == rfK_22.id_class() && rfK_22.id_break().id_class((eX_2)iB_22.Ps(), 16.0);
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        iZ_2<?> iZ_22 = iB_22.SF();
        rfK_2 rfK_22 = iZ_22.id_byte(this.id_class).get();
        rfH_2 rfH_22 = rfK_22.id_break();
        rrEm_1 rrEm_13 = rrEm_12.id_const().id_class(rfK_22.id_class());
        if (rrEm_13 != null && !this.id_class(rrEm_13, rfH_22)) {
            if (this.id_class(rrEm_13, rfH_22, iB_22)) {
                iZ_22.id_break(this.id_class);
                rrEm_12.d().id_break(rfH_22);
                ruP_2.id_byte(rrEm_12, rfH_22);
            }
        } else {
            iZ_22.id_break(this.id_class);
        }
    }
}

