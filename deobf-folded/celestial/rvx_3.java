package celestial;

import java.io.IOException;

public class rvx_3 extends rvJ_2 {
   public rvx_3() {
      this.id_private = true;
   }

   public rvx_3(int var1, byte var2, byte var3, boolean var4) {
      super(var1);
      this.id_throws = var2;
      this.id_case = var3;
      this.id_private = true;
      this.id_catch = var4;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      super.id_class(var1);
      this.id_throws = var1.readByte();
      this.id_case = var1.readByte();
      this.id_catch = var1.readBoolean();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      super.id_break(var1);
      var1.writeByte(this.id_throws);
      var1.writeByte(this.id_case);
      var1.writeBoolean(this.id_catch);
   }
}
