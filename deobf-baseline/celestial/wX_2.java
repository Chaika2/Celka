package celestial;

public class wX_2<T extends rMK> extends wk_3<T> {
   public wX_2() {
      super(12, 0.0F, true, 16.0F, 4.0F, 2.25F, 2.0F, 24);
      this.id_return = 128;
      this.id_public = 64;
      this.id_class = new Iq_1(this, 0, 0);
      this.id_class.id_class(-3.5F, -3.0F, -3.0F, 7.0F, 7.0F, 7.0F, 0.0F);
      this.id_class.id_class(0.0F, 10.0F, -16.0F);
      this.id_class.id_class(0, 44).id_class(-2.5F, 1.0F, -6.0F, 5.0F, 3.0F, 3.0F, 0.0F);
      this.id_class.id_class(26, 0).id_class(-4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      Iq_1 var1 = this.id_class.id_class(26, 0);
      var1.id_implements = true;
      var1.id_class(2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      this.id_break = new Iq_1(this);
      this.id_break.id_class(0, 19).id_class(-5.0F, -13.0F, -7.0F, 14.0F, 14.0F, 11.0F, 0.0F);
      this.id_break.id_class(39, 0).id_class(-4.0F, -25.0F, -7.0F, 12.0F, 12.0F, 10.0F, 0.0F);
      this.id_break.id_class(-2.0F, 9.0F, 12.0F);
      byte var2 = 10;
      this.id_byte = new Iq_1(this, 50, 22);
      this.id_byte.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F, 0.0F);
      this.id_byte.id_class(-3.5F, 14.0F, 6.0F);
      this.id_protected = new Iq_1(this, 50, 22);
      this.id_protected.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F, 0.0F);
      this.id_protected.id_class(3.5F, 14.0F, 6.0F);
      this.id_throws = new Iq_1(this, 50, 40);
      this.id_throws.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F, 0.0F);
      this.id_throws.id_class(-2.5F, 14.0F, -7.0F);
      this.id_case = new Iq_1(this, 50, 40);
      this.id_case.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F, 0.0F);
      this.id_case.id_class(2.5F, 14.0F, -7.0F);
      this.id_byte.id_byte--;
      this.id_protected.id_byte++;
      this.id_byte.id_throws += 0.0F;
      this.id_protected.id_throws += 0.0F;
      this.id_throws.id_byte--;
      this.id_case.id_byte++;
      this.id_throws.id_throws--;
      this.id_case.id_throws--;
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.id_class((T)var1, var2, var3, var4, var5, var6);
      float var7 = var4 - (float)((Integer)var1.id_throws[41]).intValue();
      float var8 = var1.id_throw(var7);
      var8 *= var8;
      float var9 = 1.0F - var8;
      this.id_break.id_case = (float) (Math.PI / 2) - var8 * (float) Math.PI * 0.35F;
      this.id_break.id_protected = 9.0F * var9 + 11.0F * var8;
      this.id_throws.id_protected = 14.0F * var9 - 6.0F * var8;
      this.id_throws.id_throws = -8.0F * var9 - 4.0F * var8;
      this.id_throws.id_case -= var8 * (float) Math.PI * 0.45F;
      this.id_case.id_protected = this.id_throws.id_protected;
      this.id_case.id_throws = this.id_throws.id_throws;
      this.id_case.id_case -= var8 * (float) Math.PI * 0.45F;
      if (this.id_int) {
         this.id_class.id_protected = 10.0F * var9 - 9.0F * var8;
         this.id_class.id_throws = -16.0F * var9 - 7.0F * var8;
      } else {
         this.id_class.id_protected = 10.0F * var9 - 14.0F * var8;
         this.id_class.id_throws = -16.0F * var9 - 3.0F * var8;
      }

      this.id_class.id_case += var8 * (float) Math.PI * 0.15F;
   }
}
