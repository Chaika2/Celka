/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVi_1;
import celestial.rgP_2;
import celestial.rgn_3;

public class cN_2 {
    public static final rgP_2 id_class = new rgn_3("options.on");
    public static final rgP_2 id_break = new rgn_3("options.off");
    public static final rgP_2 id_byte = new rgn_3("gui.done");
    public static final rgP_2 id_protected = new rgn_3("gui.cancel");
    public static final rgP_2 id_throws = new rgn_3("gui.yes");
    public static final rgP_2 id_case = new rgn_3("gui.no");
    public static final rgP_2 id_catch = new rgn_3("gui.proceed");
    public static final rgP_2 id_private = new rgn_3("gui.back");
    public static final rgP_2 id_implements = new rgn_3("connect.failed");

    public static rgP_2 id_class(boolean bl) {
        return bl ? id_class : id_break;
    }

    public static rVi_1 id_class(rgP_2 rgP_22, boolean bl) {
        return new rgn_3(bl ? "options.on.composed" : "options.off.composed", rgP_22);
    }
}

