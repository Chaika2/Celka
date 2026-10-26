package celestial;

import java.io.IOException;
import java.security.PublicKey;

public class rmA_2 implements ruS_2<AH> {
   private String class_;
   private byte[] break_;
   private byte[] byte_;

   public PublicKey byte_() throws ryo_3 {
      return ryK_2.class_(this.break_);
   }

   public rmA_2() {
   }

   public rmA_2(String var1, byte[] var2, byte[] var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public void class_(AH var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.throws_(20);
      this.break_ = var1.class_();
      this.byte_ = var1.class_();
   }

   public String break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.class_(this.break_);
      var1.class_(this.byte_);
   }

   public byte[] protected_() {
      return this.byte_;
   }
}
