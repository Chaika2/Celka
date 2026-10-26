package celestial;

import java.io.IOException;

public class rmi_3 implements ruS_2<rmH_2> {
   private rfH_2 class_;
   private int break_;
   private boolean byte_;

   public int byte_() {
      return this.break_;
   }

   public rmi_3() {
   }

   public rmi_3(rfH_2 var1, int var2, boolean var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.byte_();
      this.break_ = var1.case_();
      this.byte_ = var1.readBoolean();
   }

   public rfH_2 break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.protected_(this.break_);
      var1.writeBoolean(this.byte_);
   }

   public boolean protected_() {
      return this.byte_;
   }
}
