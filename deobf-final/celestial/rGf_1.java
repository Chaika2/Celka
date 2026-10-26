package celestial;

import java.util.Random;

public class rGf_1 implements aU_2 {
   public rLR class_;

   public void class_(Random var1) {
      int var2 = var1.nextInt(5);
      if (var2 <= 1) {
         this.class_ = rLD.class_;
      } else if (var2 <= 2) {
         this.class_ = rLD.throws_;
      } else if (var2 <= 3) {
         this.class_ = rLD.finally_;
      } else if (var2 <= 4) {
         this.class_ = rLD.final_;
      }
   }
}
