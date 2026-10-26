/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.cG_2;
import celestial.cb_3;
import celestial.gm_3;
import celestial.iB_2;
import celestial.jz_3;
import celestial.rOh_1;
import celestial.rOi_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rmE_2;
import celestial.rqO_2;
import celestial.rrMG;
import celestial.rrMO;
import celestial.rrMb_1;
import celestial.rrbD_2;
import celestial.rrbb_3;
import celestial.rrxb_3;
import celestial.rrzE_2;
import celestial.rrzM_2;
import celestial.rrzX_2;
import celestial.ryO_2;
import celestial.yX_2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;

public class rrME {
    private static Map<String, rrMb_1> id_private = new HashMap<String, rrMb_1>();
    private static boolean id_implements = false;
    private static yX_2 id_finally;
    private static rrMG id_extends;
    private static jz_3 id_native;
    private static rrMO id_volatile;
    private static boolean id_final;
    public static final String id_class = ".png";
    public static final String id_break = ".properties";
    public static final String id_byte = "textures/entity/";
    public static final String id_protected = "textures/painting/";
    public static final String id_throws = "textures/";
    public static final String id_case = "optifine/random/";
    public static final String id_catch = "optifine/mob/";
    private static final String[] id_package;
    private static final String id_int = "horse/";
    private static final String[] id_new;
    private static final String[] id_continue;

    private static String id_byte(String string) {
        if (string.startsWith(id_case)) {
            return rrzX_2.id_break(string, id_case, id_throws);
        }
        return string.startsWith(id_catch) ? rrzX_2.id_break(string, id_catch, id_byte) : null;
    }

    private static void id_byte() {
        id_finally = rrbb_3.z();
        id_native = jz_3.id_break;
        String[] stringArray = new String[]{id_case, id_catch};
        String[] stringArray2 = new String[]{id_class, id_break};
        String[] stringArray3 = rrzM_2.id_class(stringArray, stringArray2);
        HashSet<String> hashSet = new HashSet<String>();
        for (int i = 0; i < stringArray3.length; ++i) {
            rrMb_1 rrMb_12;
            Object object = stringArray3[i];
            object = rrzX_2.id_byte((String)object, stringArray2);
            object = rrzX_2.id_finally((String)object, "0123456789");
            String string = rrME.id_byte((String)(object = (String)object + id_class));
            if (hashSet.contains(string)) continue;
            hashSet.add(string);
            rqO_2 rqO_22 = new rqO_2(string);
            if (!rrbb_3.id_byte(rqO_22) || (rrMb_12 = id_private.get(string)) != null) continue;
            rrMb_12 = rrME.id_break(rqO_22, false);
            if (rrMb_12 == null) {
                rrMb_12 = rrME.id_break(rqO_22, true);
            }
            if (rrMb_12 == null) continue;
            id_private.put(string, rrMb_12);
        }
        id_implements = !id_private.isEmpty();
    }

    private static rqO_2 id_byte(rqO_2 rqO_22, boolean bl) {
        String string;
        String string2;
        String string3;
        rqO_2 rqO_23 = rrME.id_class(rqO_22, bl);
        if (rqO_23 == null) {
            return null;
        }
        String string4 = rqO_23.id_byte();
        rqO_2 rqO_24 = new rqO_2(string4, string3 = (string2 = rrzX_2.id_throws(string = rqO_23.id_break(), id_class)) + id_break);
        if (rrbb_3.id_byte(rqO_24)) {
            return rqO_24;
        }
        String string5 = rrME.id_protected(string2);
        if (string5 == null) {
            return null;
        }
        rqO_2 rqO_25 = new rqO_2(string4, string5 + id_break);
        return rrbb_3.id_byte(rqO_25) ? rqO_25 : null;
    }

    static {
        id_extends = new rrMG();
        id_volatile = new rrMO();
        id_final = false;
        id_package = new String[]{"_armor", "_eyes", "_exploding", "_shooting", "_fur", "_eyes", "_invulnerable", "_angry", "_tame", "_collar"};
        id_new = (String[])rrxb_3.id_class(null, rOi_1.class, String[].class, 0);
        id_continue = (String[])rrxb_3.id_class(null, rOi_1.class, String[].class, 1);
    }

    public static void id_class(rYB rYB2, rYB rYB3) {
        if (rYB3 instanceof gm_3) {
            gm_3 gm_32 = (gm_3)rYB3;
            for (an_3 an_32 : gm_32.id_byte()) {
                rrME.id_class(an_32, rYB3);
            }
        }
        id_extends.id_class(null);
        id_volatile.id_class(null);
    }

