package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rot_3 implements roq_3 {
   private static final Logger id_class = LogManager.getLogger();
   private final int id_break;
   private int id_byte;
   private long id_protected;
   private long id_throws = Long.MAX_VALUE;

   public rot_3(int var1) {
      int var2 = var1 * 2 + 1;
      this.id_break = var2 * var2;
   }

   @Override
   public void id_class() {
      id_class.info("Time elapsed: {} ms", rqR_2.id_break() - this.id_protected);
      this.id_throws = Long.MAX_VALUE;
   }

   @Override
   public void id_class(rfj_3 var1) {
      this.id_throws = rqR_2.id_break();
      this.id_protected = this.id_throws;
   }

   @Override
   public void id_class(rfj_3 var1, roN_2 var2) {
      if (var2 == roN_2.id_volatile) {
         this.id_byte++;
      }

      int var3 = this.id_break();
      if (rqR_2.id_break() > this.id_throws) {
         this.id_throws += 500L;
         id_class.info(new rgn_3("menu.preparingSpawn", rfU_2.id_class(var3, 0, 100)).getString());
      }
   }

   public int id_break() {
      return rfU_2.id_protected((float)this.id_byte * 100.0F / (float)this.id_break);
   }
}
