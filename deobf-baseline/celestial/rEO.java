package celestial;

import java.util.Random;

public class rEO extends rEi_1 {
   private float id_class = 0.5F;
   private int id_break;
   private static final rut_3<Byte> id_protected = rmE_2.id_class(rEO.class, ruw_3.id_class);

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.K;
   }

   @Override
   protected void id_double() {
      this.id_break--;
      if (this.id_break <= 0) {
         this.id_break = 100;
         this.id_class = 0.5F + (float)((Random)this.id_throws[40]).nextGaussian() * 3.0F;
      }

      iB_2 var1 = this.I_();
      if (var1 != null && var1.rH() > this.rH() + (double)this.id_class && this.id_catch(var1)) {
         rjU_2 var2 = this.rv();
         this.id_byte(this.rv().id_break(0.0, (0.3F - var2.id_byte) * 0.3F, 0.0));
         Boolean var7 = true;
         this.id_throws[57] = var7;
      }

      super.id_double();
   }

   public rEO(aI_2<? extends rEO> var1, rYB var2) {
      super(var1, var2);
      this.id_class(rLp_1.WATER, -1.0F);
      this.id_class(rLp_1.LAVA, 8.0F);
      this.id_class(rLp_1.DANGER_FIRE, 0.0F);
      this.id_class(rLp_1.DAMAGE_FIRE, 0.0F);
      this.id_finally = 10;
   }

   void id_this(boolean var1) {
      byte var2 = ((rmE_2)this.id_throws[49]).id_class(id_protected);
      if (var1) {
         var2 = (byte)(var2 | 1);
      } else {
         var2 = (byte)(var2 & -2);
      }

      ((rmE_2)this.id_throws[49]).id_break(id_protected, var2);
   }

   @Override
   public boolean id_class(float var1, float var2) {
      return false;
   }

   @Override
   public void id_default() {
      if (!(Boolean)this.id_throws[20] && this.rv().id_byte < 0.0) {
         this.id_byte(this.rv().id_throws(1.0, 0.6, 1.0));
      }

      if (((rYB)this.id_throws[7]).id_continue) {
         if (((Random)this.id_throws[40]).nextInt(24) == 0 && !this.BF()) {
            ((rYB)this.id_throws[7])
               .id_class(
                  this.rx() + 0.5,
                  this.re() + 0.5,
                  this.BO() + 0.5,
                  rqn_3.Y,
                  this.Pr(),
                  1.0F + ((Random)this.id_throws[40]).nextFloat(),
                  ((Random)this.id_throws[40]).nextFloat() * 0.7F + 0.3F,
                  false
               );
         }

         for (int var1 = 0; var1 < 2; var1++) {
            ((rYB)this.id_throws[7]).id_class(rLQ.id_short, this.id_break(0.5), this.Ph(), this.id_protected(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.id_default();
   }

   public static iz_3 id_throws() {
      return rEi_1.sm().id_class(iQ_2.id_case, 6.0).id_class(iQ_2.id_protected, 0.23F).id_class(iQ_2.id_break, 48.0);
   }

   private boolean L() {
      return (((rmE_2)this.id_throws[49]).id_class(id_protected) & 1) != 0;
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.R;
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(4, new rEh_1(this));
      this.id_package.id_class(5, new rBT(this, 1.0));
      this.id_package.id_class(7, new rSk_1(this, 1.0, 0.0F));
      this.id_package.id_class(8, new rBA(this, rhd_3.class, 8.0F));
      this.id_package.id_class(8, new rBC(this));
      this.id_int.id_class(1, new rBc_1(this).id_class());
      this.id_int.id_class(2, new rBI<>(this, rhd_3.class, true));
   }

   @Override
   public boolean Pz() {
      return this.L();
   }

   @Override
   public float rX() {
      return 1.0F;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.o;
   }

   @Override
   public boolean BU() {
      return true;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_protected, (byte)0);
   }
}
