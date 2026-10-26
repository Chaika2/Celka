package celestial;

import java.util.function.Consumer;

public class DZ {
   private final rdb_3 id_class;
   private final rkg_3 id_break;
   private final float id_byte;
   private final int id_protected;
   private final Ot_1 id_throws = Ot_1.id_class();
   private String id_case;
   private final rkl_3<?> id_catch;

   private DZ(rpL_2 var1, rkg_3 var2, float var3, int var4, rkl_3<?> var5) {
      this.id_class = var1.id_case();
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_catch = var5;
   }

   public void id_class(Consumer<Dw_1> var1) {
      this.id_class(var1, rVL.id_for.id_break(this.id_class));
   }

   public void id_class(Consumer<Dw_1> var1, String var2) {
      rqO_2 var3 = rVL.id_for.id_break(this.id_class);
      rqO_2 var4 = new rqO_2(var2);
      if (var4.equals(var3)) {
         throw new IllegalStateException("Recipe " + var4 + " should remove its 'save' argument");
      } else {
         this.id_class(var1, var4);
      }
   }

   public void id_class(Consumer<Dw_1> var1, rqO_2 var2) {
      this.id_class(var2);
      this.id_throws.id_class(new rqO_2("recipes/root")).id_class("has_the_recipe", XD.id_class(var2)).id_class(OR.id_class(var2)).id_class(hS_2.id_break);
      var1.accept(
         new Dv_1(
            var2,
            this.id_case == null ? "" : this.id_case,
            this.id_break,
            this.id_class,
            this.id_byte,
            this.id_protected,
            this.id_throws,
            new rqO_2(var2.id_byte(), "recipes/" + this.id_class.id_new().id_break() + "/" + var2.id_break()),
            (rkf_3<? extends rkv_3>)this.id_catch
         )
      );
   }

   private void id_class(rqO_2 var1) {
      if (this.id_throws.id_byte().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1);
      }
   }

   public static DZ id_class(rkg_3 var0, rpL_2 var1, float var2, int var3, rkl_3<?> var4) {
      return new DZ(var1, var0, var2, var3, var4);
   }

   public static DZ id_class(rkg_3 var0, rpL_2 var1, float var2, int var3) {
      return id_class(var0, var1, var2, var3, rkf_3.id_new);
   }

   public DZ id_class(String var1, hr_3 var2) {
      this.id_throws.id_class(var1, var2);
      return this;
   }

   public static DZ id_break(rkg_3 var0, rpL_2 var1, float var2, int var3) {
      return id_class(var0, var1, var2, var3, rkf_3.id_int);
   }
}
