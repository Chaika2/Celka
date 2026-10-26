package celestial;

public class tC_2<T extends rbB_2> extends wg_3<T> {
   public tC_2(float var1, float var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.id_protected = new Iq_1(this, 32, 48);
      this.id_protected.id_class(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.id_protected.id_class(-5.0F, 2.0F + var2, 0.0F);
      this.id_case = new Iq_1(this, 16, 48);
      this.id_case.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.id_case.id_class(-1.9F, 12.0F + var2, 0.0F);
   }

   public tC_2(float var1, boolean var2) {
      super(var1, 0.0F, 64, var2 ? 32 : 64);
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.id_class((T)var1, var2, var3, var4, var5, var6);
      if (this.id_private == tQ_2.THROW_SPEAR) {
         this.id_throws.id_case = this.id_throws.id_case * 0.5F - (float) Math.PI;
         this.id_throws.id_catch = 0.0F;
      }

      if (this.id_implements == tQ_2.THROW_SPEAR) {
         this.id_protected.id_case = this.id_protected.id_case * 0.5F - (float) Math.PI;
         this.id_protected.id_catch = 0.0F;
      }

      if (this.id_extends > 0.0F) {
         this.id_protected.id_case = this.id_class(this.id_extends, this.id_protected.id_case, (float) (-Math.PI * 4.0 / 5.0))
            + this.id_extends * 0.35F * rfU_2.id_class(0.1F * var4);
         this.id_throws.id_case = this.id_class(this.id_extends, this.id_throws.id_case, (float) (-Math.PI * 4.0 / 5.0))
            - this.id_extends * 0.35F * rfU_2.id_class(0.1F * var4);
         this.id_protected.id_private = this.id_class(this.id_extends, this.id_protected.id_private, -0.15F);
         this.id_throws.id_private = this.id_class(this.id_extends, this.id_throws.id_private, 0.15F);
         this.id_catch.id_case = this.id_catch.id_case - this.id_extends * 0.55F * rfU_2.id_class(0.1F * var4);
         this.id_case.id_case = this.id_case.id_case + this.id_extends * 0.55F * rfU_2.id_class(0.1F * var4);
         this.id_class.id_case = 0.0F;
      }
   }

   public void id_class(T var1, float var2, float var3, float var4) {
      this.id_implements = tQ_2.EMPTY;
      this.id_private = tQ_2.EMPTY;
      rdn_3 var5 = var1.id_protected(rpm_3.MAIN_HAND);
      if (var5.id_break() == rdy_3.kY && var1.v()) {
         if (var1.Su() == rpZ_2.RIGHT) {
            this.id_implements = tQ_2.THROW_SPEAR;
         } else {
            this.id_private = tQ_2.THROW_SPEAR;
         }
      }

      super.id_class((T)var1, var2, var3, var4);
   }
}
