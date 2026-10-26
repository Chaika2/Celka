/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgc_3;

public class ZO {
    public final rgc_3 id_class;
    public final String id_break;
    public final rgP_2 id_byte;
    public final int id_protected;
    public final int id_throws;

    public ZO(rgc_3 rgc_32, String string, int n, int n2) {
        this.id_class = rgc_32;
        this.id_break = string;
        this.id_protected = n;
        this.id_throws = n2;
        this.id_byte = new rgN_2(string).id_class(rgc_32);
    }
}

