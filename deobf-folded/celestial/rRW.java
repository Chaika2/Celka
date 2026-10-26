package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

public class rRW {
   private static final rRQ id_class = new rRQ();
   private final boolean id_break;
   private final rRz_1 id_byte;
   private final Random id_protected = new Random();
   private final rYB id_throws;
   private final double id_case;
   private final double id_catch;
   private final double id_private;
   private final an_3 id_implements;
   private final float id_finally;
   private final rye_3 id_extends;
   private final rRQ id_native;
   private final List<rfH_2> id_volatile = Lists.newArrayList();
   private final Map<rhd_3, rjU_2> id_final = Maps.newHashMap();

   public Map<rhd_3, rjU_2> id_byte() {
      return this.id_final;
   }

   public rRW(rYB var1, an_3 var2, rye_3 var3, rRQ var4, double var5, double var7, double var9, float var11, boolean var12, rRz_1 var13) {
      this.id_throws = var1;
      this.id_implements = var2;
      this.id_finally = var11;
      this.id_case = var5;
      this.id_catch = var7;
      this.id_private = var9;
      this.id_break = var12;
      this.id_byte = var13;
      this.id_extends = var3 == null ? rye_3.id_class(this) : var3;
      this.id_native = var4 == null ? this.id_class(var2) : var4;
   }

   public rRW(rYB var1, an_3 var2, double var3, double var5, double var7, float var9, boolean var10, rRz_1 var11) {
      this(var1, var2, (rye_3)null, (rRQ)null, var3, var5, var7, var9, var10, var11);
   }

   public rRW(rYB var1, an_3 var2, double var3, double var5, double var7, float var9, boolean var10, rRz_1 var11, List<rfH_2> var12) {
      this(var1, var2, var3, var5, var7, var9, var10, var11);
      this.id_volatile.addAll(var12);
   }

   public rRW(rYB var1, an_3 var2, double var3, double var5, double var7, float var9, List<rfH_2> var10) {
      this(var1, var2, var3, var5, var7, var9, false, rRz_1.DESTROY, var10);
   }

   private static void id_class(ObjectArrayList<Pair<rdn_3, rfH_2>> var0, rdn_3 var1, rfH_2 var2) {
      int var3 = var0.size();

      for (int var4 = 0; var4 < var3; var4++) {
         Pair var5 = (Pair)var0.get(var4);
         rdn_3 var6 = (rdn_3)var5.getFirst();
         if (rsE_2.id_class(var6, var1)) {
            rdn_3 var7 = rsE_2.id_class(var6, var1, 16);
            var0.set(var4, Pair.of(var7, (rfH_2)var5.getSecond()));
            if (var1.id_class()) {
               return;
            }
         }
      }

      var0.add(Pair.of(var1, var2));
   }

   private rRQ id_class(an_3 var1) {
      return (rRQ)(var1 == null ? id_class : new rRk_1(var1));
   }

