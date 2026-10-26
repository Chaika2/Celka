package celestial;

import java.util.List;

public interface rq_3 {
   int byte_();

   xc_3 class_(int var1, int var2, int var3, xc_3 var4, List<xc_3> var5);

   default boolean class_(int var1, int var2, int var3, xc_3 var4) {
      return var1 >= 0 && var1 < this.break_() && var2 >= 0 && var2 < this.class_() && var3 >= 0 && var3 < this.byte_();
   }

   default int class_(rpB_2 var1) {
      switch (((int[])rT_2.class_[0])[var1.ordinal()]) {
         case 1:
            return this.break_();
         case 2:
            return this.class_();
         case 3:
            return this.byte_();
         default:
            throw new UnsupportedOperationException(var1 + "");
      }
   }

   int class_();

   int break_();

   default void protected_() {
   }
}
