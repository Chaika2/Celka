package celestial;

import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import java.util.function.Supplier;
import org.apache.commons.lang3.tuple.Triple;

public final class rjo_3 {
   private final rjV_2 class_;
   private boolean break_;
   private rje_3 byte_;
   private rjY_2 protected_;
   private rje_3 throws_;
   private rjY_2 case_;
   private static final rjo_3 catch_ = rqR_2.class_((Supplier<rjo_3>)(() -> {
      rjV_2 var0 = new rjV_2();
      var0.class_();
      rjo_3 var1 = new rjo_3(var0);
      var1.protected_();
      return var1;
   }));

   public rjV_2 byte_() {
      return this.class_.case_();
   }

   public rjo_3(rjV_2 var1) {
      if (var1 == null) {
         this.class_ = catch_.class_;
      } else {
         this.class_ = var1;
      }
   }

   public rjo_3(rje_3 var1, rjY_2 var2, rje_3 var3, rjY_2 var4) {
      this.class_ = class_(var1, var2, var3, var4);
      this.byte_ = var1 != null ? var1 : new rje_3();
      this.protected_ = var2 != null ? var2 : rjY_2.class_.catch_();
      this.throws_ = var3 != null ? var3 : new rje_3(1.0F, 1.0F, 1.0F);
      this.case_ = var4 != null ? var4 : rjY_2.class_.catch_();
      this.break_ = true;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rjo_3 var2 = (rjo_3)var1;
         return Objects.equals(this.class_, var2.class_);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.class_);
   }

   public static rjo_3 class_() {
      return catch_;
   }

   public static Pair<rjj_3, rje_3> class_(rjV_2 var0) {
      var0.class_(1.0F / var0.int_);
      rje_3 var1 = new rje_3(var0.protected_, var0.private_, var0.native_);
      rjj_3 var2 = new rjj_3(var0);
      return Pair.of(var2, var1);
   }

   public rjo_3 class_(rjo_3 var1) {
      rjV_2 var2 = this.byte_();
      var2.class_(var1.byte_());
      return new rjo_3(var2);
   }

   private static rjV_2 class_(rje_3 var0, rjY_2 var1, rje_3 var2, rjY_2 var3) {
      rjV_2 var4 = new rjV_2();
      var4.class_();
      if (var1 != null) {
         var4.class_(new rjV_2(var1));
      }

      if (var2 != null) {
         var4.class_(rjV_2.throws_(var2.class_(), var2.break_(), var2.byte_()));
      }

      if (var3 != null) {
         var4.class_(new rjV_2(var3));
      }

      if (var0 != null) {
         var4.protected_ = var0.class_();
         var4.private_ = var0.break_();
         var4.native_ = var0.byte_();
      }

      return var4;
   }

   public rjo_3 break_() {
      if (this == catch_) {
         return this;
      } else {
         rjV_2 var1 = this.byte_();
         return var1.throws_() ? new rjo_3(var1) : null;
      }
   }

   private void throws_() {
      if (!this.break_) {
         Pair var1 = class_(this.class_);
         Triple var2 = ((rjj_3)var1.getFirst()).break_();
         this.byte_ = (rje_3)var1.getSecond();
         this.protected_ = (rjY_2)var2.getLeft();
         this.throws_ = (rje_3)var2.getMiddle();
         this.case_ = (rjY_2)var2.getRight();
         this.break_ = true;
      }
   }

   public rjY_2 protected_() {
      this.throws_();
      return this.protected_.catch_();
   }
}
