/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  celestial.DP$celestial.DB
 *  com.google.gson.JsonElement
 */
package celestial;

import celestial.DP;
import com.google.gson.JsonElement;
import java.util.function.Function;

public class DP<T> {
    public final String id_class;
    public final Function<T, JsonElement> id_break;

    public DP(String string, Function<T, JsonElement> function) {
        this.id_class = string;
        this.id_break = function;
    }

    public String toString() {
        return this.id_class;
    }

    public DB id_class(T t) {
        return new celestial.DB(this, t);
    }
}

