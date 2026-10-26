package celestial;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class rFU {
   private final ByteArrayOutputStream class_;
   private final DataOutputStream break_;

   public rFU(int var1) {
      this.class_ = new ByteArrayOutputStream(var1);
      this.break_ = new DataOutputStream(this.class_);
   }

   public void class_(int var1) throws IOException {
      this.break_.write(var1);
   }

   public void class_(short var1) throws IOException {
      this.break_.writeShort(Short.reverseBytes(var1));
   }

   public byte[] class_() {
      return this.class_.toByteArray();
   }

   public void class_(String var1) throws IOException {
      this.break_.writeBytes(var1);
      this.break_.write(0);
   }

   public void class_(byte[] var1) throws IOException {
      this.break_.write(var1, 0, var1.length);
   }

   public void break_() {
      this.class_.reset();
   }
}
