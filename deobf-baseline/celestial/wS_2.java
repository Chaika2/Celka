package celestial;

public class wS_2<T extends rMl_1> extends wk_3<T> {
   private float id_catch;
   private float id_private;
   private float id_implements;

   public wS_2(int var1, float var2) {
      super(var1, var2, true, 23.0F, 4.8F, 2.7F, 3.0F, 49);
      this.id_return = 64;
      this.id_public = 64;
      this.id_class = new Iq_1(this, 0, 6);
      this.id_class.id_class(-6.5F, -5.0F, -4.0F, 13.0F, 10.0F, 9.0F);
      this.id_class.id_class(0.0F, 11.5F, -17.0F);
      this.id_class.id_class(45, 16).id_class(-3.5F, 0.0F, -6.0F, 7.0F, 5.0F, 2.0F);
      this.id_class.id_class(52, 25).id_class(-8.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F);
      this.id_class.id_class(52, 25).id_class(3.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F);
      this.id_break = new Iq_1(this, 0, 25);
      this.id_break.id_class(-9.5F, -13.0F, -6.5F, 19.0F, 26.0F, 13.0F);
      this.id_break.id_class(0.0F, 10.0F, 0.0F);
      byte var3 = 9;
      byte var4 = 6;
      this.id_byte = new Iq_1(this, 40, 0);
      this.id_byte.id_class(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      this.id_byte.id_class(-5.5F, 15.0F, 9.0F);
      this.id_protected = new Iq_1(this, 40, 0);
      this.id_protected.id_class(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      this.id_protected.id_class(5.5F, 15.0F, 9.0F);
      this.id_throws = new Iq_1(this, 40, 0);
      this.id_throws.id_class(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      this.id_throws.id_class(-5.5F, 15.0F, -9.0F);
      this.id_case = new Iq_1(this, 40, 0);
      this.id_case.id_class(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      this.id_case.id_class(5.5F, 15.0F, -9.0F);
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.id_class((T)var1, var2, var3, var4, var5, var6);
      boolean var7 = var1.L() > 0;
      boolean var8 = var1.n();
      int var9 = var1.sc();
      boolean var10 = var1.sd();
      boolean var11 = var1.sl();
      if (var7) {
         this.id_class.id_catch = 0.35F * rfU_2.id_class(0.6F * var4);
         this.id_class.id_private = 0.35F * rfU_2.id_class(0.6F * var4);
         this.id_throws.id_case = -0.75F * rfU_2.id_class(0.3F * var4);
         this.id_case.id_case = 0.75F * rfU_2.id_class(0.3F * var4);
      } else {
         this.id_class.id_private = 0.0F;
      }

      if (var8) {
         if (var9 < 15) {
            this.id_class.id_case = (float) (-Math.PI / 4) * (float)var9 / 14.0F;
         } else if (var9 < 20) {
            float var12 = (float)((var9 - 15) / 5);
            this.id_class.id_case = (float) (-Math.PI / 4) + (float) (Math.PI / 4) * var12;
         }
      }

      if (this.id_catch > 0.0F) {
         this.id_break.id_case = wP_2.id_class(this.id_break.id_case, 1.7407963F, this.id_catch);
         this.id_class.id_case = wP_2.id_class(this.id_class.id_case, (float) (Math.PI / 2), this.id_catch);
         this.id_throws.id_private = -0.27079642F;
         this.id_case.id_private = 0.27079642F;
         this.id_byte.id_private = 0.5707964F;
         this.id_protected.id_private = -0.5707964F;
         if (var10) {
            this.id_class.id_case = (float) (Math.PI / 2) + 0.2F * rfU_2.id_class(var4 * 0.6F);
            this.id_throws.id_case = -0.4F - 0.2F * rfU_2.id_class(var4 * 0.6F);
            this.id_case.id_case = -0.4F - 0.2F * rfU_2.id_class(var4 * 0.6F);
         }

         if (var11) {
            this.id_class.id_case = 2.1707964F;
            this.id_throws.id_case = -0.9F;
            this.id_case.id_case = -0.9F;
         }
      } else {
         this.id_byte.id_private = 0.0F;
         this.id_protected.id_private = 0.0F;
         this.id_throws.id_private = 0.0F;
         this.id_case.id_private = 0.0F;
      }

      if (this.id_private > 0.0F) {
         this.id_byte.id_case = -0.6F * rfU_2.id_class(var4 * 0.15F);
         this.id_protected.id_case = 0.6F * rfU_2.id_class(var4 * 0.15F);
         this.id_throws.id_case = 0.3F * rfU_2.id_class(var4 * 0.25F);
         this.id_case.id_case = -0.3F * rfU_2.id_class(var4 * 0.25F);
         this.id_class.id_case = wP_2.id_class(this.id_class.id_case, (float) (Math.PI / 2), this.id_private);
      }

      if (this.id_implements > 0.0F) {
         this.id_class.id_case = wP_2.id_class(this.id_class.id_case, 2.0561945F, this.id_implements);
         this.id_byte.id_case = -0.5F * rfU_2.id_class(var4 * 0.5F);
         this.id_protected.id_case = 0.5F * rfU_2.id_class(var4 * 0.5F);
         this.id_throws.id_case = 0.5F * rfU_2.id_class(var4 * 0.5F);
         this.id_case.id_case = -0.5F * rfU_2.id_class(var4 * 0.5F);
      }
   }

   public void id_class(T var1, float var2, float var3, float var4) {
      super.id_class((T)var1, var2, var3, var4);
      this.id_catch = var1.id_throw(var4);
      this.id_private = var1.id_interface(var4);
      this.id_implements = var1.n_() ? 0.0F : var1.id_char(var4);
   }
}
