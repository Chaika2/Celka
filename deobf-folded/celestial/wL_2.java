package celestial;

public class wL_2<T extends is_3 & aa_3> extends tW_2<T> {
   public wL_2() {
      this(0.0F, false);
   }

   public wL_2(float var1, boolean var2) {
      super(var1);
      if (!var2) {
         this.id_protected = new Iq_1(this, 40, 16);
         this.id_protected.id_class(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.id_protected.id_class(-5.0F, 2.0F, 0.0F);
         this.id_throws = new Iq_1(this, 40, 16);
         this.id_throws.id_implements = true;
         this.id_throws.id_class(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.id_throws.id_class(5.0F, 2.0F, 0.0F);
         this.id_case = new Iq_1(this, 0, 16);
         this.id_case.id_class(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.id_case.id_class(-2.0F, 12.0F, 0.0F);
         this.id_catch = new Iq_1(this, 0, 16);
         this.id_catch.id_implements = true;
         this.id_catch.id_class(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.id_catch.id_class(2.0F, 12.0F, 0.0F);
      }
   }

   @Override
   public void id_class(rpZ_2 var1, Ml_1 var2) {
      float var3 = var1 == rpZ_2.RIGHT ? 1.0F : -1.0F;
      Iq_1 var4 = this.id_class(var1);
      var4.id_byte += var3;
      var4.id_class(var2);
      var4.id_byte -= var3;
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.id_class((T)var1, var2, var3, var4, var5, var6);
      rdn_3 var7 = var1.ss();
      if (var1.v() && (var7.id_class() || var7.id_break() != rdy_3.OM)) {
         float var8 = rfU_2.id_class(this.id_final * (float) Math.PI);
         float var9 = rfU_2.id_class((1.0F - (1.0F - this.id_final) * (1.0F - this.id_final)) * (float) Math.PI);
         this.id_protected.id_private = 0.0F;
         this.id_throws.id_private = 0.0F;
         this.id_protected.id_catch = -(0.1F - var8 * 0.6F);
         this.id_throws.id_catch = 0.1F - var8 * 0.6F;
         this.id_protected.id_case = (float) (-Math.PI / 2);
         this.id_throws.id_case = (float) (-Math.PI / 2);
         this.id_protected.id_case -= var8 * 1.2F - var9 * 0.4F;
         this.id_throws.id_case -= var8 * 1.2F - var9 * 0.4F;
         Iy_1.id_class(this.id_protected, this.id_throws, var4);
      }
   }

   public void id_class(T var1, float var2, float var3, float var4) {
      this.id_implements = tQ_2.EMPTY;
      this.id_private = tQ_2.EMPTY;
      rdn_3 var5 = var1.id_protected(rpm_3.MAIN_HAND);
      if (var5.id_break() == rdy_3.OM && var1.v()) {
         if (var1.Su() == rpZ_2.RIGHT) {
            this.id_implements = tQ_2.BOW_AND_ARROW;
         } else {
            this.id_private = tQ_2.BOW_AND_ARROW;
         }
      }

      super.id_class((T)var1, var2, var3, var4);
   }
}
