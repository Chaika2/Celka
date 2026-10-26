package celestial;

import java.io.IOException;

public class rZj_1 implements ruS_2<At_1> {
   private int id_class;
   private int id_break;

   public int id_byte() {
      return this.id_break;
   }

   public rZj_1() {
   }

   public rZj_1(an_3 var1, int var2) {
      this.id_class = var1.V();
      this.id_break = var2;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.readUnsignedByte();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.writeByte(this.id_break);
   }

   public int id_break() {
      return this.id_class;
   }
}
