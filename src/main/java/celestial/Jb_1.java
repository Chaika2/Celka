/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.JG;
import celestial.rCZ;
import celestial.rCn_1;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Optional;

public class Jb_1
extends JG {
    private final String id_class;
    private final String id_break;

    public Jb_1(String string, String string2, String string3) {
        super(string);
        this.id_class = string2;
        this.id_break = string3;
    }

    @Override
    protected <T extends Comparable<T>> boolean id_class(rCn_1<?, ?> rCn_12, rCZ<T> rCZ2) {
        Optional<T> optional;
        Comparable comparable = rCn_12.id_byte(rCZ2);
        if (!(this.id_class == null || (optional = rCZ2.id_break(this.id_class)).isPresent() && comparable.compareTo((Comparable)((Comparable)optional.get())) >= 0)) {
            return false;
        }
        return this.id_break == null || (optional = rCZ2.id_break(this.id_break)).isPresent() && comparable.compareTo((Comparable)((Comparable)optional.get())) <= 0;
    }

    @Override
    public JsonElement id_class() {
        JsonObject jsonObject = new JsonObject();
        if (this.id_class != null) {
            jsonObject.addProperty("min", this.id_class);
        }
        if (this.id_break != null) {
            jsonObject.addProperty("max", this.id_break);
        }
        return jsonObject;
    }
}

