package celestial;

import java.io.IOException;

public class rmJ_2 implements ruS_2<rmO_2> {
   private int class_;
   private String break_;
   private int byte_;
   private ruv_3 protected_;

   public int byte_() {
      return this.class_;
   }

   public rmJ_2() {
   }

   public rmJ_2(String var1, int var2, ruv_3 var3) {
      this.class_ = rqu_3.class_().getProtocolVersion();
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
   }

   public void class_(rmO_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.throws_(255);
      this.byte_ = var1.readUnsignedShort();
      this.protected_ = ruv_3.class_(var1.case_());
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.class_(this.break_);
      var1.writeShort(this.byte_);
      var1.protected_(this.protected_.class_());
   }

   public ruv_3 break_() {
      return this.protected_;
   }
}
