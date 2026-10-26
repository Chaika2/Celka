package celestial;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dt_3 extends Jj_1 {
   public static final rCm_1 final_ = rCT.k;
   public static final rCN package_ = Wt_1.volatile_;
   public static final rCN int_ = Wt_1.final_;
   public static final rCN new_ = Wt_1.package_;
   public static final rCN continue_ = Wt_1.int_;
   public static final rCN super_ = Wt_1.new_;
   private static final Map<rpr_3, rCN> this_ = Wt_1.super_.entrySet().stream().filter(var0 -> var0.getKey() != rpr_3.DOWN).collect(rqR_2.class_());
   private static final rjC_2 else_ = xd_3.class_(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final rjC_2 synchronized_ = xd_3.class_(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final rjC_2 return_ = xd_3.class_(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final rjC_2 public_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final rjC_2 goto_ = xd_3.class_(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<xc_3, rjC_2> while_;
   private final Object2IntMap<xd_3> try_ = new Object2IntOpenHashMap();
   private final Object2IntMap<xd_3> instanceof_ = new Object2IntOpenHashMap();

   public dt_3(Jq_1 var1) {
      super(var1, 1.0F);
      this.extends_(
         this.abstract_
            .break_()
            .class_(final_, Integer.valueOf(0))
            .class_(package_, Boolean.valueOf(false))
            .class_(int_, Boolean.valueOf(false))
            .class_(new_, Boolean.valueOf(false))
            .class_(continue_, Boolean.valueOf(false))
            .class_(super_, Boolean.valueOf(false))
      );
      this.while_ = ImmutableMap.copyOf(
         this.abstract_.class_().stream().filter(var0 -> var0.byte_(final_) == 0).collect(Collectors.toMap(Function.identity(), dt_3::private_))
      );
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      super.class_(var1, var2, var3, var4, var5);
      var2.finally_().class_(var3, this, class_(var2.int_));
   }

   private int class_(rRR var1, rfH_2 var2) {
      if (!var1.finally_(var2)) {
         return 0;
      } else {
         int var3 = 0;

         for (rpr_3 var7 : rpr_3.values()) {
            xc_3 var8 = var1.byte_(var2.break_(var7));
            var3 = Math.max(this.volatile_(var8), var3);
         }

         return var3;
      }
   }

   private xc_3 class_(rRg_1 var1, rfH_2 var2, int var3) {
      xc_3 var4 = class_(var1, var2);
      return var4.class_(xu_3.ro) ? var4.class_(final_, Integer.valueOf(var3)) : var4;
   }

   private void class_(rYB var1, rfH_2 var2, int var3, Random var4, int var5) {
      int var6 = this.implements_(var1.byte_(var2));
      if (var4.nextInt(var3) < var6) {
         xc_3 var7 = var1.byte_(var2);
         if (var4.nextInt(var5 + 10) < 5 && !var1.while_(var2)) {
            int var8 = Math.min(var5 + var4.nextInt(5) / 4, 15);
            var1.class_(var2, this.class_(var1, var2, var8), 3);
         } else {
            var1.class_(var2, false);
         }

         if (var7.break_() instanceof zQ_2 var9) {
            zQ_2.class_(var1, var2);
         }
      }
   }

   private void class_(xd_3 var1, int var2, int var3) {
      this.try_.put(var1, var2);
      this.instanceof_.put(var1, var3);
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(final_, package_, int_, new_, continue_, super_);
   }

   private static int class_(Random var0) {
      return 30 + var0.nextInt(10);
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      rfH_2 var4 = var3.break_();
      return var2.byte_(var4).protected_(var2, var4, rpr_3.UP) || this.protected_(var2, var3);
   }

   protected boolean class_(rYB var1, rfH_2 var2) {
      return var1.while_(var2) || var1.while_(var2.byte_()) || var1.while_(var2.extends_()) || var1.while_(var2.private_()) || var1.while_(var2.protected_());
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return this.class_(var1, var4, var5) ? this.class_(var4, var5, var1.byte_(final_)) : xu_3.class_.continue_();
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return this.break_(var1.int_(), var1.class_());
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.while_.get(var1.class_(final_, Integer.valueOf(0)));
   }

   public static void break_() {
      dt_3 var0 = (dt_3)xu_3.ro;
      var0.class_(xu_3.final_, 5, 20);
      var0.class_(xu_3.package_, 5, 20);
      var0.class_(xu_3.int_, 5, 20);
      var0.class_(xu_3.new_, 5, 20);
      var0.class_(xu_3.continue_, 5, 20);
      var0.class_(xu_3.super_, 5, 20);
      var0.class_(xu_3.Gg, 5, 20);
      var0.class_(xu_3.GR, 5, 20);
      var0.class_(xu_3.GY, 5, 20);
      var0.class_(xu_3.Go, 5, 20);
      var0.class_(xu_3.GK, 5, 20);
      var0.class_(xu_3.GD, 5, 20);
      var0.class_(xu_3.BU, 5, 20);
      var0.class_(xu_3.bx, 5, 20);
      var0.class_(xu_3.bd, 5, 20);
      var0.class_(xu_3.bk, 5, 20);
      var0.class_(xu_3.bz, 5, 20);
      var0.class_(xu_3.bW, 5, 20);
      var0.class_(xu_3.PV, 5, 20);
      var0.class_(xu_3.bQ, 5, 20);
      var0.class_(xu_3.bN, 5, 20);
      var0.class_(xu_3.bc, 5, 20);
      var0.class_(xu_3.bm, 5, 20);
      var0.class_(xu_3.bu, 5, 20);
      var0.class_(xu_3.rU, 5, 20);
      var0.class_(xu_3.Su, 5, 20);
      var0.class_(xu_3.Sc, 5, 20);
      var0.class_(xu_3.Sm, 5, 20);
      var0.class_(xu_3.Ez, 5, 20);
      var0.class_(xu_3.EQ, 5, 20);
      var0.class_(xu_3.static_, 5, 5);
      var0.class_(xu_3.import_, 5, 5);
      var0.class_(xu_3.short_, 5, 5);
      var0.class_(xu_3.default_, 5, 5);
      var0.class_(xu_3.const_, 5, 5);
      var0.class_(xu_3.strictfp_, 5, 5);
      var0.class_(xu_3.r, 5, 5);
      var0.class_(xu_3.boolean_, 5, 5);
      var0.class_(xu_3.transient_, 5, 5);
      var0.class_(xu_3.for_, 5, 5);
      var0.class_(xu_3.double_, 5, 5);
      var0.class_(xu_3.switch_, 5, 5);
      var0.class_(xu_3.b, 5, 5);
      var0.class_(xu_3.M, 5, 5);
      var0.class_(xu_3.O, 5, 5);
      var0.class_(xu_3.h, 5, 5);
      var0.class_(xu_3.X, 5, 5);
      var0.class_(xu_3.J, 5, 5);
      var0.class_(xu_3.P, 5, 5);
      var0.class_(xu_3.B, 5, 5);
      var0.class_(xu_3.S, 5, 5);
      var0.class_(xu_3.s, 5, 5);
      var0.class_(xu_3.E, 5, 5);
      var0.class_(xu_3.G, 5, 5);
      var0.class_(xu_3.x, 30, 60);
      var0.class_(xu_3.d, 30, 60);
      var0.class_(xu_3.k, 30, 60);
      var0.class_(xu_3.W, 30, 60);
      var0.class_(xu_3.z, 30, 60);
      var0.class_(xu_3.Q, 30, 60);
      var0.class_(xu_3.rj, 30, 20);
      var0.class_(xu_3.rf, 15, 100);
      var0.class_(xu_3.e, 60, 100);
      var0.class_(xu_3.a, 60, 100);
      var0.class_(xu_3.i, 60, 100);
      var0.class_(xu_3.Gr, 60, 100);
      var0.class_(xu_3.GP, 60, 100);
      var0.class_(xu_3.GB, 60, 100);
      var0.class_(xu_3.GS, 60, 100);
      var0.class_(xu_3.Gs, 60, 100);
      var0.class_(xu_3.GE, 60, 100);
      var0.class_(xu_3.ru, 60, 100);
      var0.class_(xu_3.rm, 60, 100);
      var0.class_(xu_3.rZ, 60, 100);
      var0.class_(xu_3.rv, 60, 100);
      var0.class_(xu_3.rF, 60, 100);
      var0.class_(xu_3.rL, 60, 100);
      var0.class_(xu_3.rA, 60, 100);
      var0.class_(xu_3.rn, 60, 100);
      var0.class_(xu_3.rC, 60, 100);
      var0.class_(xu_3.rl, 60, 100);
      var0.class_(xu_3.rH, 60, 100);
      var0.class_(xu_3.rp, 60, 100);
      var0.class_(xu_3.ry, 60, 100);
      var0.class_(xu_3.rs, 30, 60);
      var0.class_(xu_3.rE, 30, 60);
      var0.class_(xu_3.rG, 30, 60);
      var0.class_(xu_3.rb, 30, 60);
      var0.class_(xu_3.rM, 30, 60);
      var0.class_(xu_3.rO, 30, 60);
      var0.class_(xu_3.rh, 30, 60);
      var0.class_(xu_3.rX, 30, 60);
      var0.class_(xu_3.rJ, 30, 60);
      var0.class_(xu_3.rx, 30, 60);
      var0.class_(xu_3.rd, 30, 60);
      var0.class_(xu_3.rk, 30, 60);
      var0.class_(xu_3.rW, 30, 60);
      var0.class_(xu_3.rz, 30, 60);
      var0.class_(xu_3.rQ, 30, 60);
      var0.class_(xu_3.rN, 30, 60);
      var0.class_(xu_3.BD, 15, 100);
      var0.class_(xu_3.Ea, 5, 5);
      var0.class_(xu_3.Ey, 60, 20);
      var0.class_(xu_3.Jb, 15, 20);
      var0.class_(xu_3.Ep, 60, 20);
      var0.class_(xu_3.Eq, 60, 20);
      var0.class_(xu_3.ET, 60, 20);
      var0.class_(xu_3.Et, 60, 20);
      var0.class_(xu_3.Ew, 60, 20);
      var0.class_(xu_3.EI, 60, 20);
      var0.class_(xu_3.Ef, 60, 20);
      var0.class_(xu_3.Ej, 60, 20);
      var0.class_(xu_3.EV, 60, 20);
      var0.class_(xu_3.Eg, 60, 20);
      var0.class_(xu_3.ER, 60, 20);
      var0.class_(xu_3.EY, 60, 20);
      var0.class_(xu_3.Eo, 60, 20);
      var0.class_(xu_3.EK, 60, 20);
      var0.class_(xu_3.ED, 60, 20);
      var0.class_(xu_3.EU, 60, 20);
      var0.class_(xu_3.Oh, 30, 60);
      var0.class_(xu_3.hs, 60, 60);
      var0.class_(xu_3.hU, 60, 60);
      var0.class_(xu_3.Xs, 30, 20);
      var0.class_(xu_3.JG, 5, 20);
      var0.class_(xu_3.XJ, 60, 100);
      var0.class_(xu_3.JO, 5, 20);
      var0.class_(xu_3.JM, 30, 20);
   }

   protected xc_3 break_(rRq_1 var1, rfH_2 var2) {
      rfH_2 var3 = var2.break_();
      xc_3 var4 = var1.byte_(var3);
      if (!this.catch_(var4) && !var4.protected_(var1, var3, rpr_3.UP)) {
         xc_3 var5 = this.continue_();

         for (rpr_3 var9 : rpr_3.values()) {
            rCN var10 = this_.get(var9);
            if (var10 != null) {
               var5 = var5.class_(var10, Boolean.valueOf(this.catch_(var1.byte_(var2.break_(var9)))));
            }
         }

         return var5;
      } else {
         return this.continue_();
      }
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      var2.synchronized_().class_(var3, this, class_(var2.int_));
      if (var2.B().break_(rRu_1.class_)) {
         if (!var1.class_(var2, var3)) {
            var2.class_(var3, false);
         }

         xc_3 var5 = var2.byte_(var3.break_());
         boolean var6 = var5.class_(var2.default_().package_());
         int var7 = var1.byte_(final_);
         if (!var6 && var2.s() && this.class_((rYB)var2, var3) && var4.nextFloat() < 0.2F + (float)var7 * 0.03F) {
            var2.class_(var3, false);
         } else {
            int var8 = Math.min(15, var7 + var4.nextInt(3) / 2);
            if (var7 != var8) {
               var1 = var1.class_(final_, Integer.valueOf(var8));
               var2.class_(var3, var1, 4);
            }

            if (!var6) {
               if (!this.protected_(var2, var3)) {
                  rfH_2 var20 = var3.break_();
                  if (!var2.byte_(var20).protected_(var2, var20, rpr_3.UP) || var7 > 3) {
                     var2.class_(var3, false);
                  }

                  return;
               }

               if (var7 == 15 && var4.nextInt(4) == 0 && !this.catch_(var2.byte_(var3.break_()))) {
                  var2.class_(var3, false);
                  return;
               }
            }

            boolean var9 = var2.try_(var3);
            int var10 = var9 ? -50 : 0;
            this.class_(var2, var3.extends_(), 300 + var10, var4, var7);
            this.class_(var2, var3.byte_(), 300 + var10, var4, var7);
            this.class_(var2, var3.break_(), 250 + var10, var4, var7);
            this.class_(var2, var3.final_(), 250 + var10, var4, var7);
            this.class_(var2, var3.private_(), 300 + var10, var4, var7);
            this.class_(var2, var3.protected_(), 300 + var10, var4, var7);
            rfw_3 var11 = new rfw_3();

            for (int var12 = -1; var12 <= 1; var12++) {
               for (int var13 = -1; var13 <= 1; var13++) {
                  for (int var14 = -1; var14 <= 4; var14++) {
                     if (var12 != 0 || var14 != 0 || var13 != 0) {
                        int var15 = 100;
                        if (var14 > 1) {
                           var15 += (var14 - 1) * 100;
                        }

                        var11.class_(var3, var12, var14, var13);
                        int var16 = this.class_((rRR)var2, var11);
                        if (var16 > 0) {
                           int var17 = (var16 + 40 + var2.abstract_().class_() * 7) / (var7 + 30);
                           if (var9) {
                              var17 /= 2;
                           }

                           if (var17 > 0 && var4.nextInt(var15) <= var17 && (!var2.s() || !this.class_((rYB)var2, var11))) {
                              int var18 = Math.min(15, var7 + var4.nextInt(5) / 4);
                              var2.class_(var11, this.class_(var2, var11, var18), 3);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean catch_(xc_3 var1) {
      return this.volatile_(var1) > 0;
   }

   private int implements_(xc_3 var1) {
      return var1.break_(rCT.throw_) && var1.byte_(rCT.throw_) ? 0 : this.instanceof_.getInt(var1.break_());
   }

   private boolean protected_(rRq_1 var1, rfH_2 var2) {
      for (rpr_3 var6 : rpr_3.values()) {
         if (this.catch_(var1.byte_(var2.break_(var6)))) {
            return true;
         }
      }

      return false;
   }

   private static rjC_2 private_(xc_3 var0) {
      rjC_2 var1 = rjw_3.class_();
      if (var0.byte_(super_)) {
         var1 = else_;
      }

      if (var0.byte_(package_)) {
         var1 = rjw_3.class_(var1, public_);
      }

      if (var0.byte_(new_)) {
         var1 = rjw_3.class_(var1, goto_);
      }

      if (var0.byte_(int_)) {
         var1 = rjw_3.class_(var1, return_);
      }

      if (var0.byte_(continue_)) {
         var1 = rjw_3.class_(var1, synchronized_);
      }

      return var1.break_() ? volatile_ : var1;
   }

   private int volatile_(xc_3 var1) {
      return var1.break_(rCT.throw_) && var1.byte_(rCT.throw_) ? 0 : this.try_.getInt(var1.break_());
   }
}
