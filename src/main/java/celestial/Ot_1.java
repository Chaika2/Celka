/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  org.apache.commons.lang3.ArrayUtils
 */
package celestial;

import celestial.OK;
import celestial.OR;
import celestial.OT;
import celestial.OU;
import celestial.Oe_1;
import celestial.Og_1;
import celestial.hS_2;
import celestial.hr_3;
import celestial.rWl_1;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rpL_2;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.ruu_3;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.commons.lang3.ArrayUtils;

public class Ot_1 {
    private rqO_2 id_class;
    private OT id_break;
    private OU id_byte;
    private Og_1 id_protected = Og_1.id_class;
    private Map<String, OK> id_throws = Maps.newLinkedHashMap();
    private String[][] id_case;
    private hS_2 id_catch = hS_2.id_class;

    public Map<String, OK> id_byte() {
        return this.id_throws;
    }

    public Ot_1(rqO_2 rqO_22, OU oU, Og_1 og_1, Map<String, OK> map, String[][] stringArray) {
        this.id_class = rqO_22;
        this.id_byte = oU;
        this.id_protected = og_1;
        this.id_throws = map;
        this.id_case = stringArray;
    }

    private Ot_1() {
    }

    public String toString() {
        return "Task Advancement{parentId=" + this.id_class + ", display=" + this.id_byte + ", rewards=" + this.id_protected + ", criteria=" + this.id_throws + ", requirements=" + Arrays.deepToString((Object[])this.id_case) + "}";
    }

    public boolean id_class(Function<rqO_2, OT> function) {
        if (this.id_class == null) {
            return true;
        }
        if (this.id_break == null) {
            this.id_break = function.apply(this.id_class);
        }
        return this.id_break != null;
    }

    public OT id_class(Consumer<OT> consumer, String string) {
        OT oT = this.id_break(new rqO_2(string));
        consumer.accept(oT);
        return oT;
    }

    public static Ot_1 id_class() {
        return new Ot_1();
    }

    public Ot_1 id_class(hS_2 hS_22) {
        this.id_catch = hS_22;
        return this;
    }

    public void id_class(ruu_3 ruu_32) {
        if (this.id_class == null) {
            ruu_32.writeBoolean(false);
        } else {
            ruu_32.writeBoolean(true);
            ruu_32.id_class(this.id_class);
        }
        if (this.id_byte == null) {
            ruu_32.writeBoolean(false);
        } else {
            ruu_32.writeBoolean(true);
            this.id_byte.id_class(ruu_32);
        }
        OK.id_class(this.id_throws, ruu_32);
        ruu_32.id_protected(this.id_case.length);
        for (String[] stringArray : this.id_case) {
            ruu_32.id_protected(stringArray.length);
            for (String string : stringArray) {
                ruu_32.id_class(string);
            }
        }
    }

    public static Ot_1 id_class(JsonObject jsonObject, rWl_1 rWl_12) {
        int n;
        rqO_2 rqO_22 = jsonObject.has("parent") ? new rqO_2(rpY_2.id_case(jsonObject, "parent")) : null;
        OU oU = jsonObject.has("display") ? OU.id_class(rpY_2.id_native(jsonObject, "display")) : null;
        Og_1 og_1 = jsonObject.has("rewards") ? Og_1.id_class(rpY_2.id_native(jsonObject, "rewards")) : Og_1.id_class;
        Map<String, OK> map = OK.id_break(rpY_2.id_native(jsonObject, "criteria"), rWl_12);
        if (map.isEmpty()) {
            throw new JsonSyntaxException("Advancement criteria cannot be empty");
        }
        JsonArray jsonArray = rpY_2.id_class(jsonObject, "requirements", new JsonArray());
        String[][] stringArray = new String[jsonArray.size()][];
        for (n = 0; n < jsonArray.size(); ++n) {
            JsonArray jsonArray2 = rpY_2.id_implements(jsonArray.get(n), "requirements[" + n + "]");
            stringArray[n] = new String[jsonArray2.size()];
            for (int i = 0; i < jsonArray2.size(); ++i) {
                stringArray[n][i] = rpY_2.id_class(jsonArray2.get(i), "requirements[" + n + "][" + i + "]");
            }
        }
        if (stringArray.length == 0) {
            stringArray = new String[map.size()][];
            n = 0;
            for (String string : map.keySet()) {
                stringArray[n++] = new String[]{string};
            }
        }
        for (String[] stringArray2 : stringArray) {
            if (stringArray2.length == 0 && map.isEmpty()) {
                throw new JsonSyntaxException("Requirement entry cannot be empty");
            }
            String[] stringArray3 = stringArray2;
            int n2 = stringArray3.length;
            for (int i = 0; i < n2; ++i) {
                String string = stringArray3[i];
                if (map.containsKey(string)) continue;
                throw new JsonSyntaxException("Unknown required criterion '" + string + "'");
            }
        }
        for (String string : map.keySet()) {
            int n3 = 0;
            for (String string2 : stringArray) {
                if (!ArrayUtils.contains((Object[])string2, (Object)string)) continue;
                n3 = 1;
                break;
            }
            if (n3 != 0) continue;
            throw new JsonSyntaxException("Criterion '" + string + "' isn't a requirement for completion. This isn't supported behaviour, all criteria must be required.");
        }
        return new Ot_1(rqO_22, oU, og_1, map, stringArray);
    }

