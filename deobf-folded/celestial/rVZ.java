package celestial;

import com.mojang.serialization.Codec;

final class rVZ<E> {
   private final rqM_2<? extends rVL<E>> id_class;
   private final Codec<E> id_break;
   private final Codec<E> id_byte;

   public Codec<E> id_byte() {
      return this.id_byte;
   }

   public rVZ(rqM_2<? extends rVL<E>> var1, Codec<E> var2, Codec<E> var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public rqM_2<? extends rVL<E>> id_class() {
      return this.id_class;
   }

   public Codec<E> id_break() {
      return this.id_break;
   }

   public boolean id_protected() {
      return this.id_byte != null;
   }
}
