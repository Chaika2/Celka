package celestial;

import it.unimi.dsi.fastutil.doubles.DoubleList;

public class rjn_3 extends rjC_2 {
   private final rjC_2 break_;
   private final rpB_2 byte_;
   private static final DoubleList protected_ = new rjW_2(1);

   public rjn_3(rjC_2 var1, rpB_2 var2, int var3) {
      super(class_(var1.class_, var2, var3));
      this.break_ = var1;
      this.byte_ = var2;
   }

   private static rjp_3 class_(rjp_3 var0, rpB_2 var1, int var2) {
      return new rjL_2(
         var0,
         var1.class_(var2, 0, 0),
         var1.class_(0, var2, 0),
         var1.class_(0, 0, var2),
         var1.class_(var2 + 1, var0.class_, var0.class_),
         var1.class_(var0.break_, var2 + 1, var0.break_),
         var1.class_(var0.byte_, var0.byte_, var2 + 1)
      );
   }

   @Override
   protected DoubleList class_(rpB_2 var1) {
      return var1 == this.byte_ ? protected_ : this.break_.class_(var1);
   }
}
