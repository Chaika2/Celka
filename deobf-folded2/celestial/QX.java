package celestial;

import com.google.common.cache.CacheLoader;

class QX extends CacheLoader<rfH_2, ryw_3> {
   private final rRR id_class;
   private final boolean id_break;

   public QX(rRR var1, boolean var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public ryw_3 id_class(rfH_2 var1) throws Exception {
      return new ryw_3(this.id_class, var1, this.id_break);
   }
}
