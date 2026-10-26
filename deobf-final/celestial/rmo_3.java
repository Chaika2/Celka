package celestial;

import java.io.IOException;

public class rmo_3 implements ruS_2<rmH_2> {
   private rdn_3 class_;
   private boolean break_;
   private int byte_;

   public boolean byte_() {
      return this.break_;
   }

   public rmo_3() {
   }

   public rmo_3(rdn_3 var1, boolean var2, int var3) {
      this.class_ = var1.implements_();
      this.break_ = var2;
      this.byte_ = var3;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.extends_();
      this.break_ = var1.readBoolean();
      this.byte_ = var1.case_();
   }

   public rdn_3 break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.writeBoolean(this.break_);
      var1.protected_(this.byte_);
   }

   public int protected_() {
      return this.byte_;
   }
}
