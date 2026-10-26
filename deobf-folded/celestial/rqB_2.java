package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class rqB_2 implements ryY_2 {
   private final List<rqS_2> id_class = Lists.newArrayList();
   private int id_break;

   public int id_byte(rdn_3 var1) {
      if (var1.id_break() != rdy_3.id_class && !this.id_class.isEmpty()) {
         for (rqS_2 var3 : this.id_class) {
            if (var3.id_class.test(var1)) {
               return var3.id_byte - this.id_break;
            }
         }

         return 0;
      } else {
         return 0;
      }
   }

   public void id_class(rdn_3 var1, Predicate<rdn_3> var2, int var3) {
      this.id_class.add(new rqS_2(var2, this.id_break, this.id_break + var3));
      rrLa_1.id_break(var1, rrLi_1.id_class(var3));
   }

   public boolean id_class(rdn_3 var1) {
      return this.id_class(var1, 0.0F) > 0.0F;
   }

   public boolean id_class(rdn_3... var1) {
      for (rdn_3 var5 : var1) {
         if (this.id_class(var5)) {
            return true;
         }
      }

      return false;
   }

   public float id_class(rdn_3 var1, float var2) {
      if (var1.id_break() != rdy_3.id_class && !this.id_class.isEmpty()) {
         for (rqS_2 var4 : this.id_class) {
            if (var4.id_class.test(var1)) {
               float var5 = (float)(var4.id_byte - var4.id_break);
               float var6 = (float)var4.id_byte - ((float)this.id_break + var2);
               return rfU_2.id_class(var6 / var5, 0.0F, 1.0F);
            }
         }

         return 0.0F;
      } else {
         return 0.0F;
      }
   }

   public void id_class() {
      this.id_break++;
      if (!this.id_class.isEmpty()) {
         this.id_class.removeIf(var1 -> var1.id_byte <= this.id_break);
      }
   }

   public void id_break(rdn_3 var1) {
      this.id_class.removeIf(var1x -> var1x.id_class.test(var1));
      rrLa_1.id_break(var1, rrLi_1.id_class());
   }

   public void id_break() {
      this.id_class.clear();
   }
}
