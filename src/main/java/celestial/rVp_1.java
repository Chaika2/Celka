/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 */
package celestial;

import celestial.rTF;
import celestial.rVF;
import celestial.rVL;
import celestial.rVm_1;
import celestial.rqM_2;
import celestial.rqO_2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;

public class rVp_1<T>
extends rTF<T> {
    private final rVm_1 id_break;

    private rVp_1(DynamicOps<T> dynamicOps, rVm_1 rVm_12) {
        super(dynamicOps);
        this.id_break = rVm_12;
    }

    public static <T> rVp_1<T> id_class(DynamicOps<T> dynamicOps, rVm_1 rVm_12) {
        return new rVp_1<T>(dynamicOps, rVm_12);
    }

    protected <E> DataResult<T> id_class(E e, T t, rqM_2<? extends rVL<E>> rqM_22, Codec<E> codec) {
        rVF rVF2;
        Optional<rqM_2<E>> optional;
        Optional optional2 = this.id_break.id_class(rqM_22);
        if (optional2.isPresent() && (optional = (rVF2 = optional2.get()).id_byte(e)).isPresent()) {
            rqM_2<E> rqM_23 = optional.get();
            return rqO_2.id_class.encode((Object)rqM_23.id_class(), this.id_class, t);
        }
        return codec.encode(e, (DynamicOps)this, t);
    }
}

