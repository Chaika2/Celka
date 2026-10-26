package celestial;

import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWVidMode.Buffer;

public final class yM_2 {
   private final int id_class;
   private final int id_break;
   private final int id_byte;
   private final int id_protected;
   private final int id_throws;
   private final int id_case;
   private static final Pattern id_catch = Pattern.compile("(\\d+)x(\\d+)(?:@(\\d+)(?::(\\d+))?)?");

   public int id_byte() {
      return this.id_byte;
   }

   public yM_2(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
   }

   public yM_2(GLFWVidMode var1) {
      this.id_class = var1.width();
      this.id_break = var1.height();
      this.id_byte = var1.redBits();
      this.id_protected = var1.greenBits();
      this.id_throws = var1.blueBits();
      this.id_case = var1.refreshRate();
   }

   public yM_2(Buffer var1) {
      this.id_class = var1.width();
      this.id_break = var1.height();
      this.id_byte = var1.redBits();
      this.id_protected = var1.greenBits();
      this.id_throws = var1.blueBits();
      this.id_case = var1.refreshRate();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         yM_2 var2 = (yM_2)var1;
         return this.id_class == var2.id_class
            && this.id_break == var2.id_break
            && this.id_byte == var2.id_byte
            && this.id_protected == var2.id_protected
            && this.id_throws == var2.id_throws
            && this.id_case == var2.id_case;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return String.format("%sx%s@%s (%sbit)", this.id_class, this.id_break, this.id_case, this.id_byte + this.id_protected + this.id_throws);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case);
   }

   public int id_class() {
      return this.id_class;
   }

   public static Optional<yM_2> id_class(String var0) {
      if (var0 == null) {
         return Optional.empty();
      } else {
         try {
            Matcher var1 = id_catch.matcher(var0);
            if (var1.matches()) {
               int var2 = Integer.parseInt(var1.group(1));
               int var3 = Integer.parseInt(var1.group(2));
               String var4 = var1.group(3);
               int var5;
               if (var4 == null) {
                  var5 = 60;
               } else {
                  var5 = Integer.parseInt(var4);
               }

               String var6 = var1.group(4);
               int var7;
               if (var6 == null) {
                  var7 = 24;
               } else {
                  var7 = Integer.parseInt(var6);
               }

               int var8 = var7 / 3;
               return Optional.of(new yM_2(var2, var3, var8, var8, var8, var5));
            }
         } catch (Exception var9) {
         }

         return Optional.empty();
      }
   }

   public int id_break() {
      return this.id_break;
   }

   public int id_throws() {
      return this.id_throws;
   }

   public String id_catch() {
      return String.format("%sx%s@%s:%s", this.id_class, this.id_break, this.id_case, this.id_byte + this.id_protected + this.id_throws);
   }

   public int id_case() {
      return this.id_case;
   }

   public int id_protected() {
      return this.id_protected;
   }
}
