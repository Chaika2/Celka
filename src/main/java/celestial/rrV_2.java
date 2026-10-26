/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.iA_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.is_3;
import celestial.rPm_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Random;

public class rrV_2<E extends is_3>
extends rPm_1<E> {
    private final int id_class;
    private final float id_byte;

    public rrV_2(int n, float f) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_double, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_package, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_final, (Object)((Object)iC_2.REGISTERED)));
        this.id_class = n;
        this.id_byte = f;
    }

    private static rfH_2 id_class(is_3 is_32) {
        return is_32.SF().id_byte(il_3.id_double).get();
    }

    private static int id_class(Random random) {
        return random.nextInt(3) - 1;
    }

    private static rfH_2 id_class(is_3 is_32, rfH_2 rfH_22) {
        Random random = ((rYB)is_32.id_throws[7]).id_int;
        return rfH_22.id_break(rrV_2.id_class(random), 0, rrV_2.id_class(random));
    }

    protected void id_class(rrEm_1 rrEm_12, is_3 is_32, long l) {
        rfH_2 rfH_22 = rrV_2.id_class(is_32);
        boolean bl = rfH_22.id_class(is_32.Bs(), (double)this.id_class);
        if (!bl) {
            iA_2.id_class((iB_2)is_32, rrV_2.id_class(is_32, rfH_22), this.id_byte, this.id_class);
        }
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (is_3)iB_22, l);
    }
}

