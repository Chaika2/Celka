package celestial;

import com.mojang.serialization.Codec;

public class rTS<T> {
   final T class_;
   final int break_;
   private double byte_;

   rTS(T var1, int var2) {
      this.break_ = var2;
      this.class_ = (T)var1;
   }

   @Override
   public String toString() {
      return this.break_ + ":" + this.class_;
   }

   public static <E> Codec<rTS<E>> class_(Codec<E> var0) {
      return new rTs_1(var0);
   }

   public T class_() {
      return this.class_;
   }

   void class_(float var1) {
      this.byte_ = -Math.pow((double)var1, (double)(1.0F / (float)this.break_));
   }

   double break_() {
      return this.byte_;
   }
}
