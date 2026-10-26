/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.rVL;
import celestial.rXk_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rkt_3;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rqs_3;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class rWb_1
implements rkt_3 {
    public final int id_class;
    public final int id_break;
    public final rqs_3<rkg_3> id_byte;
    public final rdn_3 id_protected;
    private final rqO_2 id_throws;
    public final String id_case;

    @Override
    public rdn_3 id_byte() {
        return this.id_protected;
    }

    public rWb_1(rqO_2 rqO_22, String string, int n, int n2, rqs_3<rkg_3> rqs_32, rdn_3 rdn_32) {
        this.id_throws = rqO_22;
        this.id_case = string;
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = rqs_32;
        this.id_protected = rdn_32;
    }

    @Override
    public rdn_3 id_class(rXk_1 rXk_12) {
        return this.id_byte().id_implements();
    }

    public static String[] id_class(JsonArray jsonArray) {
        String[] stringArray = new String[jsonArray.size()];
        if (stringArray.length > 3) {
            throw new JsonSyntaxException("Invalid pattern: too many rows, 3 is maximum");
        }
        if (stringArray.length == 0) {
            throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
        }
        for (int i = 0; i < stringArray.length; ++i) {
            String string = rpY_2.id_class(jsonArray.get(i), "pattern[" + i + "]");
            if (string.length() > 3) {
                throw new JsonSyntaxException("Invalid pattern: too many columns, 3 is maximum");
            }
            if (i > 0 && stringArray[0].length() != string.length()) {
                throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
            }
            stringArray[i] = string;
        }
        return stringArray;
    }

    public static rdn_3 id_class(JsonObject jsonObject) {
        String string = rpY_2.id_case(jsonObject, "item");
        rdb_3 rdb_32 = rVL.id_for.id_break(new rqO_2(string)).orElseThrow(() -> new JsonSyntaxException("Unknown item '" + string + "'"));
        if (jsonObject.has("data")) {
            throw new JsonParseException("Disallowed data tag found");
        }
        int n = rpY_2.id_class(jsonObject, "count", 1);
        return new rdn_3(rdb_32, n);
    }

    public static String[] id_class(String ... stringArray) {
        int n = Integer.MAX_VALUE;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            n = Math.min(n, rWb_1.id_class(string));
            int n5 = rWb_1.id_break(string);
            n2 = Math.max(n2, n5);
            if (n5 < 0) {
                if (n3 == i) {
                    ++n3;
                }
                ++n4;
                continue;
            }
            n4 = 0;
        }
        if (stringArray.length == n4) {
            return new String[0];
        }
        String[] stringArray2 = new String[stringArray.length - n4 - n3];
        for (int i = 0; i < stringArray2.length; ++i) {
            stringArray2[i] = stringArray[i + n3].substring(n, n2 + 1);
        }
        return stringArray2;
    }

    private static int id_class(String string) {
        int n;
        for (n = 0; n < string.length() && string.charAt(n) == ' '; ++n) {
        }
        return n;
    }

    public static rqs_3<rkg_3> id_class(String[] stringArray, Map<String, rkg_3> map, int n, int n2) {
        rqs_3<rkg_3> rqs_32 = rqs_3.id_class(n * n2, rkg_3.id_class);
        HashSet hashSet = Sets.newHashSet(map.keySet());
        hashSet.remove(" ");
        for (int i = 0; i < stringArray.length; ++i) {
            for (int j = 0; j < stringArray[i].length(); ++j) {
                String string = stringArray[i].substring(j, j + 1);
                rkg_3 rkg_32 = map.get(string);
                if (rkg_32 == null) {
                    throw new JsonSyntaxException("Pattern references symbol '" + string + "' but it's not defined in the key");
                }
                hashSet.remove(string);
                rqs_32.set(j + n * i, rkg_32);
            }
        }
        if (!hashSet.isEmpty()) {
            throw new JsonSyntaxException("Key defines symbols that aren't used in pattern: " + hashSet);
        }
        return rqs_32;
    }

    @Override
    public rqs_3<rkg_3> id_class() {
        return this.id_byte;
    }

    private boolean id_class(rXk_1 rXk_12, int n, int n2, boolean bl) {
        for (int i = 0; i < rXk_12.id_protected(); ++i) {
            for (int j = 0; j < rXk_12.id_byte(); ++j) {
                int n3 = i - n;
                int n4 = j - n2;
                rkg_3 rkg_32 = rkg_3.id_class;
                if (n3 >= 0 && n4 >= 0 && n3 < this.id_class && n4 < this.id_break) {
                    rkg_32 = bl ? this.id_byte.get(this.id_class - n3 - 1 + n4 * this.id_class) : this.id_byte.get(n3 + n4 * this.id_class);
                }
                if (rkg_32.id_class(rXk_12.id_extends(i + j * rXk_12.id_protected()))) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean id_class(rXk_1 rXk_12, rYB rYB2) {
        for (int i = 0; i <= rXk_12.id_protected() - this.id_class; ++i) {
            for (int j = 0; j <= rXk_12.id_byte() - this.id_break; ++j) {
                if (this.id_class(rXk_12, i, j, true)) {
                    return true;
                }
                if (!this.id_class(rXk_12, i, j, false)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean id_class(int n, int n2) {
        return n >= this.id_class && n2 >= this.id_break;
    }

    private static int id_break(String string) {
        int n;
        for (n = string.length() - 1; n >= 0 && string.charAt(n) == ' '; --n) {
        }
        return n;
    }

    public static Map<String, rkg_3> id_break(JsonObject jsonObject) {
        HashMap hashMap = Maps.newHashMap();
        for (Map.Entry entry : jsonObject.entrySet()) {
            if (((String)entry.getKey()).length() != 1) {
                throw new JsonSyntaxException("Invalid key entry: '" + (String)entry.getKey() + "' is an invalid symbol (must be 1 character only).");
            }
            if (" ".equals(entry.getKey())) {
                throw new JsonSyntaxException("Invalid key entry: ' ' is a reserved symbol.");
            }
            hashMap.put((String)entry.getKey(), rkg_3.id_class((JsonElement)entry.getValue()));
        }
        hashMap.put(" ", rkg_3.id_class);
        return hashMap;
    }

    public int id_throws() {
        return this.id_class;
    }

    public int id_finally() {
        return this.id_break;
    }

    @Override
    public rqO_2 id_case() {
        return this.id_throws;
    }

    @Override
    public String id_protected() {
        return this.id_case;
    }

    @Override
    public rkf_3<?> W_() {
        return rkf_3.id_class;
    }
}

