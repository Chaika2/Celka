package celestial;

import java.io.IOException;

public class rZV implements ruS_2<At_1> {
   private rfH_2 id_class;
   private int id_break;
   private int id_byte;
   private xd_3 id_protected;

   public int id_byte() {
      return this.id_break;
   }

   public rZV() {
   }

   public rZV(rfH_2 var1, xd_3 var2, int var3, int var4) {
      this.id_class = var1;
      this.id_protected = var2;
      this.id_break = var3;
      this.id_byte = var4;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_byte();
      this.id_break = var1.readUnsignedByte();
      this.id_byte = var1.readUnsignedByte();
      this.id_protected = rVL.id_strictfp.id_class(var1.id_case());
   }

   public rfH_2 id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.writeByte(this.id_break);
      var1.writeByte(this.id_byte);
      var1.id_protected(rVL.id_strictfp.id_class(this.id_protected));
   }

   public xd_3 id_throws() {
      return this.id_protected;
   }

   public int id_protected() {
      return this.id_byte;
   }
}
