package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class rNI extends rzO_2 {
   final List<rzE_2> id_break;

   public static rNf_1 id_byte() {
      return new rNf_1();
   }

   rNI(rQz_1[] var1, List<rzE_2> var2) {
      super(var1);
      this.id_break = ImmutableList.copyOf(var2);
   }

   @Override
   public void id_class(rQs_1 var1) {
      super.id_class(var1);

      for (int var2 = 0; var2 < this.id_break.size(); var2++) {
         this.id_break.get(var2).id_class(var1.id_break(".entry[" + var2 + "]"));
      }
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      if (var1.id_class()) {
         return var1;
      } else {
         rqs_3 var3 = rqs_3.id_class();
         this.id_break.forEach(var2x -> var2x.expand(var2, var2xx -> var2xx.id_class(rzL_2.id_class(var3::add), var2)));
         rcd_3 var4 = new rcd_3();
         rXC.id_class(var4, var3);
         rcd_3 var5 = var1.id_int();
         var5.id_class("BlockEntityTag", var4.id_class(var5.id_int("BlockEntityTag")));
         return var1;
      }
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_final;
   }
}
