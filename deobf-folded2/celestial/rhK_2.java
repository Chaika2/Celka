package celestial;

public abstract class rhK_2 extends rhf_3 {
   protected rhK_2(aI_2<? extends rhK_2> var1, iB_2 var2, rYB var3) {
      this(var1, var2.rx(), var2.rH() - 0.1F, var2.BO(), var3);
      this.id_break(var2);
   }

   protected rhK_2(aI_2<? extends rhK_2> var1, double var2, double var4, double var6, rYB var8) {
      this(var1, var8);
      this.id_new(var2, var4, var6);
   }

   protected rhK_2(aI_2<? extends rhK_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_this() {
      super.id_this();
      rjG_2 var1 = rhj_3.id_class(this, this::id_class);
      boolean var2 = false;
      if (var1.id_byte() == rjM_2.BLOCK) {
         rfH_2 var3 = ((rff_3)var1).id_class();
         xc_3 var4 = ((rYB)this.id_throws[7]).id_byte(var3);
         if (var4.id_class(xu_3.Pi)) {
            this.id_protected(var3);
            var2 = true;
         } else if (var4.id_class(xu_3.bw)) {
            ryO_2 var5 = ((rYB)this.id_throws[7]).id_class(var3);
            if (var5 instanceof rHy_1 && rHy_1.id_class(this)) {
               ((rHy_1)var5).id_break(this);
            }

            var2 = true;
         }
      }

      if (var1.id_byte() != rjM_2.MISS && !var2) {
         this.id_class(var1);
      }

      this.Px();
      rjU_2 var12 = this.rv();
      double var13 = this.rx() + var12.id_break;
      double var6 = this.re() + var12.id_byte;
      double var8 = this.BO() + var12.id_protected;
      this.id_return();
      float var10;
      if (this.rT()) {
         for (int var11 = 0; var11 < 4; var11++) {
            ((rYB)this.id_throws[7])
               .id_class(
                  rLQ.id_throws,
                  var13 - var12.id_break * 0.25,
                  var6 - var12.id_byte * 0.25,
                  var8 - var12.id_protected * 0.25,
                  var12.id_break,
                  var12.id_byte,
                  var12.id_protected
               );
         }

         var10 = 0.8F;
      } else {
         var10 = 0.99F;
      }

      this.id_byte(var12.id_class((double)var10));
      if (!this.rw()) {
         rjU_2 var14 = this.rv();
         this.id_catch(var14.id_break, var14.id_byte - (double)this.id_throws(), var14.id_protected);
      }

      this.id_new(var13, var6, var8);
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

   public rjU_2 id_class(iB_2 var1) {
      return new rjU_2(var1.rx(), var1.rH() - 0.1F, var1.BO());
   }

   public float id_throws() {
      return 0.03F;
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
