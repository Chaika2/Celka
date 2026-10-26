package celestial;

import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import java.util.Random;

public class xU_2 extends xd_3 implements rXL {
   public static final rCm_1 id_volatile = rCT.v;
   public static final Object2FloatMap<rpL_2> id_final = new Object2FloatOpenHashMap();
   private static final rjC_2 id_package = rjw_3.id_break();
   private static final rjC_2[] id_int = rqR_2.id_class(new rjC_2[9], var0 -> {
      for (int var1 = 0; var1 < 8; var1++) {
         var0[var1] = rjw_3.id_class(id_package, xd_3.id_class(2.0, (double)Math.max(2, 1 + var1 * 2), 2.0, 14.0, 16.0, 14.0), rjN_2.id_throws);
      }

      var0[8] = var0[7];
   });

   @Override
   public rjC_2 id_byte(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return id_package;
   }

   static xc_3 id_byte(xc_3 var0, rRg_1 var1, rfH_2 var2) {
      xc_3 var3 = var0.id_class(id_volatile, Integer.valueOf(0));
      var1.id_class(var2, var3, 3);
      return var3;
   }

   public static xc_3 id_byte(xc_3 var0, rYB var1, rfH_2 var2) {
      if (!var1.id_continue) {
         float var3 = 0.7F;
         double var4 = (double)(var1.id_int.nextFloat() * 0.7F) + 0.15F;
         double var6 = (double)(var1.id_int.nextFloat() * 0.7F) + 0.060000002F + 0.6;
         double var8 = (double)(var1.id_int.nextFloat() * 0.7F) + 0.15F;
         rsE_2 var10 = new rsE_2(var1, (double)var2.b_() + var4, (double)var2.c_() + var6, (double)var2.d_() + var8, new rdn_3(rdy_3.Xg));
         var10.id_private();
         var1.a_(var10);
      }

      xc_3 var11 = id_byte(var0, (rRg_1)var1, var2);
      var1.id_class((rhd_3)null, var2, rqn_3.Pr, rqL_2.BLOCKS, 1.0F, 1.0F);
      return var11;
   }

