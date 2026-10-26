package celestial;

import java.net.DatagramPacket;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Random;

class rFK {
   private final long class_ = new Date().getTime();
   private final int break_;
   private final byte[] byte_;
   private final byte[] protected_;
   private final String throws_;

   public byte[] byte_() {
      return this.byte_;
   }

   public rFK(DatagramPacket var1) {
      byte[] var2 = var1.getData();
      this.byte_ = new byte[4];
      this.byte_[0] = var2[3];
      this.byte_[1] = var2[4];
      this.byte_[2] = var2[5];
      this.byte_[3] = var2[6];
      this.throws_ = new String(this.byte_, StandardCharsets.UTF_8);
      this.break_ = new Random().nextInt(16777216);
      this.protected_ = String.format("\t%s%d��", this.throws_, this.break_).getBytes(StandardCharsets.UTF_8);
   }

   public Boolean class_(long var1) {
      return this.class_ < var1;
   }

   public int class_() {
      return this.break_;
   }

   public byte[] break_() {
      return this.protected_;
   }
}
