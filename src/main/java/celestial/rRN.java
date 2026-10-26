/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rRN {
    private static int[] id_class = new int[65536];

    public static int id_byte() {
        return 4764952;
    }

    public static int id_class() {
        return 0x619961;
    }

    public static void id_class(int[] nArray) {
        id_class = nArray;
    }

    public static int id_class(double d, double d2) {
        int n = (int)((1.0 - d) * 255.0);
        int n2 = (int)((1.0 - (d2 *= d)) * 255.0);
        return id_class[n2 << 8 | n];
    }

    public static int id_break() {
        return 8431445;
    }
}

