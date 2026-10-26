package celestial;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dt_3 extends Jj_1 {
   public static final rCm_1 id_final = rCT.k;
   public static final rCN id_package = Wt_1.id_volatile;
   public static final rCN id_int = Wt_1.id_final;
   public static final rCN id_new = Wt_1.id_package;
   public static final rCN id_continue = Wt_1.id_int;
   public static final rCN id_super = Wt_1.id_new;
   private static final Map<rpr_3, rCN> id_this = Wt_1.id_super.entrySet().stream().filter(var0 -> var0.getKey() != rpr_3.DOWN).collect(rqR_2.id_class());
   private static final rjC_2 id_else = xd_3.id_class(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final rjC_2 id_synchronized = xd_3.id_class(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final rjC_2 id_return = xd_3.id_class(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final rjC_2 id_public = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final rjC_2 id_goto = xd_3.id_class(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<xc_3, rjC_2> id_while;
   private final Object2IntMap<xd_3> id_try = new Object2IntOpenHashMap();
   private final Object2IntMap<xd_3> id_instanceof = new Object2IntOpenHashMap();

   public dt_3(Jq_1 var1) {
      super(var1, 1.0F);
      this.id_extends(
         this.id_abstract
            .id_break()
            .id_class(id_final, Integer.valueOf(0))
            .id_class(id_package, Boolean.valueOf(false))
            .id_class(id_int, Boolean.valueOf(false))
            .id_class(id_new, Boolean.valueOf(false))
            .id_class(id_continue, Boolean.valueOf(false))
            .id_class(id_super, Boolean.valueOf(false))
      );
      this.id_while = ImmutableMap.copyOf(
         this.id_abstract.id_class().stream().filter(var0 -> var0.id_byte(id_final) == 0).collect(Collectors.toMap(Function.identity(), dt_3::id_private))
      );
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      super.id_class(var1, var2, var3, var4, var5);
      var2.id_finally().id_class(var3, this, id_class(var2.id_int));
   }

   private int id_class(rRR var1, rfH_2 var2) {
      if (!var1.id_finally(var2)) {
         return 0;
      } else {
         int var3 = 0;

         for (rpr_3 var7 : rpr_3.values()) {
            xc_3 var8 = var1.id_byte(var2.id_break(var7));
            var3 = Math.max(this.id_volatile(var8), var3);
         }

         return var3;
      }
   }

   private xc_3 id_class(rRg_1 var1, rfH_2 var2, int var3) {
      xc_3 var4 = id_class(var1, var2);
      return var4.id_class(xu_3.ro) ? var4.id_class(id_final, Integer.valueOf(var3)) : var4;
   }

   private void id_class(rYB var1, rfH_2 var2, int var3, Random var4, int var5) {
      int var6 = this.id_implements(var1.id_byte(var2));
      if (var4.nextInt(var3) < var6) {
         xc_3 var7 = var1.id_byte(var2);
         if (var4.nextInt(var5 + 10) < 5 && !var1.id_while(var2)) {
            int var8 = Math.min(var5 + var4.nextInt(5) / 4, 15);
            var1.id_class(var2, this.id_class(var1, var2, var8), 3);
         } else {
            var1.id_class(var2, false);
         }

         if (var7.id_break() instanceof zQ_2 var9) {
            zQ_2.id_class(var1, var2);
         }
      }
   }

   private void id_class(xd_3 var1, int var2, int var3) {
      this.id_try.put(var1, var2);
      this.id_instanceof.put(var1, var3);
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_final, id_package, id_int, id_new, id_continue, id_super);
   }

   private static int id_class(Random var0) {
      return 30 + var0.nextInt(10);
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      rfH_2 var4 = var3.id_break();
      return var2.id_byte(var4).id_protected(var2, var4, rpr_3.UP) || this.id_protected(var2, var3);
   }

   protected boolean id_class(rYB var1, rfH_2 var2) {
      return var1.id_while(var2)
         || var1.id_while(var2.id_byte())
         || var1.id_while(var2.id_extends())
         || var1.id_while(var2.id_private())
         || var1.id_while(var2.id_protected());
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return this.id_class(var1, var4, var5) ? this.id_class(var4, var5, var1.id_byte(id_final)) : xu_3.id_class.id_continue();
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return this.id_break(var1.id_int(), var1.id_class());
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.id_while.get(var1.id_class(id_final, Integer.valueOf(0)));
   }

   public static void id_break() {
      dt_3 var0 = (dt_3)xu_3.ro;
      var0.id_class(xu_3.id_final, 5, 20);
      var0.id_class(xu_3.id_package, 5, 20);
      var0.id_class(xu_3.id_int, 5, 20);
      var0.id_class(xu_3.id_new, 5, 20);
      var0.id_class(xu_3.id_continue, 5, 20);
      var0.id_class(xu_3.id_super, 5, 20);
      var0.id_class(xu_3.Gg, 5, 20);
      var0.id_class(xu_3.GR, 5, 20);
      var0.id_class(xu_3.GY, 5, 20);
      var0.id_class(xu_3.Go, 5, 20);
      var0.id_class(xu_3.GK, 5, 20);
      var0.id_class(xu_3.GD, 5, 20);
      var0.id_class(xu_3.BU, 5, 20);
      var0.id_class(xu_3.bx, 5, 20);
      var0.id_class(xu_3.bd, 5, 20);
      var0.id_class(xu_3.bk, 5, 20);
      var0.id_class(xu_3.bz, 5, 20);
      var0.id_class(xu_3.bW, 5, 20);
      var0.id_class(xu_3.PV, 5, 20);
      var0.id_class(xu_3.bQ, 5, 20);
      var0.id_class(xu_3.bN, 5, 20);
      var0.id_class(xu_3.bc, 5, 20);
      var0.id_class(xu_3.bm, 5, 20);
      var0.id_class(xu_3.bu, 5, 20);
      var0.id_class(xu_3.rU, 5, 20);
      var0.id_class(xu_3.Su, 5, 20);
      var0.id_class(xu_3.Sc, 5, 20);
      var0.id_class(xu_3.Sm, 5, 20);
      var0.id_class(xu_3.Ez, 5, 20);
      var0.id_class(xu_3.EQ, 5, 20);
      var0.id_class(xu_3.id_static, 5, 5);
      var0.id_class(xu_3.id_import, 5, 5);
      var0.id_class(xu_3.id_short, 5, 5);
      var0.id_class(xu_3.id_default, 5, 5);
      var0.id_class(xu_3.id_const, 5, 5);
      var0.id_class(xu_3.id_strictfp, 5, 5);
      var0.id_class(xu_3.r, 5, 5);
      var0.id_class(xu_3.id_boolean, 5, 5);
      var0.id_class(xu_3.id_transient, 5, 5);
      var0.id_class(xu_3.id_for, 5, 5);
      var0.id_class(xu_3.id_double, 5, 5);
      var0.id_class(xu_3.id_switch, 5, 5);
      var0.id_class(xu_3.b, 5, 5);
      var0.id_class(xu_3.M, 5, 5);
      var0.id_class(xu_3.O, 5, 5);
      var0.id_class(xu_3.h, 5, 5);
      var0.id_class(xu_3.X, 5, 5);
      var0.id_class(xu_3.J, 5, 5);
      var0.id_class(xu_3.P, 5, 5);
      var0.id_class(xu_3.B, 5, 5);
      var0.id_class(xu_3.S, 5, 5);
      var0.id_class(xu_3.s, 5, 5);
      var0.id_class(xu_3.E, 5, 5);
      var0.id_class(xu_3.G, 5, 5);
      var0.id_class(xu_3.x, 30, 60);
      var0.id_class(xu_3.d, 30, 60);
      var0.id_class(xu_3.k, 30, 60);
      var0.id_class(xu_3.W, 30, 60);
      var0.id_class(xu_3.z, 30, 60);
      var0.id_class(xu_3.Q, 30, 60);
      var0.id_class(xu_3.rj, 30, 20);
      var0.id_class(xu_3.rf, 15, 100);
      var0.id_class(xu_3.e, 60, 100);
      var0.id_class(xu_3.a, 60, 100);
      var0.id_class(xu_3.i, 60, 100);
      var0.id_class(xu_3.Gr, 60, 100);
      var0.id_class(xu_3.GP, 60, 100);
      var0.id_class(xu_3.GB, 60, 100);
      var0.id_class(xu_3.GS, 60, 100);
      var0.id_class(xu_3.Gs, 60, 100);
      var0.id_class(xu_3.GE, 60, 100);
      var0.id_class(xu_3.ru, 60, 100);
      var0.id_class(xu_3.rm, 60, 100);
      var0.id_class(xu_3.rZ, 60, 100);
      var0.id_class(xu_3.rv, 60, 100);
      var0.id_class(xu_3.rF, 60, 100);
      var0.id_class(xu_3.rL, 60, 100);
      var0.id_class(xu_3.rA, 60, 100);
      var0.id_class(xu_3.rn, 60, 100);
      var0.id_class(xu_3.rC, 60, 100);
      var0.id_class(xu_3.rl, 60, 100);
      var0.id_class(xu_3.rH, 60, 100);
      var0.id_class(xu_3.rp, 60, 100);
      var0.id_class(xu_3.ry, 60, 100);
      var0.id_class(xu_3.rs, 30, 60);
      var0.id_class(xu_3.rE, 30, 60);
      var0.id_class(xu_3.rG, 30, 60);
      var0.id_class(xu_3.rb, 30, 60);
      var0.id_class(xu_3.rM, 30, 60);
      var0.id_class(xu_3.rO, 30, 60);
      var0.id_class(xu_3.rh, 30, 60);
      var0.id_class(xu_3.rX, 30, 60);
      var0.id_class(xu_3.rJ, 30, 60);
      var0.id_class(xu_3.rx, 30, 60);
      var0.id_class(xu_3.rd, 30, 60);
      var0.id_class(xu_3.rk, 30, 60);
      var0.id_class(xu_3.rW, 30, 60);
      var0.id_class(xu_3.rz, 30, 60);
      var0.id_class(xu_3.rQ, 30, 60);
      var0.id_class(xu_3.rN, 30, 60);
      var0.id_class(xu_3.BD, 15, 100);
      var0.id_class(xu_3.Ea, 5, 5);
      var0.id_class(xu_3.Ey, 60, 20);
      var0.id_class(xu_3.Jb, 15, 20);
      var0.id_class(xu_3.Ep, 60, 20);
      var0.id_class(xu_3.Eq, 60, 20);
      var0.id_class(xu_3.ET, 60, 20);
      var0.id_class(xu_3.Et, 60, 20);
      var0.id_class(xu_3.Ew, 60, 20);
      var0.id_class(xu_3.EI, 60, 20);
      var0.id_class(xu_3.Ef, 60, 20);
      var0.id_class(xu_3.Ej, 60, 20);
      var0.id_class(xu_3.EV, 60, 20);
      var0.id_class(xu_3.Eg, 60, 20);
      var0.id_class(xu_3.ER, 60, 20);
      var0.id_class(xu_3.EY, 60, 20);
      var0.id_class(xu_3.Eo, 60, 20);
      var0.id_class(xu_3.EK, 60, 20);
      var0.id_class(xu_3.ED, 60, 20);
      var0.id_class(xu_3.EU, 60, 20);
      var0.id_class(xu_3.Oh, 30, 60);
      var0.id_class(xu_3.hs, 60, 60);
      var0.id_class(xu_3.hU, 60, 60);
      var0.id_class(xu_3.Xs, 30, 20);
      var0.id_class(xu_3.JG, 5, 20);
      var0.id_class(xu_3.XJ, 60, 100);
      var0.id_class(xu_3.JO, 5, 20);
      var0.id_class(xu_3.JM, 30, 20);
   }

   protected xc_3 id_break(rRq_1 var1, rfH_2 var2) {
      rfH_2 var3 = var2.id_break();
      xc_3 var4 = var1.id_byte(var3);
      if (!this.id_catch(var4) && !var4.id_protected(var1, var3, rpr_3.UP)) {
         xc_3 var5 = this.id_continue();

         for (rpr_3 var9 : rpr_3.values()) {
            rCN var10 = id_this.get(var9);
            if (var10 != null) {
               var5 = var5.id_class(var10, Boolean.valueOf(this.id_catch(var1.id_byte(var2.id_break(var9)))));
            }
         }

         return var5;
      } else {
         return this.id_continue();
      }
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      var2.id_synchronized().id_class(var3, this, id_class(var2.id_int));
      if (var2.B().id_break(rRu_1.id_class)) {
         if (!var1.id_class(var2, var3)) {
            var2.id_class(var3, false);
         }

         xc_3 var5 = var2.id_byte(var3.id_break());
         boolean var6 = var5.id_class(var2.id_default().id_package());
         int var7 = var1.id_byte(id_final);
         if (!var6 && var2.s() && this.id_class((rYB)var2, var3) && var4.nextFloat() < 0.2F + (float)var7 * 0.03F) {
            var2.id_class(var3, false);
         } else {
            int var8 = Math.min(15, var7 + var4.nextInt(3) / 2);
            if (var7 != var8) {
               var1 = var1.id_class(id_final, Integer.valueOf(var8));
               var2.id_class(var3, var1, 4);
            }

            if (!var6) {
               if (!this.id_protected(var2, var3)) {
                  rfH_2 var20 = var3.id_break();
                  if (!var2.id_byte(var20).id_protected(var2, var20, rpr_3.UP) || var7 > 3) {
                     var2.id_class(var3, false);
                  }

                  return;
               }

               if (var7 == 15 && var4.nextInt(4) == 0 && !this.id_catch(var2.id_byte(var3.id_break()))) {
                  var2.id_class(var3, false);
                  return;
               }
            }

            boolean var9 = var2.id_try(var3);
            int var10 = var9 ? -50 : 0;
            this.id_class(var2, var3.id_extends(), 300 + var10, var4, var7);
            this.id_class(var2, var3.id_byte(), 300 + var10, var4, var7);
            this.id_class(var2, var3.id_break(), 250 + var10, var4, var7);
            this.id_class(var2, var3.id_final(), 250 + var10, var4, var7);
            this.id_class(var2, var3.id_private(), 300 + var10, var4, var7);
            this.id_class(var2, var3.id_protected(), 300 + var10, var4, var7);
            rfw_3 var11 = new rfw_3();

            for (int var12 = -1; var12 <= 1; var12++) {
               for (int var13 = -1; var13 <= 1; var13++) {
                  for (int var14 = -1; var14 <= 4; var14++) {
                     if (var12 != 0 || var14 != 0 || var13 != 0) {
                        int var15 = 100;
                        if (var14 > 1) {
                           var15 += (var14 - 1) * 100;
                        }

                        var11.id_class(var3, var12, var14, var13);
                        int var16 = this.id_class((rRR)var2, var11);
                        if (var16 > 0) {
                           int var17 = (var16 + 40 + var2.id_abstract().id_class() * 7) / (var7 + 30);
                           if (var9) {
                              var17 /= 2;
                           }

                           if (var17 > 0 && var4.nextInt(var15) <= var17 && (!var2.s() || !this.id_class((rYB)var2, var11))) {
                              int var18 = Math.min(15, var7 + var4.nextInt(5) / 4);
                              var2.id_class(var11, this.id_class(var2, var11, var18), 3);
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
   protected boolean id_catch(xc_3 var1) {
      return this.id_volatile(var1) > 0;
   }

   private int id_implements(xc_3 var1) {
      return var1.id_break(rCT.id_throw) && var1.id_byte(rCT.id_throw) ? 0 : this.id_instanceof.getInt(var1.id_break());
   }

   private boolean id_protected(rRq_1 var1, rfH_2 var2) {
      for (rpr_3 var6 : rpr_3.values()) {
         if (this.id_catch(var1.id_byte(var2.id_break(var6)))) {
            return true;
         }
      }

      return false;
   }

   private static rjC_2 id_private(xc_3 var0) {
      rjC_2 var1 = rjw_3.id_class();
      if (var0.id_byte(id_super)) {
         var1 = id_else;
      }

      if (var0.id_byte(id_package)) {
         var1 = rjw_3.id_class(var1, id_public);
      }

      if (var0.id_byte(id_new)) {
         var1 = rjw_3.id_class(var1, id_goto);
      }

      if (var0.id_byte(id_int)) {
         var1 = rjw_3.id_class(var1, id_return);
      }

      if (var0.id_byte(id_continue)) {
         var1 = rjw_3.id_class(var1, id_synchronized);
      }

      return var1.id_break() ? id_volatile : var1;
   }

   private int id_volatile(xc_3 var1) {
      return var1.id_break(rCT.id_throw) && var1.id_byte(rCT.id_throw) ? 0 : this.id_try.getInt(var1.id_break());
   }
}
