/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package celestial;

import celestial.fN_2;
import celestial.fc_3;
import celestial.rAF;
import celestial.rAL;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rrWv_1;
import celestial.uc_3;
import celestial.um_3;
import celestial.uu_3;
import celestial.uv_3;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class uZ_2
implements uu_3 {
    private rqO_2 id_class;
    private final List<int[]> id_break;
    private final int id_byte;
    private final int id_protected;

    public uZ_2(rqO_2 rqO_22, int n, int n2, List<int[]> list) {
        this.id_class = new rqO_2(rqO_22.id_byte(), "textures/" + rqO_22.id_break());
        this.id_class = rrWv_1.id_break(this.id_class);
        this.id_break = list;
        this.id_byte = n;
        this.id_protected = n2;
    }

    private int id_class(fN_2 fN_22, int n, int n2, int n3, int n4) {
        int n5;
        for (n5 = n - 1; n5 >= 0; --n5) {
            int n6 = n3 * n + n5;
            for (int i = 0; i < n2; ++i) {
                int n7 = n4 * n2 + i;
                if ((fN_22.id_break(n6, n7) & 0xFF) <= 16) continue;
                return n5 + 1;
            }
        }
        return n5 + 1;
    }

    @Override
    public uc_3 id_class(rAL rAL2) {
        um_3 um_32;
        block14: {
            rAF rAF2 = rAL2.id_class(this.id_class);
            try {
                fN_2 fN_22 = fN_2.id_class(fc_3.RGBA, rAF2.id_break());
                int n = fN_22.id_class();
                int n2 = fN_22.id_break();
                int n3 = n / this.id_break.get(0).length;
                int n4 = n2 / this.id_break.size();
                float f = (float)this.id_byte / (float)n4;
                Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap();
                Properties properties = rrWv_1.id_class(this.id_class);
                Int2ObjectMap<Float> int2ObjectMap = rrWv_1.id_class(properties);
                Float f2 = (Float)int2ObjectMap.get(32);
                boolean bl = rrWv_1.id_class(properties, "blend", false);
                float f3 = rrWv_1.id_class(properties, "offsetBold", -1.0f);
                if (f3 < 0.0f) {
                    f3 = n3 > 8 ? 0.5f : 1.0f;
                }
                for (int i = 0; i < this.id_break.size(); ++i) {
                    int n5 = 0;
                    for (int n6 : this.id_break.get(i)) {
                        uv_3 uv_32;
                        int n7 = n5++;
                        if (n6 == 0 || n6 == 32) continue;
                        float f4 = this.id_class(fN_22, n3, n4, n7, i);
                        Float f5 = (Float)int2ObjectMap.get(n6);
                        if (f5 != null) {
                            f4 = f5.floatValue() * ((float)n3 / 8.0f);
                        }
                        if ((uv_32 = (uv_3)int2ObjectOpenHashMap.put(n6, (Object)new uv_3(f, fN_22, n7 * n3, i * n4, n3, n4, (int)(0.5 + (double)(f4 * f)) + 1, this.id_protected))) != null) {
                            um_3.id_class.warn("Codepoint '{}' declared multiple times in {}", (Object)Integer.toHexString(n6), (Object)this.id_class);
                        }
                        uv_3 uv_33 = (uv_3)int2ObjectOpenHashMap.get(n6);
                        uv_33.id_implements = f3;
                    }
                }
                um_3 um_33 = new um_3(fN_22, (Int2ObjectMap<uv_3>)int2ObjectOpenHashMap);
                um_33.id_protected = bl;
                if (f2 != null) {
                    um_33.id_throws = f2.floatValue();
                }
                um_32 = um_33;
                if (rAF2 == null) break block14;
            }
            catch (Throwable throwable) {
                try {
                    if (rAF2 != null) {
                        try {
                            rAF2.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    throw new RuntimeException(iOException.getMessage());
                }
            }
            rAF2.close();
        }
        return um_32;
    }

    public static uZ_2 id_class(JsonObject jsonObject) {
        int n = rpY_2.id_class(jsonObject, "height", 8);
        int n2 = rpY_2.id_extends(jsonObject, "ascent");
        if (n2 > n) {
            throw new JsonParseException("Ascent " + n2 + " higher than height " + n);
        }
        ArrayList arrayList = Lists.newArrayList();
        JsonArray jsonArray = rpY_2.id_volatile(jsonObject, "chars");
        for (int i = 0; i < jsonArray.size(); ++i) {
            int n3;
            String string = rpY_2.id_class(jsonArray.get(i), "chars[" + i + "]");
            int[] nArray = string.codePoints().toArray();
            if (i > 0 && nArray.length != (n3 = ((int[])arrayList.get(0)).length)) {
                throw new JsonParseException("Elements of chars have to be the same length (found: " + nArray.length + ", expected: " + n3 + "), pad with space or \\u0000");
            }
            arrayList.add(nArray);
        }
        if (!arrayList.isEmpty() && ((int[])arrayList.get(0)).length != 0) {
            return new uZ_2(new rqO_2(rpY_2.id_case(jsonObject, "file")), n, n2, arrayList);
        }
        throw new JsonParseException("Expected to find data in chars, found none.");
    }
}

