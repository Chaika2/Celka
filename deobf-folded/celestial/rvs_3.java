package celestial;

import java.io.IOException;

public class rvs_3 implements ruS_2<At_1> {
   private rdb_3 id_class;
   private int id_break;

   public int id_byte() {
      return this.id_break;
   }

   public rvs_3() {
   }

   public rvs_3(rdb_3 var1, int var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void id_class(int var1) {
      this.id_break = var1;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = rdb_3.id_break(var1.id_case());
      this.id_break = var1.id_case();
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   public rdb_3 id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(rdb_3.id_class(this.id_class));
      var1.id_protected(this.id_break);
   }
}
