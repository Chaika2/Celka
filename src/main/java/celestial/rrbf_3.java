/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.fY_2;
import celestial.ff_3;
import celestial.rYB;
import celestial.rqO_2;
import celestial.rrbb_3;
import celestial.rrbj_3;
import celestial.rrdX;
import celestial.rrdZ;
import celestial.rrxh_3;
import celestial.rrzE_2;
import celestial.rrzJ_2;
import celestial.rrzX_2;
import celestial.rrzc_3;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class rrbf_3 {
    private static rrbj_3[][] id_class = null;

    private static rrbj_3[][] id_byte() {
        String string;
        int n;
        rrbj_3[][] rrbj_3Array = new rrbj_3[10][0];
        String string2 = "optifine/sky/world";
        int n2 = -1;
        for (n = 0; n < rrbj_3Array.length; ++n) {
            string = string2 + n;
            ArrayList<rrbj_3> arrayList = new ArrayList<rrbj_3>();
            for (int i = 0; i < 1000; ++i) {
                String string3 = string + "/sky" + i + ".properties";
                int n3 = 0;
                try {
                    rqO_2 rqO_22 = new rqO_2(string3);
                    InputStream inputStream = rrbb_3.id_class(rqO_22);
                    if (inputStream == null && ++n3 > 10) break;
                    rrzE_2 rrzE_22 = new rrzE_2();
                    rrzE_22.load(inputStream);
                    inputStream.close();
                    rrbb_3.id_byte("CustomSky properties: " + string3);
                    String string4 = i + ".png";
                    rrbj_3 rrbj_32 = new rrbj_3(rrzE_22, string4);
                    if (!rrbj_32.id_class(string3)) continue;
                    String string5 = rrzX_2.id_case(rrbj_32.id_class, ".png");
                    rqO_2 rqO_23 = new rqO_2(string5);
                    ff_3 ff_32 = rrzJ_2.id_class(rqO_23);
                    if (ff_32 == null) {
                        rrbb_3.id_case("CustomSky: Texture not found: " + rqO_23);
                        continue;
                    }
                    rrbj_32.id_protected = ff_32.id_new();
                    arrayList.add(rrbj_32);
                    inputStream.close();
                    continue;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    if (++n3 <= 10) continue;
                    break;
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
            if (arrayList.size() <= 0) continue;
            rrbj_3[] rrbj_3Array2 = arrayList.toArray(new rrbj_3[arrayList.size()]);
            rrbj_3Array[n] = rrbj_3Array2;
            n2 = n;
        }
        if (n2 < 0) {
            return null;
        }
        n = n2 + 1;
        string = new rrbj_3[n][0];
        for (int i = 0; i < ((rrbj_3[][])string).length; ++i) {
            string[i] = rrbj_3Array[i];
        }
        return string;
    }

    public static boolean id_class(rYB rYB2) {
        if (id_class == null) {
            return false;
        }
        int n = rrzc_3.id_class(rYB2);
        if (n >= 0 && n < id_class.length) {
            rrbj_3[] rrbj_3Array = id_class[n];
            if (rrbj_3Array == null) {
                return false;
            }
            return rrbj_3Array.length > 0;
        }
        return false;
    }

    public static void id_class(rYB rYB2, fY_2 fY_22, Ml_1 ml_1, float f) {
        if (id_class != null) {
            rrbj_3[] rrbj_3Array;
            int n;
            if (rrbb_3.rs()) {
                rrdZ.id_class(rrdX.CUSTOM_SKY);
            }
            if ((n = rrzc_3.id_class(rYB2)) >= 0 && n < id_class.length && (rrbj_3Array = id_class[n]) != null) {
                long l = rYB2.P();
                int n2 = (int)(l % 24000L);
                float f2 = rYB2.id_protected(f);
                float f3 = rYB2.id_private(f);
                float f4 = rYB2.id_case(f);
                if (f3 > 0.0f) {
                    f4 /= f3;
                }
                for (int i = 0; i < rrbj_3Array.length; ++i) {
                    rrbj_3 rrbj_32 = rrbj_3Array[i];
                    if (!rrbj_32.id_class(rYB2, n2)) continue;
                    rrbj_32.id_class(rYB2, ml_1, n2, f2, f3, f4);
                }
                float f5 = 1.0f - f3;
                rrxh_3.id_class(f5);
            }
        }
    }

    public static void id_class() {
        id_class = null;
    }

    public static void id_break() {
        rrbf_3.id_class();
        if (rrbb_3.D()) {
            id_class = rrbf_3.id_byte();
        }
    }
}

