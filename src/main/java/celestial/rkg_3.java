/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSyntaxException
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntComparators
 *  it.unimi.dsi.fastutil.ints.IntList
 */
package celestial;

import celestial.rVL;
import celestial.rWr_1;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rkR_2;
import celestial.rkY_2;
import celestial.rko_3;
import celestial.rlZ_2;
import celestial.rlb_3;
import celestial.rpL_2;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.ruu_3;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparators;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public final class rkg_3
implements Predicate<rdn_3> {
    public static final rkg_3 id_class = new rkg_3(Stream.empty());
    private final rkR_2[] id_break;
    private rdn_3[] id_byte;
    private IntList id_protected;

    public JsonElement id_byte() {
        if (this.id_break.length == 1) {
            return this.id_break[0].id_break();
        }
        JsonArray jsonArray = new JsonArray();
        for (rkR_2 rkR_22 : this.id_break) {
            jsonArray.add((JsonElement)rkR_22.id_break());
        }
        return jsonArray;
    }

    private rkg_3(Stream<? extends rkR_2> stream) {
        this.id_break = (rkR_2[])stream.toArray(rkR_2[]::new);
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rdn_3)object);
    }

    private static rkR_2 id_class(JsonObject jsonObject) {
        if (jsonObject.has("item") && jsonObject.has("tag")) {
            throw new JsonParseException("An ingredient entry is either a tag or an item, not both");
        }
        if (jsonObject.has("item")) {
            rqO_2 rqO_22 = new rqO_2(rpY_2.id_case(jsonObject, "item"));
            rdb_3 rdb_32 = rVL.id_for.id_break(rqO_22).orElseThrow(() -> new JsonSyntaxException("Unknown item '" + rqO_22 + "'"));
            return new rkY_2(new rdn_3(rdb_32));
        }
        if (jsonObject.has("tag")) {
            rqO_2 rqO_23 = new rqO_2(rpY_2.id_case(jsonObject, "tag"));
            rlb_3<rdb_3> rlb_32 = rlZ_2.id_class().id_break().id_class(rqO_23);
            if (rlb_32 == null) {
                throw new JsonSyntaxException("Unknown item tag '" + rqO_23 + "'");
            }
            return new rko_3(rlb_32);
        }
        throw new JsonParseException("An ingredient entry needs either a tag or an item");
    }

    public static rkg_3 id_class(JsonElement jsonElement2) {
        if (jsonElement2 != null && !jsonElement2.isJsonNull()) {
            if (jsonElement2.isJsonObject()) {
                return rkg_3.id_break(Stream.of(rkg_3.id_class(jsonElement2.getAsJsonObject())));
            }
            if (jsonElement2.isJsonArray()) {
                JsonArray jsonArray = jsonElement2.getAsJsonArray();
                if (jsonArray.size() == 0) {
                    throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
                }
                return rkg_3.id_break(StreamSupport.stream(jsonArray.spliterator(), false).map(jsonElement -> rkg_3.id_class(rpY_2.id_private(jsonElement, "item"))));
            }
            throw new JsonSyntaxException("Expected item to be object or array of objects");
        }
        throw new JsonSyntaxException("Item cannot be null");
    }

    public boolean id_class(rdn_3 rdn_32) {
        if (rdn_32 == null) {
            return false;
        }
        this.id_throws();
        if (this.id_byte.length == 0) {
            return rdn_32.id_class();
        }
        for (rdn_3 rdn_33 : this.id_byte) {
            if (rdn_33.id_break() != rdn_32.id_break()) continue;
            return true;
        }
        return false;
    }

    public rdn_3[] id_class() {
        this.id_throws();
        return this.id_byte;
    }

    public void id_class(ruu_3 ruu_32) {
        this.id_throws();
        ruu_32.id_protected(this.id_byte.length);
        for (int i = 0; i < this.id_byte.length; ++i) {
            ruu_32.id_class(this.id_byte[i]);
        }
    }

    public static rkg_3 id_class(rpL_2 ... rpL_2Array) {
        return rkg_3.id_class(Arrays.stream(rpL_2Array).map(rdn_3::new));
    }

    public static rkg_3 id_class(rdn_3 ... rdn_3Array) {
        return rkg_3.id_class(Arrays.stream(rdn_3Array));
    }

    public static rkg_3 id_class(rlb_3<rdb_3> rlb_32) {
        return rkg_3.id_break(Stream.of(new rko_3(rlb_32)));
    }

    public static rkg_3 id_class(Stream<rdn_3> stream) {
        return rkg_3.id_break(stream.filter(rdn_32 -> !rdn_32.id_class()).map(rdn_32 -> new rkY_2((rdn_3)rdn_32)));
    }

    public IntList id_break() {
        if (this.id_protected == null) {
            this.id_throws();
            this.id_protected = new IntArrayList(this.id_byte.length);
            for (rdn_3 rdn_32 : this.id_byte) {
                this.id_protected.add(rWr_1.id_byte(rdn_32));
            }
            this.id_protected.sort((Comparator)IntComparators.NATURAL_COMPARATOR);
        }
        return this.id_protected;
    }

    public static rkg_3 id_break(ruu_3 ruu_32) {
        int n = ruu_32.id_case();
        return rkg_3.id_break(Stream.generate(() -> new rkY_2(ruu_32.id_extends())).limit(n));
    }

    private static rkg_3 id_break(Stream<? extends rkR_2> stream) {
        rkg_3 rkg_32 = new rkg_3(stream);
        return rkg_32.id_break.length == 0 ? id_class : rkg_32;
    }

    private void id_throws() {
        if (this.id_byte == null) {
            this.id_byte = (rdn_3[])Arrays.stream(this.id_break).flatMap(rkR_22 -> rkR_22.id_class().stream()).distinct().toArray(rdn_3[]::new);
        }
    }

    public boolean id_protected() {
        return !(this.id_break.length != 0 || this.id_byte != null && this.id_byte.length != 0 || this.id_protected != null && !this.id_protected.isEmpty());
    }
}

