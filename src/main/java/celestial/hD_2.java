/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.aI_2;
import celestial.hU_2;
import celestial.ha_3;
import celestial.he_3;
import celestial.rVL;
import celestial.rlZ_2;
import celestial.rlb_3;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.common.base.Joiner;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;

public abstract class hD_2 {
    public static final hD_2 id_class = new hU_2();
    private static final Joiner id_break = Joiner.on((String)", ");

    public static hD_2 id_class(rlb_3<aI_2<?>> rlb_32) {
        return new he_3(rlb_32);
    }

    public abstract boolean id_class(aI_2<?> var1);

    public static hD_2 id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            String string = rpY_2.id_class(jsonElement, "type");
            if (string.startsWith("#")) {
                rqO_2 rqO_22 = new rqO_2(string.substring(1));
                return new he_3(rlZ_2.id_class().id_protected().id_break(rqO_22));
            }
            rqO_2 rqO_23 = new rqO_2(string);
            aI_2<?> aI_22 = rVL.id_transient.id_break(rqO_23).orElseThrow(() -> new JsonSyntaxException("Unknown entity type '" + rqO_23 + "', valid types are: " + id_break.join(rVL.id_transient.id_protected())));
            return new ha_3(aI_22);
        }
        return id_class;
    }

    public abstract JsonElement id_class();

    public static hD_2 id_break(aI_2<?> aI_22) {
        return new ha_3(aI_22);
    }
}

