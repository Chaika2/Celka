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
   final Map<String, OD> id_class = Maps.newHashMap();
   private String[][] id_break = new String[0][];

   public OD id_byte(String var1) {
      return this.id_class.get(var1);
   }

   public float id_byte() {
      if (this.id_class.isEmpty()) {
         return 0.0F;
      } else {
         float var1 = (float)this.id_break.length;
         float var2 = (float)this.id_private();
         return var2 / var1;
      }
   }

   @Override
   public String toString() {
      return "AdvancementProgress{criteria=" + this.id_class + ", requirements=" + Arrays.deepToString(this.id_break) + "}";
   }

   public int id_class(Oj_1 var1) {
      Date var2 = this.id_catch();
      Date var3 = var1.id_catch();
      if (var2 == null && var3 != null) {
         return 1;
      } else if (var2 != null && var3 == null) {
         return -1;
      } else {
         return var2 == null && var3 == null ? 0 : var2.compareTo(var3);
      }
   }

   public void id_class(Map<String, OK> var1, String[][] var2) {
      Set var3 = var1.keySet();
      this.id_class.entrySet().removeIf(var1x -> !var3.contains(var1x.getKey()));

      for (String var5 : var3) {
         if (!this.id_class.containsKey(var5)) {
            this.id_class.put(var5, new OD());
         }
      }

      this.id_break = var2;
   }

   public boolean id_class() {
      if (this.id_break.length == 0) {
         return false;
      } else {
         for (String[] var4 : this.id_break) {
            boolean var5 = false;

            for (String var9 : var4) {
               OD var10 = this.id_byte(var9);
               if (var10 != null && var10.id_class()) {
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

   public boolean id_class(String var1) {
      OD var2 = this.id_class.get(var1);
      if (var2 != null && !var2.id_class()) {
         var2.id_break();
         return true;
      } else {
         return false;
      }
   }

   public void id_class(ruu_3 var1) {
      var1.id_protected(this.id_class.size());

      for (Entry var3 : this.id_class.entrySet()) {
         var1.id_class((String)var3.getKey());
         ((OD)var3.getValue()).id_class(var1);
      }
   }

   public boolean id_break() {
      for (OD var2 : this.id_class.values()) {
         if (var2.id_class()) {
            return true;
         }
      }

      return false;
   }

   public static Oj_1 id_break(ruu_3 var0) {
      Oj_1 var1 = new Oj_1();
      int var2 = var0.id_case();

      for (int var3 = 0; var3 < var2; var3++) {
         var1.id_class.put(var0.id_throws(32767), OD.id_break(var0));
      }

      return var1;
   }

   public boolean id_break(String var1) {
      OD var2 = this.id_class.get(var1);
      if (var2 != null && var2.id_class()) {
         var2.id_byte();
         return true;
      } else {
         return false;
      }
   }

   public Iterable<String> id_throws() {
      ArrayList var1 = Lists.newArrayList();

      for (Entry var3 : this.id_class.entrySet()) {
         if (!((OD)var3.getValue()).id_class()) {
            var1.add((String)var3.getKey());
         }
      }

      return var1;
   }

   public Date id_catch() {
      Date var1 = null;

      for (OD var3 : this.id_class.values()) {
         if (var3.id_class() && (var1 == null || var3.id_protected().before(var1))) {
            var1 = var3.id_protected();
         }
      }

      return var1;
   }

   public Iterable<String> id_case() {
      ArrayList var1 = Lists.newArrayList();

      for (Entry var3 : this.id_class.entrySet()) {
         if (((OD)var3.getValue()).id_class()) {
            var1.add((String)var3.getKey());
         }
      }

      return var1;
   }

   public String id_protected() {
      if (this.id_class.isEmpty()) {
         return null;
      } else {
         int var1 = this.id_break.length;
         if (var1 <= 1) {
            return null;
         } else {
            int var2 = this.id_private();
            return var2 + "/" + var1;
         }
      }
   }

   private int id_private() {
      int var1 = 0;

      for (String[] var5 : this.id_break) {
         boolean var6 = false;

         for (String var10 : var5) {
            OD var11 = this.id_byte(var10);
            if (var11 != null && var11.id_class()) {
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
