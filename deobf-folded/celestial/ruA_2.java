package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ruA_2 extends rud_3 {
   private static final Logger id_catch = LogManager.getLogger();
   private static final rgP_2 id_private = new rgn_3("disconnect.exceeded_packet_rate");
   private final int id_implements;

   public ruA_2(int var1) {
      super(rum_3.SERVERBOUND);
      this.id_implements = var1;
   }

   @Override
   protected void id_break() {
      super.id_break();
      float var1 = this.id_volatile();
      if (var1 > (float)this.id_implements) {
         id_catch.warn("Player exceeded rate-limit (sent {} packets per second)", var1);
         this.id_class(new rvb_3(id_private), var1x -> this.id_class(id_private));
         this.id_extends();
      }
   }
}
