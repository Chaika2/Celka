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
   private static final rRQ class_ = new rRQ();
   private final boolean break_;
   private final rRz_1 byte_;
   private final Random protected_ = new Random();
   private final rYB throws_;
   private final double case_;
   private final double catch_;
   private final double private_;
   private final an_3 implements_;
   private final float finally_;
   private final rye_3 extends_;
   private final rRQ native_;
   private final List<rfH_2> volatile_ = Lists.newArrayList();
   private final Map<rhd_3, rjU_2> final_ = Maps.newHashMap();

   public Map<rhd_3, rjU_2> byte_() {
      return this.final_;
   }

   public rRW(rYB var1, an_3 var2, rye_3 var3, rRQ var4, double var5, double var7, double var9, float var11, boolean var12, rRz_1 var13) {
      this.throws_ = var1;
      this.implements_ = var2;
      this.finally_ = var11;
      this.case_ = var5;
      this.catch_ = var7;
      this.private_ = var9;
      this.break_ = var12;
      this.byte_ = var13;
      this.extends_ = var3 == null ? rye_3.class_(this) : var3;
      this.native_ = var4 == null ? this.class_(var2) : var4;
   }

   public rRW(rYB var1, an_3 var2, double var3, double var5, double var7, float var9, boolean var10, rRz_1 var11) {
      this(var1, var2, (rye_3)null, (rRQ)null, var3, var5, var7, var9, var10, var11);
   }

   public rRW(rYB var1, an_3 var2, double var3, double var5, double var7, float var9, boolean var10, rRz_1 var11, List<rfH_2> var12) {
      this(var1, var2, var3, var5, var7, var9, var10, var11);
      this.volatile_.addAll(var12);
   }

   public rRW(rYB var1, an_3 var2, double var3, double var5, double var7, float var9, List<rfH_2> var10) {
      this(var1, var2, var3, var5, var7, var9, false, rRz_1.DESTROY, var10);
   }

   private static void class_(ObjectArrayList<Pair<rdn_3, rfH_2>> var0, rdn_3 var1, rfH_2 var2) {
      int var3 = var0.size();

      for (int var4 = 0; var4 < var3; var4++) {
         Pair var5 = (Pair)var0.get(var4);
         rdn_3 var6 = (rdn_3)var5.getFirst();
         if (rsE_2.class_(var6, var1)) {
            rdn_3 var7 = rsE_2.class_(var6, var1, 16);
            var0.set(var4, Pair.of(var7, (rfH_2)var5.getSecond()));
            if (var1.class_()) {
               return;
            }
         }
      }

      var0.add(Pair.of(var1, var2));
   }

   private rRQ class_(an_3 var1) {
      return (rRQ)(var1 == null ? class_ : new rRk_1(var1));
   }

   public void class_() {
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
                  float var14 = this.finally_ * (0.7F + this.throws_.int_.nextFloat() * 0.6F);
                  double var15 = this.case_;
                  double var17 = this.catch_;
                  double var19 = this.private_;

                  for (float var21 = 0.3F; var14 > 0.0F; var14 -= 0.22500001F) {
                     rfH_2 var22 = new rfH_2(var15, var17, var19);
                     xc_3 var23 = this.throws_.byte_(var22);
                     rXE var24 = this.throws_.break_(var22);
                     Optional var25 = this.native_.class_(this, this.throws_, var22, var23, var24);
                     if (var25.isPresent()) {
                        var14 -= (var25.get() + 0.3F) * 0.3F;
                     }

                     if (var14 > 0.0F && this.native_.class_(this, this.throws_, var22, var23, var14)) {
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

      this.volatile_.addAll(var1);
      float var31 = this.finally_ * 2.0F;
      int var32 = rfU_2.byte_(this.case_ - (double)var31 - 1.0);
      int var33 = rfU_2.byte_(this.case_ + (double)var31 + 1.0);
      int var35 = rfU_2.byte_(this.catch_ - (double)var31 - 1.0);
      int var7 = rfU_2.byte_(this.catch_ + (double)var31 + 1.0);
      int var37 = rfU_2.byte_(this.private_ - (double)var31 - 1.0);
      int var9 = rfU_2.byte_(this.private_ + (double)var31 + 1.0);
      List var39 = this.throws_.class_(this.implements_, new rfl_3((double)var32, (double)var35, (double)var37, (double)var33, (double)var7, (double)var9));
      rjU_2 var11 = new rjU_2(this.case_, this.catch_, this.private_);

      for (int var40 = 0; var40 < var39.size(); var40++) {
         an_3 var13 = (an_3)var39.get(var40);
         if (!var13.Bl()) {
            double var41 = (double)(rfU_2.class_(var13.break_(var11)) / var31);
            if (var41 <= 1.0) {
               double var16 = var13.rx() - this.case_;
               double var18 = (var13 instanceof rsX_2 ? var13.re() : var13.rH()) - this.catch_;
               double var20 = var13.BO() - this.private_;
               double var45 = (double)rfU_2.class_(var16 * var16 + var18 * var18 + var20 * var20);
               if (var45 != 0.0) {
                  var16 /= var45;
                  var18 /= var45;
                  var20 /= var45;
                  double var46 = (double)class_(var11, var13);
                  double var26 = (1.0 - var41) * var46;
                  var13.break_(this.break_(), (float)((int)((var26 * var26 + var26) / 2.0 * 7.0 * (double)var31 + 1.0)));
                  double var28 = var26;
                  if (var13 instanceof iB_2) {
                     var28 = aM_2.class_((iB_2)var13, var26);
                  }

                  var13.byte_(var13.rv().break_(var16 * var28, var18 * var28, var20 * var28));
                  if (var13 instanceof rhd_3) {
                     rhd_3 var30 = (rhd_3)var13;
                     if (!var30.native_() && (!var30.implements_() || !((rhx_3)var30.implements_[18]).break_)) {
                        this.final_.put(var30, new rjU_2(var16 * var26, var18 * var26, var20 * var26));
                     }
                  }
               }
            }
         }
      }
   }

   public static float class_(rjU_2 var0, an_3 var1) {
      rfl_3 var2 = var1.rN();
      double var3 = 1.0 / ((var2.protected_ - var2.class_) * 2.0 + 1.0);
      double var5 = 1.0 / ((var2.throws_ - var2.break_) * 2.0 + 1.0);
      double var7 = 1.0 / ((var2.case_ - var2.byte_) * 2.0 + 1.0);
      double var9 = (1.0 - Math.floor(1.0 / var3) * var3) / 2.0;
      double var11 = (1.0 - Math.floor(1.0 / var7) * var7) / 2.0;
      if (!(var3 < 0.0) && !(var5 < 0.0) && !(var7 < 0.0)) {
         int var13 = 0;
         int var14 = 0;

         for (float var15 = 0.0F; var15 <= 1.0F; var15 = (float)((double)var15 + var3)) {
            for (float var16 = 0.0F; var16 <= 1.0F; var16 = (float)((double)var16 + var5)) {
               for (float var17 = 0.0F; var17 <= 1.0F; var17 = (float)((double)var17 + var7)) {
                  double var18 = rfU_2.protected_((double)var15, var2.class_, var2.protected_);
                  double var20 = rfU_2.protected_((double)var16, var2.break_, var2.throws_);
                  double var22 = rfU_2.protected_((double)var17, var2.byte_, var2.case_);
                  rjU_2 var24 = new rjU_2(var18 + var9, var20, var22 + var11);
                  if (((rYB)var1.throws_[7]).class_(new rjB_2(var24, var0, rjS_2.COLLIDER, rjs_3.NONE, var1)).byte_() == rjM_2.MISS) {
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

   public void class_(boolean var1) {
      if (this.throws_.continue_) {
         this.throws_
            .class_(
               this.case_,
               this.catch_,
               this.private_,
               rqn_3.SR,
               rqL_2.BLOCKS,
               4.0F,
               (1.0F + (this.throws_.int_.nextFloat() - this.throws_.int_.nextFloat()) * 0.2F) * 0.7F,
               false
            );
      }

      boolean var2 = this.byte_ != rRz_1.NONE;
      if (var1) {
         if (!(this.finally_ < 2.0F) && var2) {
            this.throws_.class_(rLQ.synchronized_, this.case_, this.catch_, this.private_, 1.0, 0.0, 0.0);
         } else {
            this.throws_.class_(rLQ.return_, this.case_, this.catch_, this.private_, 1.0, 0.0, 0.0);
         }
      }

      if (var2) {
         ObjectArrayList var3 = new ObjectArrayList();
         Collections.shuffle(this.volatile_, this.throws_.int_);

         for (rfH_2 var5 : this.volatile_) {
            xc_3 var6 = this.throws_.byte_(var5);
            xd_3 var7 = var6.break_();
            if (!var6.catch_()) {
               rfH_2 var8 = var5.int_();
               if (var7.class_(this) && this.throws_ instanceof rrEm_1) {
                  ryO_2 var9 = var7.protected_() ? this.throws_.class_(var5) : null;
                  rzP_2 var10 = new rzP_2((rrEm_1)this.throws_)
                     .class_(this.throws_.int_)
                     .class_(rzQ_2.case_, rjU_2.class_((rja_3)var5))
                     .class_(rzQ_2.implements_, rdn_3.break_)
                     .break_(rzQ_2.private_, var9)
                     .break_(rzQ_2.class_, this.implements_);
                  if (this.byte_ == rRz_1.DESTROY) {
                     var10.class_(rzQ_2.finally_, this.finally_);
                  }

                  var6.class_(var10).forEach(var2x -> class_(var3, var2x, var8));
               }

               this.throws_.class_(var5, xu_3.class_.continue_(), 3);
               var7.class_(this.throws_, var5, this);
            }
         }

         ObjectListIterator var12 = var3.iterator();

         while (var12.hasNext()) {
            Pair var14 = (Pair)var12.next();
            xd_3.class_(this.throws_, (rfH_2)var14.getSecond(), (rdn_3)var14.getFirst());
         }
      }

      if (this.break_) {
         for (rfH_2 var13 : this.volatile_) {
            if (this.protected_.nextInt(3) == 0
               && this.throws_.byte_(var13).catch_()
               && this.throws_.byte_(var13.break_()).implements_(this.throws_, var13.break_())) {
               this.throws_.break_(var13, Jj_1.class_(this.throws_, var13));
            }
         }
      }
   }

   public rye_3 break_() {
      return this.extends_;
   }

   public void throws_() {
      this.volatile_.clear();
   }

   public List<rfH_2> case_() {
      return this.volatile_;
   }

   public iB_2 protected_() {
      if (this.implements_ == null) {
         return null;
      } else if (this.implements_ instanceof rsX_2) {
         return ((rsX_2)this.implements_).protected_();
      } else if (this.implements_ instanceof iB_2) {
         return (iB_2)this.implements_;
      } else {
         if (this.implements_ instanceof rhf_3) {
            an_3 var1 = ((rhf_3)this.implements_).else_();
            if (var1 instanceof iB_2) {
               return (iB_2)var1;
            }
         }

         return null;
      }
   }
}
