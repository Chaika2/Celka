/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rDM;
import celestial.rDX;
import celestial.rDk_1;
import celestial.rUV;
import celestial.rVy_1;

public class rDO {
    public static final rDM<rUV> id_class = rDO.id_class("cave", rDk_1.id_class.id_class(new rUV(0.14285715f)));
    public static final rDM<rUV> id_break = rDO.id_class("canyon", rDk_1.id_byte.id_class(new rUV(0.02f)));
    public static final rDM<rUV> id_byte = rDO.id_class("ocean_cave", rDk_1.id_class.id_class(new rUV(0.06666667f)));
    public static final rDM<rUV> id_protected = rDO.id_class("underwater_canyon", rDk_1.id_protected.id_class(new rUV(0.02f)));
    public static final rDM<rUV> id_throws = rDO.id_class("underwater_cave", rDk_1.id_throws.id_class(new rUV(0.06666667f)));
    public static final rDM<rUV> id_case = rDO.id_class("nether_cave", rDk_1.id_break.id_class(new rUV(0.2f)));

    private static <WC extends rDX> rDM<WC> id_class(String string, rDM<WC> rDM2) {
        return rVy_1.id_class(rVy_1.id_protected, string, rDM2);
    }
}

