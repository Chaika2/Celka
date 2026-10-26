package celestial;

import java.util.Comparator;

class vf_3 implements Comparator<rdb_3> {
   vf_3(vI_2 var1) {
      this.class_ = var1;
   }

   public int class_(rdb_3 var1, rdb_3 var2) {
      int var3;
      int var4;
      if (this.class_.implements_ == null) {
         var3 = 0;
         var4 = 0;
      } else if (this.class_.class_.contains(this.class_.implements_)) {
         rlr_3 var5 = this.class_.implements_;
         var3 = var1 instanceof rxJ_2 ? this.class_.extends_.finally_.class_(var5, ((rxJ_2)var1).catch_()) : -1;
         var4 = var2 instanceof rxJ_2 ? this.class_.extends_.finally_.class_(var5, ((rxJ_2)var2).catch_()) : -1;
      } else {
         rlr_3 var6 = this.class_.implements_;
         var3 = this.class_.extends_.finally_.class_(var6, var1);
         var4 = this.class_.extends_.finally_.class_(var6, var2);
      }

      return var3 == var4 ? this.class_.finally_ * Integer.compare(rdb_3.class_(var1), rdb_3.class_(var2)) : this.class_.finally_ * Integer.compare(var3, var4);
   }
}
