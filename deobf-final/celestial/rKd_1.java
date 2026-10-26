package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public abstract class rKd_1 {
   public static final Codec<rKd_1> class_ = rVL.rG.dispatchStable(rKd_1::class_, Function.identity());
   protected final rYY break_;
   protected final rYY byte_;
   private final rrSq_1 protected_;
   private final long throws_;
   private final List<rfj_3> case_ = Lists.newArrayList();

   public int byte_() {
      return 64;
   }

   public int byte_(int var1, int var2, rKv_1 var3) {
      return this.class_(var1, var2, var3) - 1;
   }

   public rKd_1(rYY var1, rrSq_1 var2) {
      this(var1, var1, var2, 0L);
   }

   public rKd_1(rYY var1, rYY var2, rrSq_1 var3, long var4) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
   }

   static {
      rVL.class_(rVL.rG, "noise", rKT.protected_);
      rVL.class_(rVL.rG, "flat", rKz_1.protected_);
      rVL.class_(rVL.rG, "debug", rKk_1.protected_);
   }

   public abstract int class_(int var1, int var2, rKv_1 var3);

   public abstract void class_(rRg_1 var1, rrrA var2, roC_2 var3);

   public void class_(rRI var1, rrrA var2, roC_2 var3) {
      byte var4 = 8;
      int var5 = var3.private_().break_;
      int var6 = var3.private_().byte_;
      int var7 = var5 << 4;
      int var8 = var6 << 4;
      rjh_3 var9 = rjh_3.class_(var3.private_(), 0);

      for (int var10 = var5 - 8; var10 <= var5 + 8; var10++) {
         for (int var11 = var6 - 8; var11 <= var6 + 8; var11++) {
            long var12 = rfj_3.class_(var10, var11);

            for (rrrH var15 : var1.protected_(var10, var11).super_().values()) {
               try {
                  if (var15 != rrrH.class_ && var15.byte_().class_(var7, var8, var7 + 15, var8 + 15)) {
                     var2.class_(var9, var15.native_(), var12, var3);
                     ruP_2.class_(var1, var15);
                  }
               } catch (Exception var19) {
                  KY var17 = KY.class_(var19, "Generating structure reference");
                  Ko_1 var18 = var17.class_("Structure");
                  var18.class_("Id", () -> rVL.t.break_(var15.native_()).toString());
                  var18.class_("Name", () -> var15.native_().catch_());
                  var18.class_("Class", () -> var15.native_().getClass().getCanonicalName());
                  throw new KU(var17);
               }
            }
         }
      }
   }

   private void class_(reP_2<?, ?> var1, rVm_1 var2, rrrA var3, roC_2 var4, rrPt_1 var5, long var6, rfj_3 var8, rYG var9) {
      rrrH var10 = var3.class_(rjh_3.class_(var4.private_(), 0), var1.protected_, var4);
      int var11 = var10 != null ? var10.finally_() : 0;
      rrSI var12 = this.protected_.class_(var1.protected_);
      if (var12 != null) {
         rrrH var13 = var1.class_(var2, this, this.break_, var5, var6, var8, var9, var11, var12);
         var3.class_(rjh_3.class_(var4.private_(), 0), var1.protected_, var13, var4);
      }
   }

   public void class_(rVm_1 var1, rrrA var2, roC_2 var3, rrPt_1 var4, long var5) {
      rfj_3 var7 = var3.private_();
      rYG var8 = this.break_.protected_((var7.break_ << 2) + 2, 0, (var7.byte_ << 2) + 2);
      this.class_(rrrF.extends_, var1, var2, var3, var4, var5, var7, var8);

      for (Supplier var10 : var8.throws_().class_()) {
         this.class_((reP_2<?, ?>)var10.get(), var1, var2, var3, var4, var5, var7, var8);
      }
   }

   public List<rYf_1> class_(rYG var1, rrrA var2, aH_2 var3, rfH_2 var4) {
      return var1.break_().class_(var3);
   }

   public boolean class_(rfj_3 var1) {
      this.catch_();
      return this.case_.contains(var1);
   }

   protected abstract Codec<? extends rKd_1> class_();

   public abstract rRq_1 class_(int var1, int var2);

   public void class_(rKf_1 var1) {
   }

   public void class_(long var1, rYA var3, roC_2 var4, rKu_1 var5) {
      rYA var6 = var3.class_(this.break_);
      rqm_3 var7 = new rqm_3();
      byte var8 = 8;
      rfj_3 var9 = var4.private_();
      int var10 = var9.break_;
      int var11 = var9.byte_;
      rYv_1 var12 = this.break_.protected_(var9.break_ << 2, 0, var9.byte_ << 2).throws_();
      BitSet var13 = ((rok_3)var4).break_(var5);

      for (int var14 = var10 - 8; var14 <= var10 + 8; var14++) {
         for (int var15 = var11 - 8; var15 <= var11 + 8; var15++) {
            List var16 = var12.class_(var5);
            ListIterator var17 = var16.listIterator();

            while (var17.hasNext()) {
               int var18 = var17.nextIndex();
               rDM var19 = (rDM)((Supplier)var17.next()).get();
               var7.byte_(var1 + (long)var18, var14, var15);
               if (var19.class_(var7, var14, var15)) {
                  var19.class_(var4, var6::class_, var7, this.case_(), var14, var15, var10, var11, var13);
               }
            }
         }
      }
   }

   public abstract void class_(rKf_1 var1, roC_2 var2);

   public void class_(rKf_1 var1, rrrA var2) {
      int var3 = var1.protected_();
      int var4 = var1.throws_();
      int var5 = var3 * 16;
      int var6 = var4 * 16;
      rfH_2 var7 = new rfH_2(var5, 0, var6);
      rYG var8 = this.break_.protected_((var3 << 2) + 2, 2, (var4 << 2) + 2);
      rqm_3 var9 = new rqm_3();
      long var10 = var9.class_(var1.break_(), var5, var6);

      try {
         var8.class_(var2, this, var1, var10, var9, var7);
      } catch (Exception var14) {
         KY var13 = KY.class_(var14, "Biome decoration");
         var13.class_("Generation").class_("CenterX", var3).class_("CenterZ", var4).class_("Seed", var10).class_("Biome", var8);
         throw new KU(var13);
      }
   }

   public rfH_2 class_(rrEm_1 var1, rrrZ<?> var2, rfH_2 var3, int var4, boolean var5) {
      if (!this.break_.class_(var2)) {
         return null;
      } else if (var2 == rrrZ.extends_) {
         this.catch_();
         rfH_2 var14 = null;
         double var7 = Double.MAX_VALUE;
         rfw_3 var9 = new rfw_3();

         for (rfj_3 var11 : this.case_) {
            var9.class_((var11.break_ << 4) + 8, 32, (var11.byte_ << 4) + 8);
            double var12 = var9.private_(var3);
            if (var14 == null) {
               var14 = new rfH_2(var9);
               var7 = var12;
            } else if (var12 < var7) {
               var14 = new rfH_2(var9);
               var7 = var12;
            }
         }

         return var14;
      } else {
         rrSI var6 = this.protected_.class_(var2);
         return var6 == null ? null : var2.class_(var1, var1.protected_(), var3, var4, var5, var1.break_(), var6);
      }
   }

   public void class_(rVL<rYG> var1, roC_2 var2) {
      rfj_3 var3 = var2.private_();
      ((rok_3)var2).class_(new rYZ(var1, var3, this.byte_));
   }

   public abstract rKd_1 class_(long var1);

   public int break_(int var1, int var2, rKv_1 var3) {
      return this.class_(var1, var2, var3);
   }

   public rrSq_1 break_() {
      return this.protected_;
   }

   public int throws_() {
      return 256;
   }

   private void catch_() {
      if (this.case_.isEmpty()) {
         rrSf_1 var1 = this.protected_.break_();
         if (var1 != null && var1.byte_() != 0) {
            ArrayList var2 = Lists.newArrayList();

            for (rYG var4 : this.break_.break_()) {
               if (var4.throws_().class_(rrrZ.extends_)) {
                  var2.add(var4);
               }
            }

            int var17 = var1.class_();
            int var18 = var1.byte_();
            int var5 = var1.break_();
            Random var6 = new Random();
            var6.setSeed(this.throws_);
            double var7 = var6.nextDouble() * Math.PI * 2.0;
            int var9 = 0;
            int var10 = 0;

            for (int var11 = 0; var11 < var18; var11++) {
               double var12 = (double)(4 * var17 + var17 * var10 * 6) + (var6.nextDouble() - 0.5) * (double)var17 * 2.5;
               int var14 = (int)Math.round(Math.cos(var7) * var12);
               int var15 = (int)Math.round(Math.sin(var7) * var12);
               rfH_2 var16 = this.break_.class_((var14 << 4) + 8, 0, (var15 << 4) + 8, 112, var2::contains, var6);
               if (var16 != null) {
                  var14 = var16.b_() >> 4;
                  var15 = var16.d_() >> 4;
               }

               this.case_.add(new rfj_3(var14, var15));
               var7 += (Math.PI * 2) / (double)var5;
               if (++var9 == var5) {
                  var10++;
                  var9 = 0;
                  var5 += 2 * var5 / (var10 + 1);
                  var5 = Math.min(var5, var18 - var11);
                  var7 += var6.nextDouble() * Math.PI * 2.0;
               }
            }
         }
      }
   }

   public int case_() {
      return 63;
   }

   public rYY protected_() {
      return this.byte_;
   }
}