   public void id_class() {
      HashSet var1 = Sets.newHashSet();
      byte var2 = 16;

      for (int var3 = 0; var3 < 16; var3++) {
         for (int var4 = 0; var4 < 16; var4++) {
            for (int var5 = 0; var5 < 16; var5++) {
               if (var3 == 0 || var3 == 15 || var4 == 0 || var4 == 15 || var5 == 0 || var5 == 15) {
                  double var6 = (double)((float)var3 / 15.0F * 2.0F - 1.0F);
                  double var8 = (double)((float)var4 / 15.0F * 2.0F - 1.0F);
                  double var10 = (double)((float)var5 / 15.0F * 2.0F - 1.0F);
                  double var12 = Math.sqrt(var6 * var6 + var8 * var8 + var10 * var10);
                  var6 /= var12;
                  var8 /= var12;
                  var10 /= var12;
                  float var14 = this.id_finally * (0.7F + this.id_throws.id_int.nextFloat() * 0.6F);
                  double var15 = this.id_case;
                  double var17 = this.id_catch;
                  double var19 = this.id_private;

                  for (float var21 = 0.3F; var14 > 0.0F; var14 -= 0.22500001F) {
                     rfH_2 var22 = new rfH_2(var15, var17, var19);
                     xc_3 var23 = this.id_throws.id_byte(var22);
                     rXE var24 = this.id_throws.id_break(var22);
                     Optional var25 = this.id_native.id_class(this, this.id_throws, var22, var23, var24);
                     if (var25.isPresent()) {
                        var14 -= (var25.get() + 0.3F) * 0.3F;
                     }

                     if (var14 > 0.0F && this.id_native.id_class(this, this.id_throws, var22, var23, var14)) {
                        var1.add(var22);
                     }

                     var15 += var6 * 0.3F;
                     var17 += var8 * 0.3F;
                     var19 += var10 * 0.3F;
                  }
               }
            }
         }
      }

      this.id_volatile.addAll(var1);
      float var31 = this.id_finally * 2.0F;
      int var32 = rfU_2.id_byte(this.id_case - (double)var31 - 1.0);
      int var33 = rfU_2.id_byte(this.id_case + (double)var31 + 1.0);
      int var35 = rfU_2.id_byte(this.id_catch - (double)var31 - 1.0);
      int var7 = rfU_2.id_byte(this.id_catch + (double)var31 + 1.0);
      int var37 = rfU_2.id_byte(this.id_private - (double)var31 - 1.0);
      int var9 = rfU_2.id_byte(this.id_private + (double)var31 + 1.0);
      List var39 = this.id_throws
         .id_class(this.id_implements, new rfl_3((double)var32, (double)var35, (double)var37, (double)var33, (double)var7, (double)var9));
      rjU_2 var11 = new rjU_2(this.id_case, this.id_catch, this.id_private);

      for (int var40 = 0; var40 < var39.size(); var40++) {
         an_3 var13 = (an_3)var39.get(var40);
         if (!var13.Bl()) {
            double var41 = (double)(rfU_2.id_class(var13.id_break(var11)) / var31);
            if (var41 <= 1.0) {
               double var16 = var13.rx() - this.id_case;
               double var18 = (var13 instanceof rsX_2 ? var13.re() : var13.rH()) - this.id_catch;
               double var20 = var13.BO() - this.id_private;
               double var45 = (double)rfU_2.id_class(var16 * var16 + var18 * var18 + var20 * var20);
               if (var45 != 0.0) {
                  var16 /= var45;
                  var18 /= var45;
                  var20 /= var45;
                  double var46 = (double)id_class(var11, var13);
                  double var26 = (1.0 - var41) * var46;
                  var13.id_break(this.id_break(), (float)((int)((var26 * var26 + var26) / 2.0 * 7.0 * (double)var31 + 1.0)));
                  double var28 = var26;
                  if (var13 instanceof iB_2) {
                     var28 = aM_2.id_class((iB_2)var13, var26);
                  }

                  var13.id_byte(var13.rv().id_break(var16 * var28, var18 * var28, var20 * var28));
                  if (var13 instanceof rhd_3) {
                     rhd_3 var30 = (rhd_3)var13;
                     if (!var30.id_native() && (!var30.id_implements() || !((rhx_3)var30.id_implements[18]).id_break)) {
                        this.id_final.put(var30, new rjU_2(var16 * var26, var18 * var26, var20 * var26));
                     }
                  }
               }
            }
         }
      }
   }

   public static float id_class(rjU_2 var0, an_3 var1) {
      rfl_3 var2 = var1.rN();
      double var3 = 1.0 / ((var2.id_protected - var2.id_class) * 2.0 + 1.0);
      double var5 = 1.0 / ((var2.id_throws - var2.id_break) * 2.0 + 1.0);
      double var7 = 1.0 / ((var2.id_case - var2.id_byte) * 2.0 + 1.0);
      double var9 = (1.0 - Math.floor(1.0 / var3) * var3) / 2.0;
      double var11 = (1.0 - Math.floor(1.0 / var7) * var7) / 2.0;
      if (!(var3 < 0.0) && !(var5 < 0.0) && !(var7 < 0.0)) {
         int var13 = 0;
         int var14 = 0;

         for (float var15 = 0.0F; var15 <= 1.0F; var15 = (float)((double)var15 + var3)) {
            for (float var16 = 0.0F; var16 <= 1.0F; var16 = (float)((double)var16 + var5)) {
               for (float var17 = 0.0F; var17 <= 1.0F; var17 = (float)((double)var17 + var7)) {
                  double var18 = rfU_2.id_protected((double)var15, var2.id_class, var2.id_protected);
                  double var20 = rfU_2.id_protected((double)var16, var2.id_break, var2.id_throws);
                  double var22 = rfU_2.id_protected((double)var17, var2.id_byte, var2.id_case);
                  rjU_2 var24 = new rjU_2(var18 + var9, var20, var22 + var11);
                  if (((rYB)var1.id_throws[7]).id_class(new rjB_2(var24, var0, rjS_2.COLLIDER, rjs_3.NONE, var1)).id_byte() == rjM_2.MISS) {
                     var13++;
                  }

                  var14++;
               }
            }
         }

         return (float)var13 / (float)var14;
      } else {
         return 0.0F;
      }
   }

