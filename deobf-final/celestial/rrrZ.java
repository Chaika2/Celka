package celestial;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rrrZ<C extends rUv_1> {
   public static final BiMap<String, rrrZ<?>> class_ = HashBiMap.create();
   private static final Map<rrrZ<?>, rKm_1> else_ = Maps.newHashMap();
   private static final Logger synchronized_ = LogManager.getLogger();
   public static final rrrZ<rrrI> break_ = class_("Pillager_Outpost", new riT_2(rrrI.class_), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<raI_2> byte_ = class_("Mineshaft", new raK_2(raI_2.class_), rKm_1.UNDERGROUND_STRUCTURES);
   public static final rrrZ<rUt_1> protected_ = class_("Mansion", new rrri_1(rUt_1.class_), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rUt_1> throws_ = class_("Jungle_Pyramid", new raq_3(rUt_1.class_), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rUt_1> case_ = class_("Desert_Pyramid", new reY_2(rUt_1.class_), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rUt_1> catch_ = class_("Igloo", new ran_3(rUt_1.class_), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rUo_1> private_ = class_("Ruined_Portal", new rij_3(rUo_1.class_), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rio_3> implements_ = class_("Shipwreck", new riU_2(rio_3.class_), rKm_1.SURFACE_STRUCTURES);
   public static final rrrq_1 finally_ = class_("Swamp_Hut", new rrrq_1(rUt_1.class_), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rUt_1> extends_ = class_("Stronghold", new rrru_1(rUt_1.class_), rKm_1.STRONGHOLDS);
   public static final rrrZ<rUt_1> native_ = class_("Monument", new riL_2(rUt_1.class_), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rin_3> volatile_ = class_("Ocean_Ruin", new riH_2(rin_3.class_), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rUt_1> final_ = class_("Fortress", new raZ_2(rUt_1.class_), rKm_1.UNDERGROUND_DECORATION);
   public static final rrrZ<rUt_1> package_ = class_("EndCity", new raB_2(rUt_1.class_), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rUV> int_ = class_("Buried_Treasure", new reV_2(rUV.class_), rKm_1.UNDERGROUND_STRUCTURES);
   public static final rrrZ<rrrI> new_ = class_("Village", new rrrf_1(rrrI.class_), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rUt_1> continue_ = class_("Nether_Fossil", new rae_3(rUt_1.class_), rKm_1.UNDERGROUND_DECORATION);
   public static final rrrZ<rrrI> super_ = class_("Bastion_Remnant", new rey_3(rrrI.class_), rKm_1.SURFACE_STRUCTURES);
   public static final List<rrrZ<?>> this_ = ImmutableList.of(break_, new_, continue_);
   private static final rqO_2 return_ = new rqO_2("jigsaw");
   private static final Map<rqO_2, rqO_2> public_ = ImmutableMap.builder()
      .put(new rqO_2("nvi"), return_)
      .put(new rqO_2("pcp"), return_)
      .put(new rqO_2("bastionremnant"), return_)
      .put(new rqO_2("runtime"), return_)
      .build();
   private final Codec<reP_2<C, rrrZ<C>>> goto_;

   public List<rYf_1> byte_() {
      return ImmutableList.of();
   }

   public rrrZ(Codec<C> var1) {
      this.goto_ = var1.fieldOf("config").xmap(var1x -> new reP_2<>(this, (C)var1x), var0 -> var0.throws_).codec();
   }

   private rrrH<C> class_(int var1, int var2, rfi_3 var3, int var4, long var5) {
      return this.class_().create(this, var1, var2, var3, var4, var5);
   }

   public rrrH<?> class_(rVm_1 var1, rKd_1 var2, rYY var3, rrPt_1 var4, long var5, rfj_3 var7, rYG var8, int var9, rqm_3 var10, rrSI var11, C var12) {
      rfj_3 var13 = this.class_(var11, var5, var10, var7.break_, var7.byte_);
      if (var7.break_ == var13.break_ && var7.byte_ == var13.byte_ && this.class_(var2, var3, var5, var10, var7.break_, var7.byte_, var8, var13, (C)var12)) {
         rrrH var14 = this.class_(var7.break_, var7.byte_, rfi_3.class_(), var9, var5);
         var14.class_(var1, var2, var4, var7.break_, var7.byte_, var8, var12);
         if (var14.throws_()) {
            return var14;
         }
      }

      return rrrH.class_;
   }

   protected boolean class_(rKd_1 var1, rYY var2, long var3, rqm_3 var5, int var6, int var7, rYG var8, rfj_3 var9, C var10) {
      return true;
   }

   public final rfj_3 class_(rrSI var1, long var2, rqm_3 var4, int var5, int var6) {
      int var7 = var1.class_();
      int var8 = var1.break_();
      int var9 = Math.floorDiv(var5, var7);
      int var10 = Math.floorDiv(var6, var7);
      var4.class_(var2, var9, var10, var1.byte_());
      int var11;
      int var12;
      if (this.break_()) {
         var11 = var4.nextInt(var7 - var8);
         var12 = var4.nextInt(var7 - var8);
      } else {
         var11 = (var4.nextInt(var7 - var8) + var4.nextInt(var7 - var8)) / 2;
         var12 = (var4.nextInt(var7 - var8) + var4.nextInt(var7 - var8)) / 2;
      }

      return new rfj_3(var9 * var7 + var11, var10 * var7 + var12);
   }

   public abstract rrrv_1<C> class_();

   private static <F extends rrrZ<?>> F class_(String var0, F var1, rKm_1 var2) {
      class_.put(var0.toLowerCase(Locale.ROOT), var1);
      else_.put(var1, var2);
      return rVL.class_(rVL.t, var0.toLowerCase(Locale.ROOT), (F)var1);
   }

   public reP_2<C, ? extends rrrZ<C>> class_(C var1) {
      return new reP_2<>(this, (C)var1);
   }

   public rfH_2 class_(rRR var1, rrrA var2, rfH_2 var3, int var4, boolean var5, long var6, rrSI var8) {
      int var9 = var8.class_();
      int var10 = var3.b_() >> 4;
      int var11 = var3.d_() >> 4;
      int var12 = 0;

      for (rqm_3 var13 = new rqm_3(); var12 <= var4; var12++) {
         for (int var14 = -var12; var14 <= var12; var14++) {
            boolean var15 = var14 == -var12 || var14 == var12;

            for (int var16 = -var12; var16 <= var12; var16++) {
               boolean var17 = var16 == -var12 || var16 == var12;
               if (var15 || var17) {
                  int var18 = var10 + var9 * var14;
                  int var19 = var11 + var9 * var16;
                  rfj_3 var20 = this.class_(var8, var6, var13, var18, var19);
                  roC_2 var21 = var1.class_(var20.break_, var20.byte_, roN_2.break_);
                  rrrH var22 = var2.class_(rjh_3.class_(var21.private_(), 0), this, var21);
                  if (var22 != null && var22.throws_()) {
                     if (var5 && var22.private_()) {
                        var22.implements_();
                        return var22.class_();
                     }

                     if (!var5) {
                        return var22.class_();
                     }
                  }

                  if (var12 == 0) {
                     break;
                  }
               }
            }

            if (var12 == 0) {
               break;
            }
         }
      }

      return null;
   }

   public static rrrH<?> class_(rrPt_1 var0, rcd_3 var1, long var2) {
      String var4 = var1.native_("id");
      if ("INVALID".equals(var4)) {
         return rrrH.class_;
      } else {
         rrrZ var5 = rVL.t.class_(new rqO_2(var4.toLowerCase(Locale.ROOT)));
         if (var5 == null) {
            synchronized_.error("Unknown feature id: {}", var4);
            return null;
         } else {
            int var6 = var1.private_("ChunkX");
            int var7 = var1.private_("ChunkZ");
            int var8 = var1.private_("references");
            rfi_3 var9 = var1.throws_("BB") ? new rfi_3(var1.final_("BB")) : rfi_3.class_();
            rcy_3 var10 = var1.protected_("Children", 10);

            try {
               rrrH var11 = var5.class_(var6, var7, var9, var8, var2);

               for (int var12 = 0; var12 < var10.size(); var12++) {
                  rcd_3 var13 = var10.class_(var12);
                  String var14 = var13.native_("id").toLowerCase(Locale.ROOT);
                  rqO_2 var15 = new rqO_2(var14);
                  rqO_2 var16 = public_.getOrDefault(var15, var15);
                  raF_2 var17 = rVL.I.class_(var16);
                  if (var17 == null) {
                     synchronized_.error("Unknown structure piece id: {}", var16);
                  } else {
                     try {
                        rrrn_1 var18 = var17.load(var0, var13);
                        var11.protected_().add(var18);
                     } catch (Exception var19) {
                        synchronized_.error("Exception loading structure piece with id {}", var16, var19);
                     }
                  }
               }

               return var11;
            } catch (Exception var20) {
               synchronized_.error("Failed Start with id {}", var4, var20);
               return null;
            }
         }
      }
   }

   protected boolean break_() {
      return true;
   }

   public static void throws_() {
   }

   public String catch_() {
      return (String)class_.inverse().get(this);
   }

   public Codec<reP_2<C, rrrZ<C>>> case_() {
      return this.goto_;
   }

   public rKm_1 protected_() {
      return else_.get(this);
   }

   public List<rYf_1> private_() {
      return ImmutableList.of();
   }
}
