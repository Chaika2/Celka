package celestial;

import java.util.Comparator;

class vf_3 implements Comparator<rdb_3> {
   vf_3(vI_2 var1) {
      this.id_class = var1;
   }

   public int id_class(rdb_3 var1, rdb_3 var2) {
      int var3;
      int var4;
      if (this.id_class.id_implements == null) {
         var3 = 0;
         var4 = 0;
      } else if (this.id_class.id_class.contains(this.id_class.id_implements)) {
         rlr_3 var5 = this.id_class.id_implements;
         var3 = var1 instanceof rxJ_2 ? this.id_class.id_extends.id_finally.id_class(var5, ((rxJ_2)var1).id_catch()) : -1;
         var4 = var2 instanceof rxJ_2 ? this.id_class.id_extends.id_finally.id_class(var5, ((rxJ_2)var2).id_catch()) : -1;
      } else {
         rlr_3 var6 = this.id_class.id_implements;
         var3 = this.id_class.id_extends.id_finally.id_class(var6, var1);
         var4 = this.id_class.id_extends.id_finally.id_class(var6, var2);
      }

      return var3 == var4
         ? this.id_class.id_finally * Integer.compare(rdb_3.id_class(var1), rdb_3.id_class(var2))
         : this.id_class.id_finally * Integer.compare(var3, var4);
   }
}
