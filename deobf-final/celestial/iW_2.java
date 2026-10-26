package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;

public class iW_2 {
   private final Map<iJ_2, ic_3> class_;

   public boolean byte_(iJ_2 var1) {
      return this.class_.containsKey(var1);
   }

   public iW_2(Map<iJ_2, ic_3> var1) {
      this.class_ = ImmutableMap.copyOf(var1);
   }

   public ic_3 class_(Consumer<ic_3> var1, iJ_2 var2) {
      ic_3 var3 = this.class_.get(var2);
      if (var3 == null) {
         return null;
      } else {
         ic_3 var4 = new ic_3(var2, var1);
         var4.class_(var3);
         return var4;
      }
   }

   public double class_(iJ_2 var1, UUID var2) {
      ix_3 var3 = this.protected_(var1).class_(var2);
      if (var3 == null) {
         throw new IllegalArgumentException("Can't find modifier " + var2 + " on attribute " + rVL.O.break_(var1));
      } else {
         return var3.protected_();
      }
   }

   public static iz_3 class_() {
      return new iz_3();
   }

   public double class_(iJ_2 var1) {
      return this.protected_(var1).case_();
   }

   public boolean break_(iJ_2 var1, UUID var2) {
      ic_3 var3 = this.class_.get(var1);
      return var3 != null && var3.class_(var2) != null;
   }

   public double break_(iJ_2 var1) {
      return this.protected_(var1).break_();
   }

   private ic_3 protected_(iJ_2 var1) {
      ic_3 var2 = this.class_.get(var1);
      if (var2 == null) {
         throw new IllegalArgumentException("Can't find attribute " + rVL.O.break_(var1));
      } else {
         return var2;
      }
   }
}
