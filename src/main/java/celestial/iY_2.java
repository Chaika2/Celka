/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rYB;
import celestial.rrEm_1;
import celestial.rrr_3;
import celestial.rye_3;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class iY_2
extends rrr_3<iB_2> {
    @Override
    protected void id_class(rrEm_1 rrEm_12, iB_2 iB_23) {
        iZ_2<?> iZ_22 = iB_23.SF();
        rye_3 rye_32 = iB_23.SJ();
        if (rye_32 != null) {
            iZ_22.id_class(il_3.id_public, iB_23.SJ());
            an_3 an_32 = rye_32.id_extends();
            if (an_32 instanceof iB_2) {
                iZ_22.id_class(il_3.id_goto, (iB_2)an_32);
            }
        } else {
            iZ_22.id_break(il_3.id_public);
        }
        iZ_22.id_byte(il_3.id_goto).ifPresent(iB_22 -> {
            if (!iB_22.BM() || (rYB)iB_22.id_throws[7] != rrEm_12) {
                iZ_22.id_break(il_3.id_goto);
            }
        });
    }

    @Override
    public Set<il_3<?>> id_class() {
        return ImmutableSet.of(il_3.id_public, il_3.id_goto);
    }
}

