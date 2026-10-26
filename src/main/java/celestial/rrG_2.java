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
import celestial.rPm_1;
import celestial.rbZ_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rrG_2
extends rPm_1<rbZ_2> {
    private final aI_2<? extends rbZ_2> id_class;
    private final float id_byte;
    private long id_protected;

    @Override
    protected void id_byte(rrEm_1 rrEm_12, rbZ_2 rbZ_22, long l) {
        rbZ_2 rbZ_23 = this.id_class(rbZ_22);
        iA_2.id_class((iB_2)rbZ_22, (iB_2)rbZ_23, this.id_byte);
        if (rbZ_22.id_class((an_3)rbZ_23, 3.0) && l >= this.id_protected) {
            rbZ_22.id_class(rrEm_12, rbZ_23);
            rbZ_22.SF().id_break(il_3.id_continue);
            rbZ_23.SF().id_break(il_3.id_continue);
        }
    }

    private Optional<? extends rbZ_2> id_byte(rbZ_2 rbZ_22) {
        return rbZ_22.SF().id_byte(il_3.id_private).get().stream().filter(iB_22 -> iB_22.BC() == this.id_class).map(iB_22 -> (rbZ_2)iB_22).filter(rbZ_22::id_class).findFirst();
    }

    public rrG_2(aI_2<? extends rbZ_2> aI_22, float f) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_private, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_continue, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_volatile, (Object)((Object)iC_2.REGISTERED), il_3.id_final, (Object)((Object)iC_2.REGISTERED)), 325);
        this.id_class = aI_22;
        this.id_byte = f;
    }

    protected void id_class(rrEm_1 rrEm_12, rbZ_2 rbZ_22, long l) {
        rbZ_2 rbZ_23 = this.id_byte(rbZ_22).get();
        rbZ_22.SF().id_class(il_3.id_continue, rbZ_23);
        rbZ_23.SF().id_class(il_3.id_continue, rbZ_22);
        iA_2.id_class((iB_2)rbZ_22, (iB_2)rbZ_23, this.id_byte);
        int n = 275 + rbZ_22.Sa().nextInt(50);
        this.id_protected = l + (long)n;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rbZ_2 rbZ_22) {
        return rbZ_22.sQ() && this.id_byte(rbZ_22).isPresent();
    }

    @Override
    protected /* synthetic */ boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        return this.id_break(rrEm_12, (rbZ_2)iB_22, l);
    }

    private rbZ_2 id_class(rbZ_2 rbZ_22) {
        return (rbZ_2)rbZ_22.SF().id_byte(il_3.id_continue).get();
    }

    @Override
    protected /* synthetic */ void id_break(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_protected(rrEm_12, (rbZ_2)iB_22, l);
    }

    private boolean id_break(rbZ_2 rbZ_22) {
        iZ_2<au_3> iZ_22 = rbZ_22.SF();
        return iZ_22.id_class(il_3.id_continue) && iZ_22.id_byte(il_3.id_continue).get().BC() == this.id_class;
    }

    protected boolean id_break(rrEm_1 rrEm_12, rbZ_2 rbZ_22, long l) {
        if (!this.id_break(rbZ_22)) {
            return false;
        }
        rbZ_2 rbZ_23 = this.id_class(rbZ_22);
        return rbZ_23.BM() && rbZ_22.id_class(rbZ_23) && iA_2.id_class(rbZ_22.SF(), (iB_2)rbZ_23) && l <= this.id_protected;
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rbZ_2)iB_22, l);
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, rbZ_2 rbZ_22, long l) {
        rbZ_22.SF().id_break(il_3.id_continue);
        rbZ_22.SF().id_break(il_3.id_volatile);
        rbZ_22.SF().id_break(il_3.id_final);
        this.id_protected = 0L;
    }
}

