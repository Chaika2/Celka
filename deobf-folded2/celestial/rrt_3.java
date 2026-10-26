package celestial;

import java.util.Random;

class rrt_3 {
   private final Random id_class;
   private long id_break;
   private long id_byte;
   private int id_protected;

   public boolean id_byte(long var1) {
      return var1 >= this.id_byte;
   }

   rrt_3(Random var1, long var2) {
      this.id_class = var1;
      this.id_class(var2);
   }

   @Override
   public String toString() {
      return "RetryMarker{, previousAttemptAt=" + this.id_break + ", nextScheduledAttemptAt=" + this.id_byte + ", currentDelay=" + this.id_protected + "}";
   }

   public void id_class(long var1) {
      this.id_break = var1;
      int var3 = this.id_protected + this.id_class.nextInt(40) + 40;
      this.id_protected = Math.min(var3, 400);
      this.id_byte = var1 + (long)this.id_protected;
   }

   public boolean id_break(long var1) {
      return var1 - this.id_break < 400L;
   }
}
