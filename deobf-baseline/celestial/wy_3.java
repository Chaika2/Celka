package celestial;

public abstract class wy_3<E extends an_3> extends tX_2<E> {
   private float id_class = 1.0F;
   private float id_break = 1.0F;
   private float id_byte = 1.0F;

   public void id_class(float var1, float var2, float var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      super.id_class(var1, var2, var3, var4, this.id_class * var5, this.id_break * var6, this.id_byte * var7, var8);
   }
}
