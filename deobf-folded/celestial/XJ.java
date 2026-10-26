package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class XJ extends hG_2<Xx_1> {
   static final rqO_2 id_class = new rqO_2("killed_by_crossbow");

   public void id_class(rhN_2 var1, Collection<an_3> var2) {
      ArrayList var3 = Lists.newArrayList();
      HashSet var4 = Sets.newHashSet();

      for (an_3 var6 : var2) {
         var4.add(var6.BC());
         var3.add(hY_2.id_break(var1, var6));
      }

      this.id_class(var1, var2x -> var2x.id_class(var3, var4.size()));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public Xx_1 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      ho_3[] var4 = ho_3.id_break(var1, "victims", var3);
      XF var5 = XF.id_class(var1.get("unique_entity_types"));
      return new Xx_1(var2, var4, var5);
   }
}
