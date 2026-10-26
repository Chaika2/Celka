package celestial;

import java.io.IOException;

public class rvc_3 implements ruS_2<At_1> {
   private int id_class;
   private int id_break;
   private int id_byte;
   private int id_protected;

   public int id_byte() {
      return this.id_break;
   }

   public void id_byte(int var1) {
      this.id_protected = var1;
   }

   public rvc_3() {
   }

   public rvc_3(int var1, rjU_2 var2) {
      this.id_class = var1;
      double var3 = 3.9;
      double var5 = rfU_2.id_class(var2.id_break, -3.9, 3.9);
      double var7 = rfU_2.id_class(var2.id_byte, -3.9, 3.9);
      double var9 = rfU_2.id_class(var2.id_protected, -3.9, 3.9);
      this.id_break = (int)(var5 * 8000.0);
      this.id_byte = (int)(var7 * 8000.0);
      this.id_protected = (int)(var9 * 8000.0);
   }

   public rvc_3(an_3 var1) {
      this(var1.V(), var1.rv());
   }

   @Override
   public String toString() {
      return "SEntityVelocityPacket{entityID="
         + this.id_class
         + ", motionX="
         + this.id_break
         + ", motionY="
         + this.id_byte
         + ", motionZ="
         + this.id_protected
         + "}";
   }

   public void id_class(int var1) {
      this.id_break = var1;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.readShort();
      this.id_byte = var1.readShort();
      this.id_protected = var1.readShort();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.writeShort(this.id_break);
      var1.writeShort(this.id_byte);
      var1.writeShort(this.id_protected);
   }

   public void id_break(int var1) {
      this.id_byte = var1;
   }

   public int id_break() {
      return this.id_class;
   }

   public int id_throws() {
      return this.id_protected;
   }

   public int id_protected() {
      return this.id_byte;
   }
}
