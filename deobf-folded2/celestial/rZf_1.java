package celestial;

import java.io.IOException;

public class rZf_1 implements ruS_2<At_1> {
   private int id_class;
   private rfH_2 id_break;
   private int id_byte;

   public rfH_2 id_byte() {
      return this.id_break;
   }

   public rZf_1() {
   }

   public rZf_1(int var1, rfH_2 var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.id_byte();
      this.id_byte = var1.readUnsignedByte();
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.id_class(this.id_break);
      var1.writeByte(this.id_byte);
   }

   public int id_protected() {
      return this.id_byte;
   }
}
