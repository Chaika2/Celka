package celestial;

import java.io.IOException;

public class rFB implements ruS_2<At_1> {
   private String id_class;
   private rgP_2 id_break;
   private rnr_3 id_byte;
   private int id_protected;

   public rgP_2 id_byte() {
      return this.id_break;
   }

   public rFB() {
   }

   public rFB(rnP_2 var1, int var2) {
      this.id_class = var1.id_break();
      this.id_break = var1.id_protected();
      this.id_byte = var1.id_case();
      this.id_protected = var2;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_throws(16);
      this.id_protected = var1.readByte();
      if (this.id_protected == 0 || this.id_protected == 2) {
         this.id_break = var1.id_throws();
         this.id_byte = var1.id_class(rnr_3.class);
      }
   }

   public String id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.writeByte(this.id_protected);
      if (this.id_protected == 0 || this.id_protected == 2) {
         var1.id_class(this.id_break);
         var1.id_class(this.id_byte);
      }
   }

   public rnr_3 id_throws() {
      return this.id_byte;
   }

   public int id_protected() {
      return this.id_protected;
   }
}
