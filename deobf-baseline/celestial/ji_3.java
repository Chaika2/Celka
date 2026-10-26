package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ji_3 {
   public static final VP id_class = new VP();
   public static final ji_3 id_break = new Vr_1(Lists.newArrayList(), -1, -1, 1, false);
   private final List<ja_3> id_byte;
   private final int id_protected;
   private final int id_throws;
   private final int id_case;
   private final boolean id_catch;

   public boolean id_byte() {
      return this.id_catch;
   }

   public int id_byte(int var1) {
      ja_3 var2 = this.id_throws(var1);
      return var2.id_class() ? this.id_case : var2.id_break();
   }

   private Pair<Integer, Integer> id_byte(int var1, int var2) {
      if (this.id_protected != -1) {
         return this.id_throws != -1 ? Pair.of(this.id_protected, this.id_throws) : Pair.of(this.id_protected, var2);
      } else if (this.id_throws != -1) {
         return Pair.of(var1, this.id_throws);
      } else {
         int var3 = Math.min(var1, var2);
         return Pair.of(var3, var3);
      }
   }

   public ji_3(List<ja_3> var1, int var2, int var3, int var4, boolean var5) {
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_throws = var3;
      this.id_case = var4;
      this.id_catch = var5;
   }

   public Pair<Integer, Integer> id_class(int var1, int var2) {
      Pair var3 = this.id_byte(var1, var2);
      int var4 = (Integer)var3.getFirst();
      int var5 = (Integer)var3.getSecond();
      if (id_break(var1, var4) && id_break(var2, var5)) {
         return var3;
      } else {
         throw new IllegalArgumentException(String.format("Image size %s,%s is not multiply of frame size %s,%s", var1, var2, var4, var5));
      }
   }

   public int id_class() {
      return this.id_byte.size();
   }

   public int id_class(int var1) {
      return this.id_throws == -1 ? var1 : this.id_throws;
   }

   public int id_break() {
      return this.id_case;
   }

   private static boolean id_break(int var0, int var1) {
      return var0 / var1 * var1 == var0;
   }

   public int id_break(int var1) {
      return this.id_protected == -1 ? var1 : this.id_protected;
   }

   private ja_3 id_throws(int var1) {
      return this.id_byte.get(var1);
   }

   public int id_protected(int var1) {
      return this.id_byte.get(var1).id_byte();
   }

   public Set<Integer> id_protected() {
      HashSet var1 = Sets.newHashSet();

      for (ja_3 var3 : this.id_byte) {
         var1.add(var3.id_byte());
      }

      return var1;
   }
}
