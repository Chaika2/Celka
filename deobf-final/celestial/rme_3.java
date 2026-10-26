package celestial;

import java.io.IOException;

public class rme_3 implements ruS_2<rmH_2> {
   private int break_;
   public static int class_;

   public rme_3() {
   }

   public rme_3(int var1) {
      this.break_ = var1;
      class_ = var1;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.break_ = var1.readShort();
      class_ = this.break_;
   }

   public int break_() {
      return this.break_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeShort(this.break_);
   }
}
