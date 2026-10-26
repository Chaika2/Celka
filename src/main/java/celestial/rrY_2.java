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
import celestial.il_3;
import celestial.is_3;
import celestial.rPm_1;
import celestial.rfH_2;
import celestial.rls_3;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rrY_2
extends rPm_1<is_3> {
    private final float id_class;
    private rfH_2 id_byte;
    private int id_protected;
    private int id_throws;
    private int id_case;

    private boolean id_byte(rrEm_1 rrEm_12, is_3 is_32) {
        rfH_2 rfH_22 = is_32.Bs();
        rfH_2 rfH_23 = rfH_22.id_break();
        return this.id_class(rrEm_12, rfH_22) || this.id_class(rrEm_12, rfH_23);
    }

    @Override
    protected /* synthetic */ void id_byte(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_protected(rrEm_12, (is_3)iB_22, l);
    }

    protected boolean id_byte(rrEm_1 rrEm_12, is_3 is_32, long l) {
        return is_32.n_() && this.id_byte != null && this.id_class(rrEm_12, this.id_byte) && !this.id_throws(rrEm_12, is_32) && !this.id_case(rrEm_12, is_32);
    }

    public rrY_2(float f) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_return, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT)));
        this.id_class = f;
    }

    @Override
    protected /* synthetic */ boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        return this.id_byte(rrEm_12, (is_3)iB_22, l);
    }

    @Override
    private boolean id_class(rrEm_1 rrEm_12, rfH_2 rfH_22) {
        return rrEm_12.id_byte(rfH_22).id_class(rls_3.id_short);
    }

    private Optional<rfH_2> id_class(is_3 is_32) {
        return is_32.SF().id_byte(il_3.id_return);
    }

    protected void id_class(rrEm_1 rrEm_12, is_3 is_32, long l) {
        super.id_protected(rrEm_12, is_32, l);
        this.id_class(is_32).ifPresent(rfH_22 -> {
            this.id_byte = rfH_22;
            this.id_protected = 100;
            this.id_throws = 3 + rrEm_12.id_int.nextInt(4);
            this.id_case = 0;
            this.id_class(is_32, (rfH_2)rfH_22);
        });
    }

    @Override
    protected boolean id_class(long l) {
        return false;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, is_3 is_32) {
        return is_32.n_() && this.id_break(rrEm_12, is_32);
    }

    private void id_class(is_3 is_32, rfH_2 rfH_22) {
        is_32.SF().id_class(il_3.id_volatile, new iH_2(rfH_22, this.id_class, 0));
    }

    @Override
    protected void id_break(rrEm_1 rrEm_12, is_3 is_32, long l) {
        super.id_break(rrEm_12, is_32, l);
        this.id_byte = null;
        this.id_protected = 0;
        this.id_throws = 0;
        this.id_case = 0;
    }

    private boolean id_break(rrEm_1 rrEm_12, is_3 is_32) {
        return this.id_byte(rrEm_12, is_32) || this.id_class(is_32).isPresent();
    }

    private boolean id_throws(rrEm_1 rrEm_12, is_3 is_32) {
        return !this.id_byte(rrEm_12, is_32) && this.id_protected <= 0;
    }

    private boolean id_case(rrEm_1 rrEm_12, is_3 is_32) {
        return this.id_byte(rrEm_12, is_32) && this.id_throws <= 0;
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, is_3 is_32, long l) {
        if (!this.id_byte(rrEm_12, is_32)) {
            --this.id_protected;
        } else if (this.id_case > 0) {
            --this.id_case;
        } else if (this.id_protected(rrEm_12, is_32)) {
            is_32.id_else().id_class();
            --this.id_throws;
            this.id_case = 5;
        }
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (is_3)iB_22, l);
    }

    private boolean id_protected(rrEm_1 rrEm_12, is_3 is_32) {
        return this.id_class(rrEm_12, is_32.Bs());
    }
}

