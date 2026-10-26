package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public abstract class rrSu_1<DC extends rrSx_1> {
   public static final rrSu_1<rrSQ> id_class = id_class("nope", new rrSc_1(rrSQ.id_class));
   public static final rrSu_1<rrBR> id_break = id_class("chance", new rrBY(rrBR.id_class));
   public static final rrSu_1<rUJ> id_byte = id_class("count", new rrBa_1(rUJ.id_class));
   public static final rrSu_1<rrSN> id_protected = id_class("count_noise", new rrBe_1(rrSN.id_class));
   public static final rrSu_1<rrSH> id_throws = id_class("count_noise_biased", new rrBU(rrSH.id_class));
   public static final rrSu_1<rrBj_1> id_case = id_class("count_extra", new rrBK(rrBj_1.id_class));
   public static final rrSu_1<rrSQ> id_catch = id_class("square", new rrSn_1(rrSQ.id_class));
   public static final rrSu_1<rrSQ> id_private = id_class("heightmap", new rrSh_1<>(rrSQ.id_class));
   public static final rrSu_1<rrSQ> id_implements = id_class("heightmap_spread_double", new rrSX<>(rrSQ.id_class));
   public static final rrSu_1<rrSQ> id_finally = id_class("top_solid_heightmap", new rrSC(rrSQ.id_class));
   public static final rrSu_1<rrSQ> id_extends = id_class("heightmap_world_surface", new rrSJ(rrSQ.id_class));
   public static final rrSu_1<rrSl_1> id_native = id_class("range", new rrSZ(rrSl_1.id_class));
   public static final rrSu_1<rrSl_1> id_volatile = id_class("range_biased", new rrSm_1(rrSl_1.id_class));
   public static final rrSu_1<rrSl_1> id_final = id_class("range_very_biased", new rrSv_1(rrSl_1.id_class));
   public static final rrSu_1<rrSB> id_package = id_class("depth_average", new rrSS(rrSB.id_class));
   public static final rrSu_1<rrSQ> id_int = id_class("spread_32_above", new rrSA(rrSQ.id_class));
   public static final rrSu_1<rrBg_1> id_new = id_class("carving_mask", new rrBV(rrBg_1.id_class));
   public static final rrSu_1<rUJ> id_continue = id_class("fire", new rrSG(rUJ.id_class));
   public static final rrSu_1<rrSQ> id_super = id_class("magma", new rrSz_1(rrSQ.id_class));
   public static final rrSu_1<rrSQ> id_this = id_class("emerald_ore", new rrSM(rrSQ.id_class));
   public static final rrSu_1<rrBR> id_else = id_class("lava_lake", new rrSk_1(rrBR.id_class));
   public static final rrSu_1<rrBR> id_synchronized = id_class("water_lake", new rrSW(rrBR.id_class));
   public static final rrSu_1<rUJ> id_return = id_class("glowstone", new rrSb_1(rUJ.id_class));
   public static final rrSu_1<rrSQ> id_public = id_class("end_gateway", new rrSs_1(rrSQ.id_class));
   public static final rrSu_1<rrSQ> id_goto = id_class("dark_oak_tree", new rrBi_1(rrSQ.id_class));
   public static final rrSu_1<rrSQ> id_while = id_class("iceberg", new rrSd_1(rrSQ.id_class));
   public static final rrSu_1<rrSQ> id_try = id_class("end_island", new rrSE(rrSQ.id_class));
   public static final rrSu_1<rrSP> id_instanceof = id_class("decorated", new rrSr_1(rrSP.id_class));
   public static final rrSu_1<rUJ> id_throw = id_class("count_multilayer", new rrBD(rUJ.id_class));
   private final Codec<rrBo_1<DC>> id_interface;

   public rrSu_1(Codec<DC> var1) {
      this.id_interface = var1.fieldOf("config").xmap(var1x -> new rrBo_1<>(this, (DC)var1x), rrBo_1::id_break).codec();
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
   }

   private static <T extends rrSx_1, G extends rrSu_1<T>> G id_class(String var0, G var1) {
      return rVL.id_class(rVL.j, var0, (G)var1);
   }

   public abstract Stream<rfH_2> id_class(reX_2 var1, Random var2, DC var3, rfH_2 var4);

   public Codec<rrBo_1<DC>> id_class() {
      return this.id_interface;
   }

   public rrBo_1<DC> id_break(DC var1) {
      return new rrBo_1<>(this, (DC)var1);
   }
}