    protected static rqO_2 id_class(rqO_2 rqO_22, boolean bl) {
        String string = rqO_22.id_byte();
        String string2 = rqO_22.id_break();
        String string3 = id_throws;
        String string4 = id_case;
        if (bl) {
            string3 = id_byte;
            string4 = id_catch;
        }
        if (!string2.startsWith(string3)) {
            return null;
        }
        String string5 = rrzX_2.id_break(string2, string3, string4);
        return new rqO_2(string, string5);
    }

    private static void id_class(rOh_1 rOh_12, boolean bl) {
        iB_2 iB_22 = rOh_12.sF();
        if (iB_22 == null) {
            iB_22 = (cb_3)rrbb_3.X().id_class[57];
        }
        if (iB_22 instanceof cG_2) {
            cG_2 cG_22 = (cG_2)iB_22;
            UUID uUID = rOh_12.ro();
            if (bl) {
                rcd_3 rcd_32;
                rcd_3 rcd_33 = cG_22.sQ();
                if (rcd_33 != null && rcd_33.id_throws("UUID") && rrbb_3.id_class((Object)rcd_33.id_class("UUID"), (Object)uUID)) {
                    rOh_1 rOh_13 = rOh_12;
                    cG_22.id_class[9] = rOh_13;
                }
                if ((rcd_32 = cG_22.sJ()) != null && rcd_32.id_throws("UUID") && rrbb_3.id_class((Object)rcd_32.id_class("UUID"), (Object)uUID)) {
                    rOh_1 rOh_14 = rOh_12;
                    cG_22.id_class[10] = rOh_14;
                }
            } else {
                rmE_2 rmE_22;
                rmE_2 rmE_23 = rOh_12.BQ();
                if ((rOh_1)cG_22.id_class[9] != null && rrbb_3.id_class((Object)((rOh_1)cG_22.id_class[9]).ro(), (Object)uUID)) {
                    rmE_22 = ((rOh_1)cG_22.id_class[9]).BQ();
                    rmE_23.id_break = rmE_22.id_break;
                    rmE_23.id_class = rmE_22.id_class;
                    Object var13_11 = null;
                    cG_22.id_class[9] = var13_11;
                }
                if ((rOh_1)cG_22.id_class[10] != null && rrbb_3.id_class((Object)((rOh_1)cG_22.id_class[10]).ro(), (Object)uUID)) {
                    rmE_22 = ((rOh_1)cG_22.id_class[10]).BQ();
                    rmE_23.id_break = rmE_22.id_break;
                    rmE_23.id_class = rmE_22.id_class;
                    Object var14_12 = null;
                    cG_22.id_class[10] = var14_12;
                }
            }
        }
    }

    protected static rqO_2 id_class(rqO_2 rqO_22, int n) {
        if (rqO_22 == null) {
            return null;
        }
        String string = rqO_22.id_break();
        int n2 = string.lastIndexOf(46);
        if (n2 < 0) {
            return null;
        }
        String string2 = string.substring(0, n2);
        String string3 = string.substring(n2);
        String string4 = string2 + n + string3;
        return new rqO_2(rqO_22.id_byte(), string4);
    }

    public static void id_class(an_3 an_32, rYB rYB2) {
        if (rYB2 != null) {
            rmE_2 rmE_22 = an_32.BQ();
            rmE_22.id_break = an_32.Bs();
            rmE_22.id_class = rYB2.id_implements(rmE_22.id_break);
            if (an_32 instanceof rOh_1) {
                rOh_1 rOh_12 = (rOh_1)an_32;
                rrME.id_class(rOh_12, false);
            }
        }
    }

