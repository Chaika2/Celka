package celestial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rrJp_1 {
   private List<wK_2> id_class = new ArrayList<>();
   private List<xc_3> id_break = new ArrayList<>();
   private List<wK_2> id_byte = Arrays.asList();

   public List<wK_2> id_class(wK_2 var1) {
      this.id_byte.set(0, var1);
      return this.id_byte;
   }

   public wK_2 id_class(int var1) {
      return this.id_class.get(var1);
   }

   public void id_class(wK_2 var1, xc_3 var2) {
      if (var1 != null) {
         this.id_class.add(var1);
         this.id_break.add(var2);
      }
   }

   public int id_class() {
      return this.id_class.size();
   }

   public xc_3 id_break(int var1) {
      return var1 >= 0 && var1 < this.id_break.size() ? this.id_break.get(var1) : xu_3.id_class.id_continue();
   }

   public void id_break() {
      this.id_class.clear();
      this.id_break.clear();
   }
}
