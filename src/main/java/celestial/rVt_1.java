/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonIOException
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.DynamicOps
 */
package celestial;

import celestial.rAF;
import celestial.rAL;
import celestial.rVL;
import celestial.rVT;
import celestial.rqM_2;
import celestial.rqO_2;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.OptionalInt;

public class rVt_1
implements rVT {
    public final /* synthetic */ rAL id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rVt_1(rAL rAL2) {
        this.id_class = rAL2;
    }

    public String toString() {
        return "ResourceAccess[" + this.id_class + "]";
    }

    @Override
    public Collection<rqO_2> id_class(rqM_2<? extends rVL<?>> rqM_22) {
        return this.id_class.id_class(rqM_22.id_class().id_break(), string -> string.endsWith(".json"));
    }

    /*
     * Enabled aggressive exception aggregation
     */
    @Override
    public <E> DataResult<Pair<E, OptionalInt>> id_class(DynamicOps<JsonElement> dynamicOps, rqM_2<? extends rVL<E>> rqM_22, rqM_2<E> rqM_23, Decoder<E> decoder) {
        rqO_2 rqO_22 = rqM_23.id_class();
        rqO_2 rqO_23 = new rqO_2(rqO_22.id_byte(), rqM_22.id_class().id_break() + "/" + rqO_22.id_break() + ".json");
        try (rAF rAF2 = this.id_class.id_class(rqO_23);){
            DataResult dataResult;
            try (InputStreamReader inputStreamReader = new InputStreamReader(rAF2.id_break(), StandardCharsets.UTF_8);){
                JsonParser jsonParser = new JsonParser();
                JsonElement jsonElement = jsonParser.parse((Reader)inputStreamReader);
                dataResult = decoder.parse(dynamicOps, (Object)jsonElement).map(object -> Pair.of((Object)object, (Object)OptionalInt.empty()));
            }
            return dataResult;
        }
        catch (JsonIOException | JsonSyntaxException | IOException throwable) {
            return DataResult.error((String)("Failed to parse " + rqO_23 + " file: " + throwable.getMessage()));
        }
    }
}

