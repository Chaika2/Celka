package celestial;

import java.io.IOException;

public class rZE implements ruS_2<rmH_2> {
   private int class_;
   private rqO_2 break_;
   private boolean byte_;

   public rqO_2 byte_() {
      return this.break_;
   }

   public rZE() {
   }

   public rZE(int var1, rkw_3<?> var2, boolean var3) {
      this.class_ = var1;
      this.break_ = var2.case_();
      this.byte_ = var3;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readByte();
      this.break_ = var1.volatile_();
      this.byte_ = var1.readBoolean();
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeByte(this.class_);
      var1.class_(this.break_);
      var1.writeBoolean(this.byte_);
   }

   public boolean protected_() {
      return this.byte_;
   }
}
