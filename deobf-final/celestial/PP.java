package celestial;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;

public interface PP {
   PP a_ = new PB();
   QY b_ = QY.instanceof_();

   default void byte_(String var1) {
      if ((Boolean)C_throws.break_().Pp.class_[0]) {
         this.c_(var1, false);
      }
   }

   default void byte_(String var1, boolean var2) {
      if ((Boolean)C_throws.break_().rX.class_[0]) {
         this.b_(var1, var2);
      }
   }

   default void class_(rVi_1... var1) {
      this.class_((Boolean)C_throws.break_().ro.class_[0], var1);
   }

   default void class_(String var1, rgF_2 var2, boolean var3) {
      Stream.of(var1.split("\n")).forEach(var3x -> {
         rVe_1 var4 = new rVe_1(var3x.replace("\t", "    "));
         var4.class_(var4.class_().class_(var2));
         this.class_(var3, var4);
      });
   }

   default void class_(String var1, rgF_2 var2) {
      this.class_(var1, var2, (Boolean)C_throws.break_().ro.class_[0]);
   }

   default void class_(boolean var1, rVi_1... var2) {
      rVe_1 var3 = new rVe_1("");
      var3.class_(throws_(var3.getString()));
      Arrays.asList(var2).forEach(var3::class_);
      if (var1) {
         this.class_(throws_(var3.getString()), var3);
      } else {
         b_.execute(() -> ((Consumer)C_throws.break_().implements_.class_[0]).accept(var3));
      }
   }

   default void class_(rgP_2 var1, rgP_2 var2) {
   }

   static rgP_2 throws_(String var0) {
      return rrfu_3.break_(var0).break_();
   }

   default void catch_(String var1) {
      this.b_(var1, false);
   }

   default void case_(String var1) {
      this.c_(var1, (Boolean)C_throws.break_().ro.class_[0]);
   }

   default void protected_(String var1) {
      this.byte_(var1, false);
   }

   default void c_(String var1, boolean var2) {
      this.class_(var1, rgF_2.GRAY, var2);
   }

   default void b_(String var1, boolean var2) {
      b_.execute(() -> ((BiConsumer)C_throws.break_().Pu.class_[0]).accept(var1, var2));
   }
}
