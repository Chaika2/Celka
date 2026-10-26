package celestial;

import java.io.IOException;
import java.security.PublicKey;

public class rmA_2 implements ruS_2<AH> {
   private String id_class;
   private byte[] id_break;
   private byte[] id_byte;

   public PublicKey id_byte() throws ryo_3 {
      return ryK_2.id_class(this.id_break);
   }

   public rmA_2() {
   }

   public rmA_2(String var1, byte[] var2, byte[] var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public void id_class(AH var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_throws(20);
      this.id_break = var1.id_class();
      this.id_byte = var1.id_class();
   }

   public String id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.id_class(this.id_break);
      var1.id_class(this.id_byte);
   }

   public byte[] id_protected() {
      return this.id_byte;
   }
}
