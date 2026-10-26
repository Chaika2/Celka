package celestial;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
import java.util.List;

public class C_if {
   private final List<iT_2> id_class = Lists.newArrayList();
   private int id_break;

   public float id_class(int var1) {
      if (this.id_class.size() <= 0) {
         return 0.0F;
      } else {
         iT_2 var2 = this.id_class.get(this.id_break);
         iT_2 var3 = this.id_class.get(this.id_class.size() - 1);
         boolean var4 = var1 < var2.id_class();
         int var5 = var4 ? 0 : this.id_break;
         float var6 = var4 ? var3.id_break() : var2.id_break();

         for (int var7 = var5; var7 < this.id_class.size(); var7++) {
            iT_2 var8 = this.id_class.get(var7);
            if (var8.id_class() > var1) {
               break;
            }

            this.id_break = var7;
            var6 = var8.id_break();
         }

         return var6;
      }
   }

   private void id_class() {
      Int2ObjectAVLTreeMap var1 = new Int2ObjectAVLTreeMap();
      this.id_class.forEach(var1x -> {
         iT_2 var2 = (iT_2)var1.put(var1x.id_class(), var1x);
      });
      this.id_class.clear();
      this.id_class.addAll(var1.values());
      this.id_break = 0;
   }

   public C_if id_class(int var1, float var2) {
      this.id_class.add(new iT_2(var1, var2));
      this.id_class();
      return this;
   }
}
