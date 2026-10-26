package celestial;

import it.unimi.dsi.fastutil.Hash.Strategy;

enum rqa_3 implements Strategy<Object> {
   INSTANCE;

   public boolean equals(Object var1, Object var2) {
      return var1 == var2;
   }

   public int hashCode(Object var1) {
      return System.identityHashCode(var1);
   }
}
