package celestial;

import com.mojang.serialization.Codec;

final class rVZ<E> {
   private final rqM_2<? extends rVL<E>> class_;
   private final Codec<E> break_;
   private final Codec<E> byte_;

   public Codec<E> byte_() {
      return this.byte_;
   }

   public rVZ(rqM_2<? extends rVL<E>> var1, Codec<E> var2, Codec<E> var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public rqM_2<? extends rVL<E>> class_() {
      return this.class_;
   }

   public Codec<E> break_() {
      return this.break_;
   }

   public boolean protected_() {
      return this.byte_ != null;
   }
}
