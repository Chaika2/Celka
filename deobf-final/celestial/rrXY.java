package celestial;

import java.util.ArrayList;
import java.util.Arrays;

public class rrXY implements rrXg_1 {
   private rrXC[] class_;
   private rrXC[] break_;
   private rrXC[] byte_;
   private int protected_ = Integer.MAX_VALUE;
   private static final rrXC[] throws_ = new rrXC[0];

   public rrXC[] byte_() {
      return this.byte_;
   }

   public rrXY byte_(rrXC... var1) {
      return new rrXY(this.class_, this.break_, var1);
   }

   public rrXY() {
      this((rrXC[])null, (rrXC[])null, (rrXC[])null);
   }

   public rrXY(rrXC[] var1, rrXC[] var2, rrXC[] var3) {
      this(var1, var2, var3, Integer.MAX_VALUE);
   }

   public rrXY(rrXC[] var1, rrXC[] var2, rrXC[] var3, int var4) {
      this.class_ = protected_(var1);
      this.break_ = protected_(var2);
      this.byte_ = protected_(var3);
      this.protected_ = var4;
   }

   public rrXY class_(rrXC... var1) {
      return new rrXY(var1, this.break_, this.byte_);
   }

   @Override
   public rrXC[] class_(rrXt_1[] var1) {
      int var2 = this.class_.length + this.byte_.length;
      int var3 = var1.length - var2;
      int var4 = 0;

      for (int var5 = 0; var5 + this.break_.length <= var3 && var2 + var5 + this.break_.length <= this.protected_; var5 += this.break_.length) {
         var4++;
      }

      ArrayList var7 = new ArrayList();
      var7.addAll(Arrays.asList(this.class_));

      for (int var6 = 0; var6 < var4; var6++) {
         var7.addAll(Arrays.asList(this.break_));
      }

      var7.addAll(Arrays.asList(this.byte_));
      return var7.toArray(new rrXC[var7.size()]);
   }

   public rrXC[] class_() {
      return this.class_;
   }

   public rrXY class_(int var1) {
      return new rrXY(this.class_, this.break_, this.byte_, var1);
   }

   public rrXY break_(rrXC... var1) {
      return new rrXY(this.class_, var1, this.byte_);
   }

   public rrXC[] break_() {
      return this.break_;
   }

   private static rrXC[] protected_(rrXC[] var0) {
      return var0 == null ? throws_ : var0;
   }

   public int protected_() {
      return this.class_ == null ? 0 : this.class_.length;
   }
}
