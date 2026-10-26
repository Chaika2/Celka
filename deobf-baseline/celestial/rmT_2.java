package celestial;

import java.io.IOException;

public class rmT_2 implements ruS_2<rmH_2> {
   private String id_class;

   public rmT_2() {
   }

   public rmT_2(String var1) {
      if (var1.length() > 256) {
         var1 = var1.substring(0, 256);
      }

      this.id_class = var1;
   }

   public void id_class(String var1) {
      this.id_class = var1;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_throws(256);
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
   }

   public String id_break() {
      return this.id_class;
   }
}
