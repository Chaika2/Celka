package celestial;

public class wu_3<T extends rOb_1> extends wk_3<T> {
   private float id_catch;

   public wu_3() {
      super(12, 0.0F, false, 8.0F, 4.0F, 2.0F, 2.0F, 24);
      this.id_class = new Iq_1(this, 0, 0);
      this.id_class.id_class(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, 0.6F);
      this.id_class.id_class(0.0F, 6.0F, -8.0F);
      this.id_break = new Iq_1(this, 28, 8);
      this.id_break.id_class(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, 1.75F);
      this.id_break.id_class(0.0F, 5.0F, 2.0F);
      float var1 = 0.5F;
      this.id_byte = new Iq_1(this, 0, 16);
      this.id_byte.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
      this.id_byte.id_class(-3.0F, 12.0F, 7.0F);
      this.id_protected = new Iq_1(this, 0, 16);
      this.id_protected.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
      this.id_protected.id_class(3.0F, 12.0F, 7.0F);
      this.id_throws = new Iq_1(this, 0, 16);
      this.id_throws.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
      this.id_throws.id_class(-3.0F, 12.0F, -5.0F);
      this.id_case = new Iq_1(this, 0, 16);
      this.id_case.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
      this.id_case.id_class(3.0F, 12.0F, -5.0F);
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.id_class((T)var1, var2, var3, var4, var5, var6);
      this.id_class.id_case = this.id_catch;
   }

   public void id_class(T var1, float var2, float var3, float var4) {
      super.id_class((T)var1, var2, var3, var4);
      this.id_class.id_protected = 6.0F + var1.id_throw(var4) * 9.0F;
      this.id_catch = var1.id_interface(var4);
   }
}
