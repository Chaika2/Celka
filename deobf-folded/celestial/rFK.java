package celestial;

import java.net.DatagramPacket;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Random;

class rFK {
   private final long id_class = new Date().getTime();
   private final int id_break;
   private final byte[] id_byte;
   private final byte[] id_protected;
   private final String id_throws;

   public byte[] id_byte() {
      return this.id_byte;
   }

   public rFK(DatagramPacket var1) {
      byte[] var2 = var1.getData();
      this.id_byte = new byte[4];
      this.id_byte[0] = var2[3];
      this.id_byte[1] = var2[4];
      this.id_byte[2] = var2[5];
      this.id_byte[3] = var2[6];
      this.id_throws = new String(this.id_byte, StandardCharsets.UTF_8);
      this.id_break = new Random().nextInt(16777216);
      this.id_protected = String.format("\t%s%d��", this.id_throws, this.id_break).getBytes(StandardCharsets.UTF_8);
   }

   public Boolean id_class(long var1) {
      return this.id_class < var1;
   }

   public int id_class() {
      return this.id_break;
   }

   public byte[] id_break() {
      return this.id_protected;
   }
}
