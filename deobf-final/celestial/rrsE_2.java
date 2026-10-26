package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rrsE_2<C extends rrSa_1> {
   private static final xc_3 class_ = xu_3.finally_.continue_();
   private static final xc_3 break_ = xu_3.implements_.continue_();
   private static final xc_3 byte_ = xu_3.native_.continue_();
   private static final xc_3 protected_ = xu_3.char_.continue_();
   private static final xc_3 throws_ = xu_3.break_.continue_();
   private static final xc_3 import_ = xu_3.extends_.continue_();
   private static final xc_3 short_ = xu_3.throw_.continue_();
   private static final xc_3 default_ = xu_3.interface_.continue_();
   private static final xc_3 const_ = xu_3.sw.continue_();
   private static final xc_3 strictfp_ = xu_3.Bi.continue_();
   private static final xc_3 boolean_ = xu_3.PY.continue_();
   private static final xc_3 transient_ = xu_3.PR.continue_();
   private static final xc_3 for_ = xu_3.Sh.continue_();
   private static final xc_3 double_ = xu_3.XL.continue_();
   private static final xc_3 switch_ = xu_3.Xz.continue_();
   private static final xc_3 r = xu_3.bg.continue_();
   private static final xc_3 P = xu_3.XN.continue_();
   private static final xc_3 B = xu_3.Ju.continue_();
   private static final xc_3 S = xu_3.PK.continue_();
   private static final xc_3 s = xu_3.bV.continue_();
   public static final rrsG_2 case_ = new rrsG_2(byte_, class_, protected_);
   public static final rrsG_2 catch_ = new rrsG_2(protected_, protected_, protected_);
   public static final rrsG_2 private_ = new rrsG_2(break_, class_, protected_);
   public static final rrsG_2 implements_ = new rrsG_2(throws_, throws_, protected_);
   public static final rrsG_2 finally_ = new rrsG_2(import_, class_, protected_);
   public static final rrsG_2 extends_ = new rrsG_2(short_, short_, protected_);
   public static final rrsG_2 native_ = new rrsG_2(break_, class_, short_);
   public static final rrsG_2 volatile_ = new rrsG_2(short_, short_, short_);
   public static final rrsG_2 final_ = new rrsG_2(default_, const_, protected_);
   public static final rrsG_2 package_ = new rrsG_2(strictfp_, class_, protected_);
   public static final rrsG_2 int_ = new rrsG_2(transient_, transient_, transient_);
   public static final rrsG_2 new_ = new rrsG_2(boolean_, boolean_, boolean_);
   public static final rrsG_2 continue_ = new rrsG_2(for_, for_, for_);
   public static final rrsG_2 super_ = new rrsG_2(double_, transient_, r);
   public static final rrsG_2 this_ = new rrsG_2(switch_, transient_, P);
   public static final rrsG_2 else_ = new rrsG_2(B, S, s);
   public static final rrsE_2<rrsG_2> synchronized_ = class_("id_default", new rrSo_1(rrsG_2.class_));
   public static final rrsE_2<rrsG_2> return_ = class_("mountain", new rrSi_1(rrsG_2.class_));
   public static final rrsE_2<rrsG_2> public_ = class_("shattered_savanna", new rrsS_2(rrsG_2.class_));
   public static final rrsE_2<rrsG_2> goto_ = class_("gravelly_mountain", new rrSe_1(rrsG_2.class_));
   public static final rrsE_2<rrsG_2> while_ = class_("giant_tree_taiga", new rrSU(rrsG_2.class_));
   public static final rrsE_2<rrsG_2> try_ = class_("swamp", new rrsb_3(rrsG_2.class_));
   public static final rrsE_2<rrsG_2> instanceof_ = class_("badlands", new rrSV(rrsG_2.class_));
   public static final rrsE_2<rrsG_2> throw_ = class_("wooded_badlands", new rrsO_2(rrsG_2.class_));
   public static final rrsE_2<rrsG_2> interface_ = class_("eroded_badlands", new rrSK(rrsG_2.class_));
   public static final rrsE_2<rrsG_2> char_ = class_("frozen_ocean", new rrSD(rrsG_2.class_));
   public static final rrsE_2<rrsG_2> abstract_ = class_("nether", new rrsP_2(rrsG_2.class_));
   public static final rrsE_2<rrsG_2> long_ = class_("nether_forest", new rrsr_3(rrsG_2.class_));
   public static final rrsE_2<rrsG_2> float_ = class_("soul_sand_valley", new rrss_3(rrsG_2.class_));
   public static final rrsE_2<rrsG_2> void_ = class_("basalt_deltas", new rrSg_1(rrsG_2.class_));
   public static final rrsE_2<rrsG_2> static_ = class_("nope", new rrsB_2(rrsG_2.class_));
   private final Codec<rrSR<C>> E;

   public rrsE_2(Codec<C> var1) {
      this.E = var1.fieldOf("config").xmap(this::class_, rrSR::class_).codec();
   }

   public void class_(long var1) {
   }

   public abstract void class_(
      Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, int var11, long var12, C var14
   );

   private static <C extends rrSa_1, F extends rrsE_2<C>> F class_(String var0, F var1) {
      return rVL.class_(rVL.l, var0, (F)var1);
   }

   public rrSR<C> class_(C var1) {
      return new rrSR<>(this, var1);
   }

   public Codec<rrSR<C>> protected_() {
      return this.E;
   }
}
