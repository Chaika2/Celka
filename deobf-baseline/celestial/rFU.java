package celestial;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class rFU {
   private final ByteArrayOutputStream id_class;
   private final DataOutputStream id_break;

   public rFU(int var1) {
      this.id_class = new ByteArrayOutputStream(var1);
      this.id_break = new DataOutputStream(this.id_class);
   }

   public void id_class(int var1) throws IOException {
      this.id_break.write(var1);
   }

   public void id_class(short var1) throws IOException {
      this.id_break.writeShort(Short.reverseBytes(var1));
   }

   public byte[] id_class() {
      return this.id_class.toByteArray();
   }

   public void id_class(String var1) throws IOException {
      this.id_break.writeBytes(var1);
      this.id_break.write(0);
   }

   public void id_class(byte[] var1) throws IOException {
      this.id_break.write(var1, 0, var1.length);
   }

   public void id_break() {
      this.id_class.reset();
   }
}
