/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.au_3;
import celestial.iA_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rLC;
import celestial.rPm_1;
import celestial.rRP;
import celestial.rfH_2;
import celestial.rfK_2;
import celestial.rrEm_1;
import celestial.rsq_3;
import celestial.ruP_2;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rrz_3
extends rPm_1<rsq_3> {
    private long id_class;

    @Override
    protected void id_byte(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        rsq_3 rsq_33 = (rsq_3)rsq_32.SF().id_byte(il_3.id_continue).get();
        if (!(rsq_32.id_int(rsq_33) > 5.0)) {
            iA_2.id_class((iB_2)rsq_32, (iB_2)rsq_33, 0.5f);
            if (l >= this.id_class) {
                rsq_32.sm();
                rsq_33.sm();
                this.id_class(rrEm_12, rsq_32, rsq_33);
            } else if (rsq_32.Sa().nextInt(35) == 0) {
                rrEm_12.id_class((an_3)rsq_33, (byte)12);
                rrEm_12.id_class((an_3)rsq_32, (byte)12);
            }
        }
    }

    public rrz_3() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_continue, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_private, (Object)((Object)iC_2.VALUE_PRESENT)), 350, 350);
    }

    private boolean id_class(rsq_3 rsq_32, rfH_2 rfH_22) {
        rLC rLC2 = rsq_32.id_public().id_class(rfH_22, rRP.id_continue.id_byte());
        return rLC2 != null && rLC2.id_finally();
    }

    private void id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, rfH_2 rfH_22) {
        rfK_2 rfK_22 = rfK_2.id_class(rrEm_12.E(), rfH_22);
        rsq_32.SF().id_class(il_3.id_break, rfK_22);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        return l <= this.id_class && this.id_class(rsq_32);
    }

    private void id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, rsq_3 rsq_33) {
        Optional<rfH_2> optional = this.id_break(rrEm_12, rsq_32);
        if (!optional.isPresent()) {
            rrEm_12.id_class((an_3)rsq_33, (byte)13);
            rrEm_12.id_class((an_3)rsq_32, (byte)13);
        } else {
            Optional<rsq_3> optional2 = this.id_break(rrEm_12, rsq_32, rsq_33);
            if (optional2.isPresent()) {
                this.id_class(rrEm_12, optional2.get(), optional.get());
            } else {
                rrEm_12.d().id_break(optional.get());
                ruP_2.id_byte(rrEm_12, optional.get());
            }
        }
    }

    private boolean id_class(rsq_3 rsq_32) {
        iZ_2<rsq_3> iZ_22 = rsq_32.SF();
        Optional<au_3> optional = iZ_22.id_byte(il_3.id_continue).filter(au_32 -> au_32.BC() == aI_2.D);
        if (!optional.isPresent()) {
            return false;
        }
        return iA_2.id_class(iZ_22, il_3.id_continue, aI_2.D) && rsq_32.N_() && optional.get().N_();
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        return this.id_class(rsq_32);
    }

    @Override
    protected /* synthetic */ void id_break(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_protected(rrEm_12, (rsq_3)iB_22, l);
    }

    private Optional<rfH_2> id_break(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        return rrEm_12.d().id_class(rRP.id_continue.id_break(), rfH_22 -> this.id_class(rsq_32, (rfH_2)rfH_22), rsq_32.Bs(), 48);
    }

    private Optional<rsq_3> id_break(rrEm_1 rrEm_12, rsq_3 rsq_32, rsq_3 rsq_33) {
        rsq_3 rsq_34 = rsq_32.id_break(rrEm_12, rsq_33);
        if (rsq_34 == null) {
            return Optional.empty();
        }
        rsq_32.e_(6000);
        rsq_33.e_(6000);
        rsq_34.e_(-24000);
        rsq_34.id_class(rsq_32.rx(), rsq_32.re(), rsq_32.BO(), 0.0f, 0.0f);
        rrEm_12.id_class((an_3)rsq_34);
        rrEm_12.id_class((an_3)rsq_34, (byte)12);
        return Optional.of(rsq_34);
    }

    @Override
    protected void id_break(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        au_3 au_32 = rsq_32.SF().id_byte(il_3.id_continue).get();
        iA_2.id_class((iB_2)rsq_32, (iB_2)au_32, 0.5f);
        rrEm_12.id_class((an_3)au_32, (byte)18);
        rrEm_12.id_class((an_3)rsq_32, (byte)18);
        int n = 275 + rsq_32.Sa().nextInt(50);
        this.id_class = l + (long)n;
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_break(rrEm_12, (rsq_3)iB_22, l);
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        rsq_32.SF().id_break(il_3.id_continue);
    }
}

