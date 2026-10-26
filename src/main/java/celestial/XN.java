/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.XQ;
import celestial.XS;
import celestial.Xm_1;
import celestial.hO_2;
import celestial.rVL;
import celestial.rYB;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rpY_2;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.rrEm_1;
import celestial.rrrZ;
import celestial.xn_3;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class XN {
    private static final Logger id_break = LogManager.getLogger();
    public static final XN id_class = new XN(Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws, null, null, null, null, XQ.id_class, hO_2.id_class, XS.id_class);
    private final Xm_1 id_byte;
    private final Xm_1 id_protected;
    private final Xm_1 id_throws;
    private final rqM_2<rYG> id_case;
    private final rrrZ<?> id_catch;
    private final rqM_2<rYB> id_private;
    private final Boolean id_implements;
    private final XQ id_finally;
    private final hO_2 id_extends;
    private final XS id_native;

    public XN(Xm_1 xm_1, Xm_1 xm_12, Xm_1 xm_13, rqM_2<rYG> rqM_22, rrrZ<?> rrrZ2, rqM_2<rYB> rqM_23, Boolean bl, XQ xQ, hO_2 hO_22, XS xS) {
        this.id_byte = xm_1;
        this.id_protected = xm_12;
        this.id_throws = xm_13;
        this.id_case = rqM_22;
        this.id_catch = rrrZ2;
        this.id_private = rqM_23;
        this.id_implements = bl;
        this.id_finally = xQ;
        this.id_extends = hO_22;
        this.id_native = xS;
    }

    public boolean id_class(rrEm_1 rrEm_12, float f, float f2, float f3) {
        if (!this.id_byte.id_break(f)) {
            return false;
        }
        if (!this.id_protected.id_break(f2)) {
            return false;
        }
        if (!this.id_throws.id_break(f3)) {
            return false;
        }
        if (this.id_private != null && this.id_private != rrEm_12.E()) {
            return false;
        }
        rfH_2 rfH_22 = new rfH_2(f, f2, f3);
        boolean bl = rrEm_12.id_synchronized(rfH_22);
        Optional<rqM_2<rYG>> optional = rrEm_12.id_new().id_break(rVL.n).id_byte(rrEm_12.id_implements(rfH_22));
        if (!optional.isPresent()) {
            return false;
        }
        if (this.id_case == null || bl && this.id_case == optional.get()) {
            if (this.id_catch == null || bl && rrEm_12.id_protected().id_class(rfH_22, true, this.id_catch).id_throws()) {
                if (this.id_implements == null || bl && this.id_implements == xn_3.id_class(rrEm_12, rfH_22)) {
                    if (!this.id_finally.id_class(rrEm_12, rfH_22)) {
                        return false;
                    }
                    if (!this.id_extends.id_class(rrEm_12, rfH_22)) {
                        return false;
                    }
                    return this.id_native.id_class(rrEm_12, rfH_22);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static XN id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            rqO_2 rqO_23;
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "location");
            JsonObject jsonObject2 = rpY_2.id_class(jsonObject, "position", new JsonObject());
            Xm_1 xm_1 = Xm_1.id_class(jsonObject2.get("x"));
            Xm_1 xm_12 = Xm_1.id_class(jsonObject2.get("y"));
            Xm_1 xm_13 = Xm_1.id_class(jsonObject2.get("z"));
            rqM_2 rqM_22 = jsonObject.has("dimension") ? rqO_2.id_class.parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonObject.get("dimension")).resultOrPartial(arg_0 -> ((Logger)id_break).error(arg_0)).map(rqO_22 -> rqM_2.id_class(rVL.id_static, rqO_22)).orElse(null) : null;
            rrrZ rrrZ2 = jsonObject.has("feature") ? (rrrZ)rrrZ.id_class.get((Object)rpY_2.id_case(jsonObject, "feature")) : null;
            rqM_2<rYG> rqM_23 = null;
            if (jsonObject.has("biome")) {
                rqO_23 = new rqO_2(rpY_2.id_case(jsonObject, "biome"));
                rqM_23 = rqM_2.id_class(rVL.n, rqO_23);
            }
            rqO_23 = jsonObject.has("smokey") ? Boolean.valueOf(jsonObject.get("smokey").getAsBoolean()) : null;
            XQ xQ = XQ.id_class(jsonObject.get("light"));
            hO_2 hO_22 = hO_2.id_class(jsonObject.get("block"));
            XS xS = XS.id_class(jsonObject.get("fluid"));
            return new XN(xm_1, xm_12, xm_13, rqM_23, rrrZ2, rqM_22, (Boolean)((Object)rqO_23), xQ, hO_22, xS);
        }
        return id_class;
    }

    public JsonElement id_class() {
        if (this == id_class) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        if (!(this.id_byte.id_byte() && this.id_protected.id_byte() && this.id_throws.id_byte())) {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.add("x", this.id_byte.id_protected());
            jsonObject2.add("y", this.id_protected.id_protected());
            jsonObject2.add("z", this.id_throws.id_protected());
            jsonObject.add("position", (JsonElement)jsonObject2);
        }
        if (this.id_private != null) {
            rYB.id_break.encodeStart((DynamicOps)JsonOps.INSTANCE, this.id_private).resultOrPartial(arg_0 -> ((Logger)id_break).error(arg_0)).ifPresent(jsonElement -> jsonObject.add("dimension", jsonElement));
        }
        if (this.id_catch != null) {
            jsonObject.addProperty("feature", this.id_catch.id_catch());
        }
        if (this.id_case != null) {
            jsonObject.addProperty("biome", this.id_case.id_class().toString());
        }
        if (this.id_implements != null) {
            jsonObject.addProperty("smokey", this.id_implements);
        }
        jsonObject.add("light", this.id_finally.id_class());
        jsonObject.add("block", this.id_extends.id_class());
        jsonObject.add("fluid", this.id_native.id_class());
        return jsonObject;
    }

    public static XN id_class(rrrZ<?> rrrZ2) {
        return new XN(Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws, null, rrrZ2, null, null, XQ.id_class, hO_2.id_class, XS.id_class);
    }

    public boolean id_class(rrEm_1 rrEm_12, double d, double d2, double d3) {
        return this.id_class(rrEm_12, (float)d, (float)d2, (float)d3);
    }

    public static XN id_class(rqM_2<rYG> rqM_22) {
        return new XN(Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws, rqM_22, null, null, null, XQ.id_class, hO_2.id_class, XS.id_class);
    }

    public static XN id_break(rqM_2<rYB> rqM_22) {
        return new XN(Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws, null, null, rqM_22, null, XQ.id_class, hO_2.id_class, XS.id_class);
    }
}

