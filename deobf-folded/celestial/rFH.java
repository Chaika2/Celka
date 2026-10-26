package celestial;

import java.io.IOException;
import java.util.Objects;

public class rFH implements ruS_2<At_1> {
   private String id_class = "";
   private String id_break;
   private int id_byte;
   private rnb_3 id_protected;

   public String id_byte() {
      return this.id_break;
   }

   public rFH() {
   }

   public rFH(rnb_3 var1, String var2, String var3, int var4) {
      if (var1 != rnb_3.REMOVE && var2 == null) {
         throw new IllegalArgumentException("Need an objective name");
      } else {
         this.id_class = var3;
         this.id_break = var2;
         this.id_byte = var4;
         this.id_protected = var1;
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_throws(40);
      this.id_protected = var1.id_class(rnb_3.class);
      String var2 = var1.id_throws(16);
      this.id_break = Objects.equals(var2, "") ? null : var2;
      if (this.id_protected != rnb_3.REMOVE) {
         this.id_byte = var1.id_case();
      }
   }

   public String id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.id_class(this.id_protected);
      var1.id_class(this.id_break == null ? "" : this.id_break);
      if (this.id_protected != rnb_3.REMOVE) {
         var1.id_protected(this.id_byte);
      }
   }

   public rnb_3 id_throws() {
      return this.id_protected;
   }

   public int id_protected() {
      return this.id_byte;
   }
}