   public void id_class(boolean var1) {
      if (this.id_throws.id_continue) {
         this.id_throws
            .id_class(
               this.id_case,
               this.id_catch,
               this.id_private,
               rqn_3.SR,
               rqL_2.BLOCKS,
               4.0F,
               (1.0F + (this.id_throws.id_int.nextFloat() - this.id_throws.id_int.nextFloat()) * 0.2F) * 0.7F,
               false
            );
      }

      boolean var2 = this.id_byte != rRz_1.NONE;
      if (var1) {
         if (!(this.id_finally < 2.0F) && var2) {
            this.id_throws.id_class(rLQ.id_synchronized, this.id_case, this.id_catch, this.id_private, 1.0, 0.0, 0.0);
         } else {
            this.id_throws.id_class(rLQ.id_return, this.id_case, this.id_catch, this.id_private, 1.0, 0.0, 0.0);
         }
      }

      if (var2) {
         ObjectArrayList var3 = new ObjectArrayList();
         Collections.shuffle(this.id_volatile, this.id_throws.id_int);

         for (rfH_2 var5 : this.id_volatile) {
            xc_3 var6 = this.id_throws.id_byte(var5);
            xd_3 var7 = var6.id_break();
            if (!var6.id_catch()) {
               rfH_2 var8 = var5.id_int();
               if (var7.id_class(this) && this.id_throws instanceof rrEm_1) {
                  ryO_2 var9 = var7.id_protected() ? this.id_throws.id_class(var5) : null;
                  rzP_2 var10 = new rzP_2((rrEm_1)this.id_throws)
                     .id_class(this.id_throws.id_int)
                     .id_class(rzQ_2.id_case, rjU_2.id_class((rja_3)var5))
                     .id_class(rzQ_2.id_implements, rdn_3.id_break)
                     .id_break(rzQ_2.id_private, var9)
                     .id_break(rzQ_2.id_class, this.id_implements);
                  if (this.id_byte == rRz_1.DESTROY) {
                     var10.id_class(rzQ_2.id_finally, this.id_finally);
                  }

                  var6.id_class(var10).forEach(var2x -> id_class(var3, var2x, var8));
               }

               this.id_throws.id_class(var5, xu_3.id_class.id_continue(), 3);
               var7.id_class(this.id_throws, var5, this);
            }
         }

         ObjectListIterator var12 = var3.iterator();

         while (var12.hasNext()) {
            Pair var14 = (Pair)var12.next();
            xd_3.id_class(this.id_throws, (rfH_2)var14.getSecond(), (rdn_3)var14.getFirst());
         }
      }

      if (this.id_break) {
         for (rfH_2 var13 : this.id_volatile) {
            if (this.id_protected.nextInt(3) == 0
               && this.id_throws.id_byte(var13).id_catch()
               && this.id_throws.id_byte(var13.id_break()).id_implements(this.id_throws, var13.id_break())) {
               this.id_throws.id_break(var13, Jj_1.id_class(this.id_throws, var13));
            }
         }
      }
   }

   public rye_3 id_break() {
      return this.id_extends;
   }

   public void id_throws() {
      this.id_volatile.clear();
   }

   public List<rfH_2> id_case() {
      return this.id_volatile;
   }

   public iB_2 id_protected() {
      if (this.id_implements == null) {
         return null;
      } else if (this.id_implements instanceof rsX_2) {
         return ((rsX_2)this.id_implements).id_protected();
      } else if (this.id_implements instanceof iB_2) {
         return (iB_2)this.id_implements;
      } else {
         if (this.id_implements instanceof rhf_3) {
            an_3 var1 = ((rhf_3)this.id_implements).id_else();
            if (var1 instanceof iB_2) {
               return (iB_2)var1;
            }
         }

         return null;
      }
   }
}
