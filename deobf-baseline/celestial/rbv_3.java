package celestial;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Random;

public class rbv_3 extends rbm_3 {
   private static final rut_3<Byte> id_class = rmE_2.id_class(rbv_3.class, ruw_3.id_class);
   private static final ay_3 id_break = new ay_3().id_class(4.0).id_break();
   private rfH_2 id_protected;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.Z;
   }

   @Override
   protected void id_double() {
      super.id_double();
      rfH_2 var1 = this.Bs();
      rfH_2 var2 = var1.id_final();
      if (this.id_catch()) {
         boolean var3 = this.BF();
         if (((rYB)this.id_throws[7]).id_byte(var2).id_catch((rYB)this.id_throws[7], var1)) {
            if (((Random)this.id_throws[40]).nextInt(200) == 0) {
               Float var17 = (float)((Random)this.id_throws[40]).nextInt(360);
               this.id_private[25] = var17;
            }

            if (((rYB)this.id_throws[7]).id_class(id_break, this) != null) {
               this.id_this(false);
               if (!var3) {
                  ((rYB)this.id_throws[7]).id_class((rhd_3)null, 1025, var1, 0);
               }
            }
         } else {
            this.id_this(false);
            if (!var3) {
               ((rYB)this.id_throws[7]).id_class((rhd_3)null, 1025, var1, 0);
            }
         }
      } else {
         if (this.id_protected != null && (!((rYB)this.id_throws[7]).id_finally(this.id_protected) || this.id_protected.c_() < 1)) {
            this.id_protected = null;
         }

         if (this.id_protected == null || ((Random)this.id_throws[40]).nextInt(30) == 0 || this.id_protected.id_class(this.Ps(), 2.0)) {
            this.id_protected = new rfH_2(
               this.rx() + (double)((Random)this.id_throws[40]).nextInt(7) - (double)((Random)this.id_throws[40]).nextInt(7),
               this.re() + (double)((Random)this.id_throws[40]).nextInt(6) - 2.0,
               this.BO() + (double)((Random)this.id_throws[40]).nextInt(7) - (double)((Random)this.id_throws[40]).nextInt(7)
            );
         }

         double var20 = (double)this.id_protected.b_() + 0.5 - this.rx();
         double var5 = (double)this.id_protected.c_() + 0.1 - this.re();
         double var7 = (double)this.id_protected.d_() + 0.5 - this.BO();
         rjU_2 var9 = this.rv();
         rjU_2 var10 = var9.id_break(
            (Math.signum(var20) * 0.5 - var9.id_break) * 0.1F,
            (Math.signum(var5) * 0.7F - var9.id_byte) * 0.1F,
            (Math.signum(var7) * 0.5 - var9.id_protected) * 0.1F
         );
         this.id_byte(var10);
         float var11 = (float)(rfU_2.id_protected(var10.id_protected, var10.id_break) * 180.0F / (float)Math.PI) - 90.0F;
         float var12 = rfU_2.id_catch(var11 - (Float)this.id_throws[15]);
         Float var18 = 0.5F;
         this.id_private[44] = var18;
         Float var19 = (Float)this.id_throws[15] + var12;
         this.id_throws[15] = var19;
         if (((Random)this.id_throws[40]).nextInt(100) == 0 && ((rYB)this.id_throws[7]).id_byte(var2).id_catch((rYB)this.id_throws[7], var2)) {
            this.id_this(true);
         }
      }
   }

   public rbv_3(aI_2<? extends rbv_3> var1, rYB var2) {
      super(var1, var2);
      this.id_this(true);
   }

   public void id_this(boolean var1) {
      byte var2 = ((rmE_2)this.id_throws[49]).id_class(id_class);
      if (var1) {
         ((rmE_2)this.id_throws[49]).id_break(id_class, (byte)(var2 | 1));
      } else {
         ((rmE_2)this.id_throws[49]).id_break(id_class, (byte)(var2 & -2));
      }
   }

   @Override
   public void id_this() {
      super.id_this();
      if (this.id_catch()) {
         this.id_byte(rjU_2.id_class);
         this.id_volatile(this.rx(), (double)rfU_2.id_byte(this.re()) + 1.0 - (double)this.Bm(), this.BO());
      } else {
         this.id_byte(this.rv().id_throws(1.0, 0.6, 1.0));
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("BatFlags", ((rmE_2)this.id_throws[49]).id_class(id_class));
   }

   @Override
   public boolean id_class(float var1, float var2) {
      return false;
   }

   @Override
   protected void id_class(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return false;
      } else {
         if (!((rYB)this.id_throws[7]).id_continue && this.id_catch()) {
            this.id_this(false);
         }

         return super.id_break(var1, var2);
      }
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return var2.id_break / 2.0F;
   }

   public static boolean id_break(aI_2<rbv_3> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      if (var3.c_() >= var1.id_short()) {
         return false;
      } else {
         int var5 = var1.id_package(var3);
         byte var6 = 4;
         if (id_implements()) {
            var6 = 7;
         } else if (var4.nextBoolean()) {
            return false;
         }

         return var5 > var4.nextInt(var6) ? false : id_class(var0, var1, var2, var3, var4);
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      ((rmE_2)this.id_throws[49]).id_break(id_class, var1.id_case("BatFlags"));
   }

   public static iz_3 id_throws() {
      return is_3.id_package().id_class(iQ_2.id_class, 6.0);
   }

   public boolean id_catch() {
      return (((rmE_2)this.id_throws[49]).id_class(id_class) & 1) != 0;
   }

   private static boolean id_implements() {
      LocalDate var0 = LocalDate.now();
      int var1 = var0.get(ChronoField.DAY_OF_MONTH);
      int var2 = var0.get(ChronoField.MONTH_OF_YEAR);
      return var2 == 10 && var1 >= 20 || var2 == 11 && var1 <= 3;
   }

   @Override
   protected void id_instanceof(an_3 var1) {
   }

   @Override
   public rqA_2 id_static() {
      return this.id_catch() && ((Random)this.id_throws[40]).nextInt(4) != 0 ? null : rqn_3.u;
   }

   @Override
   public boolean rB() {
      return true;
   }

   @Override
   public boolean rG() {
      return false;
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.m;
   }

   @Override
   protected void SS() {
   }

   @Override
   protected float SN() {
      return super.SN() * 0.95F;
   }

   @Override
   protected float Si() {
      return 0.1F;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_class, (byte)0);
   }
}
