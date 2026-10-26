package celestial;

import java.util.Random;

public final class rWn_1 implements rWK {
   final int id_protected;
   final float id_throws;

   public rWn_1(int var1, float var2) {
      this.id_protected = var1;
      this.id_throws = var2;
   }

   @Override
   public rqO_2 id_class() {
      return id_byte;
   }

   public static rWn_1 id_class(int var0, float var1) {
      return new rWn_1(var0, var1);
   }

   @Override
   public int id_class(Random var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < this.id_protected; var3++) {
         if (var1.nextFloat() < this.id_throws) {
            var2++;
         }
      }

      return var2;
   }
}
