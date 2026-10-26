package celestial;

import com.google.common.cache.CacheLoader;

class QX extends CacheLoader<rfH_2, ryw_3> {
   private final rRR class_;
   private final boolean break_;

   public QX(rRR var1, boolean var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public ryw_3 class_(rfH_2 var1) throws Exception {
      return new ryw_3(this.class_, var1, this.break_);
   }
}
