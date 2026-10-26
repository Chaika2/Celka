package celestial;

import java.io.IOException;

public class rmt_3 implements ruS_2<rmH_2> {
   private int id_class;
   private int id_break;
   private int id_byte;
   private short id_protected;
   private rdn_3 id_throws = rdn_3.id_break;
   private rXa_1 id_case;

   public int id_byte() {
      return this.id_break;
   }

   public rmt_3() {
   }

   public rmt_3(int var1, int var2, int var3, rXa_1 var4, rdn_3 var5, short var6) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_throws = var5.id_implements();
      this.id_protected = var6;
      this.id_case = var4;
   }

   @Override
   public String toString() {
      return "CClickWindowPacket(window="
         + this.id_class
         + ", slot="
         + this.id_break
         + ", button="
         + this.id_byte
         + ", action="
         + this.id_protected
         + ", mode="
         + this.id_case
         + ", item="
         + this.id_throws
         + ")";
   }

   public void id_class(int var1) {
      this.id_class = var1;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readByte();
      this.id_break = var1.readShort();
      this.id_byte = var1.readByte();
      this.id_protected = var1.readShort();
      this.id_case = var1.id_class(rXa_1.class);
      this.id_throws = var1.id_extends();
   }

   public int id_break() {
      return this.id_class;
   }

   public void id_break(int var1) {
      this.id_break = var1;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeByte(this.id_class);
      var1.writeShort(this.id_break);
      var1.writeByte(this.id_byte);
      var1.writeShort(this.id_protected);
      var1.id_class(this.id_case);
      var1.id_class(this.id_throws);
   }

   public short id_throws() {
      return this.id_protected;
   }

   public rXa_1 id_catch() {
      return this.id_case;
   }

   public rdn_3 id_case() {
      return this.id_throws;
   }

   public int id_protected() {
      return this.id_byte;
   }
}
