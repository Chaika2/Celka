package celestial;

class It_1 {
   public final rje_3 class_;
   public final float break_;
   public final float byte_;

   public It_1(float var1, float var2, float var3, float var4, float var5) {
      this(new rje_3(var1, var2, var3), var4, var5);
   }

   public It_1(rje_3 var1, float var2, float var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public It_1 class_(float var1, float var2) {
      return new It_1(this.class_, var1, var2);
   }
}
