/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.cb_3;
import celestial.gm_3;
import celestial.iB_2;
import celestial.rEJ;
import celestial.rEO;
import celestial.rEa_1;
import celestial.rXQ;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhL_2;
import celestial.rhd_3;
import celestial.rqO_2;
import celestial.rrML;
import celestial.rrMc_1;
import celestial.rrMv_1;
import celestial.rrMz_1;
import celestial.rrbR_2;
import celestial.rrbV_2;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.rrzE_2;
import celestial.rsE_2;
import celestial.rsX_2;
import celestial.rut_3;
import celestial.rxJ_2;
import celestial.xd_3;
import celestial.xu_3;
import celestial.yX_2;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class rrbg_3 {
    private static rrbR_2 id_class = new rrbR_2();
    private static Map<String, Integer> id_break = new HashMap<String, Integer>();
    private static Map<rdb_3, Integer> id_byte = new HashMap<rdb_3, Integer>();
    private static long id_protected = 0L;
    private static final double id_throws = 7.5;
    private static final double id_case = 56.25;
    private static final int id_catch = 15;
    private static final int id_private = 15;
    private static final int id_implements = 10;
    private static final int id_finally = 8;
    private static final int id_extends = 13;
    private static final int id_native = 8;
    private static final int id_volatile = 8;
    private static final rut_3<rdn_3> id_final = (rut_3)rrxr_3.SE.id_byte();
    private static boolean id_package;

    private static void id_byte() {
        id_package = true;
        id_break.clear();
        id_byte.clear();
        if (id_break.size() > 0) {
            rrbb_3.id_byte("DynamicLights entities: " + id_break.size());
        }
    }

    private static void id_byte(yX_2 yX_22) {
        gm_3 gm_32 = yX_22.id_this();
        if (gm_32 != null) {
            for (an_3 an_32 : gm_32.id_byte()) {
                rrbV_2 rrbV_22;
                int n;
                int n2 = rrbg_3.id_class(an_32);
                if (n2 > 0) {
                    n = an_32.V();
                    rrbV_22 = id_class.id_class(n);
                    if (rrbV_22 != null) continue;
                    rrbV_22 = new rrbV_2(an_32);
                    id_class.id_class(n, rrbV_22);
                    continue;
                }
                n = an_32.V();
                rrbV_22 = id_class.id_break(n);
                if (rrbV_22 == null) continue;
                rrbV_22.id_break(yX_22);
            }
        }
    }

    public static int id_class(an_3 an_32) {
        Object object;
        Object object2;
        if (an_32 == rrbb_3.X().id_catch() && !rrbb_3.rn()) {
            return 0;
        }
        if (an_32 instanceof rhd_3 && ((rhd_3)(object2 = (rhd_3)an_32)).id_native()) {
            return 0;
        }
        if (an_32.Pz()) {
            return 15;
        }
        if (!id_break.isEmpty() && (object = id_break.get(object2 = rrMc_1.id_class(an_32))) != null) {
            return (Integer)object;
        }
        if (an_32 instanceof rhL_2) {
            return 15;
        }
        if (an_32 instanceof rsX_2) {
            return 15;
        }
        if (an_32 instanceof rEO) {
            object2 = (rEO)an_32;
            return ((rEO)object2).Pz() ? 15 : 10;
        }
        if (an_32 instanceof rEa_1) {
            object2 = (rEa_1)an_32;
            return (double)((rEa_1)object2).id_break > 0.6 ? 13 : 8;
        }
        if (an_32 instanceof rEJ && (double)((rEJ)(object2 = (rEJ)an_32)).id_throw(0.0f) > 0.001) {
            return 15;
        }
        if (an_32 instanceof iB_2) {
            object2 = (iB_2)an_32;
            object = ((iB_2)object2).ss();
            int n = rrbg_3.id_class((rdn_3)object);
            rdn_3 rdn_32 = ((iB_2)object2).Sn();
            int n2 = rrbg_3.id_class(rdn_32);
            rdn_3 rdn_33 = ((iB_2)object2).id_class(rXQ.HEAD);
            int n3 = rrbg_3.id_class(rdn_33);
            int n4 = Math.max(n, n2);
            return Math.max(n4, n3);
        }
        if (an_32 instanceof rsE_2) {
            object2 = (rsE_2)an_32;
            object = rrbg_3.id_class((rsE_2)object2);
            return rrbg_3.id_class((rdn_3)object);
        }
        return 0;
    }

    public static int id_class(rdn_3 rdn_32) {
        Object object;
        xd_3 xd_32;
        if (rdn_32 == null) {
            return 0;
        }
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rdb_32 instanceof rxJ_2 && (xd_32 = ((rxJ_2)(object = (rxJ_2)rdb_32)).id_catch()) != null) {
            return xd_32.id_continue().id_case();
        }
        if (rdb_32 == rdy_3.hY) {
            return xu_3.id_instanceof.id_continue().id_case();
        }
        if (rdb_32 != rdy_3.JZ && rdb_32 != rdy_3.JH) {
            if (rdb_32 == rdy_3.XW) {
                return 8;
            }
            if (rdb_32 == rdy_3.dn) {
                return 8;
            }
            if (rdb_32 == rdy_3.Jy) {
                return 8;
            }
            if (rdb_32 == rdy_3.dQ) {
                return xu_3.Sv.id_continue().id_case() / 2;
            }
            if (!id_byte.isEmpty() && (object = id_byte.get(rdb_32)) != null) {
                return (Integer)object;
            }
            return 0;
        }
        return 10;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static double id_class(rfH_2 rfH_22) {
        double d = 0.0;
        rrbR_2 rrbR_22 = id_class;
        synchronized (rrbR_22) {
            List<rrbV_2> list = id_class.id_byte();
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                double d2;
                double d3;
                double d4;
                double d5;
                double d6;
                rrbV_2 rrbV_22 = list.get(i);
                int n2 = rrbV_22.id_throws();
                if (n2 <= 0) continue;
                double d7 = rrbV_22.id_break();
                double d8 = rrbV_22.id_byte();
                double d9 = rrbV_22.id_protected();
                double d10 = (double)rfH_22.b_() - d7;
                double d11 = d10 * d10 + (d6 = (double)rfH_22.c_() - d8) * d6 + (d5 = (double)rfH_22.d_() - d9) * d5;
                if (d11 > 56.25 || !((d4 = (d3 = 1.0 - (d2 = Math.sqrt(d11)) / 7.5) * (double)n2) > d)) continue;
                d = d4;
            }
        }
        return rrbb_3.id_class(d, 0.0, 15.0);
    }

    public static int id_class(double d, int n) {
        int n2;
        int n3;
        if (d > 0.0 && (n3 = (int)(d * 16.0)) > (n2 = n & 0xFF)) {
            n &= 0xFFFFFF00;
            n |= n3;
        }
        return n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void id_class() {
        rrbR_2 rrbR_22 = id_class;
        synchronized (rrbR_22) {
            id_class.id_break();
        }
    }

    public static rdn_3 id_class(rsE_2 rsE_22) {
        return rsE_22.BQ().id_class(id_final);
    }

    public static int id_class(an_3 an_32, int n) {
        double d = rrbg_3.id_class(an_32.Bs());
        if (an_32 == (cb_3)rrbb_3.X().id_class[57]) {
            double d2 = rrbg_3.id_class(an_32);
            d = Math.max(d, d2);
        }
        return rrbg_3.id_class(d, n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void id_class(yX_2 yX_22) {
        long l = System.currentTimeMillis();
        if (l >= id_protected + 50L) {
            id_protected = l;
            if (!id_package) {
                rrbg_3.id_byte();
            }
            rrbR_2 rrbR_22 = id_class;
            synchronized (rrbR_22) {
                rrbg_3.id_byte(yX_22);
                if (id_class.id_class() > 0) {
                    List<rrbV_2> list = id_class.id_byte();
                    for (int i = 0; i < list.size(); ++i) {
                        rrbV_2 rrbV_22 = list.get(i);
                        rrbV_22.id_class(yX_22);
                    }
                }
            }
        }
    }

    private static void id_class(InputStream inputStream, String string, String string2) {
        if (inputStream != null) {
            try {
                rrzE_2 rrzE_22 = new rrzE_2();
                rrzE_22.load(inputStream);
                inputStream.close();
                rrbb_3.id_byte("DynamicLights: Parsing " + string);
                rrMz_1 rrMz_12 = new rrMz_1("DynamicLights");
                rrbg_3.id_class(rrzE_22.getProperty("entities"), id_break, new rrMc_1(), rrMz_12, string, string2);
                rrbg_3.id_class(rrzE_22.getProperty("items"), id_byte, new rrML(), rrMz_12, string, string2);
            }
            catch (IOException iOException) {
                rrbb_3.id_protected("DynamicLights: Error reading " + string);
            }
        }
    }

    private static <T> void id_class(String string, Map<T, Integer> map, rrMv_1<T> rrMv_12, rrMz_1 rrMz_12, String string2, String string3) {
        if (string != null) {
            String[] stringArray = rrbb_3.id_class(string, " ");
            for (int i = 0; i < stringArray.length; ++i) {
                String string4 = stringArray[i];
                String[] stringArray2 = rrbb_3.id_class(string4, ":");
                if (stringArray2.length != 2) {
                    rrMz_12.id_extends("Invalid entry: " + string4 + ", in:" + string2);
                    continue;
                }
                String string5 = stringArray2[0];
                String string6 = stringArray2[1];
                String string7 = string3 + ":" + string5;
                rqO_2 rqO_22 = new rqO_2(string7);
                T t = rrMv_12.id_break(rqO_22);
                if (t == null) {
                    rrMz_12.id_extends("Object not found: " + string7);
                    continue;
                }
                int n = rrMz_12.id_class(string6, -1);
                if (n >= 0 && n <= 15) {
                    map.put(t, n);
                    continue;
                }
                rrMz_12.id_extends("Invalid light level: " + string4);
            }
        }
    }

    public static void id_class(an_3 an_32, yX_2 yX_22) {
    }

    public static int id_class(rfH_2 rfH_22, int n) {
        double d = rrbg_3.id_class(rfH_22);
        return rrbg_3.id_class(d, n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void id_break(yX_2 yX_22) {
        rrbR_2 rrbR_22 = id_class;
        synchronized (rrbR_22) {
            List<rrbV_2> list = id_class.id_byte();
            for (int i = 0; i < list.size(); ++i) {
                rrbV_2 rrbV_22 = list.get(i);
                rrbV_22.id_break(yX_22);
            }
            id_class.id_break();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int id_break() {
        rrbR_2 rrbR_22 = id_class;
        synchronized (rrbR_22) {
            return id_class.id_class();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void id_break(an_3 an_32, yX_2 yX_22) {
        rrbR_2 rrbR_22 = id_class;
        synchronized (rrbR_22) {
            rrbV_2 rrbV_22 = id_class.id_break(an_32.V());
            if (rrbV_22 != null) {
                rrbV_22.id_break(yX_22);
            }
        }
    }
}

