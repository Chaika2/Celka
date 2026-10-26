package celestial;

public class rcg_3 {
   public static final rcg_3 class_ = new rcR_2(0L);
   private final long break_;
   private long byte_;

   public rcg_3(long var1) {
      this.break_ = var1;
   }

   public void class_(long var1) {
      this.byte_ += var1 / 8L;
      if (this.byte_ > this.break_) {
         throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.byte_ + "bytes where max allowed: " + this.break_);
      }
   }
}
