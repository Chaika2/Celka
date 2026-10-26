package celestial;

import java.io.IOException;

public class rma_3 implements ruS_2<rmH_2> {
   private float id_class;
   private float id_break;
   private boolean id_byte;
   private boolean id_protected;

   public float id_byte() {
      return this.id_break;
   }

   public rma_3() {
   }

   public rma_3(float var1, float var2, boolean var3, boolean var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readFloat();
      this.id_break = var1.readFloat();
      byte var2 = var1.readByte();
      this.id_byte = (var2 & 1) > 0;
      this.id_protected = (var2 & 2) > 0;
   }

   public float id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeFloat(this.id_class);
      var1.writeFloat(this.id_break);
      byte var2 = 0;
      if (this.id_byte) {
         var2 = (byte)(var2 | 1);
      }

      if (this.id_protected) {
         var2 = (byte)(var2 | 2);
      }

      var1.writeByte(var2);
   }

   public boolean id_throws() {
      return this.id_protected;
   }

   public boolean id_protected() {
      return this.id_byte;
   }
}
