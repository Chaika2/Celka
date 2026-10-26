/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;

public interface rAZ {
    public static final rAZ id_class = rAZ.id_class();
    public static final rAZ id_break = rAZ.id_class("pack.source.builtin");
    public static final rAZ id_byte = rAZ.id_class("pack.source.world");
    public static final rAZ id_protected = rAZ.id_class("pack.source.server");

    public static rAZ id_class(String string) {
        rgn_3 rgn_32 = new rgn_3(string);
        return rgP_23 -> new rgn_3("pack.nameAndSource", rgP_23, rgn_32).id_class(rgF_2.GRAY);
    }

    public static rAZ id_class() {
        return rgP_22 -> rgP_22;
    }

    public rgP_2 decorate(rgP_2 var1);
}

