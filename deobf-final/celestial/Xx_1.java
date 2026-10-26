package celestial;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Xx_1 extends hZ_2 {
   private final ho_3[] class_;
   private final XF break_;

   public Xx_1(ho_3 var1, ho_3[] var2, XF var3) {
      super(XJ.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("victims", ho_3.class_(this.class_, var1));
      var2.add("unique_entity_types", this.break_.protected_());
      return var2;
   }

   public boolean class_(Collection<rzr_3> var1, int var2) {
      if (this.class_.length > 0) {
         ArrayList var3 = Lists.newArrayList(var1);

         for (ho_3 var7 : this.class_) {
            boolean var8 = false;
            Iterator var9 = var3.iterator();

            while (var9.hasNext()) {
               rzr_3 var10 = (rzr_3)var9.next();
               if (var7.class_(var10)) {
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

      return this.break_.byte_(var2);
   }

   public static Xx_1 class_(XF var0) {
      ho_3[] var1 = new ho_3[0];
      return new Xx_1(ho_3.class_, var1, var0);
   }

   public static Xx_1 class_(hK_2... var0) {
      ho_3[] var1 = new ho_3[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         hK_2 var3 = var0[var2];
         var1[var2] = ho_3.class_(var3.break_());
      }

      return new Xx_1(ho_3.class_, var1, XF.throws_);
   }
}