    public Ot_1 id_class(String string, OK oK) {
        if (this.id_throws.containsKey(string)) {
            throw new IllegalArgumentException("Duplicate criterion " + string);
        }
        this.id_throws.put(string, oK);
        return this;
    }

    public Ot_1 id_class(OU oU) {
        this.id_byte = oU;
        return this;
    }

    public Ot_1 id_class(rpL_2 rpL_22, rgP_2 rgP_22, rgP_2 rgP_23, rqO_2 rqO_22, Oe_1 oe_1, boolean bl, boolean bl2, boolean bl3) {
        return this.id_class(new OU(new rdn_3(rpL_22.id_case()), rgP_22, rgP_23, rqO_22, oe_1, bl, bl2, bl3));
    }

    public Ot_1 id_class(rdn_3 rdn_32, rgP_2 rgP_22, rgP_2 rgP_23, rqO_2 rqO_22, Oe_1 oe_1, boolean bl, boolean bl2, boolean bl3) {
        return this.id_class(new OU(rdn_32, rgP_22, rgP_23, rqO_22, oe_1, bl, bl2, bl3));
    }

    public Ot_1 id_class(rqO_2 rqO_22) {
        this.id_class = rqO_22;
        return this;
    }

    public Ot_1 id_class(OT oT) {
        this.id_break = oT;
        return this;
    }

    public Ot_1 id_class(Og_1 og_1) {
        this.id_protected = og_1;
        return this;
    }

    public Ot_1 id_class(OR oR) {
        return this.id_class(oR.id_class());
    }

    public Ot_1 id_class(String string, hr_3 hr_32) {
        return this.id_class(string, new OK(hr_32));
    }

    public JsonObject id_break() {
        if (this.id_case == null) {
            this.id_case = this.id_catch.createRequirements(this.id_throws.keySet());
        }
        JsonObject jsonObject = new JsonObject();
        if (this.id_break != null) {
            jsonObject.addProperty("parent", this.id_break.id_private().toString());
        } else if (this.id_class != null) {
            jsonObject.addProperty("parent", this.id_class.toString());
        }
        if (this.id_byte != null) {
            jsonObject.add("display", this.id_byte.id_extends());
        }
        jsonObject.add("rewards", this.id_protected.id_class());
        JsonObject jsonObject2 = new JsonObject();
        for (Map.Entry<String, OK> stringArray : this.id_throws.entrySet()) {
            jsonObject2.add(stringArray.getKey(), stringArray.getValue().id_break());
        }
        jsonObject.add("criteria", (JsonElement)jsonObject2);
        JsonArray jsonArray = new JsonArray();
        for (String[] stringArray : this.id_case) {
            JsonArray jsonArray2 = new JsonArray();
            for (String string : stringArray) {
                jsonArray2.add(string);
            }
            jsonArray.add((JsonElement)jsonArray2);
        }
        jsonObject.add("requirements", (JsonElement)jsonArray);
        return jsonObject;
    }

    public static Ot_1 id_break(ruu_3 ruu_32) {
        rqO_2 rqO_22 = ruu_32.readBoolean() ? ruu_32.id_volatile() : null;
        OU oU = ruu_32.readBoolean() ? OU.id_break(ruu_32) : null;
        Map<String, OK> map = OK.id_byte(ruu_32);
        String[][] stringArray = new String[ruu_32.id_case()][];
        for (int i = 0; i < stringArray.length; ++i) {
            stringArray[i] = new String[ruu_32.id_case()];
            for (int j = 0; j < stringArray[i].length; ++j) {
                stringArray[i][j] = ruu_32.id_throws(Short.MAX_VALUE);
            }
        }
        return new Ot_1(rqO_22, oU, Og_1.id_class, map, stringArray);
    }

    public OT id_break(rqO_2 rqO_23) {
        if (!this.id_class((rqO_2 rqO_22) -> null)) {
            throw new IllegalStateException("Tried to build incomplete advancement!");
        }
        if (this.id_case == null) {
            this.id_case = this.id_catch.createRequirements(this.id_throws.keySet());
        }
        return new OT(rqO_23, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case);
    }
}

