/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.RecordBuilder
 */
package celestial;

import celestial.iZ_2;
import celestial.il_3;
import celestial.in_3;
import celestial.rVL;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.RecordBuilder;
import java.util.Optional;

public final class iL_2<U> {
    private final il_3<U> id_class;
    private final Optional<? extends in_3<U>> id_break;

    public iL_2(il_3<U> il_32, Optional<? extends in_3<U>> optional) {
        this.id_class = il_32;
        this.id_break = optional;
    }

    public <T> void id_class(DynamicOps<T> dynamicOps, RecordBuilder<T> recordBuilder) {
        this.id_class.id_class().ifPresent(codec -> this.id_break.ifPresent(in_32 -> recordBuilder.add(rVL.d.encodeStart(dynamicOps, this.id_class), codec.encodeStart(dynamicOps, in_32))));
    }

    public void id_class(iZ_2<?> iZ_22) {
        iZ_22.id_break(this.id_class, this.id_break);
    }

    public static <U> iL_2<U> id_class(il_3<U> il_32, Optional<? extends in_3<?>> optional) {
        return new iL_2<U>(il_32, optional);
    }
}

