package celestial;

import com.mojang.serialization.Codec;

public class rTS<T> {
   final T id_class;
   final int id_break;
   private double id_byte;

   rTS(T var1, int var2) {
      this.id_break = var2;
      this.id_class = (T)var1;
   }

   @Override
   public String toString() {
      return this.id_break + ":" + this.id_class;
   }

   public static <E> Codec<rTS<E>> id_class(Codec<E> var0) {
      return new rTs_1(var0);
   }

   public T id_class() {
      return this.id_class;
   }

   void id_class(float var1) {
      this.id_byte = -Math.pow((double)var1, (double)(1.0F / (float)this.id_break));
   }

   double id_break() {
      return this.id_byte;
   }
}
