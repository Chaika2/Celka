package celestial;

import java.io.IOException;

public class rZL implements ruS_2<rmH_2> {
   private int id_class;
   private String id_break;

   public String id_byte() {
      return this.id_break;
   }

   public rZL() {
   }

   public rZL(int var1, String var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.id_throws(32500);
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.id_class(this.id_break, 32500);
   }

   public int id_break() {
      return this.id_class;
   }
}
