package celestial;

import java.util.Objects;

public class rgc_3 {
   public static final rgc_3 id_class = new rgc_3(
      (rVa_1)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (rgl_3)null, (rgy_3)null, (String)null, (rqO_2)null
   );
   public static final rqO_2 id_break = new rqO_2("minecraft", "default");
   final rVa_1 id_byte;
   final Boolean id_protected;
   final Boolean id_throws;
   final Boolean id_case;
   final Boolean id_catch;
   final Boolean id_private;
   final rgl_3 id_implements;
   final rgy_3 id_finally;
   final String id_extends;
   final rqO_2 id_native;

   public rgc_3 id_byte(Boolean var1) {
      return new rgc_3(
         this.id_byte,
         this.id_protected,
         this.id_throws,
         var1,
         this.id_catch,
         this.id_private,
         this.id_implements,
         this.id_finally,
         this.id_extends,
         this.id_native
      );
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public rgc_3 id_byte(rgF_2 var1) {
      rVa_1 var2 = this.id_byte;
      Boolean var3 = this.id_protected;
      Boolean var4 = this.id_throws;
      Boolean var5 = this.id_catch;
      Boolean var6 = this.id_case;
      Boolean var7 = this.id_private;
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
            return id_class;
         default:
            var7 = false;
            var3 = false;
            var5 = false;
            var6 = false;
            var4 = false;
            var2 = rVa_1.id_class(var1);
      }

      return new rgc_3(var2, var3, var4, var6, var5, var7, this.id_implements, this.id_finally, this.id_extends, this.id_native);
   }

   public boolean id_byte() {
      return this.id_throws == Boolean.TRUE;
   }

