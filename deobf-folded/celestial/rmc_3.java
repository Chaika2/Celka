package celestial;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class rmc_3 implements ruS_2<rmk_3> {
   private byte[] id_class = new byte[0];
   private byte[] id_break = new byte[0];

   public rmc_3() {
   }

   public rmc_3(SecretKey var1, PublicKey var2, byte[] var3) throws ryo_3 {
      this.id_class = ryK_2.id_class(var2, var1.getEncoded());
      this.id_break = ryK_2.id_class(var2, var3);
   }

   public SecretKey id_class(PrivateKey var1) throws ryo_3 {
      return ryK_2.id_class(var1, this.id_class);
   }

   public void id_class(rmk_3 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_class();
      this.id_break = var1.id_class();
   }

   public byte[] id_break(PrivateKey var1) throws ryo_3 {
      return ryK_2.id_break(var1, this.id_break);
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.id_class(this.id_break);
   }
}
