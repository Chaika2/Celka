/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.DA;
import celestial.DT;
import celestial.Dn_1;
import celestial.rVL;
import celestial.rVu_1;
import celestial.rqO_2;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.file.Path;

public class Da_1
implements DT {
    private static final Gson id_break = new GsonBuilder().setPrettyPrinting().create();
    private final DA id_byte;

    public Da_1(DA dA) {
        this.id_byte = dA;
    }

    @Override
    public String id_class() {
        return "Registry Dump";
    }

    @Override
    public void id_class(Dn_1 dn_1) throws IOException {
        JsonObject jsonObject = new JsonObject();
        rVL.id_protected.id_protected().forEach(rqO_22 -> jsonObject.add(rqO_22.toString(), Da_1.id_class(rVL.id_protected.id_class((rqO_2)rqO_22))));
        Path path = this.id_byte.id_break().resolve("reports/registries.json");
        DT.id_class(id_break, dn_1, (JsonElement)jsonObject, path);
    }

    private static <T> JsonElement id_class(rVL<T> rVL2) {
        JsonObject jsonObject = new JsonObject();
        if (rVL2 instanceof rVu_1) {
            rqO_2 rqO_22 = ((rVu_1)rVL2).id_class();
            jsonObject.addProperty("default", rqO_22.toString());
        }
        int n = rVL.id_protected.id_class(rVL2);
        jsonObject.addProperty("protocol_id", (Number)n);
        JsonObject jsonObject2 = new JsonObject();
        for (rqO_2 rqO_23 : rVL2.id_protected()) {
            T t = rVL2.id_class(rqO_23);
            int n2 = rVL2.id_class(t);
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("protocol_id", (Number)n2);
            jsonObject2.add(rqO_23.toString(), (JsonElement)jsonObject3);
        }
        jsonObject.add("entries", (JsonElement)jsonObject2);
        return jsonObject;
    }
}

