package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Ko_1 {
   private final KY class_;
   private final String break_;
   private final List<KK> byte_ = Lists.newArrayList();
   private StackTraceElement[] protected_ = new StackTraceElement[0];

   public Ko_1(KY var1, String var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public boolean class_(StackTraceElement var1, StackTraceElement var2) {
      if (this.protected_.length != 0 && var1 != null) {
         StackTraceElement var3 = this.protected_[0];
         if (var3.isNativeMethod() == var1.isNativeMethod()
            && var3.getClassName().equals(var1.getClassName())
            && Objects.equals(var3.getFileName(), var1.getFileName())
            && var3.getMethodName().equals(var1.getMethodName())) {
            if (var2 != null != this.protected_.length > 1) {
               return false;
            } else if (var2 != null && !this.protected_[1].equals(var2)) {
               return false;
            } else {
               this.protected_[0] = var1;
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int class_(int var1) {
      StackTraceElement[] var2 = Thread.currentThread().getStackTrace();
      if (var2.length <= 0) {
         return 0;
      } else {
         this.protected_ = new StackTraceElement[var2.length - 3 - var1];
         System.arraycopy(var2, 3 + var1, this.protected_, 0, this.protected_.length);
         return this.protected_.length;
      }
   }

   public void class_(String var1, Throwable var2) {
      this.class_(var1, (Object)var2);
   }

   public void class_(StringBuilder var1) {
      var1.append("-- ").append(this.break_).append(" --\n");
      var1.append("Details:");

      for (KK var3 : this.byte_) {
         var1.append("\n\t");
         var1.append(var3.class_());
         var1.append(": ");
         var1.append(var3.break_());
      }

      if (this.protected_ != null && this.protected_.length > 0) {
         var1.append("\nStacktrace:");

         for (StackTraceElement var5 : this.protected_) {
            var1.append("\n\tat ");
            var1.append(var5);
         }
      }
   }

   public StackTraceElement[] class_() {
      return this.protected_;
   }

   public static void class_(Ko_1 var0, rfH_2 var1, xc_3 var2) {
      if (var2 != null) {
         var0.class_("Block", var2::toString);
      }

      var0.class_("Block location", () -> class_(var1));
   }

   public static String class_(double var0, double var2, double var4) {
      return String.format(Locale.ROOT, "%.2f,%.2f,%.2f - %s", var0, var2, var4, class_(new rfH_2(var0, var2, var4)));
   }

   public static String class_(rfH_2 var0) {
      return class_(var0.b_(), var0.c_(), var0.d_());
   }

   public static String class_(int var0, int var1, int var2) {
      StringBuilder var3 = new StringBuilder();

      try {
         var3.append(String.format("World: (%d,%d,%d)", var0, var1, var2));
      } catch (Throwable var16) {
         var3.append("(Error finding world loc)");
      }

      var3.append(", ");

      try {
         int var4 = var0 >> 4;
         int var5 = var2 >> 4;
         int var6 = var0 & 15;
         int var7 = var1 >> 4;
         int var8 = var2 & 15;
         int var9 = var4 << 4;
         int var10 = var5 << 4;
         int var11 = (var4 + 1 << 4) - 1;
         int var12 = (var5 + 1 << 4) - 1;
         var3.append(
            String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", var6, var7, var8, var4, var5, var9, var10, var11, var12)
         );
      } catch (Throwable var15) {
         var3.append("(Error finding chunk loc)");
      }

      var3.append(", ");

      try {
         int var17 = var0 >> 9;
         int var18 = var2 >> 9;
         int var19 = var17 << 5;
         int var20 = var18 << 5;
         int var21 = (var17 + 1 << 5) - 1;
         int var22 = (var18 + 1 << 5) - 1;
         int var23 = var17 << 9;
         int var24 = var18 << 9;
         int var25 = (var17 + 1 << 9) - 1;
         int var13 = (var18 + 1 << 9) - 1;
         var3.append(
            String.format(
               "Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)",
               var17,
               var18,
               var19,
               var20,
               var21,
               var22,
               var23,
               var24,
               var25,
               var13
            )
         );
      } catch (Throwable var14) {
         var3.append("(Error finding world loc)");
      }

      return var3.toString();
   }

   public Ko_1 class_(String var1, Object var2) {
      this.byte_.add(new KK(var1, var2));
      return this;
   }

   public Ko_1 class_(String var1, KD<String> var2) {
      try {
         this.class_(var1, var2.call());
      } catch (Throwable var4) {
         this.class_(var1, var4);
      }

      return this;
   }

   public void break_(int var1) {
      StackTraceElement[] var2 = new StackTraceElement[this.protected_.length - var1];
      System.arraycopy(this.protected_, 0, var2, 0, var2.length);
      this.protected_ = var2;
   }
}
