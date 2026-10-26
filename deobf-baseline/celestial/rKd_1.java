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
   public static final Codec<rKd_1> id_class = rVL.rG.dispatchStable(rKd_1::id_class, Function.identity());
   protected final rYY id_break;
   protected final rYY id_byte;
   private final rrSq_1 id_protected;
   private final long id_throws;
   private final List<rfj_3> id_case = Lists.newArrayList();

   public int id_byte() {
      return 64;
   }

   public int id_byte(int var1, int var2, rKv_1 var3) {
      return this.id_class(var1, var2, var3) - 1;
   }

   public rKd_1(rYY var1, rrSq_1 var2) {
      this(var1, var1, var2, 0L);
   }

   public rKd_1(rYY var1, rYY var2, rrSq_1 var3, long var4) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
   }

   static {
      rVL.id_class(rVL.rG, "noise", rKT.id_protected);
      rVL.id_class(rVL.rG, "flat", rKz_1.id_protected);
      rVL.id_class(rVL.rG, "debug", rKk_1.id_protected);
   }

   public abstract int id_class(int var1, int var2, rKv_1 var3);

   public abstract void id_class(rRg_1 var1, rrrA var2, roC_2 var3);

   public void id_class(rRI var1, rrrA var2, roC_2 var3) {
      byte var4 = 8;
      int var5 = var3.id_private().id_break;
      int var6 = var3.id_private().id_byte;
      int var7 = var5 << 4;
      int var8 = var6 << 4;
      rjh_3 var9 = rjh_3.id_class(var3.id_private(), 0);

      for (int var10 = var5 - 8; var10 <= var5 + 8; var10++) {
         for (int var11 = var6 - 8; var11 <= var6 + 8; var11++) {
            long var12 = rfj_3.id_class(var10, var11);

            for (rrrH var15 : var1.id_protected(var10, var11).id_super().values()) {
               try {
                  if (var15 != rrrH.id_class && var15.id_byte().id_class(var7, var8, var7 + 15, var8 + 15)) {
                     var2.id_class(var9, var15.id_native(), var12, var3);
                     ruP_2.id_class(var1, var15);
                  }
               } catch (Exception var19) {
                  KY var17 = KY.id_class(var19, "Generating structure reference");
                  Ko_1 var18 = var17.id_class("Structure");
                  var18.id_class("Id", () -> rVL.t.id_break(var15.id_native()).toString());
                  var18.id_class("Name", () -> var15.id_native().id_catch());
                  var18.id_class("Class", () -> var15.id_native().getClass().getCanonicalName());
                  throw new KU(var17);
               }
            }
         }
      }
   }

   private void id_class(reP_2<?, ?> var1, rVm_1 var2, rrrA var3, roC_2 var4, rrPt_1 var5, long var6, rfj_3 var8, rYG var9) {
      rrrH var10 = var3.id_class(rjh_3.id_class(var4.id_private(), 0), var1.id_protected, var4);
      int var11 = var10 != null ? var10.id_finally() : 0;
      rrSI var12 = this.id_protected.id_class(var1.id_protected);
      if (var12 != null) {
         rrrH var13 = var1.id_class(var2, this, this.id_break, var5, var6, var8, var9, var11, var12);
         var3.id_class(rjh_3.id_class(var4.id_private(), 0), var1.id_protected, var13, var4);
      }
   }

   public void id_class(rVm_1 var1, rrrA var2, roC_2 var3, rrPt_1 var4, long var5) {
      rfj_3 var7 = var3.id_private();
      rYG var8 = this.id_break.id_protected((var7.id_break << 2) + 2, 0, (var7.id_byte << 2) + 2);
      this.id_class(rrrF.id_extends, var1, var2, var3, var4, var5, var7, var8);

      for (Supplier var10 : var8.id_throws().id_class()) {
         this.id_class((reP_2<?, ?>)var10.get(), var1, var2, var3, var4, var5, var7, var8);
      }
   }

   public List<rYf_1> id_class(rYG var1, rrrA var2, aH_2 var3, rfH_2 var4) {
      return var1.id_break().id_class(var3);
   }

   public boolean id_class(rfj_3 var1) {
      this.id_catch();
      return this.id_case.contains(var1);
   }

   protected abstract Codec<? extends rKd_1> id_class();

   public abstract rRq_1 id_class(int var1, int var2);

   public void id_class(rKf_1 var1) {
   }

   public void id_class(long var1, rYA var3, roC_2 var4, rKu_1 var5) {
      rYA var6 = var3.id_class(this.id_break);
      rqm_3 var7 = new rqm_3();
      byte var8 = 8;
      rfj_3 var9 = var4.id_private();
      int var10 = var9.id_break;
      int var11 = var9.id_byte;
      rYv_1 var12 = this.id_break.id_protected(var9.id_break << 2, 0, var9.id_byte << 2).id_throws();
      BitSet var13 = ((rok_3)var4).id_break(var5);

      for (int var14 = var10 - 8; var14 <= var10 + 8; var14++) {
         for (int var15 = var11 - 8; var15 <= var11 + 8; var15++) {
            List var16 = var12.id_class(var5);
            ListIterator var17 = var16.listIterator();

            while (var17.hasNext()) {
               int var18 = var17.nextIndex();
               rDM var19 = (rDM)((Supplier)var17.next()).get();
               var7.id_byte(var1 + (long)var18, var14, var15);
               if (var19.id_class(var7, var14, var15)) {
                  var19.id_class(var4, var6::id_class, var7, this.id_case(), var14, var15, var10, var11, var13);
               }
            }
         }
      }
   }

   public abstract void id_class(rKf_1 var1, roC_2 var2);

   public void id_class(rKf_1 var1, rrrA var2) {
      int var3 = var1.id_protected();
      int var4 = var1.id_throws();
      int var5 = var3 * 16;
      int var6 = var4 * 16;
      rfH_2 var7 = new rfH_2(var5, 0, var6);
      rYG var8 = this.id_break.id_protected((var3 << 2) + 2, 2, (var4 << 2) + 2);
      rqm_3 var9 = new rqm_3();
      long var10 = var9.id_class(var1.id_break(), var5, var6);

      try {
         var8.id_class(var2, this, var1, var10, var9, var7);
      } catch (Exception var14) {
         KY var13 = KY.id_class(var14, "Biome decoration");
         var13.id_class("Generation").id_class("CenterX", var3).id_class("CenterZ", var4).id_class("Seed", var10).id_class("Biome", var8);
         throw new KU(var13);
      }
   }

   public rfH_2 id_class(rrEm_1 var1, rrrZ<?> var2, rfH_2 var3, int var4, boolean var5) {
      if (!this.id_break.id_class(var2)) {
         return null;
      } else if (var2 == rrrZ.id_extends) {
         this.id_catch();
         rfH_2 var14 = null;
         double var7 = Double.MAX_VALUE;
         rfw_3 var9 = new rfw_3();

         for (rfj_3 var11 : this.id_case) {
            var9.id_class((var11.id_break << 4) + 8, 32, (var11.id_byte << 4) + 8);
            double var12 = var9.id_private(var3);
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
         rrSI var6 = this.id_protected.id_class(var2);
         return var6 == null ? null : var2.id_class(var1, var1.id_protected(), var3, var4, var5, var1.id_break(), var6);
      }
   }

   public void id_class(rVL<rYG> var1, roC_2 var2) {
      rfj_3 var3 = var2.id_private();
      ((rok_3)var2).id_class(new rYZ(var1, var3, this.id_byte));
   }

   public abstract rKd_1 id_class(long var1);

   public int id_break(int var1, int var2, rKv_1 var3) {
      return this.id_class(var1, var2, var3);
   }

   public rrSq_1 id_break() {
      return this.id_protected;
   }

   public int id_throws() {
      return 256;
   }

   private void id_catch() {
      if (this.id_case.isEmpty()) {
         rrSf_1 var1 = this.id_protected.id_break();
         if (var1 != null && var1.id_byte() != 0) {
            ArrayList var2 = Lists.newArrayList();

            for (rYG var4 : this.id_break.id_break()) {
               if (var4.id_throws().id_class(rrrZ.id_extends)) {
                  var2.add(var4);
               }
            }

            int var17 = var1.id_class();
            int var18 = var1.id_byte();
            int var5 = var1.id_break();
            Random var6 = new Random();
            var6.setSeed(this.id_throws);
            double var7 = var6.nextDouble() * Math.PI * 2.0;
            int var9 = 0;
            int var10 = 0;

            for (int var11 = 0; var11 < var18; var11++) {
               double var12 = (double)(4 * var17 + var17 * var10 * 6) + (var6.nextDouble() - 0.5) * (double)var17 * 2.5;
               int var14 = (int)Math.round(Math.cos(var7) * var12);
               int var15 = (int)Math.round(Math.sin(var7) * var12);
               rfH_2 var16 = this.id_break.id_class((var14 << 4) + 8, 0, (var15 << 4) + 8, 112, var2::contains, var6);
               if (var16 != null) {
                  var14 = var16.b_() >> 4;
                  var15 = var16.d_() >> 4;
               }

               this.id_case.add(new rfj_3(var14, var15));
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

   public int id_case() {
      return 63;
   }

   public rYY id_protected() {
      return this.id_byte;
   }
}
