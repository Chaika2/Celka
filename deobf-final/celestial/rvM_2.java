package celestial;

import java.io.IOException;
import java.util.Objects;

public class rvM_2 implements ruS_2<At_1> {
   private int class_;
   private String break_;

   public String byte_() {
      return Objects.equals(this.break_, "") ? null : this.break_;
   }

   public rvM_2() {
   }

   public rvM_2(int var1, rnP_2 var2) {
      this.class_ = var1;
      if (var2 == null) {
         this.break_ = "";
      } else {
         this.break_ = var2.break_();
      }
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readByte();
      this.break_ = var1.throws_(16);
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeByte(this.class_);
      var1.class_(this.break_);
   }

   public int break_() {
      return this.class_;
   }
}
