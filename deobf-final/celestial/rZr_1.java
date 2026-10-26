package celestial;

import java.io.IOException;

public class rZr_1 implements ruS_2<rmH_2> {
   private long class_;

   public rZr_1() {
   }

   public rZr_1(long var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readLong();
   }

   public void class_(rmH_2 var1) {
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
