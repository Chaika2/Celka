/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVL;
import celestial.rWQ;
import celestial.rWW;
import celestial.rWu_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rkA_2;
import celestial.rkC_2;
import celestial.rkT_2;
import celestial.rkV_2;
import celestial.rkt_3;
import celestial.rkw_3;
import celestial.rqO_2;
import java.util.Optional;

public interface rkj_3<T extends rkw_3<?>> {
    public static final rkj_3<rkt_3> id_class = rkj_3.id_class("crafting");
    public static final rkj_3<rkT_2> id_break = rkj_3.id_class("smelting");
    public static final rkj_3<rkA_2> id_byte = rkj_3.id_class("blasting");
    public static final rkj_3<rWQ> id_protected = rkj_3.id_class("smoking");
    public static final rkj_3<rkC_2> id_throws = rkj_3.id_class("campfire_cooking");
    public static final rkj_3<rWu_1> id_case = rkj_3.id_class("stonecutting");
    public static final rkj_3<rWW> id_catch = rkj_3.id_class("smithing");

    default public <C extends rXu_1> Optional<T> id_class(rkw_3<C> rkw_32, rYB rYB2, C c) {
        return rkw_32.id_class(c, rYB2) ? Optional.of(rkw_32) : Optional.empty();
    }

    public static <T extends rkw_3<?>> rkj_3<T> id_class(String string) {
        return rVL.id_class(rVL.b, new rqO_2(string), new rkV_2(string));
    }
}

