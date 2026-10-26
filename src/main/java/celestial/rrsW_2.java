/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rVL;
import celestial.rrsJ_2;
import celestial.rrsX_2;
import celestial.rrsd_3;
import celestial.rrsk_3;
import celestial.rrsx_3;
import celestial.rrsz_3;
import com.mojang.serialization.Codec;

public class rrsW_2<P extends rrsk_3> {
    public static final rrsW_2<rrsz_3> id_class = rrsW_2.id_class("trunk_vine", rrsz_3.id_class);
    public static final rrsW_2<rrsd_3> id_break = rrsW_2.id_class("leave_vine", rrsd_3.id_class);
    public static final rrsW_2<rrsx_3> id_byte = rrsW_2.id_class("cocoa", rrsx_3.id_class);
    public static final rrsW_2<rrsJ_2> id_protected = rrsW_2.id_class("beehive", rrsJ_2.id_class);
    public static final rrsW_2<rrsX_2> id_throws = rrsW_2.id_class("alter_ground", rrsX_2.id_class);
    private final Codec<P> id_case;

    private rrsW_2(Codec<P> codec) {
        this.id_case = codec;
    }

    private static <P extends rrsk_3> rrsW_2<P> id_class(String string, Codec<P> codec) {
        return rVL.id_class(rVL.rS, string, new rrsW_2<P>(codec));
    }

    public Codec<P> id_class() {
        return this.id_case;
    }
}

