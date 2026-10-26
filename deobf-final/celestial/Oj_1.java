package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Oj_1 implements Comparable<Oj_1> {
   final Map<String, OD> class_ = Maps.newHashMap();
   private String[][] break_ = new String[0][];

   public OD byte_(String var1) {
      return this.class_.get(var1);
   }

   public float byte_() {
      if (this.class_.isEmpty()) {
         return 0.0F;
      } else {
         float var1 = (float)this.break_.length;
         float var2 = (float)this.private_();
         return var2 / var1;
      }
   }

   @Override
   public String toString() {
      return "AdvancementProgress{criteria=" + this.class_ + ", requirements=" + Arrays.deepToString(this.break_) + "}";
   }

   public int class_(Oj_1 var1) {
      Date var2 = this.catch_();
      Date var3 = var1.catch_();
      if (var2 == null && var3 != null) {
         return 1;
      } else if (var2 != null && var3 == null) {
         return -1;
      } else {
         return var2 == null && var3 == null ? 0 : var2.compareTo(var3);
      }
   }

   public void class_(Map<String, OK> var1, String[][] var2) {
      Set var3 = var1.keySet();
      this.class_.entrySet().removeIf(var1x -> !var3.contains(var1x.getKey()));

      for (String var5 : var3) {
         if (!this.class_.containsKey(var5)) {
            this.class_.put(var5, new OD());
         }
      }

      this.break_ = var2;
   }

   public boolean class_() {
      if (this.break_.length == 0) {
         return false;
      } else {
         for (String[] var4 : this.break_) {
            boolean var5 = false;

            for (String var9 : var4) {
               OD var10 = this.byte_(var9);
               if (var10 != null && var10.class_()) {
                  var5 = true;
                  break;
               }
            }

            if (!var5) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean class_(String var1) {
      OD var2 = this.class_.get(var1);
      if (var2 != null && !var2.class_()) {
         var2.break_();
         return true;
      } else {
         return false;
      }
   }

   public void class_(ruu_3 var1) {
      var1.protected_(this.class_.size());

      for (Entry var3 : this.class_.entrySet()) {
         var1.class_((String)var3.getKey());
         ((OD)var3.getValue()).class_(var1);
      }
   }

   public boolean break_() {
      for (OD var2 : this.class_.values()) {
         if (var2.class_()) {
            return true;
         }
      }

      return false;
   }

   public static Oj_1 break_(ruu_3 var0) {
      Oj_1 var1 = new Oj_1();
      int var2 = var0.case_();

      for (int var3 = 0; var3 < var2; var3++) {
         var1.class_.put(var0.throws_(32767), OD.break_(var0));
      }

      return var1;
   }

   public boolean break_(String var1) {
      OD var2 = this.class_.get(var1);
      if (var2 != null && var2.class_()) {
         var2.byte_();
         return true;
      } else {
         return false;
      }
   }

   public Iterable<String> throws_() {
      ArrayList var1 = Lists.newArrayList();

      for (Entry var3 : this.class_.entrySet()) {
         if (!((OD)var3.getValue()).class_()) {
            var1.add((String)var3.getKey());
         }
      }

      return var1;
   }

   public Date catch_() {
      Date var1 = null;

      for (OD var3 : this.class_.values()) {
         if (var3.class_() && (var1 == null || var3.protected_().before(var1))) {
            var1 = var3.protected_();
         }
      }

      return var1;
   }

   public Iterable<String> case_() {
      ArrayList var1 = Lists.newArrayList();

      for (Entry var3 : this.class_.entrySet()) {
         if (((OD)var3.getValue()).class_()) {
            var1.add((String)var3.getKey());
         }
      }

      return var1;
   }

   public String protected_() {
      if (this.class_.isEmpty()) {
         return null;
      } else {
         int var1 = this.break_.length;
         if (var1 <= 1) {
            return null;
         } else {
            int var2 = this.private_();
            return var2 + "/" + var1;
         }
      }
   }

   private int private_() {
      int var1 = 0;

      for (String[] var5 : this.break_) {
         boolean var6 = false;

         for (String var10 : var5) {
            OD var11 = this.byte_(var10);
            if (var11 != null && var11.class_()) {
               var6 = true;
               break;
            }
         }

         if (var6) {
            var1++;
         }
      }

      return var1;
   }
}
