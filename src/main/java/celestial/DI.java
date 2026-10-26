/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 */
package celestial;

import celestial.DV;
import celestial.Df_1;
import celestial.Dj_1;
import celestial.rCF;
import com.google.gson.JsonElement;
import java.util.Arrays;
import java.util.function.Supplier;

public interface DI
extends Supplier<JsonElement> {
    public void id_class(rCF<?, ?> var1);

    public static Dj_1 id_class() {
        return new Dj_1();
    }

    public static DI id_class(DI ... dIArray) {
        return new DV(Df_1.OR, Arrays.asList(dIArray));
    }
}

