package celestial;

import java.io.IOException;

public class rvf_3 implements ruS_2<At_1> {
   private boolean id_class;
   private boolean id_break;
   private boolean id_byte;
   private boolean id_protected;
   private float id_throws;
   private float id_case;

   public boolean id_byte() {
      return this.id_break;
   }

   public rvf_3() {
   }

   public rvf_3(rhx_3 var1) {
      this.id_class = var1.id_class;
      this.id_break = var1.id_break;
      this.id_byte = var1.id_byte;
      this.id_protected = var1.id_protected;
      this.id_throws = var1.id_class();
      this.id_case = var1.id_break();
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      byte var2 = var1.readByte();
      this.id_class = (var2 & 1) != 0;
      this.id_break = (var2 & 2) != 0;
      this.id_byte = (var2 & 4) != 0;
      this.id_protected = (var2 & 8) != 0;
      this.id_throws = var1.readFloat();
      this.id_case = var1.readFloat();
   }

   public boolean id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      byte var2 = 0;
      if (this.id_class) {
         var2 = (byte)(var2 | 1);
      }

      if (this.id_break) {
         var2 = (byte)(var2 | 2);
      }

      if (this.id_byte) {
         var2 = (byte)(var2 | 4);
      }

      if (this.id_protected) {
         var2 = (byte)(var2 | 8);
      }

      var1.writeByte(var2);
      var1.writeFloat(this.id_throws);
      var1.writeFloat(this.id_case);
   }

   public boolean id_throws() {
      return this.id_protected;
   }

   public float id_catch() {
      return this.id_case;
   }

   public float id_case() {
      return this.id_throws;
   }

   public boolean id_protected() {
      return this.id_byte;
   }
}
