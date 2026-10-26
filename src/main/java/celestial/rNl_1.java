/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNB;
import celestial.rNC;
import celestial.rNF;
import celestial.rNK;
import celestial.rNL;
import celestial.rNQ;
import celestial.rNU;
import celestial.rNX;
import celestial.rNY;
import celestial.rNZ;
import celestial.rNa_1;
import celestial.rNg_1;
import celestial.rNj_1;
import celestial.rNk_1;
import celestial.rNp_1;
import celestial.rNr_1;
import celestial.rNu_1;
import celestial.rNw_1;
import celestial.rQU;
import celestial.rVL;
import celestial.rWY;
import celestial.rcE_2;
import celestial.rcS_2;
import celestial.rcr_3;
import celestial.rdn_3;
import celestial.rqO_2;
import celestial.rzr_3;
import celestial.rzx_3;
import celestial.rzy_3;
import java.util.function.BiFunction;

public class rNl_1 {
    public static final BiFunction<rdn_3, rzr_3, rdn_3> id_class = (rdn_32, rzr_32) -> rdn_32;
    public static final rzx_3 id_break = rNl_1.id_class("set_count", new rNg_1());
    public static final rzx_3 id_byte = rNl_1.id_class("enchant_with_levels", new rNQ());
    public static final rzx_3 id_protected = rNl_1.id_class("enchant_randomly", new rNk_1());
    public static final rzx_3 id_throws = rNl_1.id_class("set_nbt", new rNa_1());
    public static final rzx_3 id_case = rNl_1.id_class("furnace_smelt", new rcE_2());
    public static final rzx_3 id_catch = rNl_1.id_class("looting_enchant", new rNp_1());
    public static final rzx_3 id_private = rNl_1.id_class("set_damage", new rNY());
    public static final rzx_3 id_implements = rNl_1.id_class("set_attributes", new rNw_1());
    public static final rzx_3 id_finally = rNl_1.id_class("set_name", new rcr_3());
    public static final rzx_3 id_extends = rNl_1.id_class("exploration_map", new rNu_1());
    public static final rzx_3 id_native = rNl_1.id_class("set_stew_effect", new rcS_2());
    public static final rzx_3 id_volatile = rNl_1.id_class("copy_name", new rNB());
    public static final rzx_3 id_final = rNl_1.id_class("set_contents", new rNj_1());
    public static final rzx_3 id_package = rNl_1.id_class("limit_count", new rNC());
    public static final rzx_3 id_int = rNl_1.id_class("apply_bonus", new rQU());
    public static final rzx_3 id_new = rNl_1.id_class("set_loot_table", new rNK());
    public static final rzx_3 id_continue = rNl_1.id_class("explosion_decay", new rNZ());
    public static final rzx_3 id_super = rNl_1.id_class("set_lore", new rNU());
    public static final rzx_3 id_this = rNl_1.id_class("fill_player_head", new rNF());
    public static final rzx_3 id_else = rNl_1.id_class("copy_nbt", new rNX());
    public static final rzx_3 id_synchronized = rNl_1.id_class("copy_state", new rNr_1());

    private static rzx_3 id_class(String string, rWY<? extends rNL> rWY2) {
        return rVL.id_class(rVL.N, new rqO_2(string), new rzx_3(rWY2));
    }

    public static BiFunction<rdn_3, rzr_3, rdn_3> id_class(BiFunction<rdn_3, rzr_3, rdn_3>[] biFunctionArray) {
        switch (biFunctionArray.length) {
            case 0: {
                return id_class;
            }
            case 1: {
                return biFunctionArray[0];
            }
            case 2: {
                BiFunction<rdn_3, rzr_3, rdn_3> biFunction = biFunctionArray[0];
                BiFunction<rdn_3, rzr_3, rdn_3> biFunction2 = biFunctionArray[1];
                return (rdn_32, rzr_32) -> (rdn_3)biFunction2.apply((rdn_3)biFunction.apply((rdn_3)rdn_32, (rzr_3)rzr_32), (rzr_3)rzr_32);
            }
        }
        return (rdn_32, rzr_32) -> {
            for (BiFunction biFunction : biFunctionArray) {
                rdn_32 = (rdn_3)biFunction.apply(rdn_32, rzr_32);
            }
            return rdn_32;
        };
    }

    public static Object id_class() {
        return rzy_3.id_class(rVL.N, "function", "function", rNL::id_break).id_class();
    }
}

