/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.iB_2;
import celestial.iC_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rfH_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rrc_3
extends rPm_1<iB_2> {
    private final int id_class;
    private final int id_byte;
    private int id_protected;

    public rrc_3(int n, int n2) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_instanceof, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_throw, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_byte = n * 20;
        this.id_protected = 0;
        this.id_class = n2;
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        boolean bl;
        iZ_2<?> iZ_22 = iB_22.SF();
        Optional<Long> optional = iZ_22.id_byte(il_3.id_throw);
        boolean bl2 = bl = optional.get() + 300L <= l;
        if (this.id_protected <= this.id_byte && !bl) {
            rfH_2 rfH_22 = iZ_22.id_byte(il_3.id_instanceof).get().id_break();
            if (rfH_22.id_class(iB_22.Bs(), (double)this.id_class)) {
                ++this.id_protected;
            }
        } else {
            iZ_22.id_break(il_3.id_throw);
            iZ_22.id_break(il_3.id_instanceof);
            iZ_22.id_class(rrEm_12.P(), rrEm_12.r());
            this.id_protected = 0;
        }
    }
}

