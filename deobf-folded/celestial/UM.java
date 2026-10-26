package celestial;

import java.util.function.Consumer;

public class UM {
   private final rkg_3 id_class;
   private final rkg_3 id_break;
   private final rdb_3 id_byte;
   private final Ot_1 id_protected = Ot_1.id_class();
   private final rkf_3<?> id_throws;

   public UM(rkf_3<?> var1, rkg_3 var2, rkg_3 var3, rdb_3 var4) {
      this.id_throws = var1;
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
   }

   public void id_class(Consumer<Dw_1> var1, String var2) {
      this.id_class(var1, new rqO_2(var2));
   }

   public void id_class(Consumer<Dw_1> var1, rqO_2 var2) {
      this.id_class(var2);
      this.id_protected.id_class(new rqO_2("recipes/root")).id_class("has_the_recipe", XD.id_class(var2)).id_class(OR.id_class(var2)).id_class(hS_2.id_break);
      var1.accept(
         new UO(
            var2,
            this.id_throws,
            this.id_class,
            this.id_break,
            this.id_byte,
            this.id_protected,
            new rqO_2(var2.id_byte(), "recipes/" + this.id_byte.id_new().id_break() + "/" + var2.id_break())
         )
      );
   }

   private void id_class(rqO_2 var1) {
      if (this.id_protected.id_byte().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1);
      }
   }

   public UM id_class(String var1, hr_3 var2) {
      this.id_protected.id_class(var1, var2);
      return this;
   }

   public static UM id_class(rkg_3 var0, rkg_3 var1, rdb_3 var2) {
      return new UM(rkf_3.id_else, var0, var1, var2);
   }
}
