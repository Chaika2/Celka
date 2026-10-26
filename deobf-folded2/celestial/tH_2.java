package celestial;

public class tH_2<T extends iB_2> extends tW_2<T> {
   public boolean id_native;
   public boolean id_volatile;

   public tH_2(float var1) {
      super(0.0F, -14.0F, 64, 32);
      float var2 = -14.0F;
      this.id_break = new Iq_1(this, 0, 16);
      this.id_break.id_class(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1 - 0.5F);
      this.id_break.id_class(0.0F, -14.0F, 0.0F);
      this.id_byte = new Iq_1(this, 32, 16);
      this.id_byte.id_class(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1);
      this.id_byte.id_class(0.0F, -14.0F, 0.0F);
      this.id_protected = new Iq_1(this, 56, 0);
      this.id_protected.id_class(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.id_protected.id_class(-3.0F, -12.0F, 0.0F);
      this.id_throws = new Iq_1(this, 56, 0);
      this.id_throws.id_implements = true;
      this.id_throws.id_class(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.id_throws.id_class(5.0F, -12.0F, 0.0F);
      this.id_case = new Iq_1(this, 56, 0);
      this.id_case.id_class(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.id_case.id_class(-2.0F, -2.0F, 0.0F);
      this.id_catch = new Iq_1(this, 56, 0);
      this.id_catch.id_implements = true;
      this.id_catch.id_class(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.id_catch.id_class(2.0F, -2.0F, 0.0F);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.id_class((T)var1, var2, var3, var4, var5, var6);
      this.id_class.id_finally = true;
      float var7 = -14.0F;
      this.id_byte.id_case = 0.0F;
      this.id_byte.id_protected = -14.0F;
      this.id_byte.id_throws = -0.0F;
      this.id_case.id_case -= 0.0F;
      this.id_catch.id_case -= 0.0F;
      this.id_protected.id_case = (float)((double)this.id_protected.id_case * 0.5);
      this.id_throws.id_case = (float)((double)this.id_throws.id_case * 0.5);
      this.id_case.id_case = (float)((double)this.id_case.id_case * 0.5);
      this.id_catch.id_case = (float)((double)this.id_catch.id_case * 0.5);
      float var8 = 0.4F;
      if (this.id_protected.id_case > 0.4F) {
         this.id_protected.id_case = 0.4F;
      }

      if (this.id_throws.id_case > 0.4F) {
         this.id_throws.id_case = 0.4F;
      }

      if (this.id_protected.id_case < -0.4F) {
         this.id_protected.id_case = -0.4F;
      }

      if (this.id_throws.id_case < -0.4F) {
         this.id_throws.id_case = -0.4F;
      }

      if (this.id_case.id_case > 0.4F) {
         this.id_case.id_case = 0.4F;
      }

      if (this.id_catch.id_case > 0.4F) {
         this.id_catch.id_case = 0.4F;
      }

      if (this.id_case.id_case < -0.4F) {
         this.id_case.id_case = -0.4F;
      }

      if (this.id_catch.id_case < -0.4F) {
         this.id_catch.id_case = -0.4F;
      }

      if (this.id_native) {
         this.id_protected.id_case = -0.5F;
         this.id_throws.id_case = -0.5F;
         this.id_protected.id_private = 0.05F;
         this.id_throws.id_private = -0.05F;
      }

      this.id_protected.id_throws = 0.0F;
      this.id_throws.id_throws = 0.0F;
      this.id_case.id_throws = 0.0F;
      this.id_catch.id_throws = 0.0F;
      this.id_case.id_protected = -5.0F;
      this.id_catch.id_protected = -5.0F;
      this.id_class.id_throws = -0.0F;
      this.id_class.id_protected = -13.0F;
      this.id_break.id_byte = this.id_class.id_byte;
      this.id_break.id_protected = this.id_class.id_protected;
      this.id_break.id_throws = this.id_class.id_throws;
      this.id_break.id_case = this.id_class.id_case;
      this.id_break.id_catch = this.id_class.id_catch;
      this.id_break.id_private = this.id_class.id_private;
      if (this.id_volatile) {
         float var9 = 1.0F;
         this.id_class.id_protected -= 5.0F;
      }

      float var10 = -14.0F;
      this.id_protected.id_class(-5.0F, -12.0F, 0.0F);
      this.id_throws.id_class(5.0F, -12.0F, 0.0F);
   }
}
