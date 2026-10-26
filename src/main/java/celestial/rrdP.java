/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.rrMz_1;
import celestial.rrbb_3;
import celestial.rrdT;
import celestial.rrdZ;
import celestial.rrxi_3;
import celestial.rrxr_3;
import celestial.rrzE_2;
import celestial.rrzX_2;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class rrdP {
    private static int[] id_class = null;
    private static boolean id_break;

    private static void id_class(InputStream inputStream, String string, List<Integer> list) {
        if (inputStream != null) {
            try {
                inputStream = rrdT.id_class(inputStream, string, true);
                rrzE_2 rrzE_22 = new rrzE_2();
                rrzE_22.load(inputStream);
                inputStream.close();
                rrbb_3.id_byte("[Shaders] Parsing item mappings: " + string);
                rrMz_1 rrMz_12 = new rrMz_1("Shaders");
                for (String string2 : ((Properties)rrzE_22).keySet()) {
                    String string3 = rrzE_22.getProperty(string2);
                    String string4 = "item.";
                    if (!string2.startsWith(string4)) {
                        rrbb_3.id_protected("[Shaders] Invalid item ID: " + string2);
                        continue;
                    }
                    String string5 = rrzX_2.id_protected(string2, string4);
                    int n = rrbb_3.id_class(string5, -1);
                    if (n < 0) {
                        rrbb_3.id_protected("[Shaders] Invalid item alias ID: " + n);
                        continue;
                    }
                    int[] nArray = rrMz_12.id_package(string3);
                    if (nArray != null && nArray.length >= 1) {
                        for (int i = 0; i < nArray.length; ++i) {
                            int n2 = nArray[i];
                            rrdP.id_class(list, n2, n);
                        }
                        continue;
                    }
                    rrbb_3.id_protected("[Shaders] Invalid item ID mapping: " + string2 + "=" + string3);
                }
            }
            catch (IOException iOException) {
                rrbb_3.id_protected("[Shaders] Error reading: " + string);
            }
        }
    }

    private static int[] id_class(List<Integer> list) {
        int[] nArray = new int[list.size()];
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = list.get(i);
        }
        return nArray;
    }

    private static void id_class(List<Integer> list, int n, int n2) {
        while (list.size() <= n) {
            list.add(-1);
        }
        list.set(n, n2);
    }

    public static void id_class() {
        if (id_break) {
            id_break = false;
            rrdP.id_class(rrdZ.id_protected());
        }
    }

    public static void id_class(rrxi_3 rrxi_32) {
        rrdP.id_break();
        if (rrxi_32 != null) {
            if (rrxr_3.Bx.id_byte() && QY.id_instanceof().F() == null) {
                rrbb_3.id_byte("[Shaders] Delayed loading of item mappings after resources are loaded");
                id_break = true;
            } else {
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                String string = "/shaders/item.properties";
                InputStream inputStream = rrxi_32.id_class(string);
                if (inputStream != null) {
                    rrdP.id_class(inputStream, string, arrayList);
                }
                if (arrayList.size() > 0) {
                    id_class = rrdP.id_class(arrayList);
                }
            }
        }
    }

    public static int id_class(int n) {
        if (id_class == null) {
            return -1;
        }
        return n >= 0 && n < id_class.length ? id_class[n] : -1;
    }

    public static void id_break() {
        id_class = null;
    }
}

