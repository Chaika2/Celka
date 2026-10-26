package celestial;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;

public interface PP {
   PP a_ = new PB();
   QY b_ = QY.id_instanceof();

   default void id_byte(String var1) {
      if ((Boolean)C_throws.id_break().Pp.id_class[0]) {
         this.c_(var1, false);
      }
   }

   default void id_byte(String var1, boolean var2) {
      if ((Boolean)C_throws.id_break().rX.id_class[0]) {
         this.b_(var1, var2);
      }
   }

   default void id_class(rVi_1... var1) {
      this.id_class((Boolean)C_throws.id_break().ro.id_class[0], var1);
   }

   default void id_class(String var1, rgF_2 var2, boolean var3) {
      Stream.of(var1.split("\n")).forEach(var3x -> {
         rVe_1 var4 = new rVe_1(var3x.replace("\t", "    "));
         var4.id_class(var4.id_class().id_class(var2));
         this.id_class(var3, var4);
      });
   }

   default void id_class(String var1, rgF_2 var2) {
      this.id_class(var1, var2, (Boolean)C_throws.id_break().ro.id_class[0]);
   }

   default void id_class(boolean var1, rVi_1... var2) {
      rVe_1 var3 = new rVe_1("");
      var3.id_class(id_throws(var3.getString()));
      Arrays.asList(var2).forEach(var3::id_class);
      if (var1) {
         this.id_class(id_throws(var3.getString()), var3);
      } else {
         b_.execute(() -> ((Consumer)C_throws.id_break().id_implements.id_class[0]).accept(var3));
      }
   }

   default void id_class(rgP_2 var1, rgP_2 var2) {
   }

   static rgP_2 id_throws(String var0) {
      return rrfu_3.id_break(var0).id_break();
   }

   default void id_catch(String var1) {
      this.b_(var1, false);
   }

   default void id_case(String var1) {
      this.c_(var1, (Boolean)C_throws.id_break().ro.id_class[0]);
   }

   default void id_protected(String var1) {
      this.id_byte(var1, false);
   }

   default void c_(String var1, boolean var2) {
      this.id_class(var1, rgF_2.GRAY, var2);
   }

   default void b_(String var1, boolean var2) {
      b_.execute(() -> ((BiConsumer)C_throws.id_break().Pu.id_class[0]).accept(var1, var2));
   }
}
