package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rgn_3 extends rgZ_2 implements rgr_3 {
   private static final Object[] byte_ = new Object[0];
   private static final rgS_2 protected_ = rgS_2.protected_("%");
   private static final rgS_2 throws_ = rgS_2.protected_("null");
   private final String catch_;
   private final Object[] private_;
   private rgX_2 implements_;
   private final List<rgS_2> finally_ = Lists.newArrayList();
   private static final Pattern extends_ = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

   public rgn_3(String var1) {
      this.catch_ = var1;
      this.private_ = byte_;
   }

   public rgn_3(String var1, Object... var2) {
      this.catch_ = var1;
      this.private_ = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgn_3 var2) ? false : Arrays.equals(this.private_, var2.private_) && this.catch_.equals(var2.catch_) && super.equals(var1);
      }
   }

   @Override
   public String toString() {
      return "TranslatableComponent{key='"
         + this.catch_
         + "', args="
         + Arrays.toString(this.private_)
         + ", siblings="
         + this.case_
         + ", style="
         + this.class_()
         + "}";
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = 31 * var1 + this.catch_.hashCode();
      return 31 * var1 + Arrays.hashCode(this.private_);
   }

   @Override
   public rVi_1 class_(gy_3 var1, an_3 var2, int var3) throws CommandSyntaxException {
      Object[] var4 = new Object[this.private_.length];

      for (int var5 = 0; var5 < var4.length; var5++) {
         Object var6 = this.private_[var5];
         if (var6 instanceof rgP_2) {
            var4[var5] = rgv_3.class_(var1, (rgP_2)var6, var2, var3);
         } else {
            var4[var5] = var6;
         }
      }

      return new rgn_3(this.catch_, var4);
   }

   private void class_(String var1) {
      Matcher var2 = extends_.matcher(var1);

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

               this.finally_.add(rgS_2.protected_(var7));
            }

            String var13 = var2.group(2);
            String var8 = var1.substring(var6, var5);
            if ("%".equals(var13) && "%%".equals(var8)) {
               this.finally_.add(protected_);
            } else {
               if (!"s".equals(var13)) {
                  throw new rgC_2(this, "Unsupported format: '" + var8 + "'");
               }

               String var9 = var2.group(1);
               int var10 = var9 != null ? Integer.parseInt(var9) - 1 : var3++;
               if (var10 < this.private_.length) {
                  this.finally_.add(this.break_(var10));
               }
            }

            var4 = var5;
         }

         if (var4 < var1.length()) {
            String var12 = var1.substring(var4);
            if (var12.indexOf(37) != -1) {
               throw new IllegalArgumentException();
            }

            this.finally_.add(rgS_2.protected_(var12));
         }
      } catch (IllegalArgumentException var11) {
         throw new rgC_2(this, var11);
      }
   }

   @Override
   public <T> Optional<T> break_(rgM_2<T> var1, rgc_3 var2) {
      this.volatile_();

      for (rgS_2 var4 : this.finally_) {
         Optional var5 = var4.class_(var1, var2);
         if (var5.isPresent()) {
            return var5;
         }
      }

      return Optional.empty();
   }

   private rgS_2 break_(int var1) {
      if (var1 >= this.private_.length) {
         throw new rgC_2(this, var1);
      } else {
         Object var2 = this.private_[var1];
         if (var2 instanceof rgP_2) {
            return (rgP_2)var2;
         } else {
            return var2 == null ? throws_ : rgS_2.protected_(var2.toString());
         }
      }
   }

   @Override
   public <T> Optional<T> break_(rgO_2<T> var1) {
      this.volatile_();

      for (rgS_2 var3 : this.finally_) {
         Optional var4 = var3.class_(var1);
         if (var4.isPresent()) {
            return var4;
         }
      }

      return Optional.empty();
   }

   public Object[] extends_() {
      return this.private_;
   }

   public String implements_() {
      return this.catch_;
   }

   public rgn_3 private_() {
      return new rgn_3(this.catch_, this.private_);
   }

   private void volatile_() {
      rgX_2 var1 = rgX_2.byte_();
      if (var1 != this.implements_) {
         this.implements_ = var1;
         this.finally_.clear();
         String var2 = var1.class_(this.catch_);

         try {
            this.class_(var2);
         } catch (rgC_2 var4) {
            this.finally_.clear();
            this.finally_.add(rgS_2.protected_(var2));
         }
      }
   }

   public boolean native_() {
      return jI_2.class_(this.catch_);
   }
}
