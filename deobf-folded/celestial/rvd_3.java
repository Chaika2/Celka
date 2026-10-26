package celestial;

import java.io.IOException;

public class rvd_3 extends rvJ_2 {
   public rvd_3() {
      this.id_private = true;
      this.id_implements = true;
   }

   public rvd_3(int var1, short var2, short var3, short var4, byte var5, byte var6, boolean var7) {
      super(var1);
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
      this.id_private = true;
      this.id_implements = true;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      super.id_class(var1);
      this.id_break = var1.readShort();
      this.id_byte = var1.readShort();
      this.id_protected = var1.readShort();
      this.id_throws = var1.readByte();
      this.id_case = var1.readByte();
      this.id_catch = var1.readBoolean();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      super.id_break(var1);
      var1.writeShort(this.id_break);
      var1.writeShort(this.id_byte);
      var1.writeShort(this.id_protected);
      var1.writeByte(this.id_throws);
      var1.writeByte(this.id_case);
      var1.writeBoolean(this.id_catch);
   }
}