   rgc_3(rVa_1 var1, Boolean var2, Boolean var3, Boolean var4, Boolean var5, Boolean var6, rgl_3 var7, rgy_3 var8, String var9, rqO_2 var10) {
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_throws = var3;
      this.id_case = var4;
      this.id_catch = var5;
      this.id_private = var6;
      this.id_implements = var7;
      this.id_finally = var8;
      this.id_extends = var9;
      this.id_native = var10;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgc_3 var2)
            ? false
            : this.id_break() == var2.id_break()
               && Objects.equals(this.id_class(), var2.id_class())
               && this.id_byte() == var2.id_byte()
               && this.id_case() == var2.id_case()
               && this.id_protected() == var2.id_protected()
               && this.id_throws() == var2.id_throws()
               && Objects.equals(this.id_private(), var2.id_private())
               && Objects.equals(this.id_implements(), var2.id_implements())
               && Objects.equals(this.id_finally(), var2.id_finally())
               && Objects.equals(this.id_extends(), var2.id_extends());
      }
   }

   @Override
   public String toString() {
      return "Style{ color="
         + this.id_byte
         + ", bold="
         + this.id_protected
         + ", italic="
         + this.id_throws
         + ", underlined="
         + this.id_case
         + ", strikethrough="
         + this.id_catch
         + ", obfuscated="
         + this.id_private
         + ", clickEvent="
         + this.id_private()
         + ", hoverEvent="
         + this.id_implements()
         + ", insertion="
         + this.id_finally()
         + ", font="
         + this.id_extends()
         + "}";
   }

   @Override
   public int hashCode() {
      return Objects.hash(
         this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements, this.id_finally, this.id_extends
      );
   }

   public rgc_3 id_class(rqO_2 var1) {
      return new rgc_3(
         this.id_byte,
         this.id_protected,
         this.id_throws,
         this.id_case,
         this.id_catch,
         this.id_private,
         this.id_implements,
         this.id_finally,
         this.id_extends,
         var1
      );
   }

   public rgc_3 id_class(String var1) {
      return new rgc_3(
         this.id_byte,
         this.id_protected,
         this.id_throws,
         this.id_case,
         this.id_catch,
         this.id_private,
         this.id_implements,
         this.id_finally,
         var1,
         this.id_native
      );
   }

   public rgc_3 id_class(rgy_3 var1) {
      return new rgc_3(
         this.id_byte,
         this.id_protected,
         this.id_throws,
         this.id_case,
         this.id_catch,
         this.id_private,
         this.id_implements,
         var1,
         this.id_extends,
         this.id_native
      );
   }

   public rgc_3 id_class(Boolean var1) {
      return new rgc_3(
         this.id_byte, var1, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements, this.id_finally, this.id_extends, this.id_native
      );
   }

   public rVa_1 id_class() {
      return this.id_byte;
   }

   public rgc_3 id_class(rgF_2... var1) {
      rVa_1 var2 = this.id_byte;
      Boolean var3 = this.id_protected;
      Boolean var4 = this.id_throws;
      Boolean var5 = this.id_catch;
      Boolean var6 = this.id_case;
      Boolean var7 = this.id_private;

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
               return id_class;
            default:
               var2 = rVa_1.id_class(var11);
         }
      }

      return new rgc_3(var2, var3, var4, var6, var5, var7, this.id_implements, this.id_finally, this.id_extends, this.id_native);
   }

   public rgc_3 id_class(rgc_3 var1) {
      if (this == id_class) {
         return var1;
      } else {
         return var1 == id_class
            ? this
            : new rgc_3(
               this.id_byte != null ? this.id_byte : var1.id_byte,
               this.id_protected != null ? this.id_protected : var1.id_protected,
               this.id_throws != null ? this.id_throws : var1.id_throws,
               this.id_case != null ? this.id_case : var1.id_case,
               this.id_catch != null ? this.id_catch : var1.id_catch,
               this.id_private != null ? this.id_private : var1.id_private,
               this.id_implements != null ? this.id_implements : var1.id_implements,
               this.id_finally != null ? this.id_finally : var1.id_finally,
               this.id_extends != null ? this.id_extends : var1.id_extends,
               this.id_native != null ? this.id_native : var1.id_native
            );
      }
   }

   public rgc_3 id_class(rVa_1 var1) {
      return new rgc_3(
         var1,
         this.id_protected,
         this.id_throws,
         this.id_case,
         this.id_catch,
         this.id_private,
         this.id_implements,
         this.id_finally,
         this.id_extends,
         this.id_native
      );
   }

   public rgc_3 id_class(rgl_3 var1) {
      return new rgc_3(
         this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_private, var1, this.id_finally, this.id_extends, this.id_native
      );
   }

   public rgc_3 id_class(rgF_2 var1) {
      return this.id_class(var1 != null ? rVa_1.id_class(var1) : null);
   }

   public rgc_3 id_break(rgF_2 var1) {
      rVa_1 var2 = this.id_byte;
      Boolean var3 = this.id_protected;
      Boolean var4 = this.id_throws;
      Boolean var5 = this.id_catch;
      Boolean var6 = this.id_case;
      Boolean var7 = this.id_private;
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
            return id_class;
         default:
            var2 = rVa_1.id_class(var1);
      }

      return new rgc_3(var2, var3, var4, var6, var5, var7, this.id_implements, this.id_finally, this.id_extends, this.id_native);
   }

   public rgc_3 id_break(Boolean var1) {
      return new rgc_3(
         this.id_byte,
         this.id_protected,
         var1,
         this.id_case,
         this.id_catch,
         this.id_private,
         this.id_implements,
         this.id_finally,
         this.id_extends,
         this.id_native
      );
   }

   public boolean id_break() {
      return this.id_protected == Boolean.TRUE;
   }

   public boolean id_throws() {
      return this.id_case == Boolean.TRUE;
   }

   public String id_finally() {
      return this.id_extends;
   }

   public boolean id_catch() {
      return this == id_class;
   }

   public rqO_2 id_extends() {
      return this.id_native != null ? this.id_native : id_break;
   }

   public boolean id_case() {
      return this.id_private == Boolean.TRUE;
   }

   public rgy_3 id_implements() {
      return this.id_finally;
   }

   public boolean id_protected() {
      return this.id_catch == Boolean.TRUE;
   }

   public rgl_3 id_private() {
      return this.id_implements;
   }
}
