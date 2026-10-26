package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rgn_3 extends rgZ_2 implements rgr_3 {
   private static final Object[] id_byte = new Object[0];
   private static final rgS_2 id_protected = rgS_2.id_protected("%");
   private static final rgS_2 id_throws = rgS_2.id_protected("null");
   private final String id_catch;
   private final Object[] id_private;
   private rgX_2 id_implements;
   private final List<rgS_2> id_finally = Lists.newArrayList();
   private static final Pattern id_extends = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

   public rgn_3(String var1) {
      this.id_catch = var1;
      this.id_private = id_byte;
   }

   public rgn_3(String var1, Object... var2) {
      this.id_catch = var1;
      this.id_private = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgn_3 var2)
            ? false
            : Arrays.equals(this.id_private, var2.id_private) && this.id_catch.equals(var2.id_catch) && super.equals(var1);
      }
   }

   @Override
   public String toString() {
      return "TranslatableComponent{key='"
         + this.id_catch
         + "', args="
         + Arrays.toString(this.id_private)
         + ", siblings="
         + this.id_case
         + ", style="
         + this.id_class()
         + "}";
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = 31 * var1 + this.id_catch.hashCode();
      return 31 * var1 + Arrays.hashCode(this.id_private);
   }

   @Override
   public rVi_1 id_class(gy_3 var1, an_3 var2, int var3) throws CommandSyntaxException {
      Object[] var4 = new Object[this.id_private.length];

      for (int var5 = 0; var5 < var4.length; var5++) {
         Object var6 = this.id_private[var5];
         if (var6 instanceof rgP_2) {
            var4[var5] = rgv_3.id_class(var1, (rgP_2)var6, var2, var3);
         } else {
            var4[var5] = var6;
         }
      }

      return new rgn_3(this.id_catch, var4);
   }

   private void id_class(String var1) {
      Matcher var2 = id_extends.matcher(var1);

      try {
         int var3 = 0;
         int var4 = 0;

         while (var2.find(var4)) {
            int var6 = var2.start();
            int var5 = var2.end();
            if (var6 > var4) {
               String var7 = var1.substring(var4, var6);
               if (var7.indexOf(37) != -1) {
                  throw new IllegalArgumentException();
               }

               this.id_finally.add(rgS_2.id_protected(var7));
            }

            String var13 = var2.group(2);
            String var8 = var1.substring(var6, var5);
            if ("%".equals(var13) && "%%".equals(var8)) {
               this.id_finally.add(id_protected);
            } else {
               if (!"s".equals(var13)) {
                  throw new rgC_2(this, "Unsupported format: '" + var8 + "'");
               }

               String var9 = var2.group(1);
               int var10 = var9 != null ? Integer.parseInt(var9) - 1 : var3++;
               if (var10 < this.id_private.length) {
                  this.id_finally.add(this.id_break(var10));
               }
            }

            var4 = var5;
         }

         if (var4 < var1.length()) {
            String var12 = var1.substring(var4);
            if (var12.indexOf(37) != -1) {
               throw new IllegalArgumentException();
            }

            this.id_finally.add(rgS_2.id_protected(var12));
         }
      } catch (IllegalArgumentException var11) {
         throw new rgC_2(this, var11);
      }
   }

   @Override
   public <T> Optional<T> id_break(rgM_2<T> var1, rgc_3 var2) {
      this.id_volatile();

      for (rgS_2 var4 : this.id_finally) {
         Optional var5 = var4.id_class(var1, var2);
         if (var5.isPresent()) {
            return var5;
         }
      }

      return Optional.empty();
   }

   private rgS_2 id_break(int var1) {
      if (var1 >= this.id_private.length) {
         throw new rgC_2(this, var1);
      } else {
         Object var2 = this.id_private[var1];
         if (var2 instanceof rgP_2) {
            return (rgP_2)var2;
         } else {
            return var2 == null ? id_throws : rgS_2.id_protected(var2.toString());
         }
      }
   }

   @Override
   public <T> Optional<T> id_break(rgO_2<T> var1) {
      this.id_volatile();

      for (rgS_2 var3 : this.id_finally) {
         Optional var4 = var3.id_class(var1);
         if (var4.isPresent()) {
            return var4;
         }
      }

      return Optional.empty();
   }

   public Object[] id_extends() {
      return this.id_private;
   }

   public String id_implements() {
      return this.id_catch;
   }

   public rgn_3 id_private() {
      return new rgn_3(this.id_catch, this.id_private);
   }

   private void id_volatile() {
      rgX_2 var1 = rgX_2.id_byte();
      if (var1 != this.id_implements) {
         this.id_implements = var1;
         this.id_finally.clear();
         String var2 = var1.id_class(this.id_catch);

         try {
            this.id_class(var2);
         } catch (rgC_2 var4) {
            this.id_finally.clear();
            this.id_finally.add(rgS_2.id_protected(var2));
         }
      }
   }

   public boolean id_native() {
      return jI_2.id_class(this.id_catch);
   }
}
