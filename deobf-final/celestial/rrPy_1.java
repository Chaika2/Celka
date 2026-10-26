package celestial;

import java.util.Iterator;

class rrPy_1 implements Iterable<xc_3> {
   public static final xc_3 class_ = xu_3.class_.continue_();
   private final rqE_2<xc_3> break_ = new rqE_2<>(16);
   private int byte_;

   @Override
   public Iterator<xc_3> iterator() {
      return this.break_.iterator();
   }

   public xc_3 class_(int var1) {
      xc_3 var2 = this.break_.class_(var1);
      return var2 == null ? class_ : var2;
   }

   public void class_(xc_3 var1, int var2) {
      this.break_.class_(var1, var2);
   }

   public int class_(xc_3 var1) {
      int var2 = this.break_.class_(var1);
      if (var2 == -1) {
         var2 = this.byte_++;
         this.break_.class_(var1, var2);
      }

      return var2;
   }
}
