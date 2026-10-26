package celestial;

import com.mojang.serialization.Codec;

public abstract class rLz_1<T extends rLx_1> {
   private final boolean id_class;
   private final rLd_1<T> id_break;

   protected rLz_1(boolean var1, rLd_1<T> var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public abstract Codec<T> id_break();

   public boolean id_throws() {
      return this.id_class;
   }

   public rLd_1<T> id_case() {
      return this.id_break;
   }
}
