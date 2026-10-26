/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MT;
import celestial.rrbb_3;

public class rrxh_3 {
    public static final int id_class = 0;
    public static final int id_break = 1;
    public static final int id_byte = 2;
    public static final int id_protected = 3;
    public static final int id_throws = 4;
    public static final int id_case = 5;
    public static final int id_catch = 6;
    public static final int id_private = 7;
    public static final int id_implements = 8;
    public static final int id_finally = 1;

    public static void id_class(float f) {
        MT.id_protected();
        MT.id_package();
        MT.id_break(770, 1);
        MT.id_protected(1.0f, 1.0f, 1.0f, f);
    }

    public static void id_class(int n, float f) {
        switch (n) {
            case 0: {
                MT.id_protected();
                MT.id_package();
                MT.id_break(770, 771);
                MT.id_protected(1.0f, 1.0f, 1.0f, f);
                break;
            }
            case 1: {
                MT.id_protected();
                MT.id_package();
                MT.id_break(770, 1);
                MT.id_protected(1.0f, 1.0f, 1.0f, f);
                break;
            }
            case 2: {
                MT.id_protected();
                MT.id_package();
                MT.id_break(775, 0);
                MT.id_protected(f, f, f, 1.0f);
                break;
            }
            case 3: {
                MT.id_protected();
                MT.id_package();
                MT.id_break(774, 771);
                MT.id_protected(f, f, f, f);
                break;
            }
            case 4: {
                MT.id_protected();
                MT.id_package();
                MT.id_break(1, 1);
                MT.id_protected(f, f, f, 1.0f);
                break;
            }
            case 5: {
                MT.id_protected();
                MT.id_package();
                MT.id_break(0, 769);
                MT.id_protected(f, f, f, 1.0f);
                break;
            }
            case 6: {
                MT.id_protected();
                MT.id_package();
                MT.id_break(1, 769);
                MT.id_protected(f, f, f, 1.0f);
                break;
            }
            case 7: {
                MT.id_protected();
                MT.id_package();
                MT.id_break(774, 768);
                MT.id_protected(f, f, f, 1.0f);
                break;
            }
            case 8: {
                MT.id_throws();
                MT.id_final();
                MT.id_protected(1.0f, 1.0f, 1.0f, f);
            }
        }
        MT.id_import();
    }

    public static int id_class(String string) {
        if (string == null) {
            return 1;
        }
        if ((string = string.toLowerCase().trim()).equals("alpha")) {
            return 0;
        }
        if (string.equals("add")) {
            return 1;
        }
        if (string.equals("subtract")) {
            return 2;
        }
        if (string.equals("multiply")) {
            return 3;
        }
        if (string.equals("dodge")) {
            return 4;
        }
        if (string.equals("burn")) {
            return 5;
        }
        if (string.equals("screen")) {
            return 6;
        }
        if (string.equals("overlay")) {
            return 7;
        }
        if (string.equals("replace")) {
            return 8;
        }
        rrbb_3.id_protected("Unknown blend: " + string);
        return 1;
    }
}

