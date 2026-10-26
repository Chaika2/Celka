package celestial;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Jq_1 {
   QP id_class;
   Function<xc_3, QS> id_break;
   boolean id_byte = true;
   zr_3 id_protected = zr_3.id_throws;
   ToIntFunction<xc_3> id_throws = var0 -> 0;
   float id_case;
   float id_catch;
   boolean id_private;
   boolean id_implements;
   float id_finally = 0.6F;
   float id_extends = 1.0F;
   float id_native = 1.0F;
   rqO_2 id_volatile;
   boolean id_final = true;
   boolean id_package;
   JH<aI_2<?>> id_int = (var0, var1x, var2x, var3) -> var0.id_protected(var1x, var2x, rpr_3.UP) && var0.id_case() < 14;
   Jy_1 id_new = (var0, var1x, var2x) -> var0.id_byte().id_case() && var0.id_new(var1x, var2x);
   Jy_1 id_continue = (var1x, var2x, var3) -> this.id_class.id_byte() && var1x.id_new(var2x, var3);
   Jy_1 id_super = this.id_continue;
   Jy_1 id_this = (var0, var1x, var2x) -> false;
   Jy_1 id_else = (var0, var1x, var2x) -> false;
   boolean id_synchronized;

   public Jq_1 id_byte(float var1) {
      this.id_native = var1;
      return this;
   }

   public Jq_1 id_byte(Jy_1 var1) {
      this.id_super = var1;
      return this;
   }

   public Jq_1 id_byte() {
      return this.id_protected(0.0F);
   }

   private Jq_1(QP var1, QS var2) {
      this(var1, var1x -> var2);
   }

   private Jq_1(QP var1, Function<xc_3, QS> var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public Jq_1 id_class(xd_3 var1) {
      this.id_volatile = var1.id_throws();
      return this;
   }

   public Jq_1 id_class(float var1, float var2) {
      this.id_catch = var1;
      this.id_case = Math.max(0.0F, var2);
      return this;
   }

   public Jq_1 id_class(Jy_1 var1) {
      this.id_new = var1;
      return this;
   }

   public Jq_1 id_class(JH<aI_2<?>> var1) {
      this.id_int = var1;
      return this;
   }

   public static Jq_1 id_class(QP var0, Function<xc_3, QS> var1) {
      return new Jq_1(var0, var1);
   }

   public static Jq_1 id_class(JA var0) {
      Jq_1 var1 = new Jq_1(var0.id_break, var0.id_extends.id_break);
      var1.id_class = var0.id_extends.id_class;
      var1.id_catch = var0.id_extends.id_catch;
      var1.id_case = var0.id_extends.id_case;
      var1.id_byte = var0.id_extends.id_byte;
      var1.id_implements = var0.id_extends.id_implements;
      var1.id_throws = var0.id_extends.id_throws;
      var1.id_break = var0.id_extends.id_break;
      var1.id_protected = var0.id_extends.id_protected;
      var1.id_finally = var0.id_extends.id_finally;
      var1.id_extends = var0.id_extends.id_extends;
      var1.id_synchronized = var0.id_extends.id_synchronized;
      var1.id_final = var0.id_extends.id_final;
      var1.id_package = var0.id_extends.id_package;
      var1.id_private = var0.id_extends.id_private;
      return var1;
   }

   public Jq_1 id_class() {
      this.id_byte = false;
      this.id_final = false;
      return this;
   }

   public Jq_1 id_class(float var1) {
      this.id_finally = var1;
      return this;
   }

   public static Jq_1 id_class(QP var0, QS var1) {
      return new Jq_1(var0, var1);
   }

   public static Jq_1 id_class(QP var0, rxL_2 var1) {
      return id_class(var0, var1.id_throws());
   }

   public static Jq_1 id_class(QP var0) {
      return id_class(var0, var0.id_private());
   }

   public Jq_1 id_class(ToIntFunction<xc_3> var1) {
      this.id_throws = var1;
      return this;
   }

   public Jq_1 id_class(zr_3 var1) {
      this.id_protected = var1;
      return this;
   }

   public Jq_1 id_break(Jy_1 var1) {
      this.id_continue = var1;
      return this;
   }

   public Jq_1 id_break() {
      this.id_final = false;
      return this;
   }

   public Jq_1 id_break(float var1) {
      this.id_extends = var1;
      return this;
   }

   public Jq_1 id_throws() {
      this.id_synchronized = true;
      return this;
   }

   public Jq_1 id_throws(Jy_1 var1) {
      this.id_else = var1;
      return this;
   }

   public Jq_1 id_catch() {
      this.id_package = true;
      return this;
   }

   public Jq_1 id_case() {
      this.id_volatile = rzl_3.id_class;
      return this;
   }

   public Jq_1 id_protected(Jy_1 var1) {
      this.id_this = var1;
      return this;
   }

   public Jq_1 id_protected(float var1) {
      this.id_class(var1, var1);
      return this;
   }

   public Jq_1 id_protected() {
      this.id_implements = true;
      return this;
   }

   public Jq_1 id_private() {
      this.id_private = true;
      return this;
   }
}
