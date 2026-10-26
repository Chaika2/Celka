package celestial;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class rGA extends is_3 implements rEK {
   private static final rut_3<Integer> id_super = rmE_2.id_class(rGA.class, ruw_3.id_break);
   public float id_class;
   public float id_break;
   public float id_protected;
   private boolean id_this;

   @Override
   protected boolean id_boolean() {
      return this.sk() > 0;
   }

   @Override
   public void id_byte(an_3 var1) {
      super.id_byte(var1);
      if (var1 instanceof rMZ && this.n()) {
         this.id_private((iB_2)var1);
      }
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return this.sW() ? rqn_3.xW : rqn_3.Jf;
   }

   public static boolean id_byte(aI_2<rGA> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      if (var1.id_abstract() != rRO.PEACEFUL) {
         if (Objects.equals(var1.id_protected(var3), Optional.of(rYl_1.id_catch))
            && var3.c_() > 50
            && var3.c_() < 70
            && var4.nextFloat() < 0.5F
            && var4.nextFloat() < var1.id_interface()
            && var1.id_package(var3) <= var4.nextInt(8)) {
            return id_class(var0, var1, var2, var3, var4);
         }

         if (!(var1 instanceof rRI)) {
            return false;
         }

         rfj_3 var5 = new rfj_3(var3);
         boolean var6 = rqm_3.id_class(var5.id_break, var5.id_byte, ((rRI)var1).id_break(), 987234911L).nextInt(10) == 0;
         if (var4.nextInt(10) == 0 && var6 && var3.c_() < 40) {
            return id_class(var0, var1, var2, var3, var4);
         }
      }

      return false;
   }

   public rGA(aI_2<? extends rGA> var1, rYB var2) {
      super(var1, var2);
      this.id_native = new rGy_1(this);
   }

   @Override
   public void id_this() {
      this.id_break = this.id_break + (this.id_class - this.id_break) * 0.5F;
      this.id_protected = this.id_break;
      super.id_this();
      if ((Boolean)this.id_throws[20] && !this.id_this) {
         int var1 = this.sk();

         for (int var2 = 0; var2 < var1 * 8; var2++) {
            float var3 = ((Random)this.id_throws[40]).nextFloat() * (float) (Math.PI * 2);
            float var4 = ((Random)this.id_throws[40]).nextFloat() * 0.5F + 0.5F;
            float var5 = rfU_2.id_class(var3) * (float)var1 * 0.5F * var4;
            float var6 = rfU_2.id_break(var3) * (float)var1 * 0.5F * var4;
            ((rYB)this.id_throws[7]).id_class(this.id_catch(), this.rx() + (double)var5, this.re(), this.BO() + (double)var6, 0.0, 0.0, 0.0);
         }

         this.id_class(this.sx(), this.Si(), ((((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 1.0F) / 0.8F);
         this.id_class = -0.5F;
      } else if (!(Boolean)this.id_throws[20] && this.id_this) {
         this.id_class = 1.0F;
      }

      this.id_this = (Boolean)this.id_throws[20];
      this.L();
   }

   @Override
   protected boolean n() {
      return !this.sW() && this.id_try();
   }

   @Override
   public void id_class(rut_3<?> var1) {
      if (id_super.equals(var1)) {
         this.q_();
         Float var6 = (Float)this.id_private[25];
         this.id_throws[15] = var6;
         Float var7 = (Float)this.id_private[25];
         this.id_private[23] = var7;
         if (this.rT() && ((Random)this.id_throws[40]).nextInt(20) == 0) {
            this.U();
         }
      }

      super.id_class(var1);
   }

   protected void id_class(int var1, boolean var2) {
      ((rmE_2)this.id_throws[49]).id_break(id_super, var1);
      this.PX();
      this.q_();
      this.id_byte(iQ_2.id_class).id_class((double)(var1 * var1));
      this.id_byte(iQ_2.id_protected).id_class((double)(0.2F + 0.1F * (float)var1));
      this.id_byte(iQ_2.id_case).id_class((double)var1);
      if (var2) {
         this.id_public(this.SK());
      }

      this.id_finally = var1;
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      int var6 = ((Random)this.id_throws[40]).nextInt(3);
      if (var6 < 2 && ((Random)this.id_throws[40]).nextFloat() < 0.5F * var2.id_byte()) {
         var6++;
      }

      int var7 = 1 << var6;
      this.id_class(var7, true);
      return super.id_class(var1, var2, var3, var4, var5);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("Size", this.sk() - 1);
      var1.id_class("wasOnGround", this.id_this);
   }

   protected rqA_2 sd() {
      return this.sW() ? rqn_3.xz : rqn_3.Jj;
   }

   @Override
   protected rqO_2 id_short() {
      return this.sk() == 1 ? this.BC().id_finally() : rzl_3.id_class;
   }

   @Override
   public int r() {
      return 0;
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return 0.625F * var2.id_break;
   }

   @Override
   public void id_break(rcd_3 var1) {
      int var2 = var1.id_private("Size");
      if (var2 < 0) {
         var2 = 0;
      }

      this.id_class(var2 + 1, false);
      super.id_break(var1);
      this.id_this = var1.id_new("wasOnGround");
   }

   float id_throws() {
      float var1 = this.sW() ? 1.4F : 0.8F;
      return ((((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 1.0F) * var1;
   }

   @Override
   protected void L() {
      this.id_class *= 0.6F;
   }

   protected rqA_2 sx() {
      return this.sW() ? rqn_3.xQ : rqn_3.JV;
   }

   public int sk() {
      return ((rmE_2)this.id_throws[49]).id_class(id_super);
   }

   @Override
   public void PD() {
      int var1 = this.sk();
      if (!((rYB)this.id_throws[7]).id_continue && var1 > 1 && this.Sl()) {
         rgP_2 var2 = this.rD();
         boolean var3 = this.c();
         float var4 = (float)var1 / 4.0F;
         int var5 = var1 / 2;
         int var6 = 2 + ((Random)this.id_throws[40]).nextInt(3);

         for (int var7 = 0; var7 < var6; var7++) {
            float var8 = ((float)(var7 % 2) - 0.5F) * var4;
            float var9 = ((float)(var7 / 2) - 0.5F) * var4;
            rGA var10 = this.BC().id_class((rYB)this.id_throws[7]);
            if (this.O()) {
               var10.b();
            }

            var10.id_break(var2);
            var10.id_protected(var3);
            var10.id_catch(this.rg());
            var10.id_class(var5, true);
            var10.id_class(this.rx() + (double)var8, this.re() + 0.5, this.BO() + (double)var9, ((Random)this.id_throws[40]).nextFloat() * 360.0F, 0.0F);
            ((rYB)this.id_throws[7]).a_(var10);
         }
      }

      super.PD();
   }

   protected rLx_1 id_catch() {
      return rLQ.id_static;
   }

   @Override
   protected void id_continue(boolean var1) {
      rjU_2 var2 = this.rv();
      this.id_catch(var2.id_break, (double)this.ST(), var2.id_protected);
      Boolean var7 = true;
      this.id_throws[57] = var7;
   }

   protected int id_implements() {
      return ((Random)this.id_throws[40]).nextInt(20) + 10;
   }

   protected void id_private(iB_2 var1) {
      if (this.BM()) {
         int var2 = this.sk();
         if (this.id_int(var1) < 0.6 * (double)var2 * 0.6 * (double)var2 && this.id_while(var1) && var1.id_break(rye_3.id_byte(this), this.sJ())) {
            this.id_class(rqn_3.Jw, 1.0F, (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 1.0F);
            this.id_class(this, var1);
         }
      }
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(1, new rGl_1(this));
      this.id_package.id_class(2, new rGn_1(this));
      this.id_package.id_class(3, new rGC(this));
      this.id_package.id_class(5, new rGH(this));
      this.id_int.id_class(1, new rBI<>(this, rhd_3.class, 10, true, false, var1 -> Math.abs(var1.re() - this.re()) <= 4.0));
      this.id_int.id_class(3, new rBI<>(this, rMZ.class, true));
   }

   protected boolean sz() {
      return this.sk() > 0;
   }

   @Override
   public aI_2<? extends rGA> BC() {
      return (aI_2<? extends rGA>)super.BC();
   }

   @Override
   protected rqA_2 Bt() {
      return this.sW() ? rqn_3.xk : rqn_3.JI;
   }

   protected float sJ() {
      return (float)this.id_class(iQ_2.id_case);
   }

   public boolean sW() {
      return this.sk() <= 1;
   }

   @Override
   protected float Si() {
      return 0.4F * (float)this.sk();
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      return super.a_(var1).id_class(0.255F * (float)this.sk());
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_super, 1);
   }

   @Override
   public void q_() {
      double var1 = this.rx();
      double var3 = this.re();
      double var5 = this.BO();
      super.q_();
      this.id_new(var1, var3, var5);
   }

   @Override
   public void c_(rhd_3 var1) {
      if (this.n()) {
         this.id_private(var1);
      }
   }
}