   public xU_2(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(0)));
   }

   private static void id_class(float var0, rpL_2 var1) {
      id_final.put(var1.id_case(), var0);
   }

   static xc_3 id_class(xc_3 var0, rRg_1 var1, rfH_2 var2, rdn_3 var3) {
      int var4 = var0.id_byte(id_volatile);
      float var5 = id_final.getFloat(var3.id_break());
      if ((var4 != 0 || !(var5 > 0.0F)) && !(var1.id_long().nextDouble() < (double)var5)) {
         return var0;
      } else {
         int var6 = var4 + 1;
         xc_3 var7 = var0.id_class(id_volatile, Integer.valueOf(var6));
         var1.id_class(var2, var7, 3);
         if (var6 == 7) {
            var1.id_finally().id_class(var2, var0.id_break(), 20);
         }

         return var7;
      }
   }

   @Override
   public rXF id_class(xc_3 var1, rRg_1 var2, rfH_2 var3) {
      int var4 = var1.id_byte(id_volatile);
      return (rXF)(var4 == 8 ? new xa_3(var1, var2, var3, new rdn_3(rdy_3.Xg)) : (rXF)(var4 < 7 ? new xi_3(var1, var2, var3) : new xe_3()));
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_int[var1.id_byte(id_volatile)];
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (var1.id_byte(id_volatile) == 7) {
         var2.id_finally().id_class(var3, var1.id_break(), 20);
      }
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      int var7 = var1.id_byte(id_volatile);
      rdn_3 var8 = var4.id_protected(var5);
      if (var7 < 8 && id_final.containsKey(var8.id_break())) {
         if (var7 < 7 && !var2.id_continue) {
            xc_3 var9 = id_class(var1, var2, var3, var8);
            var2.id_byte(1500, var3, var1 != var9 ? 1 : 0);
            if (!((rhx_3)var4.id_implements[18]).id_protected) {
               var8.id_catch(1);
            }
         }

         return ryZ_2.id_class(var2.id_continue);
      } else if (var7 == 8) {
         id_byte(var1, var2, var3);
         return ryZ_2.id_class(var2.id_continue);
      } else {
         return ryZ_2.PASS;
      }
   }

   public static xc_3 id_class(xc_3 var0, rrEm_1 var1, rdn_3 var2, rfH_2 var3) {
      int var4 = var0.id_byte(id_volatile);
      if (var4 < 7 && id_final.containsKey(var2.id_break())) {
         xc_3 var5 = id_class(var0, var1, var3, var2);
         var2.id_catch(1);
         return var5;
      } else {
         return var0;
      }
   }

   public static void id_class(rYB var0, rfH_2 var1, boolean var2) {
      xc_3 var3 = var0.id_byte(var1);
      var0.id_class((double)var1.b_(), (double)var1.c_(), (double)var1.d_(), var2 ? rqn_3.PB : rqn_3.PP, rqL_2.BLOCKS, 1.0F, 1.0F, false);
      double var4 = var3.id_finally(var0, var1).id_class(rpB_2.Y, 0.5, 0.5) + 0.03125;
      double var6 = 0.13125F;
      double var8 = 0.7375F;
      Random var10 = var0.id_long();

      for (int var11 = 0; var11 < 10; var11++) {
         double var12 = var10.nextGaussian() * 0.02;
         double var14 = var10.nextGaussian() * 0.02;
         double var16 = var10.nextGaussian() * 0.02;
         var0.id_class(
            rLQ.id_abstract,
            (double)var1.b_() + 0.13125F + 0.7375F * (double)var10.nextFloat(),
            (double)var1.c_() + var4 + (double)var10.nextFloat() * (1.0 - var4),
            (double)var1.d_() + 0.13125F + 0.7375F * (double)var10.nextFloat(),
            var12,
            var14,
            var16
         );
      }
   }

   public static void id_break() {
      id_final.defaultReturnValue(-1.0F);
      float var0 = 0.3F;
      float var1 = 0.5F;
      float var2 = 0.65F;
      float var3 = 0.85F;
      float var4 = 1.0F;
      id_class(0.3F, rdy_3.L);
      id_class(0.3F, rdy_3.Z);
      id_class(0.3F, rdy_3.v);
      id_class(0.3F, rdy_3.n);
      id_class(0.3F, rdy_3.A);
      id_class(0.3F, rdy_3.F);
      id_class(0.3F, rdy_3.id_public);
      id_class(0.3F, rdy_3.id_goto);
      id_class(0.3F, rdy_3.id_while);
      id_class(0.3F, rdy_3.id_try);
      id_class(0.3F, rdy_3.id_instanceof);
      id_class(0.3F, rdy_3.id_throw);
      id_class(0.3F, rdy_3.kJ);
      id_class(0.3F, rdy_3.Jd);
      id_class(0.3F, rdy_3.R);
      id_class(0.3F, rdy_3.rt);
      id_class(0.3F, rdy_3.JW);
      id_class(0.3F, rdy_3.Jk);
      id_class(0.3F, rdy_3.K);
      id_class(0.3F, rdy_3.WQ);
      id_class(0.3F, rdy_3.hP);
      id_class(0.5F, rdy_3.XG);
      id_class(0.5F, rdy_3.EN);
      id_class(0.5F, rdy_3.BS);
      id_class(0.5F, rdy_3.rT);
      id_class(0.5F, rdy_3.Be);
      id_class(0.5F, rdy_3.ry);
      id_class(0.5F, rdy_3.rp);
      id_class(0.5F, rdy_3.rq);
      id_class(0.5F, rdy_3.Jx);
      id_class(0.65F, rdy_3.D);
      id_class(0.65F, rdy_3.SO);
      id_class(0.65F, rdy_3.Bd);
      id_class(0.65F, rdy_3.Bk);
      id_class(0.65F, rdy_3.BU);
      id_class(0.65F, rdy_3.Ob);
      id_class(0.65F, rdy_3.kX);
      id_class(0.65F, rdy_3.ds);
      id_class(0.65F, rdy_3.Xv);
      id_class(0.65F, rdy_3.dE);
      id_class(0.65F, rdy_3.hB);
      id_class(0.65F, rdy_3.rL);
      id_class(0.65F, rdy_3.rA);
      id_class(0.65F, rdy_3.BY);
      id_class(0.65F, rdy_3.rn);
      id_class(0.65F, rdy_3.rC);
      id_class(0.65F, rdy_3.JL);
      id_class(0.65F, rdy_3.rl);
      id_class(0.65F, rdy_3.rH);
      id_class(0.65F, rdy_3.Wu);
      id_class(0.65F, rdy_3.rx);
      id_class(0.65F, rdy_3.rd);
      id_class(0.65F, rdy_3.rk);
      id_class(0.65F, rdy_3.rW);
      id_class(0.65F, rdy_3.rz);
      id_class(0.65F, rdy_3.rQ);
      id_class(0.65F, rdy_3.rN);
      id_class(0.65F, rdy_3.rc);
      id_class(0.65F, rdy_3.ru);
      id_class(0.65F, rdy_3.rm);
      id_class(0.65F, rdy_3.rZ);
      id_class(0.65F, rdy_3.rv);
      id_class(0.65F, rdy_3.rF);
      id_class(0.65F, rdy_3.Y);
      id_class(0.65F, rdy_3.Ek);
      id_class(0.65F, rdy_3.EW);
      id_class(0.65F, rdy_3.Ez);
      id_class(0.65F, rdy_3.EQ);
      id_class(0.65F, rdy_3.Ec);
      id_class(0.85F, rdy_3.sR);
      id_class(0.85F, rdy_3.Bg);
      id_class(0.85F, rdy_3.BR);
      id_class(0.85F, rdy_3.Gk);
      id_class(0.85F, rdy_3.GW);
      id_class(0.85F, rdy_3.hS);
      id_class(0.85F, rdy_3.dG);
      id_class(0.85F, rdy_3.Jh);
      id_class(1.0F, rdy_3.Xo);
      id_class(1.0F, rdy_3.dN);
   }

   @Override
   public rjC_2 id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_int[0];
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var1.id_byte(id_volatile) == 7) {
         var2.id_class(var3, var1.id_class(id_volatile), 3);
         var2.id_class((rhd_3)null, var3, rqn_3.PS, rqL_2.BLOCKS, 1.0F, 1.0F);
      }
   }

   @Override
   public int id_break(xc_3 var1, rYB var2, rfH_2 var3) {
      return var1.id_byte(id_volatile);
   }

   @Override
   public boolean id_case(xc_3 var1) {
      return true;
   }
}
