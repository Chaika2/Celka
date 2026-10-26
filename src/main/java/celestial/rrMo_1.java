/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  it.unimi.dsi.fastutil.objects.ObjectList
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.Tr_1;
import celestial.WI;
import celestial.aI_2;
import celestial.jG_2;
import celestial.jS_2;
import celestial.jW_2;
import celestial.jz_3;
import celestial.pV_2;
import celestial.pg_3;
import celestial.qd_3;
import celestial.rqO_2;
import celestial.rrMD;
import celestial.rrMK;
import celestial.rrMU;
import celestial.rrMY;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrWQ;
import celestial.rrXJ;
import celestial.rrXx_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.ryW_2;
import celestial.tm_3;
import celestial.wp_3;
import celestial.xc_3;
import celestial.xd_3;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class rrMo_1 {
    private static boolean id_class = false;
    private static Map<aI_2, pV_2> id_break = null;
    private static Map<ryW_2, jW_2> id_byte = null;
    private static Map<WI, In_1> id_protected = null;
    private static List<ryW_2> id_throws = new ArrayList<ryW_2>();

    private static Map<aI_2, pV_2> id_byte() {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        Map<aI_2, pV_2> map = pg_32.id_throws();
        if (map == null) {
            return null;
        }
        if (id_break == null) {
            id_break = new HashMap<aI_2, pV_2>(map);
        }
        return map;
    }

    private static boolean id_class(rrMi_1 rrMi_12, In_1 in_1, rrMU rrMU2, rrXJ rrXJ2) {
        Iq_1[] iq_1Array;
        String string = rrMU2.id_break();
        Iq_1 iq_1 = rrMi_12.id_class(in_1, string);
        if (iq_1 == null) {
            rrbb_3.id_protected("Model part not found: " + string + ", model: " + in_1);
            return false;
        }
        if (!rrMU2.id_byte()) {
            if (iq_1.id_extends != null) {
                iq_1.id_extends.clear();
            }
            if (iq_1.id_volatile != null) {
                iq_1.id_volatile.clear();
            }
            if (iq_1.id_native != null) {
                iq_1Array = rrMi_12.id_class(in_1);
                Set set = Collections.newSetFromMap(new IdentityHashMap());
                set.addAll(Arrays.asList(iq_1Array));
                ObjectList<Iq_1> objectList = iq_1.id_native;
                Iterator iterator = objectList.iterator();
                while (iterator.hasNext()) {
                    Iq_1 iq_12 = (Iq_1)iterator.next();
                    if (set.contains(iq_12)) continue;
                    iterator.remove();
                }
            }
        }
        iq_1.id_break(rrMU2.id_class());
        iq_1Array = rrMU2.id_protected();
        if (iq_1Array != null) {
            rrXJ2.id_break(rrMU2.id_class());
            rrXJ2.id_class(iq_1);
            if (!iq_1Array.id_class(rrXJ2)) {
                return false;
            }
            rrMU2.id_class().id_class((rrXx_1)iq_1Array);
        }
        return true;
    }

    private static boolean id_class(rrMi_1 rrMi_12, In_1 in_1, rrMU[] rrMUArray, rrXJ rrXJ2) {
        for (int i = 0; i < rrMUArray.length; ++i) {
            rrMU rrMU2 = rrMUArray[i];
            if (rrMo_1.id_class(rrMi_12, in_1, rrMU2, rrXJ2)) continue;
            return false;
        }
        return true;
    }

    private static void id_class(rrMi_1 rrMi_12, In_1 in_1, rrMa_1 rrMa_12, rqO_2 rqO_22) {
        if (rrMa_12 instanceof qd_3) {
            rrMa_12.id_class(rqO_22);
        } else {
            String[] stringArray = rrMi_12.id_case();
            for (int i = 0; i < stringArray.length; ++i) {
                String string = stringArray[i];
                Iq_1 iq_1 = rrMi_12.id_class(in_1, string);
                if (iq_1 == null || iq_1.id_break() != null) continue;
                iq_1.id_class(rqO_22);
            }
        }
    }

    private static rrMa_1 id_class(rrMi_1 rrMi_12, rrMK rrMK2) {
        In_1 in_1;
        rqO_2 rqO_22 = rrMK2.id_byte();
        rrMU[] rrMUArray = rrMK2.id_protected();
        float f = rrMK2.id_throws();
        if (f < 0.0f) {
            f = rrMi_12.id_protected();
        }
        if ((in_1 = rrMi_12.id_throws()) == null) {
            return null;
        }
        rrXJ rrXJ2 = new rrXJ(rrMi_12, in_1, rrMUArray);
        if (!rrMo_1.id_class(rrMi_12, in_1, rrMUArray, rrXJ2)) {
            return null;
        }
        rrMa_1 rrMa_12 = rrMi_12.id_class(in_1, f);
        if (rrMa_12 == null) {
            throw new JsonParseException("Entity renderer is null, model: " + rrMi_12.id_break() + ", adapter: " + rrMi_12.getClass().getName());
        }
        if (rqO_22 != null) {
            rrMo_1.id_class(rrMi_12, in_1, rrMa_12, rqO_22);
        }
        return rrMa_12;
    }

    private static void id_class(Object object, String string) {
        if (object == null) {
            throw new JsonParseException(string);
        }
    }

    public static boolean id_class(xc_3 xc_32) {
        xd_3 xd_32 = xc_32.id_break();
        for (int i = 0; i < id_throws.size(); ++i) {
            ryW_2 ryW_22 = id_throws.get(i);
            if (!ryW_22.id_class(xd_32)) continue;
            return true;
        }
        return false;
    }

    private static rrMa_1 id_class(JsonObject jsonObject, String string) {
        rrMK rrMK2 = rrMY.id_class(jsonObject, string);
        String string2 = rrMK2.id_class();
        rrMi_1 rrMi_12 = rrMD.id_class(string2);
        rrMo_1.id_class((Object)rrMi_12, "Entity not found: " + string2);
        rrWQ<aI_2, ryW_2> rrWQ2 = rrMi_12.id_class();
        rrMo_1.id_class(rrWQ2, "Entity type not found: " + string2);
        rrMa_1 rrMa_12 = rrMo_1.id_class(rrMi_12, rrMK2);
        if (rrMa_12 == null) {
            return null;
        }
        rrMa_12.id_class(rrWQ2);
        return rrMa_12;
    }

    private static void id_class(tm_3 tm_32) {
        tm_3 tm_33 = (tm_3)rrxr_3.SO.id_byte();
        if (tm_33 != null && tm_32 != null) {
            if (!rrxr_3.St.id_protected()) {
                return;
            }
            if (!rrxr_3.Sw.id_protected()) {
                return;
            }
            int n = rrxr_3.St.id_byte();
            for (int i = 0; i < n; ++i) {
                Iq_1 iq_1 = (Iq_1)rrxr_3.St.id_class(tm_32, i);
                rrxr_3.St.id_class(tm_33, i, iq_1);
            }
            List list = (List)rrxr_3.Sw.id_class(tm_32);
            rrxr_3.Sw.id_class(tm_33, list);
            tm_33.id_return = tm_32.id_return;
            tm_33.id_public = tm_32.id_public;
        }
    }

    private static rrMa_1 id_class(rqO_2 rqO_22) {
        try {
            JsonObject jsonObject = rrMY.id_class(rqO_22);
            return rrMo_1.id_class(jsonObject, rqO_22.id_break());
        }
        catch (IOException iOException) {
            rrbb_3.id_throws(iOException.getClass().getName() + ": " + iOException.getMessage());
            return null;
        }
        catch (JsonParseException jsonParseException) {
            rrbb_3.id_throws(((Object)((Object)jsonParseException)).getClass().getName() + ": " + jsonParseException.getMessage());
            return null;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static void id_class() {
        Map<aI_2, pV_2> map = rrMo_1.id_byte();
        Map<ryW_2, jW_2> map2 = rrMo_1.id_protected();
        Map<WI, In_1> map3 = rrMo_1.id_throws();
        if (map == null) {
            rrbb_3.id_protected("Entity render map not found, custom entity models are DISABLED.");
        } else if (map2 == null) {
            rrbb_3.id_protected("Tile entity render map not found, custom entity models are DISABLED.");
        } else {
            id_class = false;
            map.clear();
            map2.clear();
            map3.clear();
            id_throws.clear();
            map.putAll(id_break);
            map2.putAll(id_byte);
            map3.putAll(id_protected);
            jG_2.id_class.id_break = new wp_3();
            rrMo_1.id_class(new tm_3());
            if (rrbb_3.rC()) {
                rqO_2[] rqO_2Array = rrMo_1.id_case();
                for (int i = 0; i < rqO_2Array.length; ++i) {
                    rqO_2 rqO_22 = rqO_2Array[i];
                    rrbb_3.id_byte("CustomEntityModel: " + rqO_22.id_break());
                    rrMa_1 rrMa_12 = rrMo_1.id_class(rqO_22);
                    if (rrMa_12 == null) continue;
                    rrWQ<aI_2, ryW_2> rrWQ2 = rrMa_12.id_byte();
                    if (rrMa_12 instanceof pV_2) {
                        map.put(rrWQ2.id_class().get(), (pV_2)rrMa_12);
                        if (rrMa_12 instanceof Tr_1 && (var9_9 = (wp_3)rrxr_3.id_class(var8_8 = (Tr_1)rrMa_12, rrxr_3.Gs)) != null) {
                            jG_2.id_class.id_break = var9_9;
                        }
                    } else if (rrMa_12 instanceof jW_2) {
                        map2.put(rrWQ2.id_break().get(), (jW_2)rrMa_12);
                        if (rrMa_12 instanceof jS_2) {
                            var8_8 = (jS_2)rrMa_12;
                            var9_9 = (tm_3)rrxr_3.id_class(var8_8, rrxr_3.GF);
                            rrMo_1.id_class((tm_3)var9_9);
                        }
                        id_throws.add(rrWQ2.id_break().get());
                    } else {
                        rrbb_3.id_protected("Unknown renderer type: " + rrMa_12.getClass().getName());
                    }
                    id_class = true;
                }
            }
        }
    }

    public static boolean id_break() {
        return id_class;
    }

    private static Map<WI, In_1> id_throws() {
        HashMap hashMap = (HashMap)rrxr_3.Gp.id_byte();
        if (hashMap == null) {
            rrbb_3.id_protected("Field not found: TileEntitySkullRenderer.MODELS");
            hashMap = new HashMap();
        }
        if (id_protected == null) {
            id_protected = new HashMap<WI, In_1>(hashMap);
        }
        return hashMap;
    }

    private static rqO_2[] id_case() {
        String string = "optifine/cem/";
        String string2 = ".jem";
        ArrayList<rqO_2> arrayList = new ArrayList<rqO_2>();
        String[] stringArray = rrMD.id_class();
        for (int i = 0; i < stringArray.length; ++i) {
            String string3 = stringArray[i];
            String string4 = string + string3 + string2;
            rqO_2 rqO_22 = new rqO_2(string4);
            if (!rrbb_3.id_byte(rqO_22)) continue;
            arrayList.add(rqO_22);
        }
        return arrayList.toArray(new rqO_2[arrayList.size()]);
    }

    private static Map<ryW_2, jW_2> id_protected() {
        Map<ryW_2, jW_2> map = jz_3.id_break.id_class;
        if (id_byte == null) {
            id_byte = new HashMap<ryW_2, jW_2>(map);
        }
        return map;
    }
}

