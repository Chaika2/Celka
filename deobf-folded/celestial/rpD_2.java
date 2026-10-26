package celestial;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class rpD_2 implements ryY_2 {
   private final Map<rdb_3, rpU_2> id_class = Maps.newHashMap();
   private int id_break;

   protected void id_byte(rdb_3 var1) {
   }

   public void id_class() {
      this.id_break++;
      if (!this.id_class.isEmpty()) {
         Iterator var1 = this.id_class.entrySet().iterator();

         while (var1.hasNext()) {
            Entry var2 = (Entry)var1.next();
            if (((rpU_2)var2.getValue()).id_break <= this.id_break) {
               var1.remove();
               this.id_byte((rdb_3)var2.getKey());
            }
         }
      }
   }

   public void id_class(rdb_3 var1, int var2) {
      this.id_class.put(var1, new rpU_2(this.id_break, this.id_break + var2));
      this.id_break(var1, var2);
      rrLa_1.id_break(var1.id_continue(), rrLi_1.id_class(var2));
   }

   public boolean id_class(rdb_3 var1) {
      return this.id_class(var1, 0.0F) > 0.0F;
   }

   public boolean id_class(rdb_3... var1) {
      for (rdb_3 var5 : var1) {
         if (this.id_class(var5)) {
            return true;
         }
      }

      return false;
   }

   public float id_class(rdb_3 var1, float var2) {
      if (var1 != rdy_3.id_class && !this.id_class.isEmpty()) {
         rpU_2 var3 = this.id_class.get(var1);
         if (var3 != null) {
            float var4 = (float)(var3.id_break - var3.id_class);
            float var5 = (float)var3.id_break - ((float)this.id_break + var2);
            return rfU_2.id_class(var5 / var4, 0.0F, 1.0F);
         } else {
            return 0.0F;
         }
      } else {
         return 0.0F;
      }
   }

   protected void id_break(rdb_3 var1, int var2) {
   }

   public void id_break(rdb_3 var1) {
      this.id_class.remove(var1);
      this.id_byte(var1);
      rrLa_1.id_break(var1.id_continue(), rrLi_1.id_class());
   }

   public int id_protected(rdb_3 var1) {
      if (var1 != rdy_3.id_class && !this.id_class.isEmpty()) {
         rpU_2 var2 = this.id_class.get(var1);
         return var2 != null ? var2.id_break - this.id_break : 0;
      } else {
         return 0;
      }
   }
}
