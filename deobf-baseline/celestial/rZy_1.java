package celestial;

import java.io.IOException;

public class rZy_1 implements ruS_2<rmH_2> {
   private rfH_2 id_class;
   private String[] id_break;

   public String[] id_byte() {
      return this.id_break;
   }

   public rZy_1() {
   }

   public rZy_1(rfH_2 var1, String var2, String var3, String var4, String var5) {
      this.id_class = var1;
      this.id_break = new String[]{var2, var3, var4, var5};
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_byte();
      this.id_break = new String[4];

      for (int var2 = 0; var2 < 4; var2++) {
         this.id_break[var2] = var1.id_throws(384);
      }
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);

      for (int var2 = 0; var2 < 4; var2++) {
         var1.id_class(this.id_break[var2]);
      }
   }

   public rfH_2 id_break() {
      return this.id_class;
   }
}
