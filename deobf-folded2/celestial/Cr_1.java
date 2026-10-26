package celestial;

class Cr_1 extends CK {
   private boolean id_break;
   private boolean id_interface;
   private final Cy_1 id_char;
   private float id_abstract;
   private float id_long;
   private float id_float;
   private boolean id_void;

   Cr_1(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Cy_1 var14, Ch_1 var15) {
      super(var1, var2, var4, var6, var15, -0.004F);
      this.id_finally = var8;
      this.id_extends = var10;
      this.id_native = var12;
      this.id_char = var14;
      this.id_throw *= 0.75F;
      this.id_this = 48 + this.id_continue.nextInt(12);
      this.id_break(var15);
   }

   public void id_class(boolean var1) {
      this.id_break = var1;
   }

   @Override
   public void id_class(Ok_1 var1, ly_3 var2, float var3) {
      if (!this.id_interface || this.id_super < this.id_this / 3 || (this.id_super + this.id_this) / 3 % 2 == 0) {
         super.id_class(var1, var2, var3);
      }
   }

   public void id_break(boolean var1) {
      this.id_interface = var1;
   }

   @Override
   public void id_case() {
      super.id_case();
      if (this.id_break && this.id_super < this.id_this / 2 && (this.id_super + this.id_this) % 2 == 0) {
         Cr_1 var1 = new Cr_1(this.id_byte, this.id_catch, this.id_private, this.id_implements, 0.0, 0.0, 0.0, this.id_char, this.id_class);
         var1.id_throws(0.99F);
         var1.id_class(this.id_synchronized, this.id_return, this.id_public);
         var1.id_super = var1.id_this / 2;
         if (this.id_void) {
            var1.id_void = true;
            var1.id_abstract = this.id_abstract;
            var1.id_long = this.id_long;
            var1.id_float = this.id_float;
         }

         var1.id_interface = this.id_interface;
         this.id_char.id_class(var1);
      }
   }
}
