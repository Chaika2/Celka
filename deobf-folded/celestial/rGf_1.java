package celestial;

import java.util.Random;

public class rGf_1 implements aU_2 {
   public rLR id_class;

   public void id_class(Random var1) {
      int var2 = var1.nextInt(5);
      if (var2 <= 1) {
         this.id_class = rLD.id_class;
      } else if (var2 <= 2) {
         this.id_class = rLD.id_throws;
      } else if (var2 <= 3) {
         this.id_class = rLD.id_finally;
      } else if (var2 <= 4) {
         this.id_class = rLD.id_final;
      }
   }
}
