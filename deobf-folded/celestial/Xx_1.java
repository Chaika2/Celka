package celestial;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Xx_1 extends hZ_2 {
   private final ho_3[] id_class;
   private final XF id_break;

   public Xx_1(ho_3 var1, ho_3[] var2, XF var3) {
      super(XJ.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("victims", ho_3.id_class(this.id_class, var1));
      var2.add("unique_entity_types", this.id_break.id_protected());
      return var2;
   }

   public boolean id_class(Collection<rzr_3> var1, int var2) {
      if (this.id_class.length > 0) {
         ArrayList var3 = Lists.newArrayList(var1);

         for (ho_3 var7 : this.id_class) {
            boolean var8 = false;
            Iterator var9 = var3.iterator();

            while (var9.hasNext()) {
               rzr_3 var10 = (rzr_3)var9.next();
               if (var7.id_class(var10)) {
                  var9.remove();
                  var8 = true;
                  break;
               }
            }

            if (!var8) {
               return false;
            }
         }
      }

      return this.id_break.id_byte(var2);
   }

   public static Xx_1 id_class(XF var0) {
      ho_3[] var1 = new ho_3[0];
      return new Xx_1(ho_3.id_class, var1, var0);
   }

   public static Xx_1 id_class(hK_2... var0) {
      ho_3[] var1 = new ho_3[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         hK_2 var3 = var0[var2];
         var1[var2] = ho_3.id_class(var3.id_break());
      }

      return new Xx_1(ho_3.id_class, var1, XF.id_throws);
   }
}
