package celestial;

import java.io.IOException;

public class rFp_1 implements ruS_2<At_1> {
   private long class_;
   private long break_;

   public long byte_() {
      return this.break_;
   }

   public rFp_1() {
   }

   public rFp_1(long var1, long var3, boolean var5) {
      this.class_ = var1;
      this.break_ = var3;
      if (!var5) {
         this.break_ = -this.break_;
         if (this.break_ == 0L) {
            this.break_ = -1L;
         }
      }
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readLong();
      this.break_ = var1.readLong();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeLong(this.class_);
      var1.writeLong(this.break_);
   }

   public long break_() {
      return this.class_;
   }
}
