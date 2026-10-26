/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iD_2;
import celestial.iK_2;
import celestial.iR_2;
import celestial.iU_2;
import celestial.iV_2;
import celestial.iY_2;
import celestial.ia_3;
import celestial.ie_3;
import celestial.ig_3;
import celestial.ii_3;
import celestial.io_3;
import celestial.rVL;
import celestial.rqO_2;
import celestial.rrB_2;
import celestial.rrS_2;
import celestial.rrr_3;
import celestial.rrs_3;
import java.util.function.Supplier;

public class rrP_2<U extends rrr_3<?>> {
    public static final rrP_2<iV_2> id_class = rrP_2.id_class("dummy", iV_2::new);
    public static final rrP_2<rrs_3> id_break = rrP_2.id_class("nearest_items", rrs_3::new);
    public static final rrP_2<iD_2> id_byte = rrP_2.id_class("nearest_living_entities", iD_2::new);
    public static final rrP_2<iU_2> id_protected = rrP_2.id_class("nearest_players", iU_2::new);
    public static final rrP_2<iK_2> id_throws = rrP_2.id_class("nearest_bed", iK_2::new);
    public static final rrP_2<iY_2> id_case = rrP_2.id_class("hurt_by", iY_2::new);
    public static final rrP_2<rrS_2> id_catch = rrP_2.id_class("villager_hostiles", rrS_2::new);
    public static final rrP_2<rrB_2> id_private = rrP_2.id_class("villager_babies", rrB_2::new);
    public static final rrP_2<ii_3> id_implements = rrP_2.id_class("secondary_pois", ii_3::new);
    public static final rrP_2<ig_3> id_finally = rrP_2.id_class("golem_detected", ig_3::new);
    public static final rrP_2<ia_3> id_extends = rrP_2.id_class("piglin_specific_sensor", ia_3::new);
    public static final rrP_2<ie_3> id_native = rrP_2.id_class("piglin_brute_specific_sensor", ie_3::new);
    public static final rrP_2<iR_2> id_volatile = rrP_2.id_class("hoglin_specific_sensor", iR_2::new);
    public static final rrP_2<io_3> id_final = rrP_2.id_class("nearest_adult", io_3::new);
    private final Supplier<U> id_package;

    private rrP_2(Supplier<U> supplier) {
        this.id_package = supplier;
    }

    public U id_class() {
        return (U)((rrr_3)this.id_package.get());
    }

    private static <U extends rrr_3<?>> rrP_2<U> id_class(String string, Supplier<U> supplier) {
        return rVL.id_class(rVL.k, new rqO_2(string), new rrP_2<U>(supplier));
    }
}

