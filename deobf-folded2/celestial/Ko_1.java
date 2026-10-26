package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Ko_1 {
   private final KY id_class;
   private final String id_break;
   private final List<KK> id_byte = Lists.newArrayList();
   private StackTraceElement[] id_protected = new StackTraceElement[0];

   public Ko_1(KY var1, String var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public boolean id_class(StackTraceElement var1, StackTraceElement var2) {
      if (this.id_protected.length != 0 && var1 != null) {
         StackTraceElement var3 = this.id_protected[0];
         if (var3.isNativeMethod() == var1.isNativeMethod()
            && var3.getClassName().equals(var1.getClassName())
            && Objects.equals(var3.getFileName(), var1.getFileName())
            && var3.getMethodName().equals(var1.getMethodName())) {
            if (var2 != null != this.id_protected.length > 1) {
               return false;
            } else if (var2 != null && !this.id_protected[1].equals(var2)) {
               return false;
            } else {
               this.id_protected[0] = var1;
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int id_class(int var1) {
      StackTraceElement[] var2 = Thread.currentThread().getStackTrace();
      if (var2.length <= 0) {
         return 0;
      } else {
         this.id_protected = new StackTraceElement[var2.length - 3 - var1];
         System.arraycopy(var2, 3 + var1, this.id_protected, 0, this.id_protected.length);
         return this.id_protected.length;
      }
   }

   public void id_class(String var1, Throwable var2) {
      this.id_class(var1, (Object)var2);
   }

   public void id_class(StringBuilder var1) {
      var1.append("-- ").append(this.id_break).append(" --\n");
      var1.append("Details:");

      for (KK var3 : this.id_byte) {
         var1.append("\n\t");
         var1.append(var3.id_class());
         var1.append(": ");
         var1.append(var3.id_break());
      }

      if (this.id_protected != null && this.id_protected.length > 0) {
         var1.append("\nStacktrace:");

         for (StackTraceElement var5 : this.id_protected) {
            var1.append("\n\tat ");
            var1.append(var5);
         }
      }
   }

   public StackTraceElement[] id_class() {
      return this.id_protected;
   }

   public static void id_class(Ko_1 var0, rfH_2 var1, xc_3 var2) {
      if (var2 != null) {
         var0.id_class("Block", var2::toString);
      }

      var0.id_class("Block location", () -> id_class(var1));
   }

   public static String id_class(double var0, double var2, double var4) {
      return String.format(Locale.ROOT, "%.2f,%.2f,%.2f - %s", var0, var2, var4, id_class(new rfH_2(var0, var2, var4)));
   }

   public static String id_class(rfH_2 var0) {
      return id_class(var0.b_(), var0.c_(), var0.d_());
   }

   public static String id_class(int var0, int var1, int var2) {
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

   public Ko_1 id_class(String var1, Object var2) {
      this.id_byte.add(new KK(var1, var2));
      return this;
   }

   public Ko_1 id_class(String var1, KD<String> var2) {
      try {
         this.id_class(var1, var2.call());
      } catch (Throwable var4) {
         this.id_class(var1, var4);
      }

      return this;
   }

   public void id_break(int var1) {
      StackTraceElement[] var2 = new StackTraceElement[this.id_protected.length - var1];
      System.arraycopy(this.id_protected, 0, var2, 0, var2.length);
      this.id_protected = var2;
   }
}
