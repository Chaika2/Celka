package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ji_3 {
   public static final VP class_ = new VP();
   public static final ji_3 break_ = new Vr_1(Lists.newArrayList(), -1, -1, 1, false);
   private final List<ja_3> byte_;
   private final int protected_;
   private final int throws_;
   private final int case_;
   private final boolean catch_;

   public boolean byte_() {
      return this.catch_;
   }

   public int byte_(int var1) {
      ja_3 var2 = this.throws_(var1);
      return var2.class_() ? this.case_ : var2.break_();
   }

   private Pair<Integer, Integer> byte_(int var1, int var2) {
      if (this.protected_ != -1) {
         return this.throws_ != -1 ? Pair.of(this.protected_, this.throws_) : Pair.of(this.protected_, var2);
      } else if (this.throws_ != -1) {
         return Pair.of(var1, this.throws_);
      } else {
         int var3 = Math.min(var1, var2);
         return Pair.of(var3, var3);
      }
   }

   public ji_3(List<ja_3> var1, int var2, int var3, int var4, boolean var5) {
      this.byte_ = var1;
      this.protected_ = var2;
      this.throws_ = var3;
      this.case_ = var4;
      this.catch_ = var5;
   }

   public Pair<Integer, Integer> class_(int var1, int var2) {
      Pair var3 = this.byte_(var1, var2);
      int var4 = (Integer)var3.getFirst();
      int var5 = (Integer)var3.getSecond();
      if (break_(var1, var4) && break_(var2, var5)) {
         return var3;
      } else {
         throw new IllegalArgumentException(String.format("Image size %s,%s is not multiply of frame size %s,%s", var1, var2, var4, var5));
      }
   }

   public int class_() {
      return this.byte_.size();
   }

   public int class_(int var1) {
      return this.throws_ == -1 ? var1 : this.throws_;
   }

   public int break_() {
      return this.case_;
   }

   private static boolean break_(int var0, int var1) {
      return var0 / var1 * var1 == var0;
   }

   public int break_(int var1) {
      return this.protected_ == -1 ? var1 : this.protected_;
   }

   private ja_3 throws_(int var1) {
      return this.byte_.get(var1);
   }

   public int protected_(int var1) {
      return this.byte_.get(var1).byte_();
   }

   public Set<Integer> protected_() {
      HashSet var1 = Sets.newHashSet();

      for (ja_3 var3 : this.byte_) {
         var1.add(var3.byte_());
      }

      return var1;
   }
}
