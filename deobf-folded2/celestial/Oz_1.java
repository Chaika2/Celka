package celestial;

public class Oz_1 extends Od_1 {
   private final Ok_1 id_private;
   private final rjV_2 id_implements;
   private final rjj_3 id_finally;
   private float id_extends;
   private float id_native;
   private float id_volatile;
   private int id_final;
   private int id_package;
   private int id_int;
   private float id_new;
   private float id_continue;
   private float id_super;

   @Override
   public Ok_1 id_byte(int var1, int var2) {
      this.id_int = var1 | var2 << 16;
      return this;
   }

   public Oz_1(Ok_1 var1, rjV_2 var2, rjj_3 var3) {
      this.id_private = var1;
      this.id_implements = var2.id_case();
      this.id_implements.id_throws();
      this.id_finally = var3.id_case();
      this.id_finally.id_throws();
      this.id_case();
   }

   @Override
   public Ok_1 id_class(int var1) {
      return this;
   }

   @Override
   public Ok_1 id_class(int var1, int var2) {
      return this;
   }

   @Override
   public Ok_1 id_class(float var1, float var2) {
      return this;
   }

   @Override
   public Ok_1 id_class(float var1, float var2, float var3) {
      this.id_new = var1;
      this.id_continue = var2;
      this.id_super = var3;
      return this;
   }

   @Override
   public void id_class() {
      rje_3 var1 = new rje_3(this.id_new, this.id_continue, this.id_super);
      var1.id_class(this.id_finally);
      rpr_3 var2 = rpr_3.id_class(var1.id_class(), var1.id_break(), var1.id_byte());
      rji_3 var3 = new rji_3(this.id_extends, this.id_native, this.id_volatile, 1.0F);
      var3.id_class(this.id_implements);
      var3.id_class(rje_3.id_protected.id_byte(180.0F));
      var3.id_class(rje_3.id_break.id_byte(-90.0F));
      var3.id_class(var2.id_break());
      float var4 = -var3.id_class();
      float var5 = -var3.id_break();
      this.id_private
         .id_class((double)this.id_extends, (double)this.id_native, (double)this.id_volatile)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(var4, var5)
         .id_break(this.id_final, this.id_package)
         .id_break(this.id_int)
         .id_class(this.id_new, this.id_continue, this.id_super)
         .id_class();
      this.id_case();
   }

   @Override
   public Ok_1 id_class(double var1, double var3, double var5) {
      this.id_extends = (float)var1;
      this.id_native = (float)var3;
      this.id_volatile = (float)var5;
      return this;
   }

   @Override
   public Ok_1 id_break(int var1, int var2) {
      this.id_final = var1;
      this.id_package = var2;
      return this;
   }

   @Override
   public Ok_1 id_break(int var1, int var2, int var3, int var4) {
      return this;
   }

   private void id_case() {
      this.id_extends = 0.0F;
      this.id_native = 0.0F;
      this.id_volatile = 0.0F;
      this.id_final = 0;
      this.id_package = 10;
      this.id_int = 15728880;
      this.id_new = 0.0F;
      this.id_continue = 1.0F;
      this.id_super = 0.0F;
   }
}
