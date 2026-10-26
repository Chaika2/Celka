package celestial;

import java.io.IOException;

public class rvq_3 implements ruS_2<At_1> {
   private int class_;
   private rqO_2 break_;

   public int byte_() {
      return this.class_;
   }

   public rvq_3() {
   }

   public rvq_3(int var1, rkw_3<?> var2) {
      this.class_ = var1;
      this.break_ = var2.case_();
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readByte();
      this.break_ = var1.volatile_();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeByte(this.class_);
      var1.class_(this.break_);
   }

   public rqO_2 break_() {
      return this.break_;
   }
}
