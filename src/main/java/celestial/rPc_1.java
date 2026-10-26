/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.is_3;
import celestial.rPm_1;
import celestial.rlG_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rPc_1
extends rPm_1<is_3> {
    private final float id_class;

    @Override
    protected /* synthetic */ void id_byte(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_break(rrEm_12, (is_3)iB_22, l);
    }

    public rPc_1(float f) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of());
        this.id_class = f;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, is_3 is_32) {
        return is_32.rT() && is_32.id_break(rlG_2.id_break) > is_32.rI() || is_32.ry();
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, is_3 is_32, long l) {
        return this.id_class(rrEm_12, is_32);
    }

    @Override
    protected void id_break(rrEm_1 rrEm_12, is_3 is_32, long l) {
        if (is_32.Sa().nextFloat() < this.id_class) {
            is_32.id_else().id_class();
        }
    }
}

