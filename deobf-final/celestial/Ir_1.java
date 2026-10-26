package celestial;

import com.google.common.collect.Maps;
import java.io.Reader;
import java.util.List;
import java.util.Map;

public class Ir_1 {
   private final Map<String, IU> class_ = Maps.newLinkedHashMap();
   private fS_2 break_;

   public fS_2 byte_() {
      return this.break_;
   }

   public Ir_1(List<Ir_1> var1) {
      Ir_1 var2 = null;

      for (Ir_1 var4 : var1) {
         if (var4.break_()) {
            this.class_.clear();
            var2 = var4;
         }

         this.class_.putAll(var4.class_);
      }

      if (var2 != null) {
         this.break_ = var2.break_;
      }
   }

   public Ir_1(Map<String, IU> var1, fS_2 var2) {
      this.break_ = var2;
      this.class_.putAll(var1);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         if (var1 instanceof Ir_1 var2 && this.class_.equals(var2.class_)) {
            return this.break_() ? this.break_.equals(var2.break_) : !var2.break_();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.class_.hashCode() + (this.break_() ? this.break_.hashCode() : 0);
   }

   public Map<String, IU> class_() {
      return this.class_;
   }

   public static Ir_1 class_(IP var0, Reader var1) {
      return rpY_2.class_(var0.class_, var1, Ir_1.class);
   }

   public boolean break_() {
      return this.break_ != null;
   }
}
