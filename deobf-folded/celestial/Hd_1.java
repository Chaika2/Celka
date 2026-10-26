package celestial;

import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Hd_1 implements Hx_1 {
   protected final lD_2 id_class;
   protected final Map<HU, lD_2> id_break;
   protected HU id_byte = null;
   protected final Set<lD_2> id_protected = Sets.newIdentityHashSet();
   private final Ok_1 id_throws = new rrxy_3(this);

   public HU id_byte() {
      return this.id_byte;
   }

   protected Hd_1(lD_2 var1, Map<HU, lD_2> var2) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_class.id_class(this);

      for (lD_2 var4 : var2.values()) {
         var4.id_class(this);
      }
   }

   @Override
   public void id_class() {
      HU var1 = this.id_byte;
      this.id_break();
      if (var1 != null) {
         this.getBuffer(var1);
      }
   }

   public Ok_1 id_class(rqO_2 var1, Ok_1 var2) {
      if (!(this.id_byte instanceof yr_3)) {
         return var2;
      } else {
         var1 = HU.id_continue(var1);
         yr_3 var3 = (yr_3)this.id_byte;
         yr_3 var4 = var3.id_super(var1);
         return this.getBuffer(var4);
      }
   }

   public void id_class(HU var1) {
      lD_2 var2 = this.id_break(var1);
      boolean var3 = Objects.equals(this.id_byte, var1);
      if ((var3 || var2 != this.id_class) && this.id_protected.remove(var2)) {
         var1.id_class(var2, 0, 0, 0);
         if (var3) {
            this.id_byte = null;
         }
      }
   }

   public void id_break() {
      if (!this.id_protected.isEmpty()) {
         if (this.id_byte != null) {
            Ok_1 var1 = this.getBuffer(this.id_byte);
            if (var1 == this.id_class) {
               this.id_class(this.id_byte);
            }
         }

         if (!this.id_protected.isEmpty()) {
            for (HU var2 : this.id_break.keySet()) {
               this.id_class(var2);
               if (this.id_protected.isEmpty()) {
                  break;
               }
            }
         }
      }
   }

   private lD_2 id_break(HU var1) {
      return this.id_break.getOrDefault(var1, this.id_class);
   }

   @Override
   public Ok_1 getBuffer(HU var1) {
      lD_2 var2 = this.id_break(var1);
      if (!Objects.equals(this.id_byte, var1)) {
         if (this.id_byte != null) {
            HU var3 = this.id_byte;
            if (!this.id_break.containsKey(var3)) {
               this.id_class(var3);
            }
         }

         if (this.id_protected.add(var2)) {
            var2.id_class(var1);
            var2.id_class(var1.id_try(), var1.id_while());
         }

         this.id_byte = var1;
      }

      return (Ok_1)(var1.id_float() == rrzJ_2.id_while ? this.id_throws : var2);
   }

   public Ok_1 id_protected() {
      return this.id_throws;
   }
}
