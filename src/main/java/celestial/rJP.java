/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJB;
import celestial.rJD;
import celestial.rJE;
import celestial.rJJ;
import celestial.rJK;
import celestial.rJL;
import celestial.rJO;
import celestial.rJV;
import celestial.rJa_1;
import celestial.rJf_1;
import celestial.rJo_1;
import celestial.rJp_1;
import celestial.rJr_1;
import celestial.rJs_1;
import celestial.rJv_1;
import celestial.rJz_1;
import celestial.rVL;
import celestial.rXI;
import celestial.rXR;
import celestial.rXT;
import celestial.rXe_1;
import celestial.rXf_1;
import celestial.rhz_3;

public class rJP<T extends rJr_1> {
    public static final rJP<rXe_1> id_class = rJP.id_class("generic_9x1", rXe_1::id_class);
    public static final rJP<rXe_1> id_break = rJP.id_class("generic_9x2", rXe_1::id_break);
    public static final rJP<rXe_1> id_byte = rJP.id_class("generic_9x3", rXe_1::id_byte);
    public static final rJP<rXe_1> id_protected = rJP.id_class("generic_9x4", rXe_1::id_protected);
    public static final rJP<rXe_1> id_throws = rJP.id_class("generic_9x5", rXe_1::id_throws);
    public static final rJP<rXe_1> id_case = rJP.id_class("generic_9x6", rXe_1::id_case);
    public static final rJP<rJs_1> id_catch = rJP.id_class("generic_3x3", rJs_1::new);
    public static final rJP<rJf_1> id_private = rJP.id_class("anvil", rJf_1::new);
    public static final rJP<rXT> id_implements = rJP.id_class("beacon", rXT::new);
    public static final rJP<rXI> id_finally = rJP.id_class("blast_furnace", rXI::new);
    public static final rJP<rXf_1> id_extends = rJP.id_class("brewing_stand", rXf_1::new);
    public static final rJP<rJa_1> id_native = rJP.id_class("crafting", rJa_1::new);
    public static final rJP<rJE> id_volatile = rJP.id_class("enchantment", rJE::new);
    public static final rJP<rJO> id_final = rJP.id_class("furnace", rJO::new);
    public static final rJP<rJJ> id_package = rJP.id_class("grindstone", rJJ::new);
    public static final rJP<rJz_1> id_int = rJP.id_class("hopper", rJz_1::new);
    public static final rJP<rJv_1> id_new = rJP.id_class("lectern", (n, rhz_32) -> new rJv_1(n));
    public static final rJP<rJL> id_continue = rJP.id_class("loom", rJL::new);
    public static final rJP<rJp_1> id_super = rJP.id_class("merchant", rJp_1::new);
    public static final rJP<rJV> id_this = rJP.id_class("shulker_box", rJV::new);
    public static final rJP<rJo_1> id_else = rJP.id_class("smithing", rJo_1::new);
    public static final rJP<rJK> id_synchronized = rJP.id_class("smoker", rJK::new);
    public static final rJP<rXR> id_return = rJP.id_class("cartography_table", rXR::new);
    public static final rJP<rJD> id_public = rJP.id_class("stonecutter", rJD::new);
    private final rJB<T> id_goto;

    private rJP(rJB<T> rJB2) {
        this.id_goto = rJB2;
    }

    private static <T extends rJr_1> rJP<T> id_class(String string, rJB<T> rJB2) {
        return rVL.id_class(rVL.G, string, new rJP<T>(rJB2));
    }

    public T id_class(int n, rhz_3 rhz_32) {
        return this.id_goto.create(n, rhz_32);
    }
}

