package celestial;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class rpD_2 implements ryY_2 {
   private final Map<rdb_3, rpU_2> class_ = Maps.newHashMap();
   private int break_;

   protected void byte_(rdb_3 var1) {
   }

   public void class_() {
      this.break_++;
      if (!this.class_.isEmpty()) {
         Iterator var1 = this.class_.entrySet().iterator();

         while (var1.hasNext()) {
            Entry var2 = (Entry)var1.next();
            if (((rpU_2)var2.getValue()).break_ <= this.break_) {
               var1.remove();
               this.byte_((rdb_3)var2.getKey());
            }
         }
      }
   }

   public void class_(rdb_3 var1, int var2) {
      this.class_.put(var1, new rpU_2(this.break_, this.break_ + var2));
      this.break_(var1, var2);
      rrLa_1.break_(var1.continue_(), rrLi_1.class_(var2));
   }

   public boolean class_(rdb_3 var1) {
      return this.class_(var1, 0.0F) > 0.0F;
   }

   public boolean class_(rdb_3... var1) {
      for (rdb_3 var5 : var1) {
         if (this.class_(var5)) {
            return true;
         }
      }

      return false;
   }

   public float class_(rdb_3 var1, float var2) {
      if (var1 != rdy_3.class_ && !this.class_.isEmpty()) {
         rpU_2 var3 = this.class_.get(var1);
         if (var3 != null) {
            float var4 = (float)(var3.break_ - var3.class_);
            float var5 = (float)var3.break_ - ((float)this.break_ + var2);
            return rfU_2.class_(var5 / var4, 0.0F, 1.0F);
         } else {
            return 0.0F;
         }
      } else {
         return 0.0F;
      }
   }

   protected void break_(rdb_3 var1, int var2) {
   }

   public void break_(rdb_3 var1) {
      this.class_.remove(var1);
      this.byte_(var1);
      rrLa_1.break_(var1.continue_(), rrLi_1.class_());
   }

   public int protected_(rdb_3 var1) {
      if (var1 != rdy_3.class_ && !this.class_.isEmpty()) {
         rpU_2 var2 = this.class_.get(var1);
         return var2 != null ? var2.break_ - this.break_ : 0;
      } else {
         return 0;
      }
   }
}
