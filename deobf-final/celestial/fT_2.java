package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class fT_2 {
   private static final Comparator<ft_3> class_ = Comparator.<ft_3, Integer>comparing(var0 -> -var0.byte_)
      .thenComparing(var0 -> -var0.break_)
      .thenComparing(var0 -> var0.class_.class_());
   private final int break_;
   private final Set<ft_3> byte_ = Sets.newHashSetWithExpectedSize(256);
   private final List<fI_2> protected_ = Lists.newArrayListWithCapacity(256);
   private int throws_;
   private int case_;
   private final int catch_;
   private final int private_;

   public void byte_() {
      ArrayList var1 = Lists.newArrayList(this.byte_);
      var1.sort(class_);

      for (ft_3 var3 : var1) {
         if (!this.class_(var3)) {
            throw new yG_2(
               var3.class_,
               var1.stream().map(var0 -> var0.class_).collect(ImmutableList.toImmutableList()),
               this.throws_,
               this.case_,
               this.catch_,
               this.private_
            );
         }
      }

      this.throws_ = rfU_2.byte_(this.throws_);
      this.case_ = rfU_2.byte_(this.case_);
   }

   public fT_2(int var1, int var2, int var3) {
      this.break_ = var3;
      this.catch_ = var1;
      this.private_ = var2;
   }

   private boolean class_(ft_3 var1) {
      for (fI_2 var3 : this.protected_) {
         if (var3.class_(var1)) {
            return true;
         }
      }

      return this.break_(var1);
   }

   public int class_() {
      return this.throws_;
   }

   public void class_(fw_3 var1) {
      for (fI_2 var3 : this.protected_) {
         var3.class_(var2 -> {
            ft_3 var3x = var2.class_();
            fV_2 var4 = var3x.class_;
            var1.load(var4, this.throws_, this.case_, var2.break_(), var2.byte_());
         });
      }
   }

   static int class_(int var0, int var1) {
      return (var0 >> var1) + ((var0 & (1 << var1) - 1) == 0 ? 0 : 1) << var1;
   }

   public void class_(fV_2 var1) {
      ft_3 var2 = new ft_3(var1, this.break_);
      this.byte_.add(var2);
   }

   public int break_() {
      return this.case_;
   }

   private boolean break_(ft_3 var1) {
      int var2 = rfU_2.byte_(this.throws_);
      int var3 = rfU_2.byte_(this.case_);
      int var4 = rfU_2.byte_(this.throws_ + var1.break_);
      int var5 = rfU_2.byte_(this.case_ + var1.byte_);
      boolean var6 = var4 <= this.catch_;
      boolean var7 = var5 <= this.private_;
      if (!var6 && !var7) {
         return false;
      } else {
         int var8 = rrWD.class_(this.case_);
         boolean var9 = var6 && var4 <= 2 * var8;
         if (this.throws_ == 0 && this.case_ == 0) {
            var9 = true;
         }

         fI_2 var10;
         if (var9) {
            if (this.case_ == 0) {
               this.case_ = var1.byte_;
            }

            var10 = new fI_2(this.throws_, 0, var1.break_, this.case_);
            this.throws_ = this.throws_ + var1.break_;
         } else {
            var10 = new fI_2(0, this.case_, this.throws_, var1.byte_);
            this.case_ = this.case_ + var1.byte_;
         }

         var10.class_(var1);
         this.protected_.add(var10);
         return true;
      }
   }
}
