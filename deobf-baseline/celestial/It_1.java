package celestial;

class It_1 {
   public final rje_3 id_class;
   public final float id_break;
   public final float id_byte;

   public It_1(float var1, float var2, float var3, float var4, float var5) {
      this(new rje_3(var1, var2, var3), var4, var5);
   }

   public It_1(rje_3 var1, float var2, float var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public It_1 id_class(float var1, float var2) {
      return new It_1(this.id_class, var1, var2);
   }
}
