package celestial;

public class rrOO extends rrMi_1 {
   public rrOO() {
      super(ryW_2.native_, "enchanting_book", 0.0F, new String[]{"book"});
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      jz_3 var3 = jz_3.break_;
      Object var4 = var3.class_(ryW_2.native_);
      if (!(var4 instanceof jS_2)) {
         return null;
      } else {
         if (((jW_2)var4).byte_() == null) {
            var4 = new jS_2(var3);
         }

         if (!rrxr_3.GF.protected_()) {
            rrbb_3.protected_("Field not found: TileEntityEnchantmentTableRenderer.modelBook");
            return null;
         } else {
            rrxr_3.class_(var4, rrxr_3.GF, var1);
            return (rrMa_1)var4;
         }
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof tm_3 var3)) {
         return null;
      } else if (var2.equals("cover_right")) {
         return (Iq_1)rrxr_3.St.class_(var3, 0);
      } else if (var2.equals("cover_left")) {
         return (Iq_1)rrxr_3.St.class_(var3, 1);
      } else if (var2.equals("pages_right")) {
         return (Iq_1)rrxr_3.St.class_(var3, 2);
      } else if (var2.equals("pages_left")) {
         return (Iq_1)rrxr_3.St.class_(var3, 3);
      } else if (var2.equals("flipping_page_right")) {
         return (Iq_1)rrxr_3.St.class_(var3, 4);
      } else if (var2.equals("flipping_page_left")) {
         return (Iq_1)rrxr_3.St.class_(var3, 5);
      } else {
         return var2.equals("book_spine") ? (Iq_1)rrxr_3.St.class_(var3, 6) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new tm_3();
   }

   @Override
   public String[] case_() {
      return new String[]{"cover_right", "cover_left", "pages_right", "pages_left", "flipping_page_right", "flipping_page_left", "book_spine"};
   }
}
