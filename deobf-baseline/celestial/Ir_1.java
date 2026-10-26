package celestial;

import com.google.common.collect.Maps;
import java.io.Reader;
import java.util.List;
import java.util.Map;

public class Ir_1 {
   private final Map<String, IU> id_class = Maps.newLinkedHashMap();
   private fS_2 id_break;

   public fS_2 id_byte() {
      return this.id_break;
   }

   public Ir_1(List<Ir_1> var1) {
      Ir_1 var2 = null;

      for (Ir_1 var4 : var1) {
         if (var4.id_break()) {
            this.id_class.clear();
            var2 = var4;
         }

         this.id_class.putAll(var4.id_class);
      }

      if (var2 != null) {
         this.id_break = var2.id_break;
      }
   }

   public Ir_1(Map<String, IU> var1, fS_2 var2) {
      this.id_break = var2;
      this.id_class.putAll(var1);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         if (var1 instanceof Ir_1 var2 && this.id_class.equals(var2.id_class)) {
            return this.id_break() ? this.id_break.equals(var2.id_break) : !var2.id_break();
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.id_class.hashCode() + (this.id_break() ? this.id_break.hashCode() : 0);
   }

   public Map<String, IU> id_class() {
      return this.id_class;
   }

   public static Ir_1 id_class(IP var0, Reader var1) {
      return rpY_2.id_class(var0.id_class, var1, Ir_1.class);
   }

   public boolean id_break() {
      return this.id_break != null;
   }
}
