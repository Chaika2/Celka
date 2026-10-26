package celestial;

import java.util.Random;

class rrrW extends rrrl_1 {
   @Override
   public void id_class(Random var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         float var6 = var1.nextFloat();
         if (var6 < 0.2F) {
            this.id_class = xu_3.Bn.id_continue();
         } else if (var6 < 0.5F) {
            this.id_class = xu_3.BA.id_continue();
         } else if (var6 < 0.55F) {
            this.id_class = xu_3.By.id_continue();
         } else {
            this.id_class = xu_3.BL.id_continue();
         }
      } else {
         this.id_class = xu_3.hb.id_continue();
      }
   }
}
