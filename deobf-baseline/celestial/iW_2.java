package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;

public class iW_2 {
   private final Map<iJ_2, ic_3> id_class;

   public boolean id_byte(iJ_2 var1) {
      return this.id_class.containsKey(var1);
   }

   public iW_2(Map<iJ_2, ic_3> var1) {
      this.id_class = ImmutableMap.copyOf(var1);
   }

   public ic_3 id_class(Consumer<ic_3> var1, iJ_2 var2) {
      ic_3 var3 = this.id_class.get(var2);
      if (var3 == null) {
         return null;
      } else {
         ic_3 var4 = new ic_3(var2, var1);
         var4.id_class(var3);
         return var4;
      }
   }

   public double id_class(iJ_2 var1, UUID var2) {
      ix_3 var3 = this.id_protected(var1).id_class(var2);
      if (var3 == null) {
         throw new IllegalArgumentException("Can't find modifier " + var2 + " on attribute " + rVL.O.id_break(var1));
      } else {
         return var3.id_protected();
      }
   }

   public static iz_3 id_class() {
      return new iz_3();
   }

   public double id_class(iJ_2 var1) {
      return this.id_protected(var1).id_case();
   }

   public boolean id_break(iJ_2 var1, UUID var2) {
      ic_3 var3 = this.id_class.get(var1);
      return var3 != null && var3.id_class(var2) != null;
   }

   public double id_break(iJ_2 var1) {
      return this.id_protected(var1).id_break();
   }

   private ic_3 id_protected(iJ_2 var1) {
      ic_3 var2 = this.id_class.get(var1);
      if (var2 == null) {
         throw new IllegalArgumentException("Can't find attribute " + rVL.O.id_break(var1));
      } else {
         return var2;
      }
   }
}
