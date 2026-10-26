package celestial;

import com.google.common.collect.Lists;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class cb_3 extends cG_2 {
   public Object[] break_;
   private static double[] finally_;
   private static short[] extends_;
   private static byte[] native_;
   private static float[] volatile_;
   private static boolean[] final_;

   public boolean boolean_() {
      this.Es();
      return (Boolean)this.break_[12];
   }

   @Override
   public boolean char_() {
      return true;
   }

   @Override
   public float byte_(boolean var1) {
      this.Es();
      double var2 = 20.0;
      if (var1) {
         var2 += var2 - (double)C_throws.byte_().continue_().break_();
      }

      return (float)((double)(volatile_[76] * Math.max(1.0F, ((rqw_3)((QY)this.break_[18]).class_[6]).class_())) / this.class_(iQ_2.private_) * var2);
   }

   public void byte_(String var1) {
      this.Es();
      this.break_[16] = var1;
   }

   public void byte_(float var1) {
      this.Es();
      if ((Boolean)this.break_[15]) {
         float var2 = this.Ss() - var1;
         if (var2 <= 0.0F) {
            this.public_(var1);
            if (var2 < 0.0F) {
               Integer var7 = 10;
               this.throws_[47] = var7;
            }
         } else {
            Float var8 = var2;
            this.private_[40] = var8;
            this.public_(this.Ss());
            Integer var9 = 20;
            this.throws_[47] = var9;
            this.class_(rye_3.final_, var2);
            Integer var10 = 10;
            this.private_[11] = var10;
            Integer var11 = (Integer)this.private_[11];
            this.private_[10] = var11;
         }
      } else {
         this.public_(var1);
         Boolean var12 = true;
         this.break_[15] = var12;
      }
   }

   @Override
   public void byte_(an_3 var1) {
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
         .finally_()
         .class_(rrAx_1.class_((rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[1]))
         .byte_()) {
         super.byte_(var1);
      }
   }

   public boolean long_() {
      this.Es();
      return (Boolean)this.break_[32];
   }

   public boolean float_() {
      this.Es();
      return (Boolean)this.break_[10];
   }

   public float double_() {
      this.Es();

      for (NW var2 : (List)this.break_[3]) {
         if (var2 instanceof NM) {
            return ((NM)var2).class_();
         }
      }

      return volatile_[2];
   }

   public cb_3(QY var1, gm_3 var2, Aq_1 var3, rlP_2 var4, VR var5, boolean var6, boolean var7) {
      super(var2, var3.catch_());
      this.Es();
      ArrayList var12 = Lists.newArrayList();
      this.break_[3] = var12;
      Integer var13 = 0;
      this.break_[4] = var13;
      Boolean var14 = true;
      this.break_[33] = var14;
      Boolean var15 = true;
      this.break_[36] = var15;
      Float var16 = -1.0F;
      this.break_[49] = var16;
      Float var17 = -1.0F;
      this.break_[50] = var17;
      PX var18 = (PX)PX.class_[0];
      this.break_[53] = var18;
      this.break_[18] = var1;
      this.break_[0] = var3;
      this.break_[1] = var4;
      this.break_[2] = var5;
      Boolean var23 = var6;
      this.break_[12] = var23;
      Boolean var24 = var7;
      this.break_[13] = var24;
      ((List)this.break_[3]).add(new cP_2(this, var1.c()));
      ((List)this.break_[3]).add(new Nh_1(this));
      ((List)this.break_[3]).add(new NM(this, var1.c(), var2.static_()));
      aF_2 var25 = new aF_2();
      this.break_[52] = var25;
      rqB_2 var26 = new rqB_2();
      this.break_[37] = var26;
      rrAM.break_(this);
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean B() {
      return !((rhx_3)this.implements_[18]).break_ && super.B() ? true : final_[25];
   }

   public boolean F() {
      return !this.x() && !this.PW() ? final_[49] : final_[48];
   }

   @Override
   public void J() {
      this.Es();
      ((Aq_1)this.break_[0]).class_(new rmI_2(rmf_3.PERFORM_RESPAWN));
   }

   public boolean S() {
      this.Es();
      if (!(Boolean)this.break_[39] && !((rhx_3)this.implements_[18]).break_ && rrfo_3.byte_() && !this.Pm() && !this.o_()) {
         rdn_3 var1 = this.class_(rXQ.CHEST);
         return var1.break_() == rdy_3.kc && rxH_2.protected_(var1) && this.sC() ? true : final_[122];
      } else {
         return final_[123];
      }
   }

   public VR Z() {
      this.Es();
      return (VR)this.break_[2];
   }

   @Override
   public void this_() {
      this.Es();
      ((rqB_2)this.break_[37]).class_();
      Float var10 = (Float)this.break_[45];
      this.break_[43] = var10;
      Float var11 = (Float)this.break_[46];
      this.break_[44] = var11;
      Float var12 = (Float)this.throws_[15];
      this.break_[45] = var12;
      Float var13 = (Float)this.throws_[16];
      this.break_[46] = var13;
      if ((vm_3)((QY)this.break_[18]).class_[73] != null) {
         ((vm_3)((QY)this.break_[18]).class_[73]).super_();
      }

      rdn_3 var1 = ((rhz_3)this.implements_[1]).finally_();
      if (!var1.class_()) {
         var1.protected_++;
      }

      rdn_3 var2 = this.sX();
      if (!var2.class_() && this.SH() == 2) {
         this.break_[30] = var2;
      }

      if (((rYB)this.throws_[7]).int_(new rfH_2(this.rx(), 0.0, this.BO()))) {
         q_1.class_((Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]);
         t_1 var15 = ((t_1)t_1.class_[0]).break_((w_1)w_1.staticFieldsa114f317008a3fe78339d2b3c5e6fe39[0]);
         this.break_[51] = var15;
         super.this_();
         rrAo_1 var3 = rrAo_1.class_(
            this.rx(),
            this.re(),
            this.BO(),
            (Double)this.break_[5],
            (Double)this.break_[6],
            (Double)this.break_[7],
            (Float)this.throws_[15],
            (Float)this.throws_[16],
            (Float)this.break_[8],
            (Float)this.break_[9],
            this.BL(),
            this.PF(),
            this.h()
         );
         Float var16 = (Float)this.throws_[15] - (Float)this.break_[8];
         this.break_[47] = var16;
         Float var17 = (Float)this.throws_[16] - (Float)this.break_[9];
         this.break_[48] = var17;
         if (this.Pm()) {
            ((Aq_1)this.break_[0]).class_(new rZJ(var3.synchronized_(), var3.continue_(), var3.extends_()));
            ((Aq_1)this.break_[0]).class_(new rma_3((Float)this.private_[42], (Float)this.private_[44], ((rqr_3)this.break_[17]).private_, var3.private_()));
            an_3 var4 = this.PO();
            if (var4 != this && var4.Po()) {
               ((Aq_1)this.break_[0]).class_(new rZS(var4));
            }
         } else {
            this.class_(var3);
         }

         for (NW var5 : (List)this.break_[3]) {
            var5.break_();
         }

         q_1.class_((Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1]);
      }
   }

   public float b() {
      this.Es();
      return (Float)this.break_[9];
   }

   @Override
   public boolean x() {
      this.Es();
      return (Boolean)this.break_[11];
   }

   public aF_2 s() {
      this.Es();
      return (aF_2)this.break_[52];
   }

   public void c() {
      this.Es();
      this.sz();
      ((Aq_1)((cb_3)((QY)this.break_[18]).class_[57]).break_[0]).class_(new rmD_2((cb_3)((QY)this.break_[18]).class_[57], rmU_2.START_FALL_FLYING));
   }

   public void n() {
      this.Es();
      ((Aq_1)this.break_[0]).class_(new rmD_2(this, rmU_2.START_RIDING_JUMP, rfU_2.protected_(this.E() * 100.0F)));
   }

   @Override
   public boolean h() {
      this.Es();
      return (rqr_3)this.break_[17] != null && ((rqr_3)this.break_[17]).implements_ ? true : final_[47];
   }

   public boolean d() {
      this.Es();
      return (Boolean)this.break_[36];
   }

   @Override
   public float interface_() {
      this.Es();
      return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
         .finally_()
         .class_(rrLl_1.break_(super.interface_() * Math.max(1.0F, ((rqw_3)((QY)this.break_[18]).class_[6]).class_())))
         .class_();
   }

   @Override
   public void class_(rgP_2 var1, UUID var2) {
      this.Es();
      ((cq_3)((QY)this.break_[18]).class_[19]).throws_().class_(var1);
   }

   @Override
   public void class_(rHZ var1) {
      this.Es();
      ((QY)this.break_[18]).break_(new ml_3(var1));
   }

   @Override
   public void class_(iM_2 var1) {
      this.Es();
      if (((cb_3)((QY)this.break_[18]).class_[57]).Pb() != var1) {
         ((Ax_1)((QY)this.break_[18]).class_[55]).throws_ = System.currentTimeMillis();
      }

      super.class_(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAJ.break_(var1)).class_());
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1773510689190289366L;
   }

   public void class_(float var1, int var2, int var3) {
      Float var8 = var1;
      this.implements_[21] = var8;
      Integer var9 = var2;
      this.implements_[20] = var9;
      Integer var10 = var3;
      this.implements_[19] = var10;
   }

   @Override
   public boolean class_(float var1, float var2) {
      boolean var3 = super.class_(var1, var2);
      if (var3) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .finally_()
            .class_(rrnh_3.class_((rrnX_2)rrnX_2.staticFields1e73a3d9163a3242ac9ccbcc36d981ca[0]));
      }

      return var3;
   }

   @Override
   public void class_(rHm_1 var1) {
      this.Es();
      ((QY)this.break_[18]).break_(new Zm_1(var1));
   }

   @Override
   public void class_(iG_2 var1, rjU_2 var2) {
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAh_1.class_()).byte_()) {
         double var3 = this.rx();
         double var5 = this.BO();
         super.class_(var1, var2);
         this.break_((float)(this.rx() - var3), (float)(this.BO() - var5));
      }
   }

   public void class_(rkw_3<?> var1) {
      this.Es();
      if (((VR)this.break_[2]).protected_(var1)) {
         ((VR)this.break_[2]).throws_(var1);
         ((Aq_1)this.break_[0]).class_(new rZB(var1));
      }
   }

   public void class_(rgP_2 var1) {
      this.Es();
      ((cq_3)((QY)this.break_[18]).class_[19]).throws_().break_(var1);
   }

   @Override
   public void class_(ryG_2 var1) {
      this.Es();
      ((QY)this.break_[18]).break_(new Zv_1(var1));
   }

   public double class_(iB_2 var1, iM_2 var2, iM_2 var3) {
      this.Es();
      iM_2 var4 = ((cb_3)((QY)this.break_[18]).class_[57]).Pb();
      iM_2 var5 = var1.Pb();
      ((cb_3)((QY)this.break_[18]).class_[57]).break_(var2);
      var1.class_(var3);
      double var6 = this.protected_(var1);
      ((cb_3)((QY)this.break_[18]).class_[57]).break_(var4);
      var1.class_(var5);
      return var6;
   }

   @Override
   public void class_(byte var1) {
      this.Es();
      if (var1 >= 24 && var1 <= 28) {
         this.class_(var1 - 24);
      } else {
         if (var1 == 9 && (rdn_3)this.break_[30] != null) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLK.class_((rdn_3)this.break_[30], this.P()));
            ((rdn_3)this.break_[30]).class_((rYB)this.throws_[7], this);
         }

         super.class_(var1);
      }
   }

   @Override
   public void class_(an_3 var1) {
      this.Es();
      ((Cy_1)((QY)this.break_[18]).class_[12]).class_(var1, rLQ.catch_);
   }

   @Override
   public void class_(rut_3<?> var1) {
      this.Es();
      super.class_(var1);
      if (((rut_3)catch_[3]).equals(var1)) {
         boolean var2 = (((rmE_2)this.throws_[49]).<Byte>class_((rut_3<Byte>)catch_[3]) & 1) > 0 ? true : final_[43];
         rpm_3 var3 = (((rmE_2)this.throws_[49]).<Byte>class_((rut_3<Byte>)catch_[3]) & 2) > 0 ? rpm_3.OFF_HAND : rpm_3.MAIN_HAND;
         if (var2 && !(Boolean)this.break_[29]) {
            this.break_(var3);
         } else if (!var2 && (Boolean)this.break_[29]) {
            this.throw_();
         }
      }

      if (((rut_3)case_[5]).equals(var1) && this.Sy() && !(Boolean)this.break_[40]) {
         ((QY)this.break_[18]).c().class_((NQ)(new Nx_1(this)));
      }
   }

   @Override
   public void class_(rgP_2 var1, boolean var2) {
      this.Es();
      if (var2) {
         ((cq_3)((QY)this.break_[18]).class_[19]).class_(var1, false, false);
      } else {
         ((cq_3)((QY)this.break_[18]).class_[19]).throws_().class_(var1);
      }
   }

   @Override
   public void class_(ryS_2 var1) {
      this.Es();
      ((QY)this.break_[18]).break_(new ZZ(var1));
   }

   @Override
   public void class_(rpm_3 var1) {
      this.Es();
      super.class_(var1);
      ((Aq_1)this.break_[0]).class_(new rmq_3(var1));
   }

   public void class_(int var1) {
      this.Es();
      Integer var6 = var1;
      this.break_[4] = var6;
   }

   private void class_(rrAo_1 var1) {
      this.Es();
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAy_1.class_());
      boolean var2 = var1.protected_();
      boolean var3 = var1.private_();
      boolean var4 = var1.extends_();
      double var5 = var1.package_();
      double var7 = var1.catch_();
      double var9 = var1.break_();
      float var11 = var1.synchronized_();
      float var12 = var1.continue_();
      if ((Float)this.break_[49] != -1.0F) {
         var11 += this.break_[49];
      }

      if ((Float)this.break_[50] != -1.0F) {
         var12 += this.break_[50];
      }

      var12 = rfU_2.class_(var12, -90.0F, 90.0F);
      boolean var13 = var1.byte_();
      boolean var14 = var1.byte_();
      if (!var13) {
         if (var2 != (Boolean)this.break_[13]) {
            rmU_2 var15 = var2 ? rmU_2.START_SPRINTING : rmU_2.STOP_SPRINTING;
            ((Aq_1)this.break_[0]).class_(new rmD_2(this, var15));
            Boolean var32 = var2;
            this.break_[13] = var32;
         }

         if (var3 != (Boolean)this.break_[12]) {
            rmU_2 var48 = var3 ? rmU_2.PRESS_SHIFT_KEY : rmU_2.RELEASE_SHIFT_KEY;
            ((Aq_1)this.break_[0]).class_(new rmD_2(this, var48));
            Boolean var33 = var3;
            this.break_[12] = var33;
         }
      }

      if (this.M()) {
         double var49 = var5 - (Double)this.break_[5];
         double var17 = var7 - (Double)this.break_[6];
         double var19 = var9 - (Double)this.break_[7];
         double var21 = (double)(var11 - (Float)this.break_[8]);
         double var23 = (double)(var12 - (Float)this.break_[9]);
         Integer var34 = (Integer)this.break_[14] + 1;
         this.break_[14] = var34;
         boolean var10001 = var13 || !(var49 * var49 + var17 * var17 + var19 * var19 > 9.0E-4) && this.break_[14] < 20 ? final_[9] : final_[8];
         Boolean var35 = var10001;
         this.break_[41] = var35;
         boolean var25 = var10001;
         var10001 = var14 || var21 == 0.0 && var23 == 0.0 ? final_[11] : final_[10];
         Boolean var36 = var14 || var21 == 0.0 && var23 == 0.0 ? final_[11] : final_[10];
         this.break_[42] = var36;
         boolean var26 = var10001;
         if (!var13) {
            if (this.Pm()) {
               rjU_2 var27 = this.rv();
               ((Aq_1)this.break_[0]).class_(new rZX(var27.break_, -999.0, var27.protected_, var11, var12, var4));
               var25 = false;
            } else if (var25 && var26) {
               ((Aq_1)this.break_[0]).class_(new rZX(var5, var7, var9, var11, var12, var4));
            } else if (var25) {
               ((Aq_1)this.break_[0]).class_(new rZh_1(var5, var7, var9, var4));
            } else if (var26) {
               ((Aq_1)this.break_[0]).class_(new rZJ(var11, var12, var4));
            } else if ((Boolean)this.break_[10] != var4) {
               ((Aq_1)this.break_[0]).class_(new rZO(var4));
            }
         }

         if (var25) {
            Double var37 = var5;
            this.break_[5] = var37;
            Double var38 = var7;
            this.break_[6] = var38;
            Double var39 = var9;
            this.break_[7] = var39;
            Integer var40 = 0;
            this.break_[14] = var40;
         }

         if (var26) {
            Float var41 = var11;
            this.break_[8] = var41;
            Float var42 = var12;
            this.break_[9] = var42;
         }

         Boolean var43 = var4;
         this.break_[10] = var43;
         Boolean var44 = ((Qw_1)((QY)this.break_[18]).class_[20]).static_;
         this.break_[33] = var44;
         Float var45 = -1.0F;
         this.break_[49] = var45;
         Float var46 = -1.0F;
         this.break_[50] = var46;
      }

      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
         .finally_()
         .class_(
            rrAj_1.class_(
               this.rx(),
               this.re(),
               this.BO(),
               (Double)this.break_[5],
               (Double)this.break_[6],
               (Double)this.break_[7],
               (Float)this.throws_[15],
               (Float)this.throws_[16],
               (Float)this.break_[8],
               (Float)this.break_[9],
               this.BL(),
               this.PF(),
               this.h()
            )
         );
   }

   public boolean class_(QP var1, float var2) {
      double var3 = this.rx();
      double var5 = this.rN().break_;
      double var7 = this.BO();
      if (((rYB)this.throws_[7]).byte_(new rfH_2(var3, var5, var7)).byte_() != var1) {
         return final_[115];
      } else {
         double var9 = this.rN().break_ + (double)var2;
         double var11 = this.re() + (double)this.Bx();
         return ((rYB)this.throws_[7]).byte_(new rfH_2(var3, var9, var7)).byte_() != var1
               && ((rYB)this.throws_[7]).byte_(new rfH_2(var3, var11, var7)).byte_() != var1
            ? true
            : final_[114];
      }
   }

   @Override
   public boolean class_(an_3 var1, boolean var2) {
      this.Es();
      if (!super.class_(var1, var2)) {
         return false;
      } else {
         if (var1 instanceof rsJ_2) {
            ((QY)this.break_[18]).c().class_((NQ)(new Ny_1(this, (rsJ_2)var1)));
         }

         if (var1 instanceof rSK) {
            Float var7 = (Float)var1.throws_[15];
            this.throws_[17] = var7;
            Float var8 = (Float)var1.throws_[15];
            this.throws_[15] = var8;
            this.implements_((Float)var1.throws_[15]);
         }

         return final_[5];
      }
   }

   @Override
   public void class_(rdn_3 var1, rpm_3 var2) {
      this.Es();
      rdb_3 var3 = var1.break_();
      if (var3 == rdy_3.xi) {
         ((QY)this.break_[18]).break_(new ZM(this, var1, var2));
      }
   }

   @Override
   public rjU_2 class_(float var1) {
      this.Es();
      if (((Qw_1)((QY)this.break_[18]).class_[20]).volatile_().class_()) {
         float var2 = rfU_2.catch_(var1 * 0.5F, (Float)this.throws_[15], (Float)this.throws_[17]) * (float) (Math.PI / 180.0);
         float var3 = rfU_2.catch_(var1 * 0.5F, (Float)this.throws_[16], (Float)this.throws_[18]) * (float) (Math.PI / 180.0);
         double var4 = this.Su() == rpZ_2.RIGHT ? -1.0 : finally_[44];
         rjU_2 var6 = new rjU_2(0.39 * var4, -0.6, 0.3);
         return var6.class_(-var3).break_(-var2).throws_(this.new_(var1));
      } else {
         return super.class_(var1);
      }
   }

   @Override
   public void class_(rye_3 var1, float var2) {
      if (!this.class_(var1)) {
         this.public_(this.Ss() - var2);
      }
   }

   @Override
   public void class_(rHj_1 var1) {
      this.Es();
      ((QY)this.break_[18]).break_(new Zo_1(var1));
   }

   @Override
   public rLY class_(rLR var1) {
      this.Es();
      if (var1 == rLD.implements_) {
         Float var7 = 0.0F;
         this.break_[28] = var7;
         Float var8 = 0.0F;
         this.break_[27] = var8;
      }

      rLY var2 = super.class_(var1);
      if (var2 != null) {
         rrAN.break_(var1);
      }

      return var2;
   }

   public void class_(PX var1) {
      this.Es();
      this.break_[53] = var1;
   }

   public void class_(double var1, double var3) {
      this.Es();
      aF_2 var5 = this.s();
      PX var6 = var5.class_();
      double var7 = var1 * 0.15;
      double var9 = var3 * 0.15;
      if (!((Qw_1)((QY)this.break_[18]).class_[20]).l.protected_()) {
         Float var16 = (float)((double)((Float)this.throws_[16]).floatValue() + var9);
         this.throws_[16] = var16;
         Float var17 = (float)((double)((Float)this.throws_[15]).floatValue() + var7);
         this.throws_[15] = var17;
         Float var18 = rfU_2.class_((Float)this.throws_[16], -90.0F, 90.0F);
         this.throws_[16] = var18;
         Float var19 = (float)((double)((Float)this.throws_[18]).floatValue() + var9);
         this.throws_[18] = var19;
         Float var20 = (float)((double)((Float)this.throws_[17]).floatValue() + var7);
         this.throws_[17] = var20;
         Float var21 = rfU_2.class_((Float)this.throws_[18], -90.0F, 90.0F);
         this.throws_[18] = var21;
         var5.class_((Float)this.throws_[15], (Float)this.throws_[16]);
      } else {
         var5.class_(var6.throws_() + (float)var7, rfU_2.class_(var6.protected_() + (float)var9, -90.0F, 90.0F));
      }

      an_3 var11 = this.ra();
      if (var11 != null) {
         var11.volatile_(this);
      }
   }

   @Override
   public void class_(rqA_2 var1, rqL_2 var2, float var3, float var4) {
      ((rYB)this.throws_[7]).class_(this.rx(), this.re(), this.BO(), var1, var2, var3, var4, false);
   }

   @Override
   public void class_(rqA_2 var1, float var2, float var3) {
      ((rYB)this.throws_[7]).class_(this.rx(), this.re(), this.BO(), var1, this.Pr(), var2, var3, false);
   }

   @Override
   public rjU_2 m() {
      this.Es();
      if ((t_1)this.break_[51] != null && !((t_1)this.break_[51]).byte_()) {
         PX var1 = ((t_1)this.break_[51]).class_();
         return this.byte_(var1.protected_(), var1.throws_());
      } else {
         return this.byte_((Float)this.break_[46], (Float)this.break_[45]);
      }
   }

   private static void si() {
      extends_ = new short[]{
         3,
         4,
         33,
         36,
         49,
         50,
         0,
         53,
         18,
         0,
         1,
         2,
         12,
         13,
         3,
         3,
         3,
         52,
         37,
         18,
         15,
         17,
         15,
         15,
         15,
         37,
         45,
         43,
         46,
         44,
         15,
         45,
         16,
         46,
         18,
         73,
         18,
         73,
         1,
         30,
         7,
         0,
         0,
         0,
         51,
         5,
         6,
         7,
         15,
         16,
         8,
         9,
         15,
         8,
         47,
         16,
         9,
         48,
         0,
         0,
         42,
         44,
         17,
         0,
         3,
         1,
         3,
         0,
         49,
         49,
         50,
         50,
         13,
         0,
         13,
         12,
         0,
         12,
         5,
         6,
         7,
         8,
         9,
         14,
         14,
         14,
         41,
         42,
         0,
         0,
         0,
         0,
         10,
         0,
         5,
         6,
         7,
         14,
         8,
         9,
         10,
         18,
         20,
         33,
         49,
         50,
         0,
         5,
         6,
         7,
         15,
         16,
         8,
         9,
         0,
         1,
         1,
         1,
         1,
         1,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         4,
         1,
         18,
         15,
         47,
         40,
         47,
         11,
         11,
         10,
         15,
         0,
         18,
         18,
         18,
         18,
         0,
         0,
         16,
         16,
         1,
         2,
         2,
         2,
         0,
         4,
         4,
         18,
         19,
         18,
         19,
         18,
         19,
         7,
         20,
         21,
         20,
         19,
         18,
         19,
         30,
         0,
         30,
         30,
         7,
         36,
         36,
         7,
         7,
         29,
         31,
         29,
         29,
         31,
         3,
         49,
         3,
         49,
         3,
         29,
         29,
         5,
         40,
         18,
         26,
         18,
         18,
         18,
         18,
         18,
         18,
         18,
         12,
         18,
         12,
         17,
         17,
         11,
         17,
         42,
         17,
         44,
         17,
         41,
         21,
         23,
         22,
         24,
         22,
         46,
         22,
         22,
         21,
         45,
         21,
         21,
         16,
         26,
         18,
         20,
         20,
         19,
         19,
         19,
         17,
         17,
         18,
         11,
         17,
         0,
         17,
         17,
         19,
         34,
         34,
         34,
         17,
         38,
         0,
         2,
         19,
         0,
         18,
         0,
         18,
         20,
         0,
         20,
         19,
         19,
         17,
         23,
         20,
         17,
         0,
         18,
         55,
         18,
         18,
         17,
         6,
         6,
         18,
         18,
         0,
         18,
         0,
         1,
         6,
         18,
         39,
         38,
         0,
         38,
         0,
         18,
         17,
         0,
         17,
         18,
         0,
         40,
         17,
         35,
         600,
         35,
         35,
         35,
         600,
         35,
         18,
         17,
         17,
         18,
         25,
         25,
         25,
         25,
         26,
         17,
         25,
         17,
         25,
         26,
         25,
         25,
         25,
         25,
         26,
         25,
         26,
         26,
         20,
         18,
         18,
         55,
         18,
         27,
         28,
         59,
         18,
         73,
         18,
         73,
         18,
         73,
         27,
         18,
         40,
         27,
         27,
         27,
         27,
         59,
         27,
         27,
         27,
         27,
         27,
         27,
         27,
         27,
         27,
         0,
         32,
         17,
         17,
         17,
         17,
         32,
         17,
         17,
         17,
         17,
         32,
         32,
         0,
         33,
         17,
         15,
         15,
         7,
         7,
         7,
         7,
         7,
         7,
         7,
         7,
         7,
         34,
         34,
         20,
         17,
         17,
         0,
         17,
         35,
         35,
         35,
         35,
         17,
         17,
         17,
         7,
         18,
         7,
         17,
         7,
         7,
         7,
         18,
         20,
         15,
         17,
         16,
         18,
         0,
         0,
         0,
         1,
         0,
         18,
         6,
         18,
         6,
         28,
         27,
         0,
         51,
         51,
         45,
         46,
         51,
         51,
         51,
         46,
         45,
         51,
         16,
         15,
         32,
         0,
         0,
         18,
         57,
         18,
         55,
         0,
         53,
         8,
         9,
         5,
         6,
         7,
         45,
         46,
         8,
         9,
         15,
         16,
         18,
         57,
         0,
         18,
         57,
         39,
         18,
         18,
         57,
         18,
         57,
         18,
         57,
         18,
         20,
         16,
         16,
         15,
         15,
         16,
         16,
         18,
         18,
         17,
         17,
         18,
         18,
         15,
         16,
         52,
         53,
         37,
         10,
         12,
         13,
         13,
         7
      };
   }

   public void k() {
      this.Es();
      ((rhz_3)this.implements_[1]).private_(rdn_3.break_);
      super.strictfp_();
      ((QY)this.break_[18]).break_(null);
   }

   @Override
   public void default_() {
      this.Es();
      Integer var19 = (Integer)this.break_[20] + 1;
      this.break_[20] = var19;
      if ((Integer)this.break_[19] > 0) {
         Integer var20 = (Integer)this.break_[19] - 1;
         this.break_[19] = var20;
      }

      this.EM();
      boolean var1 = ((rqr_3)this.break_[17]).private_;
      boolean var2 = ((rqr_3)this.break_[17]).implements_;
      boolean var3 = this.EE();
      Boolean var21 = ((rhx_3)this.implements_[18]).break_
            || this.Py()
            || !this.protected_(iM_2.CROUCHING)
            || !this.h() && (this.Sc() || this.protected_(iM_2.STANDING))
         ? final_[55]
         : final_[54];
      this.break_[11] = var21;
      ((rqr_3)this.break_[17]).class_(this.F());
      if (this.return_() && !this.Pm()) {
         rpm_3 var4 = this.P();
         rrAB var5 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .finally_()
            .class_(rrAB.class_(this.sX(), this.protected_(var4.class_()), var4, this.Sw(), 0.2F, 0.2F));
         if (!var5.byte_()) {
            ((rqr_3)this.break_[17]).break_ = ((rqr_3)this.break_[17]).break_ * var5.case_();
            ((rqr_3)this.break_[17]).byte_ = ((rqr_3)this.break_[17]).byte_ * var5.break_();
            Integer var22 = 0;
            this.break_[19] = var22;
         }
      }

      boolean var42 = final_[57];
      if ((Integer)this.break_[34] > 0) {
         Integer var23 = (Integer)this.break_[34] - 1;
         this.break_[34] = var23;
         var42 = true;
         ((rqr_3)this.break_[17]).private_ = true;
      }

      if (!(Boolean)this.throws_[38]
         && !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .finally_()
            .class_(rrAx_1.class_((rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[2]))
            .byte_()) {
         this.break_(this.rx() - (double)this.PN() * 0.35, this.BO() + (double)this.PN() * 0.35);
         this.break_(this.rx() - (double)this.PN() * 0.35, this.BO() - (double)this.PN() * 0.35);
         this.break_(this.rx() + (double)this.PN() * 0.35, this.BO() - (double)this.PN() * 0.35);
         this.break_(this.rx() + (double)this.PN() * 0.35, this.BO() + (double)this.PN() * 0.35);
      }

      if (var2) {
         Integer var24 = 0;
         this.break_[19] = var24;
      }

      boolean var43 = ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_((rhx_3)this.implements_[18]);
      boolean var6 = ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(((Qw_1)((QY)this.break_[18]).class_[20]).W);
      AutoSprint var7 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().O();
      boolean var8 = !((float)this.sk().class_() > 6.0F) && !var7.else_() && !var43 ? final_[63] : final_[62];
      boolean var9 = this.break_(rLD.package_) && !var7.continue_() ? true : final_[65];
      boolean var10 = this.return_() && !var7.new_() ? true : final_[67];
      if (((Boolean)this.throws_[20] || this.W()) && (!var2 || var7.this_()) && !var3 && this.EE() && !this.PF() && var8 && !var10 && !var9) {
         if ((Integer)this.break_[19] <= 0 && !var6) {
            Integer var25 = 7;
            this.break_[19] = var25;
         } else {
            this.c_(true);
         }
      }

      if (!this.PF() && (!this.rT() || this.W()) && this.EE() && var8 && !var10 && !var9 && var6) {
         this.c_(true);
      }

      if (this.PF()) {
         boolean var11 = ((rqr_3)this.break_[17]).break_() && var8 ? final_[71] : final_[70];
         boolean var12 = !var11 && !rrLX.class_((Boolean)this.throws_[23]).class_() && (!this.rT() || this.W()) ? final_[73] : final_[72];
         if (this.Py()) {
            if (!(Boolean)this.throws_[20] && !((rqr_3)this.break_[17]).implements_ && var11 || !this.rT()) {
               this.c_(false);
            }
         } else if (var12) {
            this.c_(false);
         }
      }

      if (this.PF()) {
         this.c_(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAF.break_(true)).class_());
      }

      boolean var44 = final_[77];
      if (var43) {
         if (((Ax_1)((QY)this.break_[18]).class_[55]).finally_()) {
            if (!((rhx_3)this.implements_[18]).break_) {
               ((rhx_3)this.implements_[18]).break_ = true;
               var44 = true;
               this.G();
            }
         } else if (!var1 && ((rqr_3)this.break_[17]).private_ && !var42) {
            if ((Integer)this.implements_[6] == 0) {
               Integer var26 = 7;
               this.implements_[6] = var26;
            } else {
               ((rhx_3)this.implements_[18]).break_ = !((rhx_3)this.implements_[18]).break_ ? true : final_[81];
               if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
                  .finally_()
                  .class_(
                     rrAt_1.class_(
                        ((rhx_3)this.implements_[18]).break_
                           ? (rrAw_1)rrAw_1.staticFieldsfdd9e1cda53536f3a280666af211bfa1[0]
                           : (rrAw_1)rrAw_1.staticFieldsfdd9e1cda53536f3a280666af211bfa1[1]
                     )
                  )
                  .byte_()) {
                  var44 = true;
                  this.G();
                  Integer var27 = 0;
                  this.implements_[6] = var27;
               } else {
                  ((rhx_3)this.implements_[18]).break_ = false;
               }
            }
         }
      }

      Boolean var28 = var44;
      this.break_[39] = var28;
      Boolean var29 = false;
      this.break_[38] = var29;
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAL.class_());
      rdn_3 var45 = this.class_(rXQ.CHEST);
      boolean var13 = var45.break_() == rdy_3.kc && rxH_2.protected_(var45) ? true : final_[87];
      if ((Boolean)this.break_[38] && rrfj_3.catch_()) {
         if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().K().aJ_()
            && !var44
            && !((rhx_3)this.implements_[18]).break_
            && !this.Pm()
            && !this.o_()
            && var13) {
            ((rqr_3)this.break_[17]).private_ = true;
            if (this.sw()) {
               ((Aq_1)this.break_[0]).class_(new rmD_2(this, rmU_2.START_FALL_FLYING));
            }
         }
      } else if (((rqr_3)this.break_[17]).private_
         && !var44
         && !var1
         && !((rhx_3)this.implements_[18]).break_
         && !this.Pm()
         && !this.o_()
         && var13
         && this.sw()) {
         ((Aq_1)this.break_[0]).class_(new rmD_2(this, rmU_2.START_FALL_FLYING));
      }

      Boolean var30 = this.Sy();
      this.break_[40] = var30;
      if (this.rT() && ((rqr_3)this.break_[17]).implements_ && this.sr()) {
         this.Sm();
      }

      if (this.class_(rlG_2.break_)) {
         byte var14 = this.native_() ? 10 : final_[89];
         Integer var31 = rfU_2.class_((Integer)this.break_[35] + var14, 0, 600);
         this.break_[35] = var31;
      } else if ((Integer)this.break_[35] > 0) {
         this.class_(rlG_2.break_);
         Integer var32 = rfU_2.class_((Integer)this.break_[35] - 10, 0, 600);
         this.break_[35] = var32;
      }

      if (((rhx_3)this.implements_[18]).break_ && this.M()) {
         int var46 = 0;
         if (((rqr_3)this.break_[17]).implements_) {
            var46--;
         }

         if (((rqr_3)this.break_[17]).private_) {
            var46++;
         }

         if (var46 != 0) {
            this.byte_(this.rv().break_(0.0, (double)((float)var46 * ((rhx_3)this.implements_[18]).class_() * 3.0F), 0.0));
         }
      }

      if (this.L()) {
         aD_2 var47 = (aD_2)this.ra();
         if ((Integer)this.break_[25] < 0) {
            Integer var33 = (Integer)this.break_[25] + 1;
            this.break_[25] = var33;
            if ((Integer)this.break_[25] == 0) {
               Float var34 = 0.0F;
               this.break_[26] = var34;
            }
         }

         if (var1 && !((rqr_3)this.break_[17]).private_) {
            Integer var35 = -10;
            this.break_[25] = var35;
            var47.class_(rfU_2.protected_(this.E() * 100.0F));
            this.n();
         } else if (!var1 && ((rqr_3)this.break_[17]).private_) {
            Integer var36 = 0;
            this.break_[25] = var36;
            Float var37 = 0.0F;
            this.break_[26] = var37;
         } else if (var1) {
            Integer var38 = (Integer)this.break_[25] + 1;
            this.break_[25] = var38;
            if ((Integer)this.break_[25] < 10) {
               Float var39 = (float)((Integer)this.break_[25]).intValue() * 0.1F;
               this.break_[26] = var39;
            } else {
               Float var40 = 0.8F + 2.0F / (float)((Integer)this.break_[25] - 9) * 0.1F;
               this.break_[26] = var40;
            }
         }
      } else {
         Float var41 = 0.0F;
         this.break_[26] = var41;
      }

      super.default_();
      if ((Boolean)this.throws_[20] && ((rhx_3)this.implements_[18]).break_ && !((Ax_1)((QY)this.break_[18]).class_[55]).finally_()) {
         ((rhx_3)this.implements_[18]).break_ = false;
         this.G();
      }
   }

   public boolean v() {
      this.Es();
      return (Boolean)this.break_[33];
   }

   public String short_() {
      this.Es();
      return (String)this.break_[16];
   }

   public PX z() {
      this.Es();
      return new PX((Float)this.break_[8], (Float)this.break_[9]);
   }

   @Override
   public boolean void_() {
      this.Es();
      boolean var1 = (Boolean)this.implements_[17];
      boolean var2 = super.void_();
      if (this.native_()) {
         return (Boolean)this.implements_[17];
      } else {
         if (!var1 && var2) {
            ((rYB)this.throws_[7]).class_(this.rx(), this.re(), this.BO(), rqn_3.new_, rqL_2.AMBIENT, 1.0F, 1.0F, false);
            ((QY)this.break_[18]).c().class_((NQ)(new cs_3(this)));
         }

         if (var1 && !var2) {
            ((rYB)this.throws_[7]).class_(this.rx(), this.re(), this.BO(), rqn_3.continue_, rqL_2.AMBIENT, 1.0F, 1.0F, false);
         }

         return (Boolean)this.implements_[17];
      }
   }

   @Override
   public boolean u() {
      return super.u()
            && !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
               .finally_()
               .class_(rrAx_1.class_((rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[0]))
               .byte_()
         ? true
         : final_[119];
   }

   public rqB_2 r() {
      this.Es();
      return (rqB_2)this.break_[37];
   }

   public float N() {
      this.Es();
      return (Float)this.break_[8];
   }

   private void break_(double var1, double var3) {
      rfH_2 var5 = new rfH_2(var1, this.re(), var3);
      if (this.implements_(var5)) {
         double var6 = var1 - (double)var5.b_();
         double var8 = var3 - (double)var5.d_();
         rpr_3 var10 = null;
         double var11 = Double.MAX_VALUE;
         rpr_3[] var13 = new rpr_3[]{rpr_3.WEST, rpr_3.EAST, rpr_3.NORTH, rpr_3.SOUTH};

         for (rpr_3 var17 : var13) {
            double var18 = var17.final_().class_(var6, 0.0, var8);
            double var20 = var17.throws_() == rpG_2.POSITIVE ? 1.0 - var18 : var18;
            if (var20 < var11 && !this.implements_(var5.break_(var17))) {
               var11 = var20;
               var10 = var17;
            }
         }

         if (var10 != null) {
            rjU_2 var22 = this.rv();
            if (var10.final_() == rpB_2.X) {
               this.catch_(0.1 * (double)var10.implements_(), var22.byte_, var22.protected_);
            } else {
               this.catch_(var22.break_, var22.byte_, 0.1 * (double)var10.extends_());
            }
         }
      }
   }

   public void break_(float var1, float var2) {
      this.Es();
      if (this.EB()) {
         rjU_2 var3 = this.Ps();
         rjU_2 var4 = var3.break_((double)var1, 0.0, (double)var2);
         rjU_2 var5 = new rjU_2((double)var1, 0.0, (double)var2);
         float var6 = this.sB();
         float var7 = (float)var5.catch_();
         if (var7 <= 0.001F) {
            rjK_2 var8 = ((rqr_3)this.break_[17]).class_();
            float var9 = var6 * var8.byte_;
            float var10 = var6 * var8.protected_;
            float var11 = rfU_2.class_((Float)this.throws_[15] * (float) (Math.PI / 180.0));
            float var12 = rfU_2.break_((Float)this.throws_[15] * (float) (Math.PI / 180.0));
            var5 = new rjU_2((double)(var9 * var12 - var10 * var11), var5.byte_, (double)(var10 * var12 + var9 * var11));
            var7 = (float)var5.catch_();
            if (var7 <= 0.001F) {
               return;
            }
         }

         float var44 = rfU_2.implements_(var7);
         rjU_2 var45 = var5.class_((double)var44);
         rjU_2 var46 = this.rh();
         float var47 = (float)(var46.break_ * var45.break_ + var46.protected_ * var45.protected_);
         if (!(var47 < -0.15F)) {
            rjm_3 var48 = rjm_3.class_(this);
            rfH_2 var13 = new rfH_2(this.rx(), this.rN().throws_, this.BO());
            xc_3 var14 = ((rYB)this.throws_[7]).byte_(var13);
            if (var14.break_((rYB)this.throws_[7], var13, var48).break_()) {
               var13 = var13.final_();
               xc_3 var15 = ((rYB)this.throws_[7]).byte_(var13);
               if (var15.break_((rYB)this.throws_[7], var13, var48).break_()) {
                  float var16 = 1.2F;
                  if (this.break_(rLD.private_)) {
                     var16 += (float)(this.byte_(rLD.private_).byte_() + 1) * 0.75F;
                  }

                  float var17 = Math.max(var6 * 7.0F, 1.0F / var44);
                  rjU_2 var18 = var4.throws_(var45.class_((double)var17));
                  float var19 = this.PN();
                  float var20 = this.Bm();
                  rfl_3 var21 = new rfl_3(var3, var18.break_(0.0, (double)var20, 0.0)).byte_((double)var19, 0.0, (double)var19);
                  rjU_2 var22 = var3.break_(0.0, 0.51F, 0.0);
                  var18 = var18.break_(0.0, 0.51F, 0.0);
                  rjU_2 var23 = var45.byte_(new rjU_2(0.0, 1.0, 0.0));
                  rjU_2 var24 = var23.class_((double)(var19 * 0.5F));
                  rjU_2 var25 = var22.protected_(var24);
                  rjU_2 var26 = var18.protected_(var24);
                  rjU_2 var27 = var22.throws_(var24);
                  rjU_2 var28 = var18.throws_(var24);
                  Iterator var29 = ((rYB)this.throws_[7]).byte_(this, var21, var0 -> true).flatMap(var0 -> var0.protected_().stream()).iterator();
                  float var30 = Float.MIN_VALUE;

                  while (var29.hasNext()) {
                     rfl_3 var31 = (rfl_3)var29.next();
                     if (var31.class_(var25, var26) || var31.class_(var27, var28)) {
                        var30 = (float)var31.throws_;
                        rjU_2 var32 = var31.case_();
                        rfH_2 var33 = new rfH_2(var32);

                        for (int var34 = 1; (float)var34 < var16; var34++) {
                           rfH_2 var35 = var33.break_(var34);
                           xc_3 var36 = ((rYB)this.throws_[7]).byte_(var35);
                           rjC_2 var37;
                           if (!(var37 = var36.break_((rYB)this.throws_[7], var35, var48)).break_()) {
                              var30 = (float)var37.byte_(rpB_2.Y) + (float)var35.c_();
                              if ((double)var30 - this.re() > (double)var16) {
                                 return;
                              }
                           }

                           if (var34 > 1) {
                              var13 = var13.final_();
                              xc_3 var38 = ((rYB)this.throws_[7]).byte_(var13);
                              if (!var38.break_((rYB)this.throws_[7], var13, var48).break_()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if (var30 != Float.MIN_VALUE) {
                     float var51 = (float)((double)var30 - this.re());
                     if (!(var51 <= 0.5F) && !(var51 > var16)) {
                        Integer var43 = 1;
                        this.break_[34] = var43;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void break_(rpm_3 var1) {
      this.Es();
      rdn_3 var2 = this.protected_(var1);
      if (!var2.class_() && !this.return_()) {
         super.break_(var1);
         Boolean var7 = true;
         this.break_[29] = var7;
         this.break_[31] = var1;
      }
   }

   public void break_(iM_2 var1) {
      super.class_(var1);
   }

   public PX break_(PX var1) {
      Float var6 = var1.throws_();
      this.throws_[15] = var6;
      Float var7 = var1.protected_();
      this.throws_[16] = var7;
      return var1;
   }

   @Override
   public void break_(an_3 var1) {
      this.Es();
      ((Cy_1)((QY)this.break_[18]).class_[12]).class_(var1, rLQ.continue_);
   }

   @Override
   public rjU_2 break_(float var1) {
      PX var2 = this.switch_();
      return this.byte_(var2.protected_(), var2.throws_());
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      return false;
   }

   public void throws_(boolean var1) {
      this.Es();
      Boolean var6 = var1;
      this.break_[36] = var6;
   }

   public static String throws_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, 68, 74, -102, -104, -81, 118, 101}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public float throws_(float var1) {
      return (Float)this.throws_[15];
   }

   public boolean L() {
      an_3 var1 = this.ra();
      return this.Pm() && var1 instanceof aD_2 && ((aD_2)var1).throws_() ? true : final_[45];
   }

   public boolean M() {
      this.Es();
      return ((QY)this.break_[18]).catch_() == this ? true : final_[51];
   }

   @Override
   public boolean W() {
      return (Boolean)this.implements_[17];
   }

   @Override
   public rpm_3 P() {
      this.Es();
      return (rpm_3)this.break_[31];
   }

   public boolean catch_(float var1) {
      return !this.class_(QP.finally_, var1) && !this.class_(QP.native_, var1) ? final_[117] : final_[116];
   }

   @Override
   public void G() {
      this.Es();
      ((Aq_1)this.break_[0]).class_(new rZG((rhx_3)this.implements_[18]));
   }

   public double O() {
      this.Es();
      return (Double)this.break_[6];
   }

   public PX goto_() {
      this.Es();
      return new PX((Float)this.break_[45], (Float)this.break_[46]);
   }

   @Override
   public float case_(float var1) {
      return (Float)this.throws_[16];
   }

   public void case_(String var1) {
      this.Es();
      ((Aq_1)this.break_[0]).class_(new rmT_2(var1));
   }

   public void case_(boolean var1) {
      this.Es();
      Boolean var6 = var1;
      this.break_[13] = var6;
   }

   @Override
   public void const_() {
      this.Es();
      super.const_();
      Boolean var5 = false;
      this.break_[32] = var5;
   }

   @Override
   public void else_() {
      this.Es();
      ((Aq_1)this.break_[0]).class_(new rmD_2(this, rmU_2.OPEN_INVENTORY));
   }

   private static int else_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 405942856;
   }

   public double for_() {
      this.Es();
      return (Double)this.break_[5];
   }

   private boolean implements_(rfH_2 var1) {
      rfl_3 var2 = this.rN();
      rfl_3 var3 = new rfl_3((double)var1.b_(), var2.break_, (double)var1.d_(), (double)var1.b_() + 1.0, var2.throws_, (double)var1.d_() + 1.0).break_(1.0E-7);
      return !((rYB)this.throws_[7]).class_(this, var3, (var1x, var2x) -> var1x.final_((rYB)this.throws_[7], var2x)) ? true : final_[34];
   }

   @Override
   public rjK_2 import_() {
      this.Es();
      if ((t_1)this.break_[51] != null && !((t_1)this.break_[51]).byte_()) {
         PX var1 = ((t_1)this.break_[51]).class_();
         return super.import_().class_(var1.throws_(), var1.protected_());
      } else {
         return super.import_().class_((Float)this.break_[45], (Float)this.break_[46]);
      }
   }

   @Override
   public boolean instanceof_() {
      rrAn_1 var1 = rrAn_1.class_(super.instanceof_());
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var1);
      return var1.class_();
   }

   @Override
   public boolean return_() {
      this.Es();
      return (Boolean)this.break_[29];
   }

   @Override
   public PX switch_() {
      this.Es();
      return (PX)this.break_[53];
   }

   @Override
   public void throw_() {
      this.Es();
      super.throw_();
      Boolean var5 = false;
      this.break_[29] = var5;
   }

   @Override
   public boolean try_() {
      return true;
   }

   @Override
   public boolean while_() {
      return !((rhx_3)this.implements_[18]).break_ && super.while_() ? true : final_[27];
   }

   public double static_() {
      this.Es();
      return (Double)this.break_[7];
   }

   public float public_() {
      this.Es();
      if (!this.class_(rlG_2.break_)) {
         return 0.0F;
      } else if ((float)((Integer)this.break_[35]).intValue() >= 600.0F) {
         return 1.0F;
      } else {
         float var1 = rfU_2.class_((float)((Integer)this.break_[35]).intValue() / 100.0F, 0.0F, 1.0F);
         float var2 = (float)((Integer)this.break_[35]).intValue() < 100.0F
            ? 0.0F
            : rfU_2.class_(((float)((Integer)this.break_[35]).intValue() - 100.0F) / 500.0F, 0.0F, 1.0F);
         return var1 * 0.6F + var2 * 0.39999998F;
      }
   }

   public boolean protected_(String var1) {
      this.Es();
      if (((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).break_(var1)) {
         return false;
      } else {
         rrAv_1 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAv_1.break_(var1));
         if (var2.byte_()) {
            return false;
         } else {
            ((Aq_1)this.break_[0]).class_(new rmT_2(var2.class_()));
            return true;
         }
      }
   }

   @Override
   public void protected_(float var1) {
   }

   @Override
   public boolean protected_(boolean var1) {
      this.Es();
      rZM var2 = var1 ? rZM.DROP_ALL_ITEMS : rZM.DROP_ITEM;
      ((Aq_1)this.break_[0]).class_(new rZb_1(var2, rfH_2.protected_, rpr_3.DOWN));
      rdn_3 var3 = ((rhz_3)this.implements_[1])
         .class_(
            ((rhz_3)this.implements_[1]).protected_,
            var1 && !((rhz_3)this.implements_[1]).byte_().class_() ? ((rhz_3)this.implements_[1]).byte_().char_() : final_[14]
         );
      rrLV.class_(var3, null, (rrLg_1)rrLg_1.staticFields83bfa4843c3c3647913690fe22963b15[1]);
      return var3 != rdn_3.break_ ? true : final_[16];
   }

   public rlP_2 abstract_() {
      this.Es();
      return (rlP_2)this.break_[1];
   }

   @Override
   public boolean transient_() {
      return !((rhx_3)this.implements_[18]).break_ && super.transient_() ? true : final_[23];
   }

   @Override
   public int synchronized_() {
      this.Es();
      return (Integer)this.break_[4];
   }

   @Override
   public void strictfp_() {
      this.Es();
      ((Aq_1)this.break_[0]).class_(new rmj_3(((rJr_1)this.implements_[4]).case_));
      this.k();
   }

   public float E() {
      this.Es();
      return (Float)this.break_[26];
   }

   @Override
   public void A() {
      this.Es();
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).break_();
      super.A();
      Boolean var7 = false;
      this.break_[32] = var7;
      if (this.ra() instanceof rSK var1) {
         var1.class_(((rqr_3)this.break_[17]).case_, ((rqr_3)this.break_[17]).catch_, ((rqr_3)this.break_[17]).protected_, ((rqr_3)this.break_[17]).throws_);
         Boolean var8 = (Boolean)this.break_[32]
            | (
               !((rqr_3)this.break_[17]).case_ && !((rqr_3)this.break_[17]).catch_ && !((rqr_3)this.break_[17]).protected_ && !((rqr_3)this.break_[17]).throws_
                  ? final_[100]
                  : final_[99]
            );
         this.break_[32] = var8;
      }
   }

   public boolean X() {
      this.Es();
      return (Boolean)this.break_[13];
   }

   @Override
   public void Q() {
      this.Es();
      super.Q();
      if (this.M()) {
         Float var5 = ((rqr_3)this.break_[17]).break_;
         this.private_[42] = var5;
         Float var6 = ((rqr_3)this.break_[17]).byte_;
         this.private_[44] = var6;
         Boolean var7 = ((rqr_3)this.break_[17]).private_;
         this.private_[41] = var7;
         Float var8 = (Float)this.break_[21];
         this.break_[23] = var8;
         Float var9 = (Float)this.break_[22];
         this.break_[24] = var9;
         Float var10 = (float)((double)((Float)this.break_[22]).floatValue() + (double)((Float)this.break_[46] - (Float)this.break_[22]) * 0.5);
         this.break_[22] = var10;
         Float var11 = (float)((double)((Float)this.break_[21]).floatValue() + (double)((Float)this.break_[45] - (Float)this.break_[21]) * 0.5);
         this.break_[21] = var11;
         Float var12 = (Float)this.throws_[16];
         this.private_[26] = var12;
      }
   }

   private void EM() {
      this.Es();
      Float var5 = (Float)this.break_[27];
      this.break_[28] = var5;
      if ((Boolean)this.throws_[59]) {
         if ((vm_3)((QY)this.break_[18]).class_[73] != null
            && !((vm_3)((QY)this.break_[18]).class_[73]).z_()
            && (vm_3)((QY)this.break_[18]).class_[73] instanceof Fu_1) {
            this.strictfp_();
         }

         if ((Float)this.break_[27] == 0.0F) {
            ((QY)this.break_[18]).c().class_(Np_1.byte_(rqn_3.hD, ((Random)this.throws_[40]).nextFloat() * 0.4F + 0.8F, 0.25F));
         }

         Float var6 = (Float)this.break_[27] + 0.0125F;
         this.break_[27] = var6;
         if ((Float)this.break_[27] >= 1.0F) {
            Float var7 = 1.0F;
            this.break_[27] = var7;
         }

         Boolean var8 = false;
         this.throws_[59] = var8;
      } else if (this.break_(rLD.implements_) && this.byte_(rLD.implements_).break_() > 60) {
         Float var9 = (Float)this.break_[27] + 0.006666667F;
         this.break_[27] = var9;
         if ((Float)this.break_[27] > 1.0F) {
            Float var10 = 1.0F;
            this.break_[27] = var10;
         }
      } else {
         if ((Float)this.break_[27] > 0.0F) {
            Float var11 = (Float)this.break_[27] - 0.05F;
            this.break_[27] = var11;
         }

         if ((Float)this.break_[27] < 0.0F) {
            Float var12 = 0.0F;
            this.break_[27] = var12;
         }
      }

      this.a();
   }

   private static void EG() {
      volatile_ = new float[]{
         -1.0F,
         -1.0F,
         0.0F,
         -1.0F,
         -1.0F,
         -90.0F,
         90.0F,
         -1.0F,
         -1.0F,
         0.0F,
         0.0F,
         100.0F,
         0.2F,
         0.2F,
         6.0F,
         3.0F,
         0.0F,
         100.0F,
         0.0F,
         0.1F,
         0.8F,
         2.0F,
         0.1F,
         0.0F,
         0.0F,
         0.4F,
         0.8F,
         0.25F,
         0.0125F,
         1.0F,
         1.0F,
         0.006666667F,
         1.0F,
         1.0F,
         0.0F,
         0.05F,
         0.0F,
         0.0F,
         0.001F,
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         0.001F,
         -0.15F,
         1.2F,
         0.75F,
         7.0F,
         1.0F,
         0.5F,
         Float.MIN_VALUE,
         Float.MIN_VALUE,
         0.5F,
         0.0F,
         0.0F,
         0.0F,
         600.0F,
         1.0F,
         100.0F,
         0.0F,
         1.0F,
         100.0F,
         0.0F,
         100.0F,
         500.0F,
         0.0F,
         1.0F,
         0.6F,
         0.39999998F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.5F,
         (float) (Math.PI / 180.0),
         0.5F,
         (float) (Math.PI / 180.0),
         1.0F,
         1.0F,
         1.0F,
         0.0F,
         0.0F,
         -90.0F,
         90.0F,
         -90.0F,
         90.0F,
         -90.0F,
         90.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   private static void Eb() {
      native_ = new byte[]{
         2,
         20,
         10,
         20,
         10,
         4,
         2,
         3,
         24,
         28,
         24,
         9,
         2,
         7,
         7,
         10,
         10,
         -10,
         10,
         9,
         60,
         54,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         14,
         15,
         19,
         20,
         21,
         22,
         23,
         24,
         25,
         26,
         27,
         28,
         29,
         32,
         33,
         34,
         35,
         36,
         38,
         39,
         40,
         41,
         42,
         43,
         44,
         45,
         46,
         47,
         48,
         49,
         50
      };
   }

   private boolean EB() {
      this.Es();
      return this.v() && this.break_[34] <= 0 && this.throws_[20] && !this.instanceof_() && !this.Pm() && this.Er() && (double)this.rl() >= 1.0
         ? true
         : final_[106];
   }

   private void Es() {
      if (this.break_ == null) {
         this.break_ = new Object[54];
         Object[] var1 = this.break_;
         var1[4] = 0;
         var1[5] = 0.0;
         var1[6] = 0.0;
         var1[7] = 0.0;
         var1[8] = 0.0F;
         var1[9] = 0.0F;
         var1[10] = false;
         var1[11] = false;
         var1[12] = false;
         var1[13] = false;
         var1[14] = 0;
         var1[15] = false;
         var1[19] = 0;
         var1[20] = 0;
         var1[21] = 0.0F;
         var1[22] = 0.0F;
         var1[23] = 0.0F;
         var1[24] = 0.0F;
         var1[25] = 0;
         var1[26] = 0.0F;
         var1[27] = 0.0F;
         var1[28] = 0.0F;
         var1[29] = false;
         var1[32] = false;
         var1[33] = false;
         var1[34] = 0;
         var1[35] = 0;
         var1[36] = false;
         var1[38] = false;
         var1[39] = false;
         var1[40] = false;
         var1[41] = false;
         var1[42] = false;
         var1[43] = 0.0F;
         var1[44] = 0.0F;
         var1[45] = 0.0F;
         var1[46] = 0.0F;
         var1[47] = 0.0F;
         var1[48] = 0.0F;
         var1[49] = 0.0F;
         var1[50] = 0.0F;
      }
   }

   private static void EP() {
      final_ = new boolean[]{
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false
      };
   }

   private static void ES() {
      finally_ = new double[]{
         0.0,
         9.0E-4,
         0.0,
         0.0,
         -999.0,
         Double.MAX_VALUE,
         0.0,
         1.0,
         0.1,
         0.1,
         1.0,
         1.0,
         1.0E-7,
         0.5,
         0.5,
         0.35,
         0.35,
         0.35,
         0.35,
         0.35,
         0.35,
         0.35,
         0.35,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.51F,
         0.0,
         0.0,
         0.51F,
         0.0,
         0.0,
         1.0,
         0.0,
         1.0,
         0.8,
         0.3,
         0.3,
         -1.0,
         1.0,
         0.39,
         -0.6,
         0.3,
         20.0,
         0.15,
         0.15,
         0.0,
         0.0,
         0.0
      };
   }

   private boolean Er() {
      this.Es();
      rjK_2 var1 = ((rqr_3)this.break_[17]).class_();
      return var1.byte_ == 0.0F && var1.protected_ == 0.0F ? final_[108] : final_[107];
   }

   private boolean EE() {
      this.Es();
      if (this.W()) {
         return ((rqr_3)this.break_[17]).break_();
      } else {
         double var1 = finally_[40];
         AutoSprint var3 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().O();
         if (this.h() && var3.this_()) {
            var1 = 0.3;
         }

         if (this.Pb() == iM_2.SWIMMING && var3.super_()) {
            var1 = 0.3;
         }

         return (double)((rqr_3)this.break_[17]).byte_ >= var1 ? true : final_[110];
      }
   }

   @Override
   public void c_(boolean var1) {
      this.Es();
      super.c_(var1);
      Integer var6 = 0;
      this.break_[20] = var6;
   }
}
