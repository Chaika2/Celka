package celestial;

public class rrOh_1 extends rrMi_1 {
   public rrOh_1() {
      super(ryW_2.id_throw, "lectern_book", 0.0F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      jz_3 var3 = jz_3.id_break;
      Object var4 = var3.id_class(ryW_2.id_throw);
      if (!(var4 instanceof jb_3)) {
         return null;
      } else {
         if (((jW_2)var4).id_byte() == null) {
            var4 = new jb_3(var3);
         }

         if (!rrxr_3.GA.id_protected()) {
            rrbb_3.id_protected("Field not found: TileEntityLecternRenderer.modelBook");
            return null;
         } else {
            rrxr_3.id_class(var4, rrxr_3.GA, var1);
            return (rrMa_1)var4;
         }
      }
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof tm_3 var3)) {
         return null;
      } else if (var2.equals("cover_right")) {
         return (Iq_1)rrxr_3.St.id_class(var3, 0);
      } else if (var2.equals("cover_left")) {
         return (Iq_1)rrxr_3.St.id_class(var3, 1);
      } else if (var2.equals("pages_right")) {
         return (Iq_1)rrxr_3.St.id_class(var3, 2);
      } else if (var2.equals("pages_left")) {
         return (Iq_1)rrxr_3.St.id_class(var3, 3);
      } else if (var2.equals("flipping_page_right")) {
         return (Iq_1)rrxr_3.St.id_class(var3, 4);
      } else if (var2.equals("flipping_page_left")) {
         return (Iq_1)rrxr_3.St.id_class(var3, 5);
      } else {
         return var2.equals("book_spine") ? (Iq_1)rrxr_3.St.id_class(var3, 6) : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new tm_3();
   }

   @Override
   public String[] id_case() {
      return new String[]{"cover_right", "cover_left", "pages_right", "pages_left", "flipping_page_right", "flipping_page_left", "book_spine"};
   }
}
