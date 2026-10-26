package celestial;

import java.util.Iterator;

class rrPy_1 implements Iterable<xc_3> {
   public static final xc_3 id_class = xu_3.id_class.id_continue();
   private final rqE_2<xc_3> id_break = new rqE_2<>(16);
   private int id_byte;

   @Override
   public Iterator<xc_3> iterator() {
      return this.id_break.iterator();
   }

   public xc_3 id_class(int var1) {
      xc_3 var2 = this.id_break.id_class(var1);
      return var2 == null ? id_class : var2;
   }

   public void id_class(xc_3 var1, int var2) {
      this.id_break.id_class(var1, var2);
   }

   public int id_class(xc_3 var1) {
      int var2 = this.id_break.id_class(var1);
      if (var2 == -1) {
         var2 = this.id_byte++;
         this.id_break.id_class(var1, var2);
      }

      return var2;
   }
}
