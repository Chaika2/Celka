/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 */
package celestial;

import celestial.rlb_3;
import celestial.rlh_3;
import celestial.rqO_2;
import com.google.gson.JsonArray;
import java.util.function.Consumer;
import java.util.function.Function;

public class rlX_2
implements rlh_3 {
    private final rqO_2 id_class;

    public rlX_2(rqO_2 rqO_22) {
        this.id_class = rqO_22;
    }

    public String toString() {
        return this.id_class.toString();
    }

    @Override
    public <T> boolean id_class(Function<rqO_2, rlb_3<T>> function, Function<rqO_2, T> function2, Consumer<T> consumer) {
        T t = function2.apply(this.id_class);
        if (t == null) {
            return false;
        }
        consumer.accept(t);
        return true;
    }

    @Override
    public void id_class(JsonArray jsonArray) {
        jsonArray.add(this.id_class.toString());
    }
}

