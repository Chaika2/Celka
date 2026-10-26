package celestial;

import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.bytes.ByteOpenHashSet;
import it.unimi.dsi.fastutil.bytes.ByteSet;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class rcy_3 extends rcx_3<rcZ_2> {
   public static final rcv_3<rcy_3> class_ = new rcp_3();
   private static final ByteSet break_ = new ByteOpenHashSet(Arrays.asList((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6));
   private final List<rcZ_2> byte_;
   private byte private_;

   @Override
   public rcZ_2 byte_(int var1) {
      rcZ_2 var2 = this.byte_.remove(var1);
      this.case_();
      return var2;
   }

   @Override
   public void byte_(int var1, rcZ_2 var2) {
      if (!this.break_(var1, var2)) {
         throw new UnsupportedOperationException(String.format("Trying to add tag of type %d to list of %d", var2.class_(), this.private_));
      }
   }

   rcy_3(List<rcZ_2> var1, byte var2) {
      this.byte_ = var1;
      this.private_ = var2;
   }

   public rcy_3() {
      this(Lists.newArrayList(), (byte)0);
   }

   @Override
   public int size() {
      return this.byte_.size();
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcy_3 && Objects.equals(this.byte_, ((rcy_3)var1).byte_);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder("[");

      for (int var2 = 0; var2 < this.byte_.size(); var2++) {
         if (var2 != 0) {
            var1.append(',');
         }

         var1.append(this.byte_.get(var2));
      }

      return var1.append(']').toString();
   }

   @Override
   public int hashCode() {
      return this.byte_.hashCode();
   }

   @Override
   public void clear() {
      this.byte_.clear();
      this.private_ = 0;
   }

   @Override
   public boolean isEmpty() {
      return this.byte_.isEmpty();
   }

   @Override
   public byte class_() {
      return 9;
   }

   @Override
   public rgP_2 class_(String var1, int var2) {
      if (this.isEmpty()) {
         return new rgN_2("[]");
      } else if (break_.contains(this.private_) && this.size() <= 8) {
         String var7 = ", ";
         rgN_2 var8 = new rgN_2("[");

         for (int var9 = 0; var9 < this.byte_.size(); var9++) {
            if (var9 != 0) {
               var8.break_(", ");
            }

            var8.class_(this.byte_.get(var9).volatile_());
         }

         var8.break_("]");
         return var8;
      } else {
         rgN_2 var3 = new rgN_2("[");
         if (!var1.isEmpty()) {
            var3.break_("\n");
         }

         String var4 = String.valueOf(',');

         for (int var5 = 0; var5 < this.byte_.size(); var5++) {
            rgN_2 var6 = new rgN_2(Strings.repeat(var1, var2 + 1));
            var6.class_(this.byte_.get(var5).class_(var1, var2 + 1));
            if (var5 != this.byte_.size() - 1) {
               var6.break_(var4).break_(var1.isEmpty() ? " " : "\n");
            }

            var3.class_(var6);
         }

         if (!var1.isEmpty()) {
            var3.break_("\n").break_(Strings.repeat(var1, var2));
         }

         var3.break_("]");
         return var3;
      }
   }

   @Override
   public boolean class_(int var1, rcZ_2 var2) {
      if (this.class_(var2)) {
         this.byte_.set(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   private boolean class_(rcZ_2 var1) {
      if (var1.class_() == 0) {
         return false;
      } else if (this.private_ == 0) {
         this.private_ = var1.class_();
         return true;
      } else {
         return this.private_ == var1.class_();
      }
   }

   public rcd_3 class_(int var1) {
      if (var1 >= 0 && var1 < this.byte_.size()) {
         rcZ_2 var2 = this.byte_.get(var1);
         if (var2.class_() == 10) {
            return (rcd_3)var2;
         }
      }

      return new rcd_3();
   }

   @Override
   public void class_(DataOutput var1) throws IOException {
      if (this.byte_.isEmpty()) {
         this.private_ = 0;
      } else {
         this.private_ = this.byte_.get(0).class_();
      }

      var1.writeByte(this.private_);
      var1.writeInt(this.byte_.size());

      for (rcZ_2 var3 : this.byte_) {
         var3.class_(var1);
      }
   }

   public rcy_3 break_(int var1) {
      if (var1 >= 0 && var1 < this.byte_.size()) {
         rcZ_2 var2 = this.byte_.get(var1);
         if (var2.class_() == 9) {
            return (rcy_3)var2;
         }
      }

      return new rcy_3();
   }

   @Override
   public rcv_3<rcy_3> break_() {
      return class_;
   }

   @Override
   public boolean break_(int var1, rcZ_2 var2) {
      if (this.class_(var2)) {
         this.byte_.add(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public byte throws_() {
      return this.private_;
   }

   public int throws_(int var1) {
      if (var1 >= 0 && var1 < this.byte_.size()) {
         rcZ_2 var2 = this.byte_.get(var1);
         if (var2.class_() == 3) {
            return ((rcn_3)var2).case_();
         }
      }

      return 0;
   }

   public rcZ_2 finally_(int var1) {
      return this.byte_.get(var1);
   }

   public double catch_(int var1) {
      if (var1 >= 0 && var1 < this.byte_.size()) {
         rcZ_2 var2 = this.byte_.get(var1);
         if (var2.class_() == 6) {
            return ((rcz_3)var2).implements_();
         }
      }

      return 0.0;
   }

   private void case_() {
      if (this.byte_.isEmpty()) {
         this.private_ = 0;
      }
   }

   public int[] case_(int var1) {
      if (var1 >= 0 && var1 < this.byte_.size()) {
         rcZ_2 var2 = this.byte_.get(var1);
         if (var2.class_() == 11) {
            return ((rcL_2)var2).case_();
         }
      }

      return new int[0];
   }

   public String implements_(int var1) {
      if (var1 >= 0 && var1 < this.byte_.size()) {
         rcZ_2 var2 = this.byte_.get(var1);
         return var2.class_() == 8 ? var2.native_() : var2.toString();
      } else {
         return "";
      }
   }

   public short protected_(int var1) {
      if (var1 >= 0 && var1 < this.byte_.size()) {
         rcZ_2 var2 = this.byte_.get(var1);
         if (var2.class_() == 2) {
            return ((rcD_2)var2).catch_();
         }
      }

      return 0;
   }

   public rcy_3 protected_() {
      Object var1 = rcY_2.class_(this.private_).byte_() ? this.byte_ : Iterables.transform(this.byte_, rcZ_2::byte_);
      ArrayList var2 = Lists.newArrayList((Iterable)var1);
      return new rcy_3(var2, this.private_);
   }

   @Override
   public rcZ_2 protected_(int var1, rcZ_2 var2) {
      rcZ_2 var3 = this.finally_(var1);
      if (!this.class_(var1, var2)) {
         throw new UnsupportedOperationException(String.format("Trying to add tag of type %d to list of %d", var2.class_(), this.private_));
      } else {
         return var3;
      }
   }

   public float private_(int var1) {
      if (var1 >= 0 && var1 < this.byte_.size()) {
         rcZ_2 var2 = this.byte_.get(var1);
         if (var2.class_() == 5) {
            return ((rcu_3)var2).finally_();
         }
      }

      return 0.0F;
   }
}
