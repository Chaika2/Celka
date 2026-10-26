/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rkf_3;
import celestial.rkw_3;
import celestial.rqO_2;
import celestial.ruu_3;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class rWc_1<T extends rkw_3<?>>
implements rkf_3<T> {
    private final Function<rqO_2, T> id_synchronized;

    public rWc_1(Function<rqO_2, T> function) {
        this.id_synchronized = function;
    }

    @Override
    public void id_class(ruu_3 ruu_32, T t) {
    }

    @Override
    public T id_break(rqO_2 rqO_22, JsonObject jsonObject) {
        return (T)((rkw_3)this.id_synchronized.apply(rqO_22));
    }

    @Override
    public T id_break(rqO_2 rqO_22, ruu_3 ruu_32) {
        return (T)((rkw_3)this.id_synchronized.apply(rqO_22));
    }
}

