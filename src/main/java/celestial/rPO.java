/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.aA_2;
import celestial.an_3;
import celestial.eX_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.iX_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Function;

public class rPO<T>
extends rPm_1<aA_2> {
    private final il_3<T> id_class;
    private final float id_byte;
    private final int id_protected;
    private final Function<T, rjU_2> id_throws;

    public rPO(il_3<T> il_32, float f, int n, boolean bl, Function<T, rjU_2> function) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_volatile, (Object)((Object)(bl ? iC_2.REGISTERED : iC_2.VALUE_ABSENT)), il_32, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_class = il_32;
        this.id_byte = f;
        this.id_protected = n;
        this.id_throws = function;
    }

    private rjU_2 id_class(aA_2 aA_22) {
        return this.id_throws.apply(aA_22.SF().id_byte(this.id_class).get());
    }

    private static void id_class(aA_2 aA_22, rjU_2 rjU_22, float f) {
        for (int i = 0; i < 10; ++i) {
            rjU_2 rjU_23 = iX_2.id_protected(aA_22, 16, 7, rjU_22);
            if (rjU_23 == null) continue;
            aA_22.SF().id_class(il_3.id_volatile, new iH_2(rjU_23, f, 0));
            return;
        }
    }

    protected void id_class(rrEm_1 rrEm_12, aA_2 aA_22, long l) {
        rPO.id_class(aA_22, this.id_class(aA_22), this.id_byte);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, aA_2 aA_22) {
        return this.id_break(aA_22) ? false : aA_22.Ps().id_class((eX_2)this.id_class(aA_22), (double)this.id_protected);
    }

    public static rPO<rfH_2> id_class(il_3<rfH_2> il_32, float f, int n, boolean bl) {
        return new rPO<rfH_2>(il_32, f, n, bl, rjU_2::id_protected);
    }

    private boolean id_break(aA_2 aA_22) {
        rjU_2 rjU_22;
        if (!aA_22.SF().id_class(il_3.id_volatile)) {
            return false;
        }
        iH_2 iH_22 = aA_22.SF().id_byte(il_3.id_volatile).get();
        if (iH_22.id_break() != this.id_byte) {
            return false;
        }
        rjU_2 rjU_23 = iH_22.id_class().id_class().id_protected(aA_22.Ps());
        return rjU_23.id_break(rjU_22 = this.id_class(aA_22).id_protected(aA_22.Ps())) < 0.0;
    }

    public static rPO<? extends an_3> id_break(il_3<? extends an_3> il_32, float f, int n, boolean bl) {
        return new rPO<an_3>(il_32, f, n, bl, an_3::Ps);
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (aA_2)iB_22, l);
    }
}

