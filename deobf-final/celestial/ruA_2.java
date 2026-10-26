package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ruA_2 extends rud_3 {
   private static final Logger catch_ = LogManager.getLogger();
   private static final rgP_2 private_ = new rgn_3("disconnect.exceeded_packet_rate");
   private final int implements_;

   public ruA_2(int var1) {
      super(rum_3.SERVERBOUND);
      this.implements_ = var1;
   }

   @Override
   protected void break_() {
      super.break_();
      float var1 = this.volatile_();
      if (var1 > (float)this.implements_) {
         catch_.warn("Player exceeded rate-limit (sent {} packets per second)", var1);
         this.class_(new rvb_3(private_), var1x -> this.class_(private_));
         this.extends_();
      }
   }
}
