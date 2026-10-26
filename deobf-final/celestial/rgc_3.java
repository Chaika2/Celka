package celestial;

import java.util.Objects;

public class rgc_3 {
   public static final rgc_3 class_ = new rgc_3(
      (rVa_1)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (rgl_3)null, (rgy_3)null, (String)null, (rqO_2)null
   );
   public static final rqO_2 break_ = new rqO_2("minecraft", "default");
   final rVa_1 byte_;
   final Boolean protected_;
   final Boolean throws_;
   final Boolean case_;
   final Boolean catch_;
   final Boolean private_;
   final rgl_3 implements_;
   final rgy_3 finally_;
   final String extends_;
   final rqO_2 native_;

   public rgc_3 byte_(Boolean var1) {
      return new rgc_3(
         this.byte_, this.protected_, this.throws_, var1, this.catch_, this.private_, this.implements_, this.finally_, this.extends_, this.native_
      );
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public rgc_3 byte_(rgF_2 var1) {
      rVa_1 var2 = this.byte_;
      Boolean var3 = this.protected_;
      Boolean var4 = this.throws_;
      Boolean var5 = this.catch_;
      Boolean var6 = this.case_;
      Boolean var7 = this.private_;
      switch (var1) {
         case OBFUSCATED:
            var7 = true;
            break;
         case BOLD:
            var3 = true;
            break;
         case STRIKETHROUGH:
            var5 = true;
            break;
         case UNDERLINE:
            var6 = true;
            break;
         case ITALIC:
            var4 = true;
            break;
         case RESET:
            return class_;
         default:
            var7 = false;
            var3 = false;
            var5 = false;
            var6 = false;
            var4 = false;
            var2 = rVa_1.class_(var1);
      }

      return new rgc_3(var2, var3, var4, var6, var5, var7, this.implements_, this.finally_, this.extends_, this.native_);
   }

   public boolean byte_() {
      return this.throws_ == Boolean.TRUE;
   }

   rgc_3(rVa_1 var1, Boolean var2, Boolean var3, Boolean var4, Boolean var5, Boolean var6, rgl_3 var7, rgy_3 var8, String var9, rqO_2 var10) {
      this.byte_ = var1;
      this.protected_ = var2;
      this.throws_ = var3;
      this.case_ = var4;
      this.catch_ = var5;
      this.private_ = var6;
      this.implements_ = var7;
      this.finally_ = var8;
      this.extends_ = var9;
      this.native_ = var10;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgc_3 var2)
            ? false
            : this.break_() == var2.break_()
               && Objects.equals(this.class_(), var2.class_())
               && this.byte_() == var2.byte_()
               && this.case_() == var2.case_()
               && this.protected_() == var2.protected_()
               && this.throws_() == var2.throws_()
               && Objects.equals(this.private_(), var2.private_())
               && Objects.equals(this.implements_(), var2.implements_())
               && Objects.equals(this.finally_(), var2.finally_())
               && Objects.equals(this.extends_(), var2.extends_());
      }
   }

   @Override
   public String toString() {
      return "Style{ color="
         + this.byte_
         + ", bold="
         + this.protected_
         + ", italic="
         + this.throws_
         + ", underlined="
         + this.case_
         + ", strikethrough="
         + this.catch_
         + ", obfuscated="
         + this.private_
         + ", clickEvent="
         + this.private_()
         + ", hoverEvent="
         + this.implements_()
         + ", insertion="
         + this.finally_()
         + ", font="
         + this.extends_()
         + "}";
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.byte_, this.protected_, this.throws_, this.case_, this.catch_, this.private_, this.implements_, this.finally_, this.extends_);
   }

   public rgc_3 class_(rqO_2 var1) {
      return new rgc_3(this.byte_, this.protected_, this.throws_, this.case_, this.catch_, this.private_, this.implements_, this.finally_, this.extends_, var1);
   }

   public rgc_3 class_(String var1) {
      return new rgc_3(this.byte_, this.protected_, this.throws_, this.case_, this.catch_, this.private_, this.implements_, this.finally_, var1, this.native_);
   }

   public rgc_3 class_(rgy_3 var1) {
      return new rgc_3(this.byte_, this.protected_, this.throws_, this.case_, this.catch_, this.private_, this.implements_, var1, this.extends_, this.native_);
   }

   public rgc_3 class_(Boolean var1) {
      return new rgc_3(this.byte_, var1, this.throws_, this.case_, this.catch_, this.private_, this.implements_, this.finally_, this.extends_, this.native_);
   }

   public rVa_1 class_() {
      return this.byte_;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public rgc_3 class_(rgF_2... var1) {
      rVa_1 var2 = this.byte_;
      Boolean var3 = this.protected_;
      Boolean var4 = this.throws_;
      Boolean var5 = this.catch_;
      Boolean var6 = this.case_;
      Boolean var7 = this.private_;

      for (rgF_2 var11 : var1) {
         switch (var11) {
            case OBFUSCATED:
               var7 = true;
               break;
            case BOLD:
               var3 = true;
               break;
            case STRIKETHROUGH:
               var5 = true;
               break;
            case UNDERLINE:
               var6 = true;
               break;
            case ITALIC:
               var4 = true;
               break;
            case RESET:
               return class_;
            default:
               var2 = rVa_1.class_(var11);
         }
      }

      return new rgc_3(var2, var3, var4, var6, var5, var7, this.implements_, this.finally_, this.extends_, this.native_);
   }

   public rgc_3 class_(rgc_3 var1) {
      if (this == class_) {
         return var1;
      } else {
         return var1 == class_
            ? this
            : new rgc_3(
               this.byte_ != null ? this.byte_ : var1.byte_,
               this.protected_ != null ? this.protected_ : var1.protected_,
               this.throws_ != null ? this.throws_ : var1.throws_,
               this.case_ != null ? this.case_ : var1.case_,
               this.catch_ != null ? this.catch_ : var1.catch_,
               this.private_ != null ? this.private_ : var1.private_,
               this.implements_ != null ? this.implements_ : var1.implements_,
               this.finally_ != null ? this.finally_ : var1.finally_,
               this.extends_ != null ? this.extends_ : var1.extends_,
               this.native_ != null ? this.native_ : var1.native_
            );
      }
   }

   public rgc_3 class_(rVa_1 var1) {
      return new rgc_3(
         var1, this.protected_, this.throws_, this.case_, this.catch_, this.private_, this.implements_, this.finally_, this.extends_, this.native_
      );
   }

   public rgc_3 class_(rgl_3 var1) {
      return new rgc_3(this.byte_, this.protected_, this.throws_, this.case_, this.catch_, this.private_, var1, this.finally_, this.extends_, this.native_);
   }

   public rgc_3 class_(rgF_2 var1) {
      return this.class_(var1 != null ? rVa_1.class_(var1) : null);
   }

   public rgc_3 break_(rgF_2 var1) {
      rVa_1 var2 = this.byte_;
      Boolean var3 = this.protected_;
      Boolean var4 = this.throws_;
      Boolean var5 = this.catch_;
      Boolean var6 = this.case_;
      Boolean var7 = this.private_;
      switch (var1) {
         case OBFUSCATED:
            var7 = true;
            break;
         case BOLD:
            var3 = true;
            break;
         case STRIKETHROUGH:
            var5 = true;
            break;
         case UNDERLINE:
            var6 = true;
            break;
         case ITALIC:
            var4 = true;
            break;
         case RESET:
            return class_;
         default:
            var2 = rVa_1.class_(var1);
      }

      return new rgc_3(var2, var3, var4, var6, var5, var7, this.implements_, this.finally_, this.extends_, this.native_);
   }

   public rgc_3 break_(Boolean var1) {
      return new rgc_3(this.byte_, this.protected_, var1, this.case_, this.catch_, this.private_, this.implements_, this.finally_, this.extends_, this.native_);
   }

   public boolean break_() {
      return this.protected_ == Boolean.TRUE;
   }

   public boolean throws_() {
      return this.case_ == Boolean.TRUE;
   }

   public String finally_() {
      return this.extends_;
   }

   public boolean catch_() {
      return this == class_;
   }

   public rqO_2 extends_() {
      return this.native_ != null ? this.native_ : break_;
   }

   public boolean case_() {
      return this.private_ == Boolean.TRUE;
   }

   public rgy_3 implements_() {
      return this.finally_;
   }

   public boolean protected_() {
      return this.catch_ == Boolean.TRUE;
   }

   public rgl_3 private_() {
      return this.implements_;
   }
}
