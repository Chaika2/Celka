/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public final class rMv_1
extends Enum<rMv_1> {
    public static final /* enum */ rMv_1 NONE = new rMv_1(1.0f);
    public static final /* enum */ rMv_1 LOW = new rMv_1(0.75f);
    public static final /* enum */ rMv_1 MEDIUM = new rMv_1(0.5f);
    public static final /* enum */ rMv_1 HIGH = new rMv_1(0.25f);
    private static final List<rMv_1> field_226513_e_;
    private final float field_226514_f_;
    private static final /* synthetic */ rMv_1[] $VALUES;

    private rMv_1(float f) {
        this.field_226514_f_ = f;
    }

    static {
        $VALUES = rMv_1.id_class();
        field_226513_e_ = (List)Stream.of(rMv_1.values()).sorted(Comparator.comparingDouble(rMv_12 -> rMv_12.field_226514_f_)).collect(ImmutableList.toImmutableList());
    }

    public static rMv_1[] values() {
        return (rMv_1[])$VALUES.clone();
    }

    public static rMv_1 valueOf(String string) {
        return Enum.valueOf(rMv_1.class, string);
    }

    public static rMv_1 id_class(float f) {
        for (rMv_1 rMv_12 : field_226513_e_) {
            if (!(f < rMv_12.field_226514_f_)) continue;
            return rMv_12;
        }
        return NONE;
    }

    private static /* synthetic */ rMv_1[] id_class() {
        return new rMv_1[]{NONE, LOW, MEDIUM, HIGH};
    }
}

