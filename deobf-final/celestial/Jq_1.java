package celestial;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Jq_1 {
   QP class_;
   Function<xc_3, QS> break_;
   boolean byte_ = true;
   zr_3 protected_ = zr_3.throws_;
   ToIntFunction<xc_3> throws_ = var0 -> 0;
   float case_;
   float catch_;
   boolean private_;
   boolean implements_;
   float finally_ = 0.6F;
   float extends_ = 1.0F;
   float native_ = 1.0F;
   rqO_2 volatile_;
   boolean final_ = true;
   boolean package_;
   JH<aI_2<?>> int_ = (var0, var1x, var2x, var3) -> var0.protected_(var1x, var2x, rpr_3.UP) && var0.case_() < 14;
   Jy_1 new_ = (var0, var1x, var2x) -> var0.byte_().case_() && var0.new_(var1x, var2x);
   Jy_1 continue_ = (var1x, var2x, var3) -> this.class_.byte_() && var1x.new_(var2x, var3);
   Jy_1 super_ = this.continue_;
   Jy_1 this_ = (var0, var1x, var2x) -> false;
   Jy_1 else_ = (var0, var1x, var2x) -> false;
   boolean synchronized_;

   public Jq_1 byte_(float var1) {
      this.native_ = var1;
      return this;
   }

   public Jq_1 byte_(Jy_1 var1) {
      this.super_ = var1;
      return this;
   }

   public Jq_1 byte_() {
      return this.protected_(0.0F);
   }

   private Jq_1(QP var1, QS var2) {
      this(var1, var1x -> var2);
   }

   private Jq_1(QP var1, Function<xc_3, QS> var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public Jq_1 class_(xd_3 var1) {
      this.volatile_ = var1.throws_();
      return this;
   }

   public Jq_1 class_(float var1, float var2) {
      this.catch_ = var1;
      this.case_ = Math.max(0.0F, var2);
      return this;
   }

   public Jq_1 class_(Jy_1 var1) {
      this.new_ = var1;
      return this;
   }

   public Jq_1 class_(JH<aI_2<?>> var1) {
      this.int_ = var1;
      return this;
   }

   public static Jq_1 class_(QP var0, Function<xc_3, QS> var1) {
      return new Jq_1(var0, var1);
   }

   public static Jq_1 class_(JA var0) {
      Jq_1 var1 = new Jq_1(var0.break_, var0.extends_.break_);
      var1.class_ = var0.extends_.class_;
      var1.catch_ = var0.extends_.catch_;
      var1.case_ = var0.extends_.case_;
      var1.byte_ = var0.extends_.byte_;
      var1.implements_ = var0.extends_.implements_;
      var1.throws_ = var0.extends_.throws_;
      var1.break_ = var0.extends_.break_;
      var1.protected_ = var0.extends_.protected_;
      var1.finally_ = var0.extends_.finally_;
      var1.extends_ = var0.extends_.extends_;
      var1.synchronized_ = var0.extends_.synchronized_;
      var1.final_ = var0.extends_.final_;
      var1.package_ = var0.extends_.package_;
      var1.private_ = var0.extends_.private_;
      return var1;
   }

   public Jq_1 class_() {
      this.byte_ = false;
      this.final_ = false;
      return this;
   }

   public Jq_1 class_(float var1) {
      this.finally_ = var1;
      return this;
   }

   public static Jq_1 class_(QP var0, QS var1) {
      return new Jq_1(var0, var1);
   }

   public static Jq_1 class_(QP var0, rxL_2 var1) {
      return class_(var0, var1.throws_());
   }

   public static Jq_1 class_(QP var0) {
      return class_(var0, var0.private_());
   }

   public Jq_1 class_(ToIntFunction<xc_3> var1) {
      this.throws_ = var1;
      return this;
   }

   public Jq_1 class_(zr_3 var1) {
      this.protected_ = var1;
      return this;
   }

   public Jq_1 break_(Jy_1 var1) {
      this.continue_ = var1;
      return this;
   }

   public Jq_1 break_() {
      this.final_ = false;
      return this;
   }

   public Jq_1 break_(float var1) {
      this.extends_ = var1;
      return this;
   }

   public Jq_1 throws_() {
      this.synchronized_ = true;
      return this;
   }

   public Jq_1 throws_(Jy_1 var1) {
      this.else_ = var1;
      return this;
   }

   public Jq_1 catch_() {
      this.package_ = true;
      return this;
   }

   public Jq_1 case_() {
      this.volatile_ = rzl_3.class_;
      return this;
   }

   public Jq_1 protected_(Jy_1 var1) {
      this.this_ = var1;
      return this;
   }

   public Jq_1 protected_(float var1) {
      this.class_(var1, var1);
      return this;
   }

   public Jq_1 protected_() {
      this.implements_ = true;
      return this;
   }

   public Jq_1 private_() {
      this.private_ = true;
      return this;
   }
}
