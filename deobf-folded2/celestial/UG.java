package celestial;

import java.util.function.Consumer;

public class UG {
   private final rdb_3 id_class;
   private final rkg_3 id_break;
   private final int id_byte;
   private final Ot_1 id_protected = Ot_1.id_class();
   private String id_throws;
   private final rkf_3<?> id_case;

   public UG(rkf_3<?> var1, rkg_3 var2, rpL_2 var3, int var4) {
      this.id_case = var1;
      this.id_class = var3.id_case();
      this.id_break = var2;
      this.id_byte = var4;
   }

   public void id_class(Consumer<Dw_1> var1, String var2) {
      rqO_2 var3 = rVL.id_for.id_break(this.id_class);
      if (new rqO_2(var2).equals(var3)) {
         throw new IllegalStateException("Single Item Recipe " + var2 + " should remove its 'save' argument");
      } else {
         this.id_class(var1, new rqO_2(var2));
      }
   }

   public void id_class(Consumer<Dw_1> var1, rqO_2 var2) {
      this.id_class(var2);
      this.id_protected.id_class(new rqO_2("recipes/root")).id_class("has_the_recipe", XD.id_class(var2)).id_class(OR.id_class(var2)).id_class(hS_2.id_break);
      var1.accept(
         new Ub_1(
            var2,
            this.id_case,
            this.id_throws == null ? "" : this.id_throws,
            this.id_break,
            this.id_class,
            this.id_byte,
            this.id_protected,
            new rqO_2(var2.id_byte(), "recipes/" + this.id_class.id_new().id_break() + "/" + var2.id_break())
         )
      );
   }

   private void id_class(rqO_2 var1) {
      if (this.id_protected.id_byte().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1);
      }
   }

   public UG id_class(String var1, hr_3 var2) {
      this.id_protected.id_class(var1, var2);
      return this;
   }

   public static UG id_class(rkg_3 var0, rpL_2 var1, int var2) {
      return new UG(rkf_3.id_this, var0, var1, var2);
   }

   public static UG id_class(rkg_3 var0, rpL_2 var1) {
      return new UG(rkf_3.id_this, var0, var1, 1);
   }
}
