/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;

public class rFa_1 {
    public static final char[] id_class = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static int id_byte(byte[] byArray, int n, int n2) {
        return 0 > n2 - n - 4 ? 0 : byArray[n] << 24 | (byArray[n + 1] & 0xFF) << 16 | (byArray[n + 2] & 0xFF) << 8 | byArray[n + 3] & 0xFF;
    }

    public static String id_class(byte by) {
        return "" + id_class[(by & 0xF0) >>> 4] + id_class[by & 0xF];
    }

    public static String id_class(byte[] byArray, int n, int n2) {
        int n3;
        int n4 = n2 - 1;
        int n5 = n3 = n > n4 ? n4 : n;
        while (0 != byArray[n3] && n3 < n4) {
            ++n3;
        }
        return new String(byArray, n, n3 - n, StandardCharsets.UTF_8);
    }

    public static int id_class(byte[] byArray, int n) {
        return rFa_1.id_break(byArray, n, byArray.length);
    }

    public static int id_break(byte[] byArray, int n, int n2) {
        return 0 > n2 - n - 4 ? 0 : byArray[n + 3] << 24 | (byArray[n + 2] & 0xFF) << 16 | (byArray[n + 1] & 0xFF) << 8 | byArray[n] & 0xFF;
    }
}

