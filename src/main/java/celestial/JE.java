/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 */
package celestial;

import celestial.JG;
import celestial.rCZ;
import celestial.rCn_1;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Optional;

public class JE
extends JG {
    private final String id_class;

    public JE(String string, String string2) {
        super(string);
        this.id_class = string2;
    }

    @Override
    protected <T extends Comparable<T>> boolean id_class(rCn_1<?, ?> rCn_12, rCZ<T> rCZ2) {
        Comparable comparable = rCn_12.id_byte(rCZ2);
        Optional<T> optional = rCZ2.id_break(this.id_class);
        return optional.isPresent() && comparable.compareTo((Comparable)((Comparable)optional.get())) == 0;
    }

    @Override
    public JsonElement id_class() {
        return new JsonPrimitive(this.id_class);
    }
}

