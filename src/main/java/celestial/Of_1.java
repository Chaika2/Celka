/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.OT;
import celestial.OY;
import celestial.Ot_1;
import celestial.Ow_1;
import celestial.jf_3;
import celestial.rAL;
import celestial.rWl_1;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rzZ_2;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Of_1
extends jf_3 {
    private static final Logger id_class = LogManager.getLogger();
    private static final Gson id_break = new GsonBuilder().create();
    private Ow_1 id_byte = new Ow_1();
    private final rzZ_2 id_protected;

    public Of_1(rzZ_2 rzZ_22) {
        super(id_break, "advancements");
        this.id_protected = rzZ_22;
    }

    public Collection<OT> id_class() {
        return this.id_byte.id_byte();
    }

    @Override
    protected void id_class(Map<rqO_2, JsonElement> map, rAL rAL2) {
        HashMap hashMap = Maps.newHashMap();
        map.forEach((rqO_22, jsonElement) -> {
            try {
                JsonObject jsonObject = rpY_2.id_private(jsonElement, "advancement");
                Ot_1 ot_1 = Ot_1.id_class(jsonObject, new rWl_1((rqO_2)rqO_22, this.id_protected));
                hashMap.put(rqO_22, ot_1);
            }
            catch (JsonParseException | IllegalArgumentException throwable) {
                id_class.error("Parsing error loading custom advancement {}: {}", rqO_22, (Object)throwable.getMessage());
            }
        });
        Ow_1 ow_1 = new Ow_1();
        ow_1.id_class(hashMap);
        for (OT oT : ow_1.id_break()) {
            if (oT.id_byte() == null) continue;
            OY.id_class(oT);
        }
        this.id_byte = ow_1;
    }

    public OT id_class(rqO_2 rqO_22) {
        return this.id_byte.id_class(rqO_22);
    }
}

