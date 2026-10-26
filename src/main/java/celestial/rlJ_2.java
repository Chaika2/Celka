/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rlb_3;
import celestial.rlh_3;
import celestial.rqO_2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Consumer;
import java.util.function.Function;

public class rlJ_2
implements rlh_3 {
    private final rqO_2 id_class;

    public rlJ_2(rqO_2 rqO_22) {
        this.id_class = rqO_22;
    }

    public String toString() {
        return this.id_class.toString() + "?";
    }

    @Override
    public <T> boolean id_class(Function<rqO_2, rlb_3<T>> function, Function<rqO_2, T> function2, Consumer<T> consumer) {
        T t = function2.apply(this.id_class);
        if (t != null) {
            consumer.accept(t);
        }
        return true;
    }

    @Override
    public void id_class(JsonArray jsonArray) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", this.id_class.toString());
        jsonObject.addProperty("required", Boolean.valueOf(false));
        jsonArray.add((JsonElement)jsonObject);
    }
}

