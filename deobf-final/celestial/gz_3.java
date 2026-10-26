package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.Swapper;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class gz_3<T> {
   private static final boolean break_ = Boolean.parseBoolean(System.getProperty("SuffixArray.printComparisons", "false"));
   private static final boolean byte_ = Boolean.parseBoolean(System.getProperty("SuffixArray.printArray", "false"));
   private static final Logger protected_ = LogManager.getLogger();
   protected final List<T> class_ = Lists.newArrayList();
   private final IntList throws_ = new IntArrayList();
   private final IntList case_ = new IntArrayList();
   private IntList catch_ = new IntArrayList();
   private IntList private_ = new IntArrayList();
   private int implements_;

   private int class_(String var1, int var2) {
      int var3 = this.case_.getInt(this.catch_.getInt(var2));
      int var4 = this.private_.getInt(var2);

      for (int var5 = 0; var5 < var1.length(); var5++) {
         int var6 = this.throws_.getInt(var3 + var4 + var5);
         if (var6 == -1) {
            return 1;
         }

         char var7 = var1.charAt(var5);
         char var8 = (char)var6;
         if (var7 < var8) {
            return -1;
         }

         if (var7 > var8) {
            return 1;
         }
      }

      return 0;
   }

   public List<T> class_(String var1) {
      int var2 = this.catch_.size();
      int var3 = 0;
      int var4 = var2;

      while (var3 < var4) {
         int var5 = var3 + (var4 - var3) / 2;
         int var6 = this.class_(var1, var5);
         if (break_) {
            protected_.debug("comparing lower \"{}\" with {} \"{}\": {}", var1, var5, this.class_(var5), var6);
         }

         if (var6 > 0) {
            var3 = var5 + 1;
         } else {
            var4 = var5;
         }
      }

      if (var3 >= 0 && var3 < var2) {
         int var15 = var3;
         var4 = var2;

         while (var3 < var4) {
            int var16 = var3 + (var4 - var3) / 2;
            int var7 = this.class_(var1, var16);
            if (break_) {
               protected_.debug("comparing upper \"{}\" with {} \"{}\": {}", var1, var16, this.class_(var16), var7);
            }

            if (var7 >= 0) {
               var3 = var16 + 1;
            } else {
               var4 = var16;
            }
         }

         int var17 = var3;
         IntOpenHashSet var18 = new IntOpenHashSet();

         for (int var8 = var15; var8 < var17; var8++) {
            var18.add(this.catch_.getInt(var8));
         }

         int[] var19 = var18.toIntArray();
         Arrays.sort(var19);
         LinkedHashSet var9 = Sets.newLinkedHashSet();

         for (int var13 : var19) {
            var9.add(this.class_.get(var13));
         }

         return Lists.newArrayList(var9);
      } else {
         return Collections.emptyList();
      }
   }

   private String class_(int var1) {
      int var2 = this.private_.getInt(var1);
      int var3 = this.case_.getInt(this.catch_.getInt(var1));
      StringBuilder var4 = new StringBuilder();

      for (int var5 = 0; var3 + var5 < this.throws_.size(); var5++) {
         if (var5 == var2) {
            var4.append('^');
         }

         int var6 = this.throws_.get(var3 + var5);
         if (var6 == -1) {
            break;
         }

         var4.append((char)var6);
      }

      return var4.toString();
   }

   public void class_(T var1, String var2) {
      this.implements_ = Math.max(this.implements_, var2.length());
      int var3 = this.class_.size();
      this.class_.add((T)var1);
      this.case_.add(this.throws_.size());

      for (int var4 = 0; var4 < var2.length(); var4++) {
         this.catch_.add(var3);
         this.private_.add(var4);
         this.throws_.add(var2.charAt(var4));
      }

      this.catch_.add(var3);
      this.private_.add(var2.length());
      this.throws_.add(-1);
   }

   public void class_() {
      int var1 = this.throws_.size();
      int[] var2 = new int[var1];
      int[] var3 = new int[var1];
      int[] var4 = new int[var1];
      int[] var5 = new int[var1];
      gQ_2 var6 = new gQ_2(this, var3, var4);
      Swapper var7 = (var3x, var4x) -> {
         if (var3x != var4x) {
            int var5x = var3[var3x];
            var3[var3x] = var3[var4x];
            var3[var4x] = var5x;
            var5x = var4[var3x];
            var4[var3x] = var4[var4x];
            var4[var4x] = var5x;
            var5x = var5[var3x];
            var5[var3x] = var5[var4x];
            var5[var4x] = var5x;
         }
      };

      for (int var8 = 0; var8 < var1; var8++) {
         var2[var8] = this.throws_.getInt(var8);
      }

      byte var13 = 1;

      for (int var9 = Math.min(var1, this.implements_); var13 * 2 < var9; var13 *= 2) {
         for (int var10 = 0; var10 < var1; var5[var10] = var10++) {
            var3[var10] = var2[var10];
            var4[var10] = var10 + var13 < var1 ? var2[var10 + var13] : -2;
         }

         it.unimi.dsi.fastutil.Arrays.quickSort(0, var1, var6, var7);

         for (int var15 = 0; var15 < var1; var15++) {
            if (var15 > 0 && var3[var15] == var3[var15 - 1] && var4[var15] == var4[var15 - 1]) {
               var2[var5[var15]] = var2[var5[var15 - 1]];
            } else {
               var2[var5[var15]] = var15;
            }
         }
      }

      IntList var14 = this.catch_;
      IntList var16 = this.private_;
      this.catch_ = new IntArrayList(var14.size());
      this.private_ = new IntArrayList(var16.size());

      for (int var11 = 0; var11 < var1; var11++) {
         int var12 = var5[var11];
         this.catch_.add(var14.getInt(var12));
         this.private_.add(var16.getInt(var12));
      }

      if (byte_) {
         this.break_();
      }
   }

   private void break_() {
      for (int var1 = 0; var1 < this.catch_.size(); var1++) {
         protected_.debug("{} {}", var1, this.class_(var1));
      }

      protected_.debug("");
   }
}
