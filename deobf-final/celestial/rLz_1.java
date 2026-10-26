package celestial;

import com.mojang.serialization.Codec;

public abstract class rLz_1<T extends rLx_1> {
   private final boolean class_;
   private final rLd_1<T> break_;

   protected rLz_1(boolean var1, rLd_1<T> var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public abstract Codec<T> break_();

   public boolean throws_() {
      return this.class_;
   }

   public rLd_1<T> case_() {
      return this.break_;
   }
}
