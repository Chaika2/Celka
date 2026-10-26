package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rot_3 implements roq_3 {
   private static final Logger class_ = LogManager.getLogger();
   private final int break_;
   private int byte_;
   private long protected_;
   private long throws_ = Long.MAX_VALUE;

   public rot_3(int var1) {
      int var2 = var1 * 2 + 1;
      this.break_ = var2 * var2;
   }

   @Override
   public void class_() {
      class_.info("Time elapsed: {} ms", rqR_2.break_() - this.protected_);
      this.throws_ = Long.MAX_VALUE;
   }

   @Override
   public void class_(rfj_3 var1) {
      this.throws_ = rqR_2.break_();
      this.protected_ = this.throws_;
   }

   @Override
   public void class_(rfj_3 var1, roN_2 var2) {
      if (var2 == roN_2.volatile_) {
         this.byte_++;
      }

      int var3 = this.break_();
      if (rqR_2.break_() > this.throws_) {
         this.throws_ += 500L;
         class_.info(new rgn_3("menu.preparingSpawn", rfU_2.class_(var3, 0, 100)).getString());
      }
   }

   public int break_() {
      return rfU_2.protected_((float)this.byte_ * 100.0F / (float)this.break_);
   }
}
