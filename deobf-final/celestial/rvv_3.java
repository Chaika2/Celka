package celestial;

import java.io.IOException;

public class rvv_3 implements ruS_2<At_1> {
   private long class_;

   public rvv_3() {
   }

   public rvv_3(long var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readLong();
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   public long break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeLong(this.class_);
   }
}
