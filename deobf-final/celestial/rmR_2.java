package celestial;

import java.io.IOException;

public class rmR_2 implements ruS_2<rmH_2> {
   private int class_;
   private rdn_3 break_;

   public rdn_3 byte_() {
      return this.break_;
   }

   public rmR_2() {
      this.break_ = rdn_3.break_;
   }

   public rmR_2(int var1, rdn_3 var2) {
      this.break_ = rdn_3.break_;
      this.class_ = var1;
      this.break_ = var2.implements_();
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readShort();
      this.break_ = var1.extends_();
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeShort(this.class_);
      var1.class_(this.break_);
   }
}
