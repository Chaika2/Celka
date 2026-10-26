package celestial;

import com.mojang.datafixers.util.Either;

class rrEk_1 implements rrEM {
   rrEk_1(rrEx_1 var1, int var2, int var3, int var4, int var5, Either var6) {
      this.id_class = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
   }

   @Override
   public String toString() {
      return "Unloaded "
         + new rfj_3(this.id_class + this.id_byte % (this.id_protected * 2 + 1), this.id_throws + this.id_byte / (this.id_protected * 2 + 1))
         + " "
         + this.id_case.right().get();
   }
}
