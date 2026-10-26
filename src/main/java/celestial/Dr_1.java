/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.DA;
import celestial.DT;
import celestial.Dn_1;
import celestial.rCF;
import celestial.rCZ;
import celestial.rVL;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.xc_3;
import celestial.xd_3;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.file.Path;

public class Dr_1
implements DT {
    private static final Gson id_break = new GsonBuilder().setPrettyPrinting().create();
    private final DA id_byte;

    public Dr_1(DA dA) {
        this.id_byte = dA;
    }

    @Override
    public void id_class(Dn_1 dn_1) throws IOException {
        JsonObject jsonObject = new JsonObject();
        for (xd_3 xd_32 : rVL.id_strictfp) {
            JsonArray jsonArray;
            JsonObject jsonObject2;
            rqO_2 rqO_22 = rVL.id_strictfp.id_break(xd_32);
            JsonObject jsonObject3 = new JsonObject();
            rCF<xd_3, xc_3> rCF2 = xd_32.id_new();
            if (!rCF2.id_protected().isEmpty()) {
                jsonObject2 = new JsonObject();
                for (rCZ rCZ2 : rCF2.id_protected()) {
                    jsonArray = new JsonArray();
                    for (Object object : rCZ2.id_class()) {
                        jsonArray.add(rqR_2.id_class(rCZ2, object));
                    }
                    jsonObject2.add(rCZ2.id_throws(), (JsonElement)jsonArray);
                }
                jsonObject3.add("properties", (JsonElement)jsonObject2);
            }
            jsonObject2 = new JsonArray();
            for (xc_3 xc_32 : rCF2.id_class()) {
                Object object;
                jsonArray = new JsonObject();
                JsonObject jsonObject4 = new JsonObject();
                object = rCF2.id_protected().iterator();
                while (object.hasNext()) {
                    rCZ rCZ3 = (rCZ)object.next();
                    jsonObject4.addProperty(rCZ3.id_throws(), rqR_2.id_class(rCZ3, xc_32.id_byte(rCZ3)));
                }
                if (jsonObject4.size() > 0) {
                    jsonArray.add("properties", (JsonElement)jsonObject4);
                }
                jsonArray.addProperty("id", (Number)xd_3.id_finally(xc_32));
                if (xc_32 == xd_32.id_continue()) {
                    jsonArray.addProperty("default", Boolean.valueOf(true));
                }
                jsonObject2.add((JsonElement)jsonArray);
            }
            jsonObject3.add("states", (JsonElement)jsonObject2);
            jsonObject.add(rqO_22.toString(), (JsonElement)jsonObject3);
        }
        Path path = this.id_byte.id_break().resolve("reports/blocks.json");
        DT.id_class(id_break, dn_1, (JsonElement)jsonObject, path);
    }

    @Override
    public String id_class() {
        return "Block List";
    }
}

