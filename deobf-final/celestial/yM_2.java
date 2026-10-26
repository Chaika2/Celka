package celestial;

import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWVidMode.Buffer;

public final class yM_2 {
   private final int class_;
   private final int break_;
   private final int byte_;
   private final int protected_;
   private final int throws_;
   private final int case_;
   private static final Pattern catch_ = Pattern.compile("(\\d+)x(\\d+)(?:@(\\d+)(?::(\\d+))?)?");

   public int byte_() {
      return this.byte_;
   }

   public yM_2(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
   }

   public yM_2(GLFWVidMode var1) {
      this.class_ = var1.width();
      this.break_ = var1.height();
      this.byte_ = var1.redBits();
      this.protected_ = var1.greenBits();
      this.throws_ = var1.blueBits();
      this.case_ = var1.refreshRate();
   }

   public yM_2(Buffer var1) {
      this.class_ = var1.width();
      this.break_ = var1.height();
      this.byte_ = var1.redBits();
      this.protected_ = var1.greenBits();
      this.throws_ = var1.blueBits();
      this.case_ = var1.refreshRate();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         yM_2 var2 = (yM_2)var1;
         return this.class_ == var2.class_
            && this.break_ == var2.break_
            && this.byte_ == var2.byte_
            && this.protected_ == var2.protected_
            && this.throws_ == var2.throws_
            && this.case_ == var2.case_;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return String.format("%sx%s@%s (%sbit)", this.class_, this.break_, this.case_, this.byte_ + this.protected_ + this.throws_);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.class_, this.break_, this.byte_, this.protected_, this.throws_, this.case_);
   }

   public int class_() {
      return this.class_;
   }

   public static Optional<yM_2> class_(String var0) {
      if (var0 == null) {
         return Optional.empty();
      } else {
         try {
            Matcher var1 = catch_.matcher(var0);
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

   public int break_() {
      return this.break_;
   }

   public int throws_() {
      return this.throws_;
   }

   public String catch_() {
      return String.format("%sx%s@%s:%s", this.class_, this.break_, this.case_, this.byte_ + this.protected_ + this.throws_);
   }

   public int case_() {
      return this.case_;
   }

   public int protected_() {
      return this.protected_;
   }
}
