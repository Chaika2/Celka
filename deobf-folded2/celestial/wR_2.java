package celestial;

public class wR_2<T extends rbB_2> extends tW_2<T> implements to_3 {
   private Iq_1 id_native;

   public wR_2(float var1, boolean var2) {
      super(var1, 0.0F, 64, var2 ? 32 : 64);
      if (var2) {
         this.id_class = new Iq_1(this, 0, 0);
         this.id_class.id_class(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1);
         this.id_byte = new Iq_1(this, 16, 16);
         this.id_byte.id_class(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1 + 0.1F);
         this.id_case = new Iq_1(this, 0, 16);
         this.id_case.id_class(-2.0F, 12.0F, 0.0F);
         this.id_case.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.1F);
         this.id_catch = new Iq_1(this, 0, 16);
         this.id_catch.id_implements = true;
         this.id_catch.id_class(2.0F, 12.0F, 0.0F);
         this.id_catch.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.1F);
      } else {
         this.id_class = new Iq_1(this, 0, 0);
         this.id_class.id_class(0, 0).id_class(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
         this.id_class.id_class(24, 0).id_class(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F, var1);
         this.id_break = new Iq_1(this, 32, 0);
         this.id_break.id_class(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1 + 0.5F);
         this.id_native = new Iq_1(this);
         this.id_native.id_class(30, 47).id_class(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F, var1);
         this.id_native.id_case = (float) (-Math.PI / 2);
         this.id_break.id_break(this.id_native);
         this.id_byte = new Iq_1(this, 16, 20);
         this.id_byte.id_class(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, var1);
         this.id_byte.id_class(0, 38).id_class(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, var1 + 0.05F);
         this.id_protected = new Iq_1(this, 44, 22);
         this.id_protected.id_class(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.id_protected.id_class(-5.0F, 2.0F, 0.0F);
         this.id_throws = new Iq_1(this, 44, 22);
         this.id_throws.id_implements = true;
         this.id_throws.id_class(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.id_throws.id_class(5.0F, 2.0F, 0.0F);
         this.id_case = new Iq_1(this, 0, 22);
         this.id_case.id_class(-2.0F, 12.0F, 0.0F);
         this.id_case.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.id_catch = new Iq_1(this, 0, 22);
         this.id_catch.id_implements = true;
         this.id_catch.id_class(2.0F, 12.0F, 0.0F);
         this.id_catch.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      }
   }

   @Override
   public void id_class(boolean var1) {
      this.id_class.id_finally = var1;
      this.id_break.id_finally = var1;
      this.id_native.id_finally = var1;
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.id_class((T)var1, var2, var3, var4, var5, var6);
      Iy_1.id_class(this.id_throws, this.id_protected, var1.v(), this.id_final, var4);
   }
}
