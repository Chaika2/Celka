/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rch_3;

public class rcJ_2 {
    public static final rch_3[] id_class = new rch_3[256];

    static {
        for (int i = 0; i < id_class.length; ++i) {
            rcJ_2.id_class[i] = new rch_3((byte)(i - 128));
        }
    }
}

