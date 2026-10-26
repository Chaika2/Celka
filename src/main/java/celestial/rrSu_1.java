/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rUJ;
import celestial.rVL;
import celestial.reX_2;
import celestial.rfH_2;
import celestial.rrBD;
import celestial.rrBK;
import celestial.rrBR;
import celestial.rrBU;
import celestial.rrBV;
import celestial.rrBY;
import celestial.rrBa_1;
import celestial.rrBe_1;
import celestial.rrBg_1;
import celestial.rrBi_1;
import celestial.rrBj_1;
import celestial.rrBo_1;
import celestial.rrSA;
import celestial.rrSB;
import celestial.rrSC;
import celestial.rrSE;
import celestial.rrSG;
import celestial.rrSH;
import celestial.rrSJ;
import celestial.rrSM;
import celestial.rrSN;
import celestial.rrSP;
import celestial.rrSQ;
import celestial.rrSS;
import celestial.rrSW;
import celestial.rrSX;
import celestial.rrSZ;
import celestial.rrSb_1;
import celestial.rrSc_1;
import celestial.rrSd_1;
import celestial.rrSh_1;
import celestial.rrSk_1;
import celestial.rrSl_1;
import celestial.rrSm_1;
import celestial.rrSn_1;
import celestial.rrSr_1;
import celestial.rrSs_1;
import celestial.rrSv_1;
import celestial.rrSx_1;
import celestial.rrSz_1;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public abstract class rrSu_1<DC extends rrSx_1> {
    public static final rrSu_1<rrSQ> id_class = rrSu_1.id_class("nope", new rrSc_1(rrSQ.id_class));
    public static final rrSu_1<rrBR> id_break = rrSu_1.id_class("chance", new rrBY(rrBR.id_class));
    public static final rrSu_1<rUJ> id_byte = rrSu_1.id_class("count", new rrBa_1(rUJ.id_class));
    public static final rrSu_1<rrSN> id_protected = rrSu_1.id_class("count_noise", new rrBe_1(rrSN.id_class));
    public static final rrSu_1<rrSH> id_throws = rrSu_1.id_class("count_noise_biased", new rrBU(rrSH.id_class));
    public static final rrSu_1<rrBj_1> id_case = rrSu_1.id_class("count_extra", new rrBK(rrBj_1.id_class));
    public static final rrSu_1<rrSQ> id_catch = rrSu_1.id_class("square", new rrSn_1(rrSQ.id_class));
    public static final rrSu_1<rrSQ> id_private = rrSu_1.id_class("heightmap", new rrSh_1<rrSQ>(rrSQ.id_class));
    public static final rrSu_1<rrSQ> id_implements = rrSu_1.id_class("heightmap_spread_double", new rrSX<rrSQ>(rrSQ.id_class));
    public static final rrSu_1<rrSQ> id_finally = rrSu_1.id_class("top_solid_heightmap", new rrSC(rrSQ.id_class));
    public static final rrSu_1<rrSQ> id_extends = rrSu_1.id_class("heightmap_world_surface", new rrSJ(rrSQ.id_class));
    public static final rrSu_1<rrSl_1> id_native = rrSu_1.id_class("range", new rrSZ(rrSl_1.id_class));
    public static final rrSu_1<rrSl_1> id_volatile = rrSu_1.id_class("range_biased", new rrSm_1(rrSl_1.id_class));
    public static final rrSu_1<rrSl_1> id_final = rrSu_1.id_class("range_very_biased", new rrSv_1(rrSl_1.id_class));
    public static final rrSu_1<rrSB> id_package = rrSu_1.id_class("depth_average", new rrSS(rrSB.id_class));
    public static final rrSu_1<rrSQ> id_int = rrSu_1.id_class("spread_32_above", new rrSA(rrSQ.id_class));
    public static final rrSu_1<rrBg_1> id_new = rrSu_1.id_class("carving_mask", new rrBV(rrBg_1.id_class));
    public static final rrSu_1<rUJ> id_continue = rrSu_1.id_class("fire", new rrSG(rUJ.id_class));
    public static final rrSu_1<rrSQ> id_super = rrSu_1.id_class("magma", new rrSz_1(rrSQ.id_class));
    public static final rrSu_1<rrSQ> id_this = rrSu_1.id_class("emerald_ore", new rrSM(rrSQ.id_class));
    public static final rrSu_1<rrBR> id_else = rrSu_1.id_class("lava_lake", new rrSk_1(rrBR.id_class));
    public static final rrSu_1<rrBR> id_synchronized = rrSu_1.id_class("water_lake", new rrSW(rrBR.id_class));
    public static final rrSu_1<rUJ> id_return = rrSu_1.id_class("glowstone", new rrSb_1(rUJ.id_class));
    public static final rrSu_1<rrSQ> id_public = rrSu_1.id_class("end_gateway", new rrSs_1(rrSQ.id_class));
    public static final rrSu_1<rrSQ> id_goto = rrSu_1.id_class("dark_oak_tree", new rrBi_1(rrSQ.id_class));
    public static final rrSu_1<rrSQ> id_while = rrSu_1.id_class("iceberg", new rrSd_1(rrSQ.id_class));
    public static final rrSu_1<rrSQ> id_try = rrSu_1.id_class("end_island", new rrSE(rrSQ.id_class));
    public static final rrSu_1<rrSP> id_instanceof = rrSu_1.id_class("decorated", new rrSr_1(rrSP.id_class));
    public static final rrSu_1<rUJ> id_throw = rrSu_1.id_class("count_multilayer", new rrBD(rUJ.id_class));
    private final Codec<rrBo_1<DC>> id_interface;

    public rrSu_1(Codec<DC> codec) {
        this.id_interface = codec.fieldOf("config").xmap(rrSx_12 -> new rrBo_1<rrSx_1>(this, (rrSx_1)rrSx_12), rrBo_1::id_break).codec();
    }

    public String toString() {
        return this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
    }

    private static <T extends rrSx_1, G extends rrSu_1<T>> G id_class(String string, G g) {
        return (G)rVL.id_class(rVL.j, string, g);
    }

    public abstract Stream<rfH_2> id_class(reX_2 var1, Random var2, DC var3, rfH_2 var4);

    public Codec<rrBo_1<DC>> id_class() {
        return this.id_interface;
    }

    public rrBo_1<DC> id_break(DC DC2) {
        return new rrBo_1<DC>(this, DC2);
    }
}

