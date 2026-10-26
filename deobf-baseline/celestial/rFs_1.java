package celestial;

import java.io.IOException;

public class rFs_1 implements ruS_2<At_1> {
   private String id_class;
   private String id_break;

   public String id_byte() {
      return this.id_break;
   }

   public rFs_1() {
   }

   public rFs_1(String var1, String var2) {
      this.id_class = var1;
      this.id_break = var2;
      if (var2.length() > 40) {
         throw new IllegalArgumentException("Hash is too long (max 40, was " + var2.length() + ")");
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_throws(32767);
      this.id_break = var1.id_throws(40);
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.id_class(this.id_break);
   }

   public String id_break() {
      return this.id_class;
   }
}
