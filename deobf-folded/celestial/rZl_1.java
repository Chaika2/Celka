package celestial;

import java.io.IOException;

public class rZl_1 implements ruS_2<rmH_2> {
   private int id_class;
   private String id_break;
   private boolean id_byte;

   public boolean id_byte() {
      return this.id_byte;
   }

   public rZl_1() {
   }

   public rZl_1(int var1, String var2, boolean var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public rHm_1 id_class(rYB var1) {
      an_3 var2 = var1.id_break(this.id_class);
      return var2 instanceof rsW_2 ? ((rsW_2)var2).id_else() : null;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.id_throws(32767);
      this.id_byte = var1.readBoolean();
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   public String id_break() {
      return this.id_break;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.id_class(this.id_break);
      var1.writeBoolean(this.id_byte);
   }
}
