package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public abstract class rrSu_1<DC extends rrSx_1> {
   public static final rrSu_1<rrSQ> class_ = class_("nope", new rrSc_1(rrSQ.class_));
   public static final rrSu_1<rrBR> break_ = class_("chance", new rrBY(rrBR.class_));
   public static final rrSu_1<rUJ> byte_ = class_("count", new rrBa_1(rUJ.class_));
   public static final rrSu_1<rrSN> protected_ = class_("count_noise", new rrBe_1(rrSN.class_));
   public static final rrSu_1<rrSH> throws_ = class_("count_noise_biased", new rrBU(rrSH.class_));
   public static final rrSu_1<rrBj_1> case_ = class_("count_extra", new rrBK(rrBj_1.class_));
   public static final rrSu_1<rrSQ> catch_ = class_("square", new rrSn_1(rrSQ.class_));
   public static final rrSu_1<rrSQ> private_ = class_("heightmap", new rrSh_1<>(rrSQ.class_));
   public static final rrSu_1<rrSQ> implements_ = class_("heightmap_spread_double", new rrSX<>(rrSQ.class_));
   public static final rrSu_1<rrSQ> finally_ = class_("top_solid_heightmap", new rrSC(rrSQ.class_));
   public static final rrSu_1<rrSQ> extends_ = class_("heightmap_world_surface", new rrSJ(rrSQ.class_));
   public static final rrSu_1<rrSl_1> native_ = class_("range", new rrSZ(rrSl_1.class_));
   public static final rrSu_1<rrSl_1> volatile_ = class_("range_biased", new rrSm_1(rrSl_1.class_));
   public static final rrSu_1<rrSl_1> final_ = class_("range_very_biased", new rrSv_1(rrSl_1.class_));
   public static final rrSu_1<rrSB> package_ = class_("depth_average", new rrSS(rrSB.class_));
   public static final rrSu_1<rrSQ> int_ = class_("spread_32_above", new rrSA(rrSQ.class_));
   public static final rrSu_1<rrBg_1> new_ = class_("carving_mask", new rrBV(rrBg_1.class_));
   public static final rrSu_1<rUJ> continue_ = class_("fire", new rrSG(rUJ.class_));
   public static final rrSu_1<rrSQ> super_ = class_("magma", new rrSz_1(rrSQ.class_));
   public static final rrSu_1<rrSQ> this_ = class_("emerald_ore", new rrSM(rrSQ.class_));
   public static final rrSu_1<rrBR> else_ = class_("lava_lake", new rrSk_1(rrBR.class_));
   public static final rrSu_1<rrBR> synchronized_ = class_("water_lake", new rrSW(rrBR.class_));
   public static final rrSu_1<rUJ> return_ = class_("glowstone", new rrSb_1(rUJ.class_));
   public static final rrSu_1<rrSQ> public_ = class_("end_gateway", new rrSs_1(rrSQ.class_));
   public static final rrSu_1<rrSQ> goto_ = class_("dark_oak_tree", new rrBi_1(rrSQ.class_));
   public static final rrSu_1<rrSQ> while_ = class_("iceberg", new rrSd_1(rrSQ.class_));
   public static final rrSu_1<rrSQ> try_ = class_("end_island", new rrSE(rrSQ.class_));
   public static final rrSu_1<rrSP> instanceof_ = class_("decorated", new rrSr_1(rrSP.class_));
   public static final rrSu_1<rUJ> throw_ = class_("count_multilayer", new rrBD(rUJ.class_));
   private final Codec<rrBo_1<DC>> interface_;

   public rrSu_1(Codec<DC> var1) {
      this.interface_ = var1.fieldOf("config").xmap(var1x -> new rrBo_1<>(this, (DC)var1x), rrBo_1::break_).codec();
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
   }

   private static <T extends rrSx_1, G extends rrSu_1<T>> G class_(String var0, G var1) {
      return rVL.class_(rVL.j, var0, (G)var1);
   }

   public abstract Stream<rfH_2> class_(reX_2 var1, Random var2, DC var3, rfH_2 var4);

   public Codec<rrBo_1<DC>> class_() {
      return this.interface_;
   }

   public rrBo_1<DC> break_(DC var1) {
      return new rrBo_1<>(this, (DC)var1);
   }
}
