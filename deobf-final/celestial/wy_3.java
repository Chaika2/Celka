package celestial;

public abstract class wy_3<E extends an_3> extends tX_2<E> {
   private float class_ = 1.0F;
   private float break_ = 1.0F;
   private float byte_ = 1.0F;

   public void class_(float var1, float var2, float var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   @Override
   public void class_(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      super.class_(var1, var2, var3, var4, this.class_ * var5, this.break_ * var6, this.byte_ * var7, var8);
   }
}
