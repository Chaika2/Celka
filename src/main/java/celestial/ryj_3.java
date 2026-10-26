/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class ryj_3 {
    public static int id_byte(int n) {
        return n >> 8 & 0xFF;
    }

    public static int id_class(int n, int n2) {
        return ryj_3.id_class(ryj_3.id_class(n) * ryj_3.id_class(n2) / 255, ryj_3.id_break(n) * ryj_3.id_break(n2) / 255, ryj_3.id_byte(n) * ryj_3.id_byte(n2) / 255, ryj_3.id_protected(n) * ryj_3.id_protected(n2) / 255);
    }

    public static int id_class(int n) {
        return n >>> 24;
    }

    public static int id_class(int n, int n2, int n3, int n4) {
        return n << 24 | n2 << 16 | n3 << 8 | n4;
    }

    public static int id_break(int n) {
        return n >> 16 & 0xFF;
    }

    public static int id_protected(int n) {
        return n & 0xFF;
    }
}

