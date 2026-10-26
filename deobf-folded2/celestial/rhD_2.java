package celestial;

public class rhD_2 extends rhm_3 {
   private static final rut_3<Byte> id_implements = rmE_2.id_class(rhD_2.class, ruw_3.id_class);
   private static final rut_3<Boolean> id_finally = rmE_2.id_class(rhD_2.class, ruw_3.id_implements);
   private rdn_3 id_extends = new rdn_3(rdy_3.kY);
   private boolean id_native;
   public int id_private;

   @Override
   public float id_int() {
      return 0.99F;
   }

   public rhD_2(rYB var1, double var2, double var4, double var6) {
      super(aI_2.g, var2, var4, var6, var1);
   }

   public rhD_2(rYB var1, iB_2 var2, rdn_3 var3) {
      super(aI_2.g, var2, var1);
      this.id_extends = var3.id_implements();
      ((rmE_2)this.id_throws[49]).id_break(id_implements, (byte)eA_2.id_case(var3));
      ((rmE_2)this.id_throws[49]).id_break(id_finally, var3.id_else());
   }

   public rhD_2(aI_2<? extends rhD_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_this() {
      if (this.id_break > 4) {
         this.id_native = true;
      }

      an_3 var1 = this.id_else();
      if ((this.id_native || this.id_new()) && var1 != null) {
         byte var2 = ((rmE_2)this.id_throws[49]).id_class(id_implements);
         if (var2 > 0 && !this.id_public()) {
            if (!((rYB)this.id_throws[7]).id_continue && this.id_protected == rhZ_2.ALLOWED) {
               this.id_class(this.id_catch(), 0.1F);
            }

            this.PD();
         } else if (var2 > 0) {
            this.id_byte(true);
            rjU_2 var3 = new rjU_2(var1.rx() - this.rx(), var1.rH() - this.re(), var1.BO() - this.BO());
            this.id_volatile(this.rx(), this.re() + var3.id_byte * 0.015 * (double)var2, this.BO());
            if (((rYB)this.id_throws[7]).id_continue) {
               Double var10 = this.re();
               this.id_throws[35] = var10;
            }

            double var4 = 0.05 * (double)var2;
            this.id_byte(this.rv().id_class(0.95).id_throws(var3.id_protected().id_class(var4)));
            if (this.id_private == 0) {
               this.id_class(rqn_3.dX, 10.0F, 1.0F);
            }

            this.id_private++;
         }
      }

      super.id_this();
   }

   @Override
   protected rfo_3 id_class(rjU_2 var1, rjU_2 var2) {
      return this.id_native ? null : super.id_class(var1, var2);
   }

   @Override
   protected void id_class(rfo_3 var1) {
      an_3 var2 = var1.id_class();
      float var3 = 8.0F;
      if (var2 instanceof iB_2 var4) {
         var3 += eA_2.id_class(this.id_extends, var4.sG());
      }

      an_3 var10 = this.id_else();
      rye_3 var5 = rye_3.id_class(this, (an_3)(var10 == null ? this : var10));
      this.id_native = true;
      rqA_2 var6 = rqn_3.dO;
      if (var2.id_break(var5, var3)) {
         if (var2.BC() == aI_2.id_else) {
            return;
         }

         if (var2 instanceof iB_2 var7) {
            if (var10 instanceof iB_2) {
               eA_2.id_class(var7, var10);
               eA_2.id_break((iB_2)var10, var7);
            }

            this.id_class(var7);
         }
      }

      this.id_byte(this.rv().id_throws(-0.01, -0.1, -0.01));
      float var11 = 1.0F;
      if ((rYB)this.id_throws[7] instanceof rrEm_1 && ((rYB)this.id_throws[7]).S() && eA_2.id_private(this.id_extends)) {
         rfH_2 var8 = var2.Bs();
         if (((rYB)this.id_throws[7]).id_case(var8)) {
            rSg_1 var9 = aI_2.id_boolean.id_class((rYB)this.id_throws[7]);
            var9.a_(rjU_2.id_protected(var8));
            var9.id_protected(var10 instanceof rhN_2 ? (rhN_2)var10 : null);
            ((rYB)this.id_throws[7]).a_(var9);
            var6 = rqn_3.dW;
            var11 = 5.0F;
         }
      }

      this.id_class(var6, var11, 1.0F);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Trident", this.id_extends.id_break(new rcd_3()));
      var1.id_class("DealtDamage", this.id_native);
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_byte("Trident", 10)) {
         this.id_extends = rdn_3.id_class(var1.id_int("Trident"));
      }

      this.id_native = var1.id_new("DealtDamage");
      ((rmE_2)this.id_throws[49]).id_break(id_implements, (byte)eA_2.id_case(this.id_extends));
   }

   @Override
   protected rqA_2 id_throws() {
      return rqn_3.dh;
   }

   @Override
   protected rdn_3 id_catch() {
      return this.id_extends.id_implements();
   }

   @Override
   public boolean id_super() {
      return ((rmE_2)this.id_throws[49]).id_class(id_finally);
   }

   private boolean id_public() {
      an_3 var1 = this.id_else();
      return var1 != null && var1.BM() ? !(var1 instanceof rhN_2) || !var1.id_native() : false;
   }

   @Override
   public void id_protected() {
      byte var1 = ((rmE_2)this.id_throws[49]).id_class(id_implements);
      if (this.id_protected != rhZ_2.ALLOWED || var1 <= 0) {
         super.id_protected();
      }
   }

   @Override
   public boolean id_final(double var1, double var3, double var5) {
      return true;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_implements, (byte)0);
      ((rmE_2)this.id_throws[49]).id_class(id_finally, false);
   }

   @Override
   public void c_(rhd_3 var1) {
      an_3 var2 = this.id_else();
      if (var2 == null || var2.ro() == var1.ro()) {
         super.c_(var1);
      }
   }
}
