/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.iX_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rfH_2;
import celestial.rfK_2;
import celestial.rjU_2;
import celestial.rrEm_1;
import celestial.rsq_3;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rPz_1
extends rPm_1<rsq_3> {
    private final il_3<rfK_2> id_class;
    private final float id_byte;
    private final int id_protected;
    private final int id_throws;
    private final int id_case;

    public rPz_1(il_3<rfK_2> il_32, float f, int n, int n2, int n3) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_interface, (Object)((Object)iC_2.REGISTERED), il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT), il_32, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_class = il_32;
        this.id_byte = f;
        this.id_protected = n;
        this.id_throws = n2;
        this.id_case = n3;
    }

    private boolean id_class(rsq_3 rsq_32, rfK_2 rfK_22) {
        return rfK_22.id_break().id_implements(rsq_32.Bs()) > this.id_throws;
    }

    @Override
    private boolean id_class(rrEm_1 rrEm_12, rfK_2 rfK_22) {
        return rfK_22.id_class() != rrEm_12.E();
    }

    private boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, rfK_2 rfK_22) {
        return rfK_22.id_class() == rrEm_12.E() && rfK_22.id_break().id_implements(rsq_32.Bs()) <= this.id_protected;
    }

    private void id_class(rsq_3 rsq_32, long l) {
        iZ_2<rsq_3> iZ_22 = rsq_32.SF();
        rsq_32.id_class(this.id_class);
        iZ_22.id_break(this.id_class);
        iZ_22.id_class(il_3.id_interface, Long.valueOf(l));
    }

    protected void id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        iZ_2<rsq_3> iZ_22 = rsq_32.SF();
        iZ_22.id_byte(this.id_class).ifPresent(rfK_22 -> {
            if (!this.id_class(rrEm_12, (rfK_2)rfK_22) && !this.id_class(rrEm_12, rsq_32)) {
                if (this.id_class(rsq_32, (rfK_2)rfK_22)) {
                    int n;
                    rjU_2 rjU_22 = null;
                    int n2 = 1000;
                    for (n = 0; n < 1000 && (rjU_22 == null || this.id_class(rsq_32, rfK_2.id_class(rrEm_12.E(), new rfH_2(rjU_22)))); ++n) {
                        rjU_22 = iX_2.id_break(rsq_32, 15, 7, rjU_2.id_protected(rfK_22.id_break()));
                    }
                    if (n == 1000) {
                        this.id_class(rsq_32, l);
                        return;
                    }
                    iZ_22.id_class(il_3.id_volatile, new iH_2(rjU_22, this.id_byte, this.id_protected));
                } else if (!this.id_class(rrEm_12, rsq_32, (rfK_2)rfK_22)) {
                    iZ_22.id_class(il_3.id_volatile, new iH_2(rfK_22.id_break(), this.id_byte, this.id_protected));
                }
            } else {
                this.id_class(rsq_32, l);
            }
        });
    }

    @Override
    private boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        Optional<Long> optional = rsq_32.SF().id_byte(il_3.id_interface);
        if (optional.isPresent()) {
            return rrEm_12.r() - optional.get() > (long)this.id_case;
        }
        return false;
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rsq_3)iB_22, l);
    }
}

