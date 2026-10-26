package celestial;

import java.util.Random;

class rrrW extends rrrl_1 {
   @Override
   public void class_(Random var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         float var6 = var1.nextFloat();
         if (var6 < 0.2F) {
            this.class_ = xu_3.Bn.continue_();
         } else if (var6 < 0.5F) {
            this.class_ = xu_3.BA.continue_();
         } else if (var6 < 0.55F) {
            this.class_ = xu_3.By.continue_();
         } else {
            this.class_ = xu_3.BL.continue_();
         }
      } else {
         this.class_ = xu_3.hb.continue_();
      }
   }
}
