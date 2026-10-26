package celestial;

public abstract class rhL_2 extends rhf_3 {
   public double id_class;
   public double id_break;
   public double id_protected;

   public rhL_2(aI_2<? extends rhL_2> var1, iB_2 var2, double var3, double var5, double var7, rYB var9) {
      this(var1, var2.rx(), var2.re(), var2.BO(), var3, var5, var7, var9);
      this.id_break(var2);
      this.id_case((Float)var2.id_throws[15], (Float)var2.id_throws[16]);
   }

   public rhL_2(aI_2<? extends rhL_2> var1, double var2, double var4, double var6, double var8, double var10, double var12, rYB var14) {
      this(var1, var14);
      this.id_class(var2, var4, var6, (Float)this.id_throws[15], (Float)this.id_throws[16]);
      this.PX();
      double var15 = (double)rfU_2.id_class(var8 * var8 + var10 * var10 + var12 * var12);
      if (var15 != 0.0) {
         this.id_class = var8 / var15 * 0.1;
         this.id_break = var10 / var15 * 0.1;
         this.id_protected = var12 / var15 * 0.1;
      }
   }

   protected rhL_2(aI_2<? extends rhL_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_this() {
      an_3 var1 = this.id_else();
      if (((rYB)this.id_throws[7]).id_continue || (var1 == null || !(Boolean)var1.id_throws[27]) && ((rYB)this.id_throws[7]).id_int(this.Bs())) {
         super.id_this();
         if (this.id_throws()) {
            this.id_case(1);
         }

         rjG_2 var2 = rhj_3.id_class(this, this::id_class);
         if (var2.id_byte() != rjM_2.MISS) {
            this.id_class(var2);
         }

         this.Px();
         rjU_2 var3 = this.rv();
         double var4 = this.rx() + var3.id_break;
         double var6 = this.re() + var3.id_byte;
         double var8 = this.BO() + var3.id_protected;
         rhj_3.id_class(this, 0.2F);
         float var10 = this.id_catch();
         if (this.rT()) {
            for (int var11 = 0; var11 < 4; var11++) {
               float var12 = 0.25F;
               ((rYB)this.id_throws[7])
                  .id_class(
                     rLQ.id_throws,
                     var4 - var3.id_break * 0.25,
                     var6 - var3.id_byte * 0.25,
                     var8 - var3.id_protected * 0.25,
                     var3.id_break,
                     var3.id_byte,
                     var3.id_protected
                  );
            }

            var10 = 0.8F;
         }

         this.id_byte(var3.id_break(this.id_class, this.id_break, this.id_protected).id_class((double)var10));
         ((rYB)this.id_throws[7]).id_class(this.id_case(), var4, var6 + 0.5, var8, 0.0, 0.0, 0.0);
         this.id_new(var4, var6, var8);
      } else {
         this.PD();
      }
   }

   @Override
   public float f() {
      return 1.0F;
   }

   @Override
   protected boolean id_class(an_3 var1) {
      return super.id_class(var1) && !(Boolean)var1.id_throws[38];
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("power", this.id_class(new double[]{this.id_class, this.id_break, this.id_protected}));
   }

   @Override
   public boolean id_class(double var1) {
      double var3 = this.rN().id_class() * 4.0;
      if (Double.isNaN(var3)) {
         var3 = 4.0;
      }

      var3 *= 64.0;
      return var1 < var3 * var3;
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_byte("power", 9)) {
         rcy_3 var2 = var1.id_protected("power", 6);
         if (var2.size() == 3) {
            this.id_class = var2.id_catch(0);
            this.id_break = var2.id_catch(1);
            this.id_protected = var2.id_catch(2);
         }
      }
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return false;
      } else {
         this.rf();
         an_3 var3 = var1.id_extends();
         if (var3 != null) {
            rjU_2 var4 = var3.m();
            this.id_byte(var4);
            this.id_class = var4.id_break * 0.1;
            this.id_break = var4.id_byte * 0.1;
            this.id_protected = var4.id_protected * 0.1;
            this.id_break(var3);
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean id_throws() {
      return true;
   }

   protected float id_catch() {
      return 0.95F;
   }

   protected rLx_1 id_case() {
      return rLQ.id_double;
   }

   @Override
   public float rX() {
      return 1.0F;
   }

   @Override
   public boolean rY() {
      return true;
   }

   @Override
   protected void m_() {
   }

   @Override
   public ruS_2<?> p_() {
      an_3 var1 = this.id_else();
      int var2 = var1 == null ? 0 : var1.V();
      return new rFJ(
         this.V(),
         this.ro(),
         this.rx(),
         this.re(),
         this.BO(),
         (Float)this.id_throws[16],
         (Float)this.id_throws[15],
         this.BC(),
         var2,
         new rjU_2(this.id_class, this.id_break, this.id_protected)
      );
   }
}
