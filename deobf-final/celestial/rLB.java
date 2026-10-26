package celestial;

import java.io.IOException;

public class rLB implements ruS_2<rLr_1> {
   private long class_;

   public rLB() {
   }

   public rLB(long var1) {
      this.class_ = var1;
   }

   public void class_(rLr_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readLong();
   }

   public long break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeLong(this.class_);
   }
}
