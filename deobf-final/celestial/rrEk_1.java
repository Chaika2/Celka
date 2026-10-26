package celestial;

import com.mojang.datafixers.util.Either;

class rrEk_1 implements rrEM {
   rrEk_1(rrEx_1 var1, int var2, int var3, int var4, int var5, Either var6) {
      this.class_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
   }

   @Override
   public String toString() {
      return "Unloaded "
         + new rfj_3(this.class_ + this.byte_ % (this.protected_ * 2 + 1), this.throws_ + this.byte_ / (this.protected_ * 2 + 1))
         + " "
         + this.case_.right().get();
   }
}
