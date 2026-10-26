package celestial;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class rmc_3 implements ruS_2<rmk_3> {
   private byte[] class_ = new byte[0];
   private byte[] break_ = new byte[0];

   public rmc_3() {
   }

   public rmc_3(SecretKey var1, PublicKey var2, byte[] var3) throws ryo_3 {
      this.class_ = ryK_2.class_(var2, var1.getEncoded());
      this.break_ = ryK_2.class_(var2, var3);
   }

   public SecretKey class_(PrivateKey var1) throws ryo_3 {
      return ryK_2.class_(var1, this.class_);
   }

   public void class_(rmk_3 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.class_();
      this.break_ = var1.class_();
   }

   public byte[] break_(PrivateKey var1) throws ryo_3 {
      return ryK_2.break_(var1, this.break_);
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.class_(this.break_);
   }
}
