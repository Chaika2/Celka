/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.aA_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.iX_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.is_3;
import celestial.rLC;
import celestial.rLy_1;
import celestial.rPm_1;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rPy_1
extends rPm_1<is_3> {
    private int id_class;
    private rLC id_byte;
    private rfH_2 id_protected;
    private float id_throws;

    @Override
    protected void id_byte(rrEm_1 rrEm_12, is_3 is_32, long l) {
        is_32.SF().id_class(il_3.id_this, this.id_byte);
        is_32.id_public().id_class(this.id_byte, (double)this.id_throws);
    }

    @Override
    protected /* synthetic */ void id_byte(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_protected(rrEm_12, (is_3)iB_22, l);
    }

    public rPy_1() {
        this(150, 250);
    }

    public rPy_1(int n, int n2) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_interface, (Object)((Object)iC_2.REGISTERED), il_3.id_this, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_volatile, (Object)((Object)iC_2.VALUE_PRESENT)), n, n2);
    }

    private boolean id_class(is_3 is_32, iH_2 iH_22) {
        return iH_22.id_class().id_break().id_implements(is_32.Bs()) <= iH_22.id_byte();
    }

    private boolean id_class(is_3 is_32, iH_2 iH_22, long l) {
        rfH_2 rfH_22 = iH_22.id_class().id_break();
        this.id_byte = is_32.id_public().id_class(rfH_22, 0);
        this.id_throws = iH_22.id_break();
        iZ_2<Long> iZ_22 = is_32.SF();
        if (this.id_class(is_32, iH_22)) {
            iZ_22.id_break(il_3.id_interface);
        } else {
            boolean bl;
            boolean bl2 = bl = this.id_byte != null && this.id_byte.id_finally();
            if (bl) {
                iZ_22.id_break(il_3.id_interface);
            } else if (!iZ_22.id_class(il_3.id_interface)) {
                iZ_22.id_class(il_3.id_interface, Long.valueOf(l));
            }
            if (this.id_byte != null) {
                return true;
            }
            rjU_2 rjU_22 = iX_2.id_break((aA_2)is_32, 10, 7, rjU_2.id_protected(rfH_22));
            if (rjU_22 != null) {
                this.id_byte = is_32.id_public().id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, 0);
                return this.id_byte != null;
            }
        }
        return false;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, is_3 is_32) {
        if (this.id_class > 0) {
            --this.id_class;
            return false;
        }
        iZ_2<?> iZ_22 = is_32.SF();
        iH_2 iH_22 = iZ_22.id_byte(il_3.id_volatile).get();
        boolean bl = this.id_class(is_32, iH_22);
        if (!bl && this.id_class(is_32, iH_22, rrEm_12.r())) {
            this.id_protected = iH_22.id_class().id_break();
            return true;
        }
        iZ_22.id_break(il_3.id_volatile);
        if (bl) {
            iZ_22.id_break(il_3.id_interface);
        }
        return false;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, is_3 is_32, long l) {
        if (this.id_byte != null && this.id_protected != null) {
            Optional<iH_2> optional = is_32.SF().id_byte(il_3.id_volatile);
            rLy_1 rLy_12 = is_32.id_public();
            return !rLy_12.id_native() && optional.isPresent() && !this.id_class(is_32, optional.get());
        }
        return false;
    }

    @Override
    protected void id_break(rrEm_1 rrEm_12, is_3 is_32, long l) {
        if (is_32.SF().id_class(il_3.id_volatile) && !this.id_class(is_32, is_32.SF().id_byte(il_3.id_volatile).get()) && is_32.id_public().id_continue()) {
            this.id_class = rrEm_12.id_long().nextInt(40);
        }
        is_32.id_public().id_final();
        is_32.SF().id_break(il_3.id_volatile);
        is_32.SF().id_break(il_3.id_this);
        this.id_byte = null;
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_byte(rrEm_12, (is_3)iB_22, l);
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, is_3 is_32, long l) {
        iH_2 iH_22;
        rLC rLC2 = is_32.id_public().id_finally();
        iZ_2<?> iZ_22 = is_32.SF();
        if (this.id_byte != rLC2) {
            this.id_byte = rLC2;
            iZ_22.id_class(il_3.id_this, rLC2);
        }
        if (rLC2 != null && this.id_protected != null && (iH_22 = iZ_22.id_byte(il_3.id_volatile).get()).id_class().id_break().id_private(this.id_protected) > 4.0 && this.id_class(is_32, iH_22, rrEm_12.r())) {
            this.id_protected = iH_22.id_class().id_break();
            this.id_byte(rrEm_12, is_32, l);
        }
    }
}

