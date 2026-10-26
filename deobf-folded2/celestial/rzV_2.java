package celestial;

import java.util.Random;

public class rzV_2 implements rWK {
   final float id_protected;
   final float id_throws;

   public float id_byte() {
      return this.id_throws;
   }

   public rzV_2(float var1, float var2) {
      this.id_protected = var1;
      this.id_throws = var2;
   }

   public rzV_2(float var1) {
      this.id_protected = var1;
      this.id_throws = var1;
   }

   @Override
   public int id_class(Random var1) {
      return rfU_2.id_class(var1, rfU_2.id_protected(this.id_protected), rfU_2.id_protected(this.id_throws));
   }

   @Override
   public rqO_2 id_class() {
      return id_break;
   }

   public boolean id_class(int var1) {
      return (float)var1 <= this.id_throws && (float)var1 >= this.id_protected;
   }

   public static rzV_2 id_class(float var0, float var1) {
      return new rzV_2(var0, var1);
   }

   public float id_break() {
      return this.id_protected;
   }

   public float id_break(Random var1) {
      return rfU_2.id_class(var1, this.id_protected, this.id_throws);
   }
}
