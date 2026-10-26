package celestial;

import it.unimi.dsi.fastutil.doubles.DoubleList;

public class rjn_3 extends rjC_2 {
   private final rjC_2 id_break;
   private final rpB_2 id_byte;
   private static final DoubleList id_protected = new rjW_2(1);

   public rjn_3(rjC_2 var1, rpB_2 var2, int var3) {
      super(id_class(var1.id_class, var2, var3));
      this.id_break = var1;
      this.id_byte = var2;
   }

   private static rjp_3 id_class(rjp_3 var0, rpB_2 var1, int var2) {
      return new rjL_2(
         var0,
         var1.id_class(var2, 0, 0),
         var1.id_class(0, var2, 0),
         var1.id_class(0, 0, var2),
         var1.id_class(var2 + 1, var0.id_class, var0.id_class),
         var1.id_class(var0.id_break, var2 + 1, var0.id_break),
         var1.id_class(var0.id_byte, var0.id_byte, var2 + 1)
      );
   }

   @Override
   protected DoubleList id_class(rpB_2 var1) {
      return var1 == this.id_byte ? id_protected : this.id_break.id_class(var1);
   }
}
