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
   public Object[] id_break;
   private static double[] id_finally;
   private static short[] id_extends;
   private static byte[] id_native;
   private static float[] id_volatile;
   private static boolean[] id_final;

   public boolean id_boolean() {
      this.Es();
      return (Boolean)this.id_break[12];
   }

   @Override
   public boolean id_char() {
      return true;
   }

   @Override
   public float id_byte(boolean var1) {
      this.Es();
      double var2 = 20.0;
      if (var1) {
         var2 += var2 - (double)C_throws.id_byte().id_continue().id_break();
      }

      return (float)(
         (double)(id_volatile[76] * Math.max(1.0F, ((rqw_3)((QY)this.id_break[18]).id_class[6]).id_class())) / this.id_class(iQ_2.id_private) * var2
      );
   }

   public void id_byte(String var1) {
      this.Es();
      this.id_break[16] = var1;
   }

   public void id_byte(float var1) {
      this.Es();
      if ((Boolean)this.id_break[15]) {
         float var2 = this.Ss() - var1;
         if (var2 <= 0.0F) {
            this.id_public(var1);
            if (var2 < 0.0F) {
               Integer var7 = 10;
               this.id_throws[47] = var7;
            }
         } else {
            Float var8 = var2;
            this.id_private[40] = var8;
            this.id_public(this.Ss());
            Integer var9 = 20;
            this.id_throws[47] = var9;
            this.id_class(rye_3.id_final, var2);
            Integer var10 = 10;
            this.id_private[11] = var10;
            Integer var11 = (Integer)this.id_private[11];
            this.id_private[10] = var11;
         }
      } else {
         this.id_public(var1);
         Boolean var12 = true;
         this.id_break[15] = var12;
      }
   }

   @Override
   public void id_byte(an_3 var1) {
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
         .id_finally()
         .id_class(rrAx_1.id_class((rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[1]))
         .id_byte()) {
         super.id_byte(var1);
      }
   }

   public boolean id_long() {
      this.Es();
      return (Boolean)this.id_break[32];
   }

   public boolean id_float() {
      this.Es();
      return (Boolean)this.id_break[10];
   }

   public float id_double() {
      this.Es();

      for (NW var2 : (List)this.id_break[3]) {
         if (var2 instanceof NM) {
            return ((NM)var2).id_class();
         }
      }

      return id_volatile[2];
   }

   public cb_3(QY var1, gm_3 var2, Aq_1 var3, rlP_2 var4, VR var5, boolean var6, boolean var7) {
      super(var2, var3.id_catch());
      this.Es();
      ArrayList var12 = Lists.newArrayList();
      this.id_break[3] = var12;
      Integer var13 = 0;
      this.id_break[4] = var13;
      Boolean var14 = true;
      this.id_break[33] = var14;
      Boolean var15 = true;
      this.id_break[36] = var15;
      Float var16 = -1.0F;
      this.id_break[49] = var16;
      Float var17 = -1.0F;
      this.id_break[50] = var17;
      PX var18 = (PX)PX.id_class[0];
      this.id_break[53] = var18;
      this.id_break[18] = var1;
      this.id_break[0] = var3;
      this.id_break[1] = var4;
      this.id_break[2] = var5;
      Boolean var23 = var6;
      this.id_break[12] = var23;
      Boolean var24 = var7;
      this.id_break[13] = var24;
      ((List)this.id_break[3]).add(new cP_2(this, var1.c()));
      ((List)this.id_break[3]).add(new Nh_1(this));
      ((List)this.id_break[3]).add(new NM(this, var1.c(), var2.id_static()));
      aF_2 var25 = new aF_2();
      this.id_break[52] = var25;
      rqB_2 var26 = new rqB_2();
      this.id_break[37] = var26;
      rrAM.id_break(this);
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean B() {
      return !((rhx_3)this.id_implements[18]).id_break && super.B() ? true : id_final[25];
   }

   public boolean F() {
      return !this.x() && !this.PW() ? id_final[49] : id_final[48];
   }

   @Override
   public void J() {
      this.Es();
      ((Aq_1)this.id_break[0]).id_class(new rmI_2(rmf_3.PERFORM_RESPAWN));
   }

   public boolean S() {
      this.Es();
      if (!(Boolean)this.id_break[39] && !((rhx_3)this.id_implements[18]).id_break && rrfo_3.id_byte() && !this.Pm() && !this.o_()) {
         rdn_3 var1 = this.id_class(rXQ.CHEST);
         return var1.id_break() == rdy_3.kc && rxH_2.id_protected(var1) && this.sC() ? true : id_final[122];
      } else {
         return id_final[123];
      }
   }

   public VR Z() {
      this.Es();
      return (VR)this.id_break[2];
   }

   @Override
   public void id_this() {
      this.Es();
      ((rqB_2)this.id_break[37]).id_class();
      Float var10 = (Float)this.id_break[45];
      this.id_break[43] = var10;
      Float var11 = (Float)this.id_break[46];
      this.id_break[44] = var11;
      Float var12 = (Float)this.id_throws[15];
      this.id_break[45] = var12;
      Float var13 = (Float)this.id_throws[16];
      this.id_break[46] = var13;
      if ((vm_3)((QY)this.id_break[18]).id_class[73] != null) {
         ((vm_3)((QY)this.id_break[18]).id_class[73]).id_super();
      }

      rdn_3 var1 = ((rhz_3)this.id_implements[1]).id_finally();
      if (!var1.id_class()) {
         var1.id_protected++;
      }

      rdn_3 var2 = this.sX();
      if (!var2.id_class() && this.SH() == 2) {
         this.id_break[30] = var2;
      }

      if (((rYB)this.id_throws[7]).id_int(new rfH_2(this.rx(), 0.0, this.BO()))) {
         q_1.id_class((Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]);
         t_1 var15 = ((t_1)t_1.id_class[0]).id_break((w_1)w_1.staticFieldsa114f317008a3fe78339d2b3c5e6fe39[0]);
         this.id_break[51] = var15;
         super.id_this();
         rrAo_1 var3 = rrAo_1.id_class(
            this.rx(),
            this.re(),
            this.BO(),
            (Double)this.id_break[5],
            (Double)this.id_break[6],
            (Double)this.id_break[7],
            (Float)this.id_throws[15],
            (Float)this.id_throws[16],
            (Float)this.id_break[8],
            (Float)this.id_break[9],
            this.BL(),
            this.PF(),
            this.h()
         );
         Float var16 = (Float)this.id_throws[15] - (Float)this.id_break[8];
         this.id_break[47] = var16;
         Float var17 = (Float)this.id_throws[16] - (Float)this.id_break[9];
         this.id_break[48] = var17;
         if (this.Pm()) {
            ((Aq_1)this.id_break[0]).id_class(new rZJ(var3.id_synchronized(), var3.id_continue(), var3.id_extends()));
            ((Aq_1)this.id_break[0])
               .id_class(new rma_3((Float)this.id_private[42], (Float)this.id_private[44], ((rqr_3)this.id_break[17]).id_private, var3.id_private()));
            an_3 var4 = this.PO();
            if (var4 != this && var4.Po()) {
               ((Aq_1)this.id_break[0]).id_class(new rZS(var4));
            }
         } else {
            this.id_class(var3);
         }

         for (NW var5 : (List)this.id_break[3]) {
            var5.id_break();
         }

         q_1.id_class((Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1]);
      }
   }

   public float b() {
      this.Es();
      return (Float)this.id_break[9];
   }

   @Override
   public boolean x() {
      this.Es();
      return (Boolean)this.id_break[11];
   }

   public aF_2 s() {
      this.Es();
      return (aF_2)this.id_break[52];
   }

   public void c() {
      this.Es();
      this.sz();
      ((Aq_1)((cb_3)((QY)this.id_break[18]).id_class[57]).id_break[0]).id_class(new rmD_2((cb_3)((QY)this.id_break[18]).id_class[57], rmU_2.START_FALL_FLYING));
   }

   public void n() {
      this.Es();
      ((Aq_1)this.id_break[0]).id_class(new rmD_2(this, rmU_2.START_RIDING_JUMP, rfU_2.id_protected(this.E() * 100.0F)));
   }

   @Override
   public boolean h() {
      this.Es();
      return (rqr_3)this.id_break[17] != null && ((rqr_3)this.id_break[17]).id_implements ? true : id_final[47];
   }

   public boolean d() {
      this.Es();
      return (Boolean)this.id_break[36];
   }

   @Override
   public float id_interface() {
      this.Es();
      return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
         .id_finally()
         .id_class(rrLl_1.id_break(super.id_interface() * Math.max(1.0F, ((rqw_3)((QY)this.id_break[18]).id_class[6]).id_class())))
         .id_class();
   }

   @Override
   public void id_class(rgP_2 var1, UUID var2) {
      this.Es();
      ((cq_3)((QY)this.id_break[18]).id_class[19]).id_throws().id_class(var1);
   }

   @Override
   public void id_class(rHZ var1) {
      this.Es();
      ((QY)this.id_break[18]).id_break(new ml_3(var1));
   }

   @Override
   public void id_class(iM_2 var1) {
      this.Es();
      if (((cb_3)((QY)this.id_break[18]).id_class[57]).Pb() != var1) {
         ((Ax_1)((QY)this.id_break[18]).id_class[55]).id_throws = System.currentTimeMillis();
      }

      super.id_class(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAJ.id_break(var1)).id_class());
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1773510689190289366L;
   }

   public void id_class(float var1, int var2, int var3) {
      Float var8 = var1;
      this.id_implements[21] = var8;
      Integer var9 = var2;
      this.id_implements[20] = var9;
      Integer var10 = var3;
      this.id_implements[19] = var10;
   }

   @Override
   public boolean id_class(float var1, float var2) {
      boolean var3 = super.id_class(var1, var2);
      if (var3) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .id_finally()
            .id_class(rrnh_3.id_class((rrnX_2)rrnX_2.staticFields1e73a3d9163a3242ac9ccbcc36d981ca[0]));
      }

      return var3;
   }

   @Override
   public void id_class(rHm_1 var1) {
      this.Es();
      ((QY)this.id_break[18]).id_break(new Zm_1(var1));
   }

   @Override
   public void id_class(iG_2 var1, rjU_2 var2) {
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAh_1.id_class()).id_byte()) {
         double var3 = this.rx();
         double var5 = this.BO();
         super.id_class(var1, var2);
         this.id_break((float)(this.rx() - var3), (float)(this.BO() - var5));
      }
   }

   public void id_class(rkw_3<?> var1) {
      this.Es();
      if (((VR)this.id_break[2]).id_protected(var1)) {
         ((VR)this.id_break[2]).id_throws(var1);
         ((Aq_1)this.id_break[0]).id_class(new rZB(var1));
      }
   }

   public void id_class(rgP_2 var1) {
      this.Es();
      ((cq_3)((QY)this.id_break[18]).id_class[19]).id_throws().id_break(var1);
   }

   @Override
   public void id_class(ryG_2 var1) {
      this.Es();
      ((QY)this.id_break[18]).id_break(new Zv_1(var1));
   }

   public double id_class(iB_2 var1, iM_2 var2, iM_2 var3) {
      this.Es();
      iM_2 var4 = ((cb_3)((QY)this.id_break[18]).id_class[57]).Pb();
      iM_2 var5 = var1.Pb();
      ((cb_3)((QY)this.id_break[18]).id_class[57]).id_break(var2);
      var1.id_class(var3);
      double var6 = this.id_protected(var1);
      ((cb_3)((QY)this.id_break[18]).id_class[57]).id_break(var4);
      var1.id_class(var5);
      return var6;
   }

   @Override
   public void id_class(byte var1) {
      this.Es();
      if (var1 >= 24 && var1 <= 28) {
         this.id_class(var1 - 24);
      } else {
         if (var1 == 9 && (rdn_3)this.id_break[30] != null) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLK.id_class((rdn_3)this.id_break[30], this.P()));
            ((rdn_3)this.id_break[30]).id_class((rYB)this.id_throws[7], this);
         }

         super.id_class(var1);
      }
   }

   @Override
   public void id_class(an_3 var1) {
      this.Es();
      ((Cy_1)((QY)this.id_break[18]).id_class[12]).id_class(var1, rLQ.id_catch);
   }

   @Override
   public void id_class(rut_3<?> var1) {
      this.Es();
      super.id_class(var1);
      if (((rut_3)id_catch[3]).equals(var1)) {
         boolean var2 = (((rmE_2)this.id_throws[49]).<Byte>id_class((rut_3<Byte>)id_catch[3]) & 1) > 0 ? true : id_final[43];
         rpm_3 var3 = (((rmE_2)this.id_throws[49]).<Byte>id_class((rut_3<Byte>)id_catch[3]) & 2) > 0 ? rpm_3.OFF_HAND : rpm_3.MAIN_HAND;
         if (var2 && !(Boolean)this.id_break[29]) {
            this.id_break(var3);
         } else if (!var2 && (Boolean)this.id_break[29]) {
            this.id_throw();
         }
      }

      if (((rut_3)id_case[5]).equals(var1) && this.Sy() && !(Boolean)this.id_break[40]) {
         ((QY)this.id_break[18]).c().id_class((NQ)(new Nx_1(this)));
      }
   }

   @Override
   public void id_class(rgP_2 var1, boolean var2) {
      this.Es();
      if (var2) {
         ((cq_3)((QY)this.id_break[18]).id_class[19]).id_class(var1, false, false);
      } else {
         ((cq_3)((QY)this.id_break[18]).id_class[19]).id_throws().id_class(var1);
      }
   }

   @Override
   public void id_class(ryS_2 var1) {
      this.Es();
      ((QY)this.id_break[18]).id_break(new ZZ(var1));
   }

   @Override
   public void id_class(rpm_3 var1) {
      this.Es();
      super.id_class(var1);
      ((Aq_1)this.id_break[0]).id_class(new rmq_3(var1));
   }

   public void id_class(int var1) {
      this.Es();
      Integer var6 = var1;
      this.id_break[4] = var6;
   }

   private void id_class(rrAo_1 var1) {
      this.Es();
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAy_1.id_class());
      boolean var2 = var1.id_protected();
      boolean var3 = var1.id_private();
      boolean var4 = var1.id_extends();
      double var5 = var1.id_package();
      double var7 = var1.id_catch();
      double var9 = var1.id_break();
      float var11 = var1.id_synchronized();
      float var12 = var1.id_continue();
      if ((Float)this.id_break[49] != -1.0F) {
         var11 += this.id_break[49];
      }

      if ((Float)this.id_break[50] != -1.0F) {
         var12 += this.id_break[50];
      }

      var12 = rfU_2.id_class(var12, -90.0F, 90.0F);
      boolean var13 = var1.id_byte();
      boolean var14 = var1.id_byte();
      if (!var13) {
         if (var2 != (Boolean)this.id_break[13]) {
            rmU_2 var15 = var2 ? rmU_2.START_SPRINTING : rmU_2.STOP_SPRINTING;
            ((Aq_1)this.id_break[0]).id_class(new rmD_2(this, var15));
            Boolean var32 = var2;
            this.id_break[13] = var32;
         }

         if (var3 != (Boolean)this.id_break[12]) {
            rmU_2 var48 = var3 ? rmU_2.PRESS_SHIFT_KEY : rmU_2.RELEASE_SHIFT_KEY;
            ((Aq_1)this.id_break[0]).id_class(new rmD_2(this, var48));
            Boolean var33 = var3;
            this.id_break[12] = var33;
         }
      }

      if (this.M()) {
         double var49 = var5 - (Double)this.id_break[5];
         double var17 = var7 - (Double)this.id_break[6];
         double var19 = var9 - (Double)this.id_break[7];
         double var21 = (double)(var11 - (Float)this.id_break[8]);
         double var23 = (double)(var12 - (Float)this.id_break[9]);
         Integer var34 = (Integer)this.id_break[14] + 1;
         this.id_break[14] = var34;
         boolean var10001 = var13 || !(var49 * var49 + var17 * var17 + var19 * var19 > 9.0E-4) && this.id_break[14] < 20 ? id_final[9] : id_final[8];
         Boolean var35 = var10001;
         this.id_break[41] = var35;
         boolean var25 = var10001;
         var10001 = var14 || var21 == 0.0 && var23 == 0.0 ? id_final[11] : id_final[10];
         Boolean var36 = var14 || var21 == 0.0 && var23 == 0.0 ? id_final[11] : id_final[10];
         this.id_break[42] = var36;
         boolean var26 = var10001;
         if (!var13) {
            if (this.Pm()) {
               rjU_2 var27 = this.rv();
               ((Aq_1)this.id_break[0]).id_class(new rZX(var27.id_break, -999.0, var27.id_protected, var11, var12, var4));
               var25 = false;
            } else if (var25 && var26) {
               ((Aq_1)this.id_break[0]).id_class(new rZX(var5, var7, var9, var11, var12, var4));
            } else if (var25) {
               ((Aq_1)this.id_break[0]).id_class(new rZh_1(var5, var7, var9, var4));
            } else if (var26) {
               ((Aq_1)this.id_break[0]).id_class(new rZJ(var11, var12, var4));
            } else if ((Boolean)this.id_break[10] != var4) {
               ((Aq_1)this.id_break[0]).id_class(new rZO(var4));
            }
         }

         if (var25) {
            Double var37 = var5;
            this.id_break[5] = var37;
            Double var38 = var7;
            this.id_break[6] = var38;
            Double var39 = var9;
            this.id_break[7] = var39;
            Integer var40 = 0;
            this.id_break[14] = var40;
         }

         if (var26) {
            Float var41 = var11;
            this.id_break[8] = var41;
            Float var42 = var12;
            this.id_break[9] = var42;
         }

         Boolean var43 = var4;
         this.id_break[10] = var43;
         Boolean var44 = ((Qw_1)((QY)this.id_break[18]).id_class[20]).id_static;
         this.id_break[33] = var44;
         Float var45 = -1.0F;
         this.id_break[49] = var45;
         Float var46 = -1.0F;
         this.id_break[50] = var46;
      }

      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
         .id_finally()
         .id_class(
            rrAj_1.id_class(
               this.rx(),
               this.re(),
               this.BO(),
               (Double)this.id_break[5],
               (Double)this.id_break[6],
               (Double)this.id_break[7],
               (Float)this.id_throws[15],
               (Float)this.id_throws[16],
               (Float)this.id_break[8],
               (Float)this.id_break[9],
               this.BL(),
               this.PF(),
               this.h()
            )
         );
   }

   public boolean id_class(QP var1, float var2) {
      double var3 = this.rx();
      double var5 = this.rN().id_break;
      double var7 = this.BO();
      if (((rYB)this.id_throws[7]).id_byte(new rfH_2(var3, var5, var7)).id_byte() != var1) {
         return id_final[115];
      } else {
         double var9 = this.rN().id_break + (double)var2;
         double var11 = this.re() + (double)this.Bx();
         return ((rYB)this.id_throws[7]).id_byte(new rfH_2(var3, var9, var7)).id_byte() != var1
               && ((rYB)this.id_throws[7]).id_byte(new rfH_2(var3, var11, var7)).id_byte() != var1
            ? true
            : id_final[114];
      }
   }

   @Override
   public boolean id_class(an_3 var1, boolean var2) {
      this.Es();
      if (!super.id_class(var1, var2)) {
         return false;
      } else {
         if (var1 instanceof rsJ_2) {
            ((QY)this.id_break[18]).c().id_class((NQ)(new Ny_1(this, (rsJ_2)var1)));
         }

         if (var1 instanceof rSK) {
            Float var7 = (Float)var1.id_throws[15];
            this.id_throws[17] = var7;
            Float var8 = (Float)var1.id_throws[15];
            this.id_throws[15] = var8;
            this.id_implements((Float)var1.id_throws[15]);
         }

         return id_final[5];
      }
   }

   @Override
   public void id_class(rdn_3 var1, rpm_3 var2) {
      this.Es();
      rdb_3 var3 = var1.id_break();
      if (var3 == rdy_3.xi) {
         ((QY)this.id_break[18]).id_break(new ZM(this, var1, var2));
      }
   }

   @Override
   public rjU_2 id_class(float var1) {
      this.Es();
      if (((Qw_1)((QY)this.id_break[18]).id_class[20]).id_volatile().id_class()) {
         float var2 = rfU_2.id_catch(var1 * 0.5F, (Float)this.id_throws[15], (Float)this.id_throws[17]) * (float) (Math.PI / 180.0);
         float var3 = rfU_2.id_catch(var1 * 0.5F, (Float)this.id_throws[16], (Float)this.id_throws[18]) * (float) (Math.PI / 180.0);
         double var4 = this.Su() == rpZ_2.RIGHT ? -1.0 : id_finally[44];
         rjU_2 var6 = new rjU_2(0.39 * var4, -0.6, 0.3);
         return var6.id_class(-var3).id_break(-var2).id_throws(this.id_new(var1));
      } else {
         return super.id_class(var1);
      }
   }

   @Override
   public void id_class(rye_3 var1, float var2) {
      if (!this.id_class(var1)) {
         this.id_public(this.Ss() - var2);
      }
   }

   @Override
   public void id_class(rHj_1 var1) {
      this.Es();
      ((QY)this.id_break[18]).id_break(new Zo_1(var1));
   }

   @Override
   public rLY id_class(rLR var1) {
      this.Es();
      if (var1 == rLD.id_implements) {
         Float var7 = 0.0F;
         this.id_break[28] = var7;
         Float var8 = 0.0F;
         this.id_break[27] = var8;
      }

      rLY var2 = super.id_class(var1);
      if (var2 != null) {
         rrAN.id_break(var1);
      }

      return var2;
   }

   public void id_class(PX var1) {
      this.Es();
      this.id_break[53] = var1;
   }

   public void id_class(double var1, double var3) {
      this.Es();
      aF_2 var5 = this.s();
      PX var6 = var5.id_class();
      double var7 = var1 * 0.15;
      double var9 = var3 * 0.15;
      if (!((Qw_1)((QY)this.id_break[18]).id_class[20]).l.id_protected()) {
         Float var16 = (float)((double)((Float)this.id_throws[16]).floatValue() + var9);
         this.id_throws[16] = var16;
         Float var17 = (float)((double)((Float)this.id_throws[15]).floatValue() + var7);
         this.id_throws[15] = var17;
         Float var18 = rfU_2.id_class((Float)this.id_throws[16], -90.0F, 90.0F);
         this.id_throws[16] = var18;
         Float var19 = (float)((double)((Float)this.id_throws[18]).floatValue() + var9);
         this.id_throws[18] = var19;
         Float var20 = (float)((double)((Float)this.id_throws[17]).floatValue() + var7);
         this.id_throws[17] = var20;
         Float var21 = rfU_2.id_class((Float)this.id_throws[18], -90.0F, 90.0F);
         this.id_throws[18] = var21;
         var5.id_class((Float)this.id_throws[15], (Float)this.id_throws[16]);
      } else {
         var5.id_class(var6.id_throws() + (float)var7, rfU_2.id_class(var6.id_protected() + (float)var9, -90.0F, 90.0F));
      }

      an_3 var11 = this.ra();
      if (var11 != null) {
         var11.id_volatile(this);
      }
   }

   @Override
   public void id_class(rqA_2 var1, rqL_2 var2, float var3, float var4) {
      ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), var1, var2, var3, var4, false);
   }

   @Override
   public void id_class(rqA_2 var1, float var2, float var3) {
      ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), var1, this.Pr(), var2, var3, false);
   }

   @Override
   public rjU_2 m() {
      this.Es();
      if ((t_1)this.id_break[51] != null && !((t_1)this.id_break[51]).id_byte()) {
         PX var1 = ((t_1)this.id_break[51]).id_class();
         return this.id_byte(var1.id_protected(), var1.id_throws());
      } else {
         return this.id_byte((Float)this.id_break[46], (Float)this.id_break[45]);
      }
   }

   private static void si() {
      id_extends = new short[]{
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
      ((rhz_3)this.id_implements[1]).id_private(rdn_3.id_break);
      super.id_strictfp();
      ((QY)this.id_break[18]).id_break(null);
   }

   @Override
   public void id_default() {
      this.Es();
      Integer var19 = (Integer)this.id_break[20] + 1;
      this.id_break[20] = var19;
      if ((Integer)this.id_break[19] > 0) {
         Integer var20 = (Integer)this.id_break[19] - 1;
         this.id_break[19] = var20;
      }

      this.EM();
      boolean var1 = ((rqr_3)this.id_break[17]).id_private;
      boolean var2 = ((rqr_3)this.id_break[17]).id_implements;
      boolean var3 = this.EE();
      Boolean var21 = ((rhx_3)this.id_implements[18]).id_break
            || this.Py()
            || !this.id_protected(iM_2.CROUCHING)
            || !this.h() && (this.Sc() || this.id_protected(iM_2.STANDING))
         ? id_final[55]
         : id_final[54];
      this.id_break[11] = var21;
      ((rqr_3)this.id_break[17]).id_class(this.F());
      if (this.id_return() && !this.Pm()) {
         rpm_3 var4 = this.P();
         rrAB var5 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .id_finally()
            .id_class(rrAB.id_class(this.sX(), this.id_protected(var4.id_class()), var4, this.Sw(), 0.2F, 0.2F));
         if (!var5.id_byte()) {
            ((rqr_3)this.id_break[17]).id_break = ((rqr_3)this.id_break[17]).id_break * var5.id_case();
            ((rqr_3)this.id_break[17]).id_byte = ((rqr_3)this.id_break[17]).id_byte * var5.id_break();
            Integer var22 = 0;
            this.id_break[19] = var22;
         }
      }

      boolean var42 = id_final[57];
      if ((Integer)this.id_break[34] > 0) {
         Integer var23 = (Integer)this.id_break[34] - 1;
         this.id_break[34] = var23;
         var42 = true;
         ((rqr_3)this.id_break[17]).id_private = true;
      }

      if (!(Boolean)this.id_throws[38]
         && !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .id_finally()
            .id_class(rrAx_1.id_class((rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[2]))
            .id_byte()) {
         this.id_break(this.rx() - (double)this.PN() * 0.35, this.BO() + (double)this.PN() * 0.35);
         this.id_break(this.rx() - (double)this.PN() * 0.35, this.BO() - (double)this.PN() * 0.35);
         this.id_break(this.rx() + (double)this.PN() * 0.35, this.BO() - (double)this.PN() * 0.35);
         this.id_break(this.rx() + (double)this.PN() * 0.35, this.BO() + (double)this.PN() * 0.35);
      }

      if (var2) {
         Integer var24 = 0;
         this.id_break[19] = var24;
      }

      boolean var43 = ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class((rhx_3)this.id_implements[18]);
      boolean var6 = ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(((Qw_1)((QY)this.id_break[18]).id_class[20]).W);
      AutoSprint var7 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().O();
      boolean var8 = !((float)this.sk().id_class() > 6.0F) && !var7.id_else() && !var43 ? id_final[63] : id_final[62];
      boolean var9 = this.id_break(rLD.id_package) && !var7.id_continue() ? true : id_final[65];
      boolean var10 = this.id_return() && !var7.id_new() ? true : id_final[67];
      if (((Boolean)this.id_throws[20] || this.W()) && (!var2 || var7.id_this()) && !var3 && this.EE() && !this.PF() && var8 && !var10 && !var9) {
         if ((Integer)this.id_break[19] <= 0 && !var6) {
            Integer var25 = 7;
            this.id_break[19] = var25;
         } else {
            this.c_(true);
         }
      }

      if (!this.PF() && (!this.rT() || this.W()) && this.EE() && var8 && !var10 && !var9 && var6) {
         this.c_(true);
      }

      if (this.PF()) {
         boolean var11 = ((rqr_3)this.id_break[17]).id_break() && var8 ? id_final[71] : id_final[70];
         boolean var12 = !var11 && !rrLX.id_class((Boolean)this.id_throws[23]).id_class() && (!this.rT() || this.W()) ? id_final[73] : id_final[72];
         if (this.Py()) {
            if (!(Boolean)this.id_throws[20] && !((rqr_3)this.id_break[17]).id_implements && var11 || !this.rT()) {
               this.c_(false);
            }
         } else if (var12) {
            this.c_(false);
         }
      }

      if (this.PF()) {
         this.c_(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAF.id_break(true)).id_class());
      }

      boolean var44 = id_final[77];
      if (var43) {
         if (((Ax_1)((QY)this.id_break[18]).id_class[55]).id_finally()) {
            if (!((rhx_3)this.id_implements[18]).id_break) {
               ((rhx_3)this.id_implements[18]).id_break = true;
               var44 = true;
               this.G();
            }
         } else if (!var1 && ((rqr_3)this.id_break[17]).id_private && !var42) {
            if ((Integer)this.id_implements[6] == 0) {
               Integer var26 = 7;
               this.id_implements[6] = var26;
            } else {
               ((rhx_3)this.id_implements[18]).id_break = !((rhx_3)this.id_implements[18]).id_break ? true : id_final[81];
               if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
                  .id_finally()
                  .id_class(
                     rrAt_1.id_class(
                        ((rhx_3)this.id_implements[18]).id_break
                           ? (rrAw_1)rrAw_1.staticFieldsfdd9e1cda53536f3a280666af211bfa1[0]
                           : (rrAw_1)rrAw_1.staticFieldsfdd9e1cda53536f3a280666af211bfa1[1]
                     )
                  )
                  .id_byte()) {
                  var44 = true;
                  this.G();
                  Integer var27 = 0;
                  this.id_implements[6] = var27;
               } else {
                  ((rhx_3)this.id_implements[18]).id_break = false;
               }
            }
         }
      }

      Boolean var28 = var44;
      this.id_break[39] = var28;
      Boolean var29 = false;
      this.id_break[38] = var29;
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAL.id_class());
      rdn_3 var45 = this.id_class(rXQ.CHEST);
      boolean var13 = var45.id_break() == rdy_3.kc && rxH_2.id_protected(var45) ? true : id_final[87];
      if ((Boolean)this.id_break[38] && rrfj_3.id_catch()) {
         if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().aJ_()
            && !var44
            && !((rhx_3)this.id_implements[18]).id_break
            && !this.Pm()
            && !this.o_()
            && var13) {
            ((rqr_3)this.id_break[17]).id_private = true;
            if (this.sw()) {
               ((Aq_1)this.id_break[0]).id_class(new rmD_2(this, rmU_2.START_FALL_FLYING));
            }
         }
      } else if (((rqr_3)this.id_break[17]).id_private
         && !var44
         && !var1
         && !((rhx_3)this.id_implements[18]).id_break
         && !this.Pm()
         && !this.o_()
         && var13
         && this.sw()) {
         ((Aq_1)this.id_break[0]).id_class(new rmD_2(this, rmU_2.START_FALL_FLYING));
      }

      Boolean var30 = this.Sy();
      this.id_break[40] = var30;
      if (this.rT() && ((rqr_3)this.id_break[17]).id_implements && this.sr()) {
         this.Sm();
      }

      if (this.id_class(rlG_2.id_break)) {
         byte var14 = this.id_native() ? 10 : id_final[89];
         Integer var31 = rfU_2.id_class((Integer)this.id_break[35] + var14, 0, 600);
         this.id_break[35] = var31;
      } else if ((Integer)this.id_break[35] > 0) {
         this.id_class(rlG_2.id_break);
         Integer var32 = rfU_2.id_class((Integer)this.id_break[35] - 10, 0, 600);
         this.id_break[35] = var32;
      }

      if (((rhx_3)this.id_implements[18]).id_break && this.M()) {
         int var46 = 0;
         if (((rqr_3)this.id_break[17]).id_implements) {
            var46--;
         }

         if (((rqr_3)this.id_break[17]).id_private) {
            var46++;
         }

         if (var46 != 0) {
            this.id_byte(this.rv().id_break(0.0, (double)((float)var46 * ((rhx_3)this.id_implements[18]).id_class() * 3.0F), 0.0));
         }
      }

      if (this.L()) {
         aD_2 var47 = (aD_2)this.ra();
         if ((Integer)this.id_break[25] < 0) {
            Integer var33 = (Integer)this.id_break[25] + 1;
            this.id_break[25] = var33;
            if ((Integer)this.id_break[25] == 0) {
               Float var34 = 0.0F;
               this.id_break[26] = var34;
            }
         }

         if (var1 && !((rqr_3)this.id_break[17]).id_private) {
            Integer var35 = -10;
            this.id_break[25] = var35;
            var47.id_class(rfU_2.id_protected(this.E() * 100.0F));
            this.n();
         } else if (!var1 && ((rqr_3)this.id_break[17]).id_private) {
            Integer var36 = 0;
            this.id_break[25] = var36;
            Float var37 = 0.0F;
            this.id_break[26] = var37;
         } else if (var1) {
            Integer var38 = (Integer)this.id_break[25] + 1;
            this.id_break[25] = var38;
            if ((Integer)this.id_break[25] < 10) {
               Float var39 = (float)((Integer)this.id_break[25]).intValue() * 0.1F;
               this.id_break[26] = var39;
            } else {
               Float var40 = 0.8F + 2.0F / (float)((Integer)this.id_break[25] - 9) * 0.1F;
               this.id_break[26] = var40;
            }
         }
      } else {
         Float var41 = 0.0F;
         this.id_break[26] = var41;
      }

      super.id_default();
      if ((Boolean)this.id_throws[20] && ((rhx_3)this.id_implements[18]).id_break && !((Ax_1)((QY)this.id_break[18]).id_class[55]).id_finally()) {
         ((rhx_3)this.id_implements[18]).id_break = false;
         this.G();
      }
   }

   public boolean v() {
      this.Es();
      return (Boolean)this.id_break[33];
   }

   public String id_short() {
      this.Es();
      return (String)this.id_break[16];
   }

   public PX z() {
      this.Es();
      return new PX((Float)this.id_break[8], (Float)this.id_break[9]);
   }

   @Override
   public boolean id_void() {
      this.Es();
      boolean var1 = (Boolean)this.id_implements[17];
      boolean var2 = super.id_void();
      if (this.id_native()) {
         return (Boolean)this.id_implements[17];
      } else {
         if (!var1 && var2) {
            ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), rqn_3.id_new, rqL_2.AMBIENT, 1.0F, 1.0F, false);
            ((QY)this.id_break[18]).c().id_class((NQ)(new cs_3(this)));
         }

         if (var1 && !var2) {
            ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), rqn_3.id_continue, rqL_2.AMBIENT, 1.0F, 1.0F, false);
         }

         return (Boolean)this.id_implements[17];
      }
   }

   @Override
   public boolean u() {
      return super.u()
            && !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
               .id_finally()
               .id_class(rrAx_1.id_class((rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[0]))
               .id_byte()
         ? true
         : id_final[119];
   }

   public rqB_2 r() {
      this.Es();
      return (rqB_2)this.id_break[37];
   }

   public float N() {
      this.Es();
      return (Float)this.id_break[8];
   }

   private void id_break(double var1, double var3) {
      rfH_2 var5 = new rfH_2(var1, this.re(), var3);
      if (this.id_implements(var5)) {
         double var6 = var1 - (double)var5.b_();
         double var8 = var3 - (double)var5.d_();
         rpr_3 var10 = null;
         double var11 = Double.MAX_VALUE;
         rpr_3[] var13 = new rpr_3[]{rpr_3.WEST, rpr_3.EAST, rpr_3.NORTH, rpr_3.SOUTH};

         for (rpr_3 var17 : var13) {
            double var18 = var17.id_final().id_class(var6, 0.0, var8);
            double var20 = var17.id_throws() == rpG_2.POSITIVE ? 1.0 - var18 : var18;
            if (var20 < var11 && !this.id_implements(var5.id_break(var17))) {
               var11 = var20;
               var10 = var17;
            }
         }

         if (var10 != null) {
            rjU_2 var22 = this.rv();
            if (var10.id_final() == rpB_2.X) {
               this.id_catch(0.1 * (double)var10.id_implements(), var22.id_byte, var22.id_protected);
            } else {
               this.id_catch(var22.id_break, var22.id_byte, 0.1 * (double)var10.id_extends());
            }
         }
      }
   }

   public void id_break(float var1, float var2) {
      this.Es();
      if (this.EB()) {
         rjU_2 var3 = this.Ps();
         rjU_2 var4 = var3.id_break((double)var1, 0.0, (double)var2);
         rjU_2 var5 = new rjU_2((double)var1, 0.0, (double)var2);
         float var6 = this.sB();
         float var7 = (float)var5.id_catch();
         if (var7 <= 0.001F) {
            rjK_2 var8 = ((rqr_3)this.id_break[17]).id_class();
            float var9 = var6 * var8.id_byte;
            float var10 = var6 * var8.id_protected;
            float var11 = rfU_2.id_class((Float)this.id_throws[15] * (float) (Math.PI / 180.0));
            float var12 = rfU_2.id_break((Float)this.id_throws[15] * (float) (Math.PI / 180.0));
            var5 = new rjU_2((double)(var9 * var12 - var10 * var11), var5.id_byte, (double)(var10 * var12 + var9 * var11));
            var7 = (float)var5.id_catch();
            if (var7 <= 0.001F) {
               return;
            }
         }

         float var44 = rfU_2.id_implements(var7);
         rjU_2 var45 = var5.id_class((double)var44);
         rjU_2 var46 = this.rh();
         float var47 = (float)(var46.id_break * var45.id_break + var46.id_protected * var45.id_protected);
         if (!(var47 < -0.15F)) {
            rjm_3 var48 = rjm_3.id_class(this);
            rfH_2 var13 = new rfH_2(this.rx(), this.rN().id_throws, this.BO());
            xc_3 var14 = ((rYB)this.id_throws[7]).id_byte(var13);
            if (var14.id_break((rYB)this.id_throws[7], var13, var48).id_break()) {
               var13 = var13.id_final();
               xc_3 var15 = ((rYB)this.id_throws[7]).id_byte(var13);
               if (var15.id_break((rYB)this.id_throws[7], var13, var48).id_break()) {
                  float var16 = 1.2F;
                  if (this.id_break(rLD.id_private)) {
                     var16 += (float)(this.id_byte(rLD.id_private).id_byte() + 1) * 0.75F;
                  }

                  float var17 = Math.max(var6 * 7.0F, 1.0F / var44);
                  rjU_2 var18 = var4.id_throws(var45.id_class((double)var17));
                  float var19 = this.PN();
                  float var20 = this.Bm();
                  rfl_3 var21 = new rfl_3(var3, var18.id_break(0.0, (double)var20, 0.0)).id_byte((double)var19, 0.0, (double)var19);
                  rjU_2 var22 = var3.id_break(0.0, 0.51F, 0.0);
                  var18 = var18.id_break(0.0, 0.51F, 0.0);
                  rjU_2 var23 = var45.id_byte(new rjU_2(0.0, 1.0, 0.0));
                  rjU_2 var24 = var23.id_class((double)(var19 * 0.5F));
                  rjU_2 var25 = var22.id_protected(var24);
                  rjU_2 var26 = var18.id_protected(var24);
                  rjU_2 var27 = var22.id_throws(var24);
                  rjU_2 var28 = var18.id_throws(var24);
                  Iterator var29 = ((rYB)this.id_throws[7]).id_byte(this, var21, var0 -> true).flatMap(var0 -> var0.id_protected().stream()).iterator();
                  float var30 = Float.MIN_VALUE;

                  while (var29.hasNext()) {
                     rfl_3 var31 = (rfl_3)var29.next();
                     if (var31.id_class(var25, var26) || var31.id_class(var27, var28)) {
                        var30 = (float)var31.id_throws;
                        rjU_2 var32 = var31.id_case();
                        rfH_2 var33 = new rfH_2(var32);

                        for (int var34 = 1; (float)var34 < var16; var34++) {
                           rfH_2 var35 = var33.id_break(var34);
                           xc_3 var36 = ((rYB)this.id_throws[7]).id_byte(var35);
                           rjC_2 var37;
                           if (!(var37 = var36.id_break((rYB)this.id_throws[7], var35, var48)).id_break()) {
                              var30 = (float)var37.id_byte(rpB_2.Y) + (float)var35.c_();
                              if ((double)var30 - this.re() > (double)var16) {
                                 return;
                              }
                           }

                           if (var34 > 1) {
                              var13 = var13.id_final();
                              xc_3 var38 = ((rYB)this.id_throws[7]).id_byte(var13);
                              if (!var38.id_break((rYB)this.id_throws[7], var13, var48).id_break()) {
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
                        this.id_break[34] = var43;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void id_break(rpm_3 var1) {
      this.Es();
      rdn_3 var2 = this.id_protected(var1);
      if (!var2.id_class() && !this.id_return()) {
         super.id_break(var1);
         Boolean var7 = true;
         this.id_break[29] = var7;
         this.id_break[31] = var1;
      }
   }

   public void id_break(iM_2 var1) {
      super.id_class(var1);
   }

   public PX id_break(PX var1) {
      Float var6 = var1.id_throws();
      this.id_throws[15] = var6;
      Float var7 = var1.id_protected();
      this.id_throws[16] = var7;
      return var1;
   }

   @Override
   public void id_break(an_3 var1) {
      this.Es();
      ((Cy_1)((QY)this.id_break[18]).id_class[12]).id_class(var1, rLQ.id_continue);
   }

   @Override
   public rjU_2 id_break(float var1) {
      PX var2 = this.id_switch();
      return this.id_byte(var2.id_protected(), var2.id_throws());
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      return false;
   }

   public void id_throws(boolean var1) {
      this.Es();
      Boolean var6 = var1;
      this.id_break[36] = var6;
   }

   public static String id_throws(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, 68, 74, -102, -104, -81, 118, 101}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public float id_throws(float var1) {
      return (Float)this.id_throws[15];
   }

   public boolean L() {
      an_3 var1 = this.ra();
      return this.Pm() && var1 instanceof aD_2 && ((aD_2)var1).id_throws() ? true : id_final[45];
   }

   public boolean M() {
      this.Es();
      return ((QY)this.id_break[18]).id_catch() == this ? true : id_final[51];
   }

   @Override
   public boolean W() {
      return (Boolean)this.id_implements[17];
   }

   @Override
   public rpm_3 P() {
      this.Es();
      return (rpm_3)this.id_break[31];
   }

   public boolean id_catch(float var1) {
      return !this.id_class(QP.id_finally, var1) && !this.id_class(QP.id_native, var1) ? id_final[117] : id_final[116];
   }

   @Override
   public void G() {
      this.Es();
      ((Aq_1)this.id_break[0]).id_class(new rZG((rhx_3)this.id_implements[18]));
   }

   public double O() {
      this.Es();
      return (Double)this.id_break[6];
   }

   public PX id_goto() {
      this.Es();
      return new PX((Float)this.id_break[45], (Float)this.id_break[46]);
   }

   @Override
   public float id_case(float var1) {
      return (Float)this.id_throws[16];
   }

   public void id_case(String var1) {
      this.Es();
      ((Aq_1)this.id_break[0]).id_class(new rmT_2(var1));
   }

   public void id_case(boolean var1) {
      this.Es();
      Boolean var6 = var1;
      this.id_break[13] = var6;
   }

   @Override
   public void id_const() {
      this.Es();
      super.id_const();
      Boolean var5 = false;
      this.id_break[32] = var5;
   }

   @Override
   public void id_else() {
      this.Es();
      ((Aq_1)this.id_break[0]).id_class(new rmD_2(this, rmU_2.OPEN_INVENTORY));
   }

   private static int id_else(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 405942856;
   }

   public double id_for() {
      this.Es();
      return (Double)this.id_break[5];
   }

   private boolean id_implements(rfH_2 var1) {
      rfl_3 var2 = this.rN();
      rfl_3 var3 = new rfl_3((double)var1.b_(), var2.id_break, (double)var1.d_(), (double)var1.b_() + 1.0, var2.id_throws, (double)var1.d_() + 1.0)
         .id_break(1.0E-7);
      return !((rYB)this.id_throws[7]).id_class(this, var3, (var1x, var2x) -> var1x.id_final((rYB)this.id_throws[7], var2x)) ? true : id_final[34];
   }

   @Override
   public rjK_2 id_import() {
      this.Es();
      if ((t_1)this.id_break[51] != null && !((t_1)this.id_break[51]).id_byte()) {
         PX var1 = ((t_1)this.id_break[51]).id_class();
         return super.id_import().id_class(var1.id_throws(), var1.id_protected());
      } else {
         return super.id_import().id_class((Float)this.id_break[45], (Float)this.id_break[46]);
      }
   }

   @Override
   public boolean id_instanceof() {
      rrAn_1 var1 = rrAn_1.id_class(super.id_instanceof());
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var1);
      return var1.id_class();
   }

   @Override
   public boolean id_return() {
      this.Es();
      return (Boolean)this.id_break[29];
   }

   @Override
   public PX id_switch() {
      this.Es();
      return (PX)this.id_break[53];
   }

   @Override
   public void id_throw() {
      this.Es();
      super.id_throw();
      Boolean var5 = false;
      this.id_break[29] = var5;
   }

   @Override
   public boolean id_try() {
      return true;
   }

   @Override
   public boolean id_while() {
      return !((rhx_3)this.id_implements[18]).id_break && super.id_while() ? true : id_final[27];
   }

   public double id_static() {
      this.Es();
      return (Double)this.id_break[7];
   }

   public float id_public() {
      this.Es();
      if (!this.id_class(rlG_2.id_break)) {
         return 0.0F;
      } else if ((float)((Integer)this.id_break[35]).intValue() >= 600.0F) {
         return 1.0F;
      } else {
         float var1 = rfU_2.id_class((float)((Integer)this.id_break[35]).intValue() / 100.0F, 0.0F, 1.0F);
         float var2 = (float)((Integer)this.id_break[35]).intValue() < 100.0F
            ? 0.0F
            : rfU_2.id_class(((float)((Integer)this.id_break[35]).intValue() - 100.0F) / 500.0F, 0.0F, 1.0F);
         return var1 * 0.6F + var2 * 0.39999998F;
      }
   }

   public boolean id_protected(String var1) {
      this.Es();
      if (((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_break(var1)) {
         return false;
      } else {
         rrAv_1 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAv_1.id_break(var1));
         if (var2.id_byte()) {
            return false;
         } else {
            ((Aq_1)this.id_break[0]).id_class(new rmT_2(var2.id_class()));
            return true;
         }
      }
   }

   @Override
   public void id_protected(float var1) {
   }

   @Override
   public boolean id_protected(boolean var1) {
      this.Es();
      rZM var2 = var1 ? rZM.DROP_ALL_ITEMS : rZM.DROP_ITEM;
      ((Aq_1)this.id_break[0]).id_class(new rZb_1(var2, rfH_2.id_protected, rpr_3.DOWN));
      rdn_3 var3 = ((rhz_3)this.id_implements[1])
         .id_class(
            ((rhz_3)this.id_implements[1]).id_protected,
            var1 && !((rhz_3)this.id_implements[1]).id_byte().id_class() ? ((rhz_3)this.id_implements[1]).id_byte().id_char() : id_final[14]
         );
      rrLV.id_class(var3, null, (rrLg_1)rrLg_1.staticFields83bfa4843c3c3647913690fe22963b15[1]);
      return var3 != rdn_3.id_break ? true : id_final[16];
   }

   public rlP_2 id_abstract() {
      this.Es();
      return (rlP_2)this.id_break[1];
   }

   @Override
   public boolean id_transient() {
      return !((rhx_3)this.id_implements[18]).id_break && super.id_transient() ? true : id_final[23];
   }

   @Override
   public int id_synchronized() {
      this.Es();
      return (Integer)this.id_break[4];
   }

   @Override
   public void id_strictfp() {
      this.Es();
      ((Aq_1)this.id_break[0]).id_class(new rmj_3(((rJr_1)this.id_implements[4]).id_case));
      this.k();
   }

   public float E() {
      this.Es();
      return (Float)this.id_break[26];
   }

   @Override
   public void A() {
      this.Es();
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_break();
      super.A();
      Boolean var7 = false;
      this.id_break[32] = var7;
      if (this.ra() instanceof rSK var1) {
         var1.id_class(
            ((rqr_3)this.id_break[17]).id_case,
            ((rqr_3)this.id_break[17]).id_catch,
            ((rqr_3)this.id_break[17]).id_protected,
            ((rqr_3)this.id_break[17]).id_throws
         );
         Boolean var8 = (Boolean)this.id_break[32]
            | (
               !((rqr_3)this.id_break[17]).id_case
                     && !((rqr_3)this.id_break[17]).id_catch
                     && !((rqr_3)this.id_break[17]).id_protected
                     && !((rqr_3)this.id_break[17]).id_throws
                  ? id_final[100]
                  : id_final[99]
            );
         this.id_break[32] = var8;
      }
   }

   public boolean X() {
      this.Es();
      return (Boolean)this.id_break[13];
   }

   @Override
   public void Q() {
      this.Es();
      super.Q();
      if (this.M()) {
         Float var5 = ((rqr_3)this.id_break[17]).id_break;
         this.id_private[42] = var5;
         Float var6 = ((rqr_3)this.id_break[17]).id_byte;
         this.id_private[44] = var6;
         Boolean var7 = ((rqr_3)this.id_break[17]).id_private;
         this.id_private[41] = var7;
         Float var8 = (Float)this.id_break[21];
         this.id_break[23] = var8;
         Float var9 = (Float)this.id_break[22];
         this.id_break[24] = var9;
         Float var10 = (float)((double)((Float)this.id_break[22]).floatValue() + (double)((Float)this.id_break[46] - (Float)this.id_break[22]) * 0.5);
         this.id_break[22] = var10;
         Float var11 = (float)((double)((Float)this.id_break[21]).floatValue() + (double)((Float)this.id_break[45] - (Float)this.id_break[21]) * 0.5);
         this.id_break[21] = var11;
         Float var12 = (Float)this.id_throws[16];
         this.id_private[26] = var12;
      }
   }

   private void EM() {
      this.Es();
      Float var5 = (Float)this.id_break[27];
      this.id_break[28] = var5;
      if ((Boolean)this.id_throws[59]) {
         if ((vm_3)((QY)this.id_break[18]).id_class[73] != null
            && !((vm_3)((QY)this.id_break[18]).id_class[73]).z_()
            && (vm_3)((QY)this.id_break[18]).id_class[73] instanceof Fu_1) {
            this.id_strictfp();
         }

         if ((Float)this.id_break[27] == 0.0F) {
            ((QY)this.id_break[18]).c().id_class(Np_1.id_byte(rqn_3.hD, ((Random)this.id_throws[40]).nextFloat() * 0.4F + 0.8F, 0.25F));
         }

         Float var6 = (Float)this.id_break[27] + 0.0125F;
         this.id_break[27] = var6;
         if ((Float)this.id_break[27] >= 1.0F) {
            Float var7 = 1.0F;
            this.id_break[27] = var7;
         }

         Boolean var8 = false;
         this.id_throws[59] = var8;
      } else if (this.id_break(rLD.id_implements) && this.id_byte(rLD.id_implements).id_break() > 60) {
         Float var9 = (Float)this.id_break[27] + 0.006666667F;
         this.id_break[27] = var9;
         if ((Float)this.id_break[27] > 1.0F) {
            Float var10 = 1.0F;
            this.id_break[27] = var10;
         }
      } else {
         if ((Float)this.id_break[27] > 0.0F) {
            Float var11 = (Float)this.id_break[27] - 0.05F;
            this.id_break[27] = var11;
         }

         if ((Float)this.id_break[27] < 0.0F) {
            Float var12 = 0.0F;
            this.id_break[27] = var12;
         }
      }

      this.a();
   }

   private static void EG() {
      id_volatile = new float[]{
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
      id_native = new byte[]{
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
      return this.v() && this.id_break[34] <= 0 && this.id_throws[20] && !this.id_instanceof() && !this.Pm() && this.Er() && (double)this.rl() >= 1.0
         ? true
         : id_final[106];
   }

   private void Es() {
      if (this.id_break == null) {
         this.id_break = new Object[54];
         Object[] var1 = this.id_break;
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
      id_final = new boolean[]{
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
      id_finally = new double[]{
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
      rjK_2 var1 = ((rqr_3)this.id_break[17]).id_class();
      return var1.id_byte == 0.0F && var1.id_protected == 0.0F ? id_final[108] : id_final[107];
   }

   private boolean EE() {
      this.Es();
      if (this.W()) {
         return ((rqr_3)this.id_break[17]).id_break();
      } else {
         double var1 = id_finally[40];
         AutoSprint var3 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().O();
         if (this.h() && var3.id_this()) {
            var1 = 0.3;
         }

         if (this.Pb() == iM_2.SWIMMING && var3.id_super()) {
            var1 = 0.3;
         }

         return (double)((rqr_3)this.id_break[17]).id_byte >= var1 ? true : id_final[110];
      }
   }

   @Override
   public void c_(boolean var1) {
      this.Es();
      super.c_(var1);
      Integer var6 = 0;
      this.id_break[20] = var6;
   }
}
