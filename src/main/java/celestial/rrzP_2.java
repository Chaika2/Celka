/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rrzP_2 {
    public static float id_class(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static int id_class(int n, int n2) {
        int n3 = n % n2;
        if (n3 < 0) {
            n3 += n2;
        }
        return n3;
    }
}

