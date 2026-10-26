package celestial;

import com.google.common.collect.ImmutableList;

public final class Ha_1 {
   final HR id_class;
   private final Ho_1 id_break;
   private final Hp_1 id_byte;
   private final HV id_protected;
   private final HC id_throws;
   private final Hy_1 id_case;
   final HH id_catch;
   private final Ht_1 id_private;
   private final Hf_1 id_implements;
   private final Hq_1 id_finally;
   private final HT id_extends;
   private final Hg_1 id_native;
   private final HY id_volatile;
   private final HK id_final;
   private final Hw_1 id_package;
   final He_1 id_int;
   final ImmutableList<Hn_1> id_new;

   Ha_1(
      HR var1,
      Ho_1 var2,
      Hp_1 var3,
      HV var4,
      HC var5,
      Hy_1 var6,
      HH var7,
      Ht_1 var8,
      Hf_1 var9,
      Hq_1 var10,
      HT var11,
      Hg_1 var12,
      HY var13,
      HK var14,
      Hw_1 var15,
      He_1 var16
   ) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
      this.id_private = var8;
      this.id_implements = var9;
      this.id_finally = var10;
      this.id_extends = var11;
      this.id_native = var12;
      this.id_volatile = var13;
      this.id_final = var14;
      this.id_package = var15;
      this.id_int = var16;
      this.id_new = ImmutableList.of(
         this.id_class,
         this.id_break,
         this.id_byte,
         this.id_protected,
         this.id_throws,
         this.id_case,
         this.id_catch,
         this.id_private,
         this.id_implements,
         this.id_finally,
         this.id_extends,
         this.id_native,
         new Hn_1[]{this.id_volatile, this.id_final, this.id_package}
      );
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Ha_1 var2 = (Ha_1)var1;
         return this.id_int == var2.id_int && this.id_new.equals(var2.id_new);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "CompositeState[" + this.id_new + ", outlineProperty=" + this.id_int + "]";
   }

   @Override
   public int hashCode() {
      return rrWX.id_class(this.id_new, this.id_int);
   }

   public static Hi_1 id_class() {
      return new Hi_1();
   }

   public Hi_1 id_break() {
      Hi_1 var1 = new Hi_1();
      var1.id_class(this.id_class);
      var1.id_class(this.id_break);
      var1.id_class(this.id_byte);
      var1.id_class(this.id_protected);
      var1.id_class(this.id_throws);
      var1.id_class(this.id_case);
      var1.id_class(this.id_catch);
      var1.id_class(this.id_private);
      var1.id_class(this.id_implements);
      var1.id_class(this.id_finally);
      var1.id_class(this.id_extends);
      var1.id_class(this.id_native);
      var1.id_class(this.id_volatile);
      var1.id_class(this.id_final);
      var1.id_class(this.id_package);
      return var1;
   }
}
