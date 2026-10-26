package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Us_1 {
   private static final Logger id_class = LogManager.getLogger();
   private final rdb_3 id_break;
   private final int id_byte;
   private final List<rkg_3> id_protected = Lists.newArrayList();
   private final Ot_1 id_throws = Ot_1.id_class();
   private String id_case;

   public Us_1(rpL_2 var1, int var2) {
      this.id_break = var1.id_case();
      this.id_byte = var2;
   }

   public void id_class(Consumer<Dw_1> var1, String var2) {
      rqO_2 var3 = rVL.id_for.id_break(this.id_break);
      if (new rqO_2(var2).equals(var3)) {
         throw new IllegalStateException("Shapeless Recipe " + var2 + " should remove its 'save' argument");
      } else {
         this.id_class(var1, new rqO_2(var2));
      }
   }

   public void id_class(Consumer<Dw_1> var1) {
      this.id_class(var1, rVL.id_for.id_break(this.id_break));
   }

   public Us_1 id_class(String var1) {
      this.id_case = var1;
      return this;
   }

   public Us_1 id_class(String var1, hr_3 var2) {
      this.id_throws.id_class(var1, var2);
      return this;
   }

   public void id_class(Consumer<Dw_1> var1, rqO_2 var2) {
      this.id_class(var2);
      this.id_throws.id_class(new rqO_2("recipes/root")).id_class("has_the_recipe", XD.id_class(var2)).id_class(OR.id_class(var2)).id_class(hS_2.id_break);
      var1.accept(
         new UE(
            var2,
            this.id_break,
            this.id_byte,
            this.id_case == null ? "" : this.id_case,
            this.id_protected,
            this.id_throws,
            new rqO_2(var2.id_byte(), "recipes/" + this.id_break.id_new().id_break() + "/" + var2.id_break())
         )
      );
   }

   private void id_class(rqO_2 var1) {
      if (this.id_throws.id_byte().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1);
      }
   }

   public Us_1 id_class(rkg_3 var1, int var2) {
      for (int var3 = 0; var3 < var2; var3++) {
         this.id_protected.add(var1);
      }

      return this;
   }

   public Us_1 id_class(rlb_3<rdb_3> var1) {
      return this.id_class(rkg_3.id_class(var1));
   }

   public static Us_1 id_class(rpL_2 var0, int var1) {
      return new Us_1(var0, var1);
   }

   public static Us_1 id_class(rpL_2 var0) {
      return new Us_1(var0, 1);
   }

   public Us_1 id_class(rkg_3 var1) {
      return this.id_class(var1, 1);
   }

   public Us_1 id_break(rpL_2 var1) {
      return this.id_break(var1, 1);
   }

   public Us_1 id_break(rpL_2 var1, int var2) {
      for (int var3 = 0; var3 < var2; var3++) {
         this.id_class(rkg_3.id_class(var1));
      }

      return this;
   }
}