    public static void id_class(String string) {
        rrbb_3.id_byte("RandomEntities: " + string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static rqO_2 id_class(rqO_2 rqO_22) {
        rqO_2 rqO_23;
        if (!id_implements) {
            return rqO_22;
        }
        if (id_final) {
            return rqO_22;
        }
        try {
            id_final = true;
            rrbD_2 rrbD_22 = rrME.id_class();
            if (rrbD_22 != null) {
                String string = rqO_22.id_break();
                if (string.startsWith(id_int)) {
                    string = rrME.id_class(string, id_int.length());
                }
                if (!string.startsWith(id_byte) && !string.startsWith(id_protected)) {
                    rqO_2 rqO_24 = rqO_22;
                    return rqO_24;
                }
                rrMb_1 rrMb_12 = id_private.get(string);
                if (rrMb_12 == null) {
                    rqO_2 rqO_25 = rqO_22;
                    return rqO_25;
                }
                rqO_2 rqO_26 = rrMb_12.id_class(rqO_22, rrbD_22);
                return rqO_26;
            }
            rqO_23 = rqO_22;
        }
        finally {
            id_final = false;
        }
        return rqO_23;
    }

    private static String id_class(String string, int n) {
        if (id_new != null && id_continue != null) {
            for (int i = 0; i < id_continue.length; ++i) {
                String string2 = id_continue[i];
                if (!string.startsWith(string2, n)) continue;
                return id_new[i];
            }
            return string;
        }
        return string;
    }

    public static rrbD_2 id_class() {
        if (rrME.id_finally.id_break != null) {
            id_extends.id_class(rrME.id_finally.id_break);
            return id_extends;
        }
        jz_3 jz_32 = id_native;
        if (jz_3.id_catch != null) {
            jz_32 = id_native;
            ryO_2 ryO_22 = jz_3.id_catch;
            if (ryO_22.id_while() != null) {
                id_volatile.id_class(ryO_22);
                return id_volatile;
            }
        }
        return null;
    }

    private static rrMb_1 id_class(rqO_2 rqO_22, rqO_2 rqO_23) {
        try {
            String string = rqO_22.id_break();
            rrME.id_class(rqO_23.id_break() + ", properties: " + string);
            InputStream inputStream = rrbb_3.id_class(rqO_22);
            if (inputStream == null) {
                rrME.id_break("Properties not found: " + string);
                return null;
            }
            rrzE_2 rrzE_22 = new rrzE_2();
            rrzE_22.load(inputStream);
            inputStream.close();
            rrMb_1 rrMb_12 = new rrMb_1(rrzE_22, string, rqO_23);
            return !rrMb_12.id_class(string) ? null : rrMb_12;
        }
        catch (FileNotFoundException fileNotFoundException) {
            rrME.id_break("File not found: " + rqO_23.id_break());
            return null;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    public static void id_break(an_3 an_32, rYB rYB2) {
        if (an_32 instanceof rOh_1) {
            rOh_1 rOh_12 = (rOh_1)an_32;
            rrME.id_class(rOh_12, true);
        }
    }

    public static void id_break(String string) {
        rrbb_3.id_protected("RandomEntities: " + string);
    }

    private static rrMb_1 id_break(rqO_2 rqO_22, boolean bl) {
        rqO_2[] rqO_2Array;
        String string = rqO_22.id_break();
        rqO_2 rqO_23 = rrME.id_byte(rqO_22, bl);
        if (rqO_23 != null && (rqO_2Array = rrME.id_class(rqO_23, rqO_22)) != null) {
            return rqO_2Array;
        }
        rqO_2Array = rrME.id_protected(rqO_22, bl);
        return rqO_2Array == null ? null : new rrMb_1(string, rqO_2Array);
    }

    public static void id_break() {
        id_private.clear();
        id_implements = false;
        if (rrbb_3.R()) {
            rrME.id_byte();
        }
    }

    private static rqO_2[] id_protected(rqO_2 rqO_22, boolean bl) {
        ArrayList<rqO_2> arrayList = new ArrayList<rqO_2>();
        arrayList.add(rqO_22);
        rqO_2 rqO_23 = rrME.id_class(rqO_22, bl);
        if (rqO_23 == null) {
            return null;
        }
        for (int i = 1; i < arrayList.size() + 10; ++i) {
            int n = i + 1;
            rqO_2 rqO_24 = rrME.id_class(rqO_23, n);
            if (!rrbb_3.id_byte(rqO_24)) continue;
            arrayList.add(rqO_24);
        }
        if (arrayList.size() <= 1) {
            return null;
        }
        rqO_2[] rqO_2Array = arrayList.toArray(new rqO_2[arrayList.size()]);
        rrME.id_class(rqO_22.id_break() + ", variants: " + rqO_2Array.length);
        return rqO_2Array;
    }

    private static String id_protected(String string) {
        for (int i = 0; i < id_package.length; ++i) {
            String string2 = id_package[i];
            if (!string.endsWith(string2)) continue;
            return rrzX_2.id_throws(string, string2);
        }
        return null;
    }
}

