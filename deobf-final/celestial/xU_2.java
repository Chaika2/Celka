package celestial;

import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import java.util.Random;

public class xU_2 extends xd_3 implements rXL {
   public static final rCm_1 volatile_ = rCT.v;
   public static final Object2FloatMap<rpL_2> final_ = new Object2FloatOpenHashMap();
   private static final rjC_2 package_ = rjw_3.break_();
   private static final rjC_2[] int_ = rqR_2.class_(new rjC_2[9], var0 -> {
      for (int var1 = 0; var1 < 8; var1++) {
         var0[var1] = rjw_3.class_(package_, xd_3.class_(2.0, (double)Math.max(2, 1 + var1 * 2), 2.0, 14.0, 16.0, 14.0), rjN_2.throws_);
      }

      var0[8] = var0[7];
   });

   @Override
   public rjC_2 byte_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return package_;
   }

   static xc_3 byte_(xc_3 var0, rRg_1 var1, rfH_2 var2) {
      xc_3 var3 = var0.class_(volatile_, Integer.valueOf(0));
      var1.class_(var2, var3, 3);
      return var3;
   }

   public static xc_3 byte_(xc_3 var0, rYB var1, rfH_2 var2) {
      if (!var1.continue_) {
         float var3 = 0.7F;
         double var4 = (double)(var1.int_.nextFloat() * 0.7F) + 0.15F;
         double var6 = (double)(var1.int_.nextFloat() * 0.7F) + 0.060000002F + 0.6;
         double var8 = (double)(var1.int_.nextFloat() * 0.7F) + 0.15F;
         rsE_2 var10 = new rsE_2(var1, (double)var2.b_() + var4, (double)var2.c_() + var6, (double)var2.d_() + var8, new rdn_3(rdy_3.Xg));
         var10.private_();
         var1.a_(var10);
      }

      xc_3 var11 = byte_(var0, (rRg_1)var1, var2);
      var1.class_((rhd_3)null, var2, rqn_3.Pr, rqL_2.BLOCKS, 1.0F, 1.0F);
      return var11;
   }

   public xU_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)));
   }

   private static void class_(float var0, rpL_2 var1) {
      final_.put(var1.case_(), var0);
   }

   static xc_3 class_(xc_3 var0, rRg_1 var1, rfH_2 var2, rdn_3 var3) {
      int var4 = var0.byte_(volatile_);
      float var5 = final_.getFloat(var3.break_());
      if ((var4 != 0 || !(var5 > 0.0F)) && !(var1.long_().nextDouble() < (double)var5)) {
         return var0;
      } else {
         int var6 = var4 + 1;
         xc_3 var7 = var0.class_(volatile_, Integer.valueOf(var6));
         var1.class_(var2, var7, 3);
         if (var6 == 7) {
            var1.finally_().class_(var2, var0.break_(), 20);
         }

         return var7;
      }
   }

   @Override
   public rXF class_(xc_3 var1, rRg_1 var2, rfH_2 var3) {
      int var4 = var1.byte_(volatile_);
      return (rXF)(var4 == 8 ? new xa_3(var1, var2, var3, new rdn_3(rdy_3.Xg)) : (rXF)(var4 < 7 ? new xi_3(var1, var2, var3) : new xe_3()));
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return int_[var1.byte_(volatile_)];
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (var1.byte_(volatile_) == 7) {
         var2.finally_().class_(var3, var1.break_(), 20);
      }
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      int var7 = var1.byte_(volatile_);
      rdn_3 var8 = var4.protected_(var5);
      if (var7 < 8 && final_.containsKey(var8.break_())) {
         if (var7 < 7 && !var2.continue_) {
            xc_3 var9 = class_(var1, var2, var3, var8);
            var2.byte_(1500, var3, var1 != var9 ? 1 : 0);
            if (!((rhx_3)var4.implements_[18]).protected_) {
               var8.catch_(1);
            }
         }

         return ryZ_2.class_(var2.continue_);
      } else if (var7 == 8) {
         byte_(var1, var2, var3);
         return ryZ_2.class_(var2.continue_);
      } else {
         return ryZ_2.PASS;
      }
   }

   public static xc_3 class_(xc_3 var0, rrEm_1 var1, rdn_3 var2, rfH_2 var3) {
      int var4 = var0.byte_(volatile_);
      if (var4 < 7 && final_.containsKey(var2.break_())) {
         xc_3 var5 = class_(var0, var1, var3, var2);
         var2.catch_(1);
         return var5;
      } else {
         return var0;
      }
   }

   public static void class_(rYB var0, rfH_2 var1, boolean var2) {
      xc_3 var3 = var0.byte_(var1);
      var0.class_((double)var1.b_(), (double)var1.c_(), (double)var1.d_(), var2 ? rqn_3.PB : rqn_3.PP, rqL_2.BLOCKS, 1.0F, 1.0F, false);
      double var4 = var3.finally_(var0, var1).class_(rpB_2.Y, 0.5, 0.5) + 0.03125;
      double var6 = 0.13125F;
      double var8 = 0.7375F;
      Random var10 = var0.long_();

      for (int var11 = 0; var11 < 10; var11++) {
         double var12 = var10.nextGaussian() * 0.02;
         double var14 = var10.nextGaussian() * 0.02;
         double var16 = var10.nextGaussian() * 0.02;
         var0.class_(
            rLQ.abstract_,
            (double)var1.b_() + 0.13125F + 0.7375F * (double)var10.nextFloat(),
            (double)var1.c_() + var4 + (double)var10.nextFloat() * (1.0 - var4),
            (double)var1.d_() + 0.13125F + 0.7375F * (double)var10.nextFloat(),
            var12,
            var14,
            var16
         );
      }
   }

   public static void break_() {
      final_.defaultReturnValue(-1.0F);
      float var0 = 0.3F;
      float var1 = 0.5F;
      float var2 = 0.65F;
      float var3 = 0.85F;
      float var4 = 1.0F;
      class_(0.3F, rdy_3.L);
      class_(0.3F, rdy_3.Z);
      class_(0.3F, rdy_3.v);
      class_(0.3F, rdy_3.n);
      class_(0.3F, rdy_3.A);
      class_(0.3F, rdy_3.F);
      class_(0.3F, rdy_3.public_);
      class_(0.3F, rdy_3.goto_);
      class_(0.3F, rdy_3.while_);
      class_(0.3F, rdy_3.try_);
      class_(0.3F, rdy_3.instanceof_);
      class_(0.3F, rdy_3.throw_);
      class_(0.3F, rdy_3.kJ);
      class_(0.3F, rdy_3.Jd);
      class_(0.3F, rdy_3.R);
      class_(0.3F, rdy_3.rt);
      class_(0.3F, rdy_3.JW);
      class_(0.3F, rdy_3.Jk);
      class_(0.3F, rdy_3.K);
      class_(0.3F, rdy_3.WQ);
      class_(0.3F, rdy_3.hP);
      class_(0.5F, rdy_3.XG);
      class_(0.5F, rdy_3.EN);
      class_(0.5F, rdy_3.BS);
      class_(0.5F, rdy_3.rT);
      class_(0.5F, rdy_3.Be);
      class_(0.5F, rdy_3.ry);
      class_(0.5F, rdy_3.rp);
      class_(0.5F, rdy_3.rq);
      class_(0.5F, rdy_3.Jx);
      class_(0.65F, rdy_3.D);
      class_(0.65F, rdy_3.SO);
      class_(0.65F, rdy_3.Bd);
      class_(0.65F, rdy_3.Bk);
      class_(0.65F, rdy_3.BU);
      class_(0.65F, rdy_3.Ob);
      class_(0.65F, rdy_3.kX);
      class_(0.65F, rdy_3.ds);
      class_(0.65F, rdy_3.Xv);
      class_(0.65F, rdy_3.dE);
      class_(0.65F, rdy_3.hB);
      class_(0.65F, rdy_3.rL);
      class_(0.65F, rdy_3.rA);
      class_(0.65F, rdy_3.BY);
      class_(0.65F, rdy_3.rn);
      class_(0.65F, rdy_3.rC);
      class_(0.65F, rdy_3.JL);
      class_(0.65F, rdy_3.rl);
      class_(0.65F, rdy_3.rH);
      class_(0.65F, rdy_3.Wu);
      class_(0.65F, rdy_3.rx);
      class_(0.65F, rdy_3.rd);
      class_(0.65F, rdy_3.rk);
      class_(0.65F, rdy_3.rW);
      class_(0.65F, rdy_3.rz);
      class_(0.65F, rdy_3.rQ);
      class_(0.65F, rdy_3.rN);
      class_(0.65F, rdy_3.rc);
      class_(0.65F, rdy_3.ru);
      class_(0.65F, rdy_3.rm);
      class_(0.65F, rdy_3.rZ);
      class_(0.65F, rdy_3.rv);
      class_(0.65F, rdy_3.rF);
      class_(0.65F, rdy_3.Y);
      class_(0.65F, rdy_3.Ek);
      class_(0.65F, rdy_3.EW);
      class_(0.65F, rdy_3.Ez);
      class_(0.65F, rdy_3.EQ);
      class_(0.65F, rdy_3.Ec);
      class_(0.85F, rdy_3.sR);
      class_(0.85F, rdy_3.Bg);
      class_(0.85F, rdy_3.BR);
      class_(0.85F, rdy_3.Gk);
      class_(0.85F, rdy_3.GW);
      class_(0.85F, rdy_3.hS);
      class_(0.85F, rdy_3.dG);
      class_(0.85F, rdy_3.Jh);
      class_(1.0F, rdy_3.Xo);
      class_(1.0F, rdy_3.dN);
   }

   @Override
   public rjC_2 break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return int_[0];
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var1.byte_(volatile_) == 7) {
         var2.class_(var3, var1.class_(volatile_), 3);
         var2.class_((rhd_3)null, var3, rqn_3.PS, rqL_2.BLOCKS, 1.0F, 1.0F);
      }
   }

   @Override
   public int break_(xc_3 var1, rYB var2, rfH_2 var3) {
      return var1.byte_(volatile_);
   }

   @Override
   public boolean case_(xc_3 var1) {
      return true;
   }
}
