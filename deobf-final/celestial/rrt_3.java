package celestial;

import java.util.Random;

class rrt_3 {
   private final Random class_;
   private long break_;
   private long byte_;
   private int protected_;

   public boolean byte_(long var1) {
      return var1 >= this.byte_;
   }

   rrt_3(Random var1, long var2) {
      this.class_ = var1;
      this.class_(var2);
   }

   @Override
   public String toString() {
      return "RetryMarker{, previousAttemptAt=" + this.break_ + ", nextScheduledAttemptAt=" + this.byte_ + ", currentDelay=" + this.protected_ + "}";
   }

   public void class_(long var1) {
      this.break_ = var1;
      int var3 = this.protected_ + this.class_.nextInt(40) + 40;
      this.protected_ = Math.min(var3, 400);
      this.byte_ = var1 + (long)this.protected_;
   }

   public boolean break_(long var1) {
      return var1 - this.break_ < 400L;
   }
}
