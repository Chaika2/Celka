/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rRH {
    private static int[] id_class = new int[65536];

    public static void id_class(int[] nArray) {
        id_class = nArray;
    }

    public static int id_class(double d, double d2) {
        int n = (int)((1.0 - (d2 *= d)) * 255.0);
        int n2 = (int)((1.0 - d) * 255.0);
        int n3 = n << 8 | n2;
        return n3 > id_class.length ? -65281 : id_class[n3];
    }
}

