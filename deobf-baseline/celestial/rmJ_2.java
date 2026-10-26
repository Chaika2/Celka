package celestial;

import java.io.IOException;

public class rmJ_2 implements ruS_2<rmO_2> {
   private int id_class;
   private String id_break;
   private int id_byte;
   private ruv_3 id_protected;

   public int id_byte() {
      return this.id_class;
   }

   public rmJ_2() {
   }

   public rmJ_2(String var1, int var2, ruv_3 var3) {
      this.id_class = rqu_3.id_class().getProtocolVersion();
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
   }

   public void id_class(rmO_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.id_throws(255);
      this.id_byte = var1.readUnsignedShort();
      this.id_protected = ruv_3.id_class(var1.id_case());
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.id_class(this.id_break);
      var1.writeShort(this.id_byte);
      var1.id_protected(this.id_protected.id_class());
   }

   public ruv_3 id_break() {
      return this.id_protected;
   }
}
