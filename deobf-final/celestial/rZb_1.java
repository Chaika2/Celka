package celestial;

import java.io.IOException;

public class rZb_1 implements ruS_2<rmH_2> {
   private rfH_2 class_;
   private rpr_3 break_;
   private rZM byte_;

   public rpr_3 byte_() {
      return this.break_;
   }

   public rZb_1() {
   }

   public rZb_1(rZM var1, rfH_2 var2, rpr_3 var3) {
      this.byte_ = var1;
      this.class_ = var2.int_();
      this.break_ = var3;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.byte_ = var1.class_(rZM.class);
      this.class_ = var1.byte_();
      this.break_ = rpr_3.class_(var1.readUnsignedByte());
   }

   public rfH_2 break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.byte_);
      var1.class_(this.class_);
      var1.writeByte(this.break_.byte_());
   }

   public rZM protected_() {
      return this.byte_;
   }
}
