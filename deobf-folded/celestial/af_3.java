package celestial;

import com.google.common.collect.ImmutableSet;

public class af_3<T extends an_3> {
   private final aj_3<T> id_class;
   private final aH_2 id_break;
   private ImmutableSet<xd_3> id_byte = ImmutableSet.of();
   private boolean id_protected = true;
   private boolean id_throws = true;
   private boolean id_case;
   private boolean id_catch;
   private int id_private = 5;
   private int id_implements = 3;
   private ap_3 id_finally = ap_3.id_break(0.6F, 1.8F);

   public af_3<T> id_byte() {
      this.id_case = true;
      return this;
   }

   private af_3(aj_3<T> var1, aH_2 var2) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_catch = var2 == aH_2.CREATURE || var2 == aH_2.MISC;
   }

   public static <T extends an_3> af_3<T> id_class(aj_3<T> var0, aH_2 var1) {
      return new af_3<>(var0, var1);
   }

   public af_3<T> id_class(xd_3... var1) {
      this.id_byte = ImmutableSet.copyOf(var1);
      return this;
   }

   public af_3<T> id_class(int var1) {
      this.id_private = var1;
      return this;
   }

   public aI_2<T> id_class(String var1) {
      if (this.id_protected) {
         rqR_2.id_class(rTC.id_package, var1);
      }

      return new aI_2<>(
         this.id_class,
         this.id_break,
         this.id_protected,
         this.id_throws,
         this.id_case,
         this.id_catch,
         this.id_byte,
         this.id_finally,
         this.id_private,
         this.id_implements
      );
   }

   public af_3<T> id_class(float var1, float var2) {
      this.id_finally = ap_3.id_break(var1, var2);
      return this;
   }

   public af_3<T> id_class() {
      this.id_throws = false;
      return this;
   }

   public static <T extends an_3> af_3<T> id_class(aH_2 var0) {
      return new af_3<>((var0x, var1) -> null, var0);
   }

   public af_3<T> id_break() {
      this.id_protected = false;
      return this;
   }

   public af_3<T> id_break(int var1) {
      this.id_implements = var1;
      return this;
   }

   public af_3<T> id_protected() {
      this.id_catch = true;
      return this;
   }
}
