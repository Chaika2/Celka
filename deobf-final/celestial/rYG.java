package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class rYG {
   public static final Logger class_ = LogManager.getLogger();
   public static final Codec<rYG> break_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rYX.class_.forGetter(var0x -> var0x.finally_),
               rYh_1.CODEC.fieldOf("category").forGetter(var0x -> var0x.package_),
               Codec.FLOAT.fieldOf("depth").forGetter(var0x -> var0x.volatile_),
               Codec.FLOAT.fieldOf("scale").forGetter(var0x -> var0x.final_),
               rYW.class_.fieldOf("effects").forGetter(var0x -> var0x.int_),
               rYv_1.byte_.forGetter(var0x -> var0x.extends_),
               rYt_1.byte_.forGetter(var0x -> var0x.native_)
            )
            .apply(var0, rYG::new)
   );
   public static final Codec<rYG> byte_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rYX.class_.forGetter(var0x -> var0x.finally_),
               rYh_1.CODEC.fieldOf("category").forGetter(var0x -> var0x.package_),
               Codec.FLOAT.fieldOf("depth").forGetter(var0x -> var0x.volatile_),
               Codec.FLOAT.fieldOf("scale").forGetter(var0x -> var0x.final_),
               rYW.class_.fieldOf("effects").forGetter(var0x -> var0x.int_)
            )
            .apply(var0, (var0x, var1, var2, var3, var4) -> new rYG(var0x, var1, var2, var3, var4, rYv_1.break_, rYt_1.break_))
   );
   public static final Codec<Supplier<rYG>> protected_ = rVA.class_(rVL.n, break_);
   public static final Codec<List<Supplier<rYG>>> throws_ = rVA.break_(rVL.n, break_);
   private final Map<Integer, List<rrrZ<?>>> catch_ = rVL.t.case_().collect(Collectors.groupingBy(var0 -> var0.protected_().ordinal()));
   private static final rKw_1 private_ = new rKw_1(new rqm_3(1234L), ImmutableList.of(0));
   static final rKw_1 implements_ = new rKw_1(new rqm_3(3456L), ImmutableList.of(-2, -1, 0));
   public static final rKw_1 case_ = new rKw_1(new rqm_3(2345L), ImmutableList.of(0));
   private final rYX finally_;
   private final rYv_1 extends_;
   private final rYt_1 native_;
   private final float volatile_;
   private final float final_;
   private final rYh_1 package_;
   private final rYW int_;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> new_ = ThreadLocal.withInitial(
      () -> rqR_2.class_((Supplier<? extends Long2FloatLinkedOpenHashMap>)(() -> {
            rYb_1 var1x = new rYb_1(this, 1024, 0.25F);
            var1x.defaultReturnValue(Float.NaN);
            return var1x;
         }))
   );

   public rYJ byte_() {
      return this.finally_.break_;
   }

   public Optional<rqA_2> int_() {
      return this.int_.implements_();
   }

   rYG(rYX var1, rYh_1 var2, float var3, float var4, rYW var5, rYv_1 var6, rYt_1 var7) {
      this.finally_ = var1;
      this.extends_ = var6;
      this.native_ = var7;
      this.package_ = var2;
      this.volatile_ = var3;
      this.final_ = var4;
      this.int_ = var5;
   }

   @Override
   public String toString() {
      rqO_2 var1 = rVy_1.implements_.break_(this);
      return var1 == null ? super.toString() : var1.toString();
   }

   public final rYh_1 this_() {
      return this.package_;
   }

   public int class_(double var1, double var3) {
      int var5 = this.int_.case_().orElseGet(this::else_);
      return this.int_.catch_().class_(var1, var3, var5);
   }

   public void class_(Random var1, roC_2 var2, int var3, int var4, int var5, double var6, xc_3 var8, xc_3 var9, int var10, long var11) {
      rrSR var13 = this.extends_.protected_().get();
      var13.class_(var11);
      var13.class_(var1, var2, this, var3, var4, var5, var6, var8, var9, var10, var11);
   }

   public int class_() {
      return this.int_.protected_();
   }

   public boolean class_(rRR var1, rfH_2 var2, boolean var3) {
      if (this.class_(var2) >= 0.15F) {
         return false;
      } else {
         if (var2.c_() >= 0 && var2.c_() < 256 && var1.class_(rRo_1.BLOCK, var2) < 10) {
            xc_3 var4 = var1.byte_(var2);
            rXE var5 = var1.break_(var2);
            if (var5.class_() == rXG.byte_ && var4.break_() instanceof dj_3) {
               if (!var3) {
                  return true;
               }

               boolean var6 = var1.final_(var2.byte_()) && var1.final_(var2.extends_()) && var1.final_(var2.private_()) && var1.final_(var2.protected_());
               if (!var6) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean class_(rRR var1, rfH_2 var2) {
      return this.class_(var1, var2, true);
   }

   public final float class_(rfH_2 var1) {
      long var2 = var1.package_();
      Long2FloatLinkedOpenHashMap var4 = this.new_.get();
      float var5 = var4.get(var2);
      if (!Float.isNaN(var5)) {
         return var5;
      } else {
         float var6 = this.break_(var1);
         if (var4.size() == 1024) {
            var4.removeFirstFloat();
         }

         var4.put(var2, var6);
         return var6;
      }
   }

   public void class_(rrrA var1, rKd_1 var2, rKf_1 var3, long var4, rqm_3 var6, rfH_2 var7) {
      List var8 = this.extends_.byte_();
      int var9 = rKm_1.values().length;

      for (int var10 = 0; var10 < var9; var10++) {
         int var11 = 0;
         if (var1.class_()) {
            for (rrrZ var13 : this.catch_.getOrDefault(var10, Collections.emptyList())) {
               var6.break_(var4, var11, var10);
               int var14 = var7.b_() >> 4;
               int var15 = var7.d_() >> 4;
               int var16 = var14 << 4;
               int var17 = var15 << 4;

               try {
                  var1.class_(rjh_3.class_(var7), var13)
                     .forEach(var8x -> var8x.class_(var3, var1, var2, var6, new rfi_3(var16, var17, var16 + 15, var17 + 15), new rfj_3(var14, var15)));
               } catch (Exception var20) {
                  KY var19 = KY.class_(var20, "Feature placement");
                  var19.class_("Feature").class_("Id", rVL.t.break_(var13)).class_("Description", () -> var13.toString());
                  throw new KU(var19);
               }

               var11++;
            }
         }

         if (var8.size() > var10) {
            for (Supplier var23 : (List)var8.get(var10)) {
               rDg_1 var24 = (rDg_1)var23.get();
               var6.break_(var4, var11, var10);

               try {
                  var24.class_(var3, var2, var6, var7);
               } catch (Exception var21) {
                  KY var25 = KY.class_(var21, "Feature placement");
                  var25.class_("Feature")
                     .class_("Id", rVL.q.break_(var24.throws_))
                     .class_("Config", var24.case_)
                     .class_("Description", () -> var24.throws_.toString());
                  throw new KU(var25);
               }

               var11++;
            }
         }
      }
   }

   public rYt_1 break_() {
      return this.native_;
   }

   public boolean break_(rRR var1, rfH_2 var2) {
      if (this.class_(var2) >= 0.15F) {
         return false;
      } else {
         if (var2.c_() >= 0 && var2.c_() < 256 && var1.class_(rRo_1.BLOCK, var2) < 10) {
            xc_3 var3 = var1.byte_(var2);
            if (var3.catch_() && xu_3.Pq.continue_().class_(var1, var2)) {
               return true;
            }
         }

         return false;
      }
   }

   private float break_(rfH_2 var1) {
      float var2 = this.finally_.protected_.class_(var1, this.extends_());
      if (var1.c_() > 64) {
         float var3 = (float)(private_.class_((double)((float)var1.b_() / 8.0F), (double)((float)var1.d_() / 8.0F), false) * 4.0);
         return var2 - (var3 + (float)var1.c_() - 64.0F) * 0.05F / 30.0F;
      } else {
         return var2;
      }
   }

   public rYv_1 throws_() {
      return this.extends_;
   }

   public final float finally_() {
      return this.final_;
   }

   public int catch_() {
      return this.int_.throws_().orElseGet(this::synchronized_);
   }

   public final float extends_() {
      return this.finally_.byte_;
   }

   public int case_() {
      return this.int_.class_();
   }

   public Optional<rYg_1> continue_() {
      return this.int_.extends_();
   }

   private int else_() {
      double var1 = (double)rfU_2.class_(this.finally_.byte_, 0.0F, 1.0F);
      double var3 = (double)rfU_2.class_(this.finally_.throws_, 0.0F, 1.0F);
      return rRH.class_(var1, var3);
   }

   public final float implements_() {
      return this.finally_.throws_;
   }

   public Optional<rYj_1> new_() {
      return this.int_.finally_();
   }

   public Optional<rYV> package_() {
      return this.int_.private_();
   }

   public Optional<NS> super_() {
      return this.int_.native_();
   }

   public boolean protected_() {
      return this.implements_() > 0.85F;
   }

   public final float private_() {
      return this.volatile_;
   }

   public final int final_() {
      return this.int_.byte_();
   }

   public final int volatile_() {
      return this.int_.break_();
   }

   private int synchronized_() {
      double var1 = (double)rfU_2.class_(this.finally_.byte_, 0.0F, 1.0F);
      double var3 = (double)rfU_2.class_(this.finally_.throws_, 0.0F, 1.0F);
      return rRN.class_(var1, var3);
   }

   public rYW native_() {
      return this.int_;
   }
}
