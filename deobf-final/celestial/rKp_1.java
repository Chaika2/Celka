package celestial;

import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import java.util.Random;

public class rKp_1 implements rKA<rKg_1> {
   private final Long2IntLinkedOpenHashMap class_;
   private final int break_;
   private final rKy_1 byte_;
   private final long protected_;
   private long throws_;

   public rKp_1(int var1, long var2, long var4) {
      this.protected_ = break_(var2, var4);
      this.byte_ = new rKy_1(new Random(var2));
      this.class_ = new Long2IntLinkedOpenHashMap(16, 0.25F);
      this.class_.defaultReturnValue(Integer.MIN_VALUE);
      this.break_ = var1;
   }

   @Override
   public rKy_1 class_() {
      return this.byte_;
   }

   @Override
   public int class_(int var1) {
      int var2 = (int)Math.floorMod(this.throws_ >> 24, (long)var1);
      this.throws_ = rpW_2.class_(this.throws_, this.protected_);
      return var2;
   }

   public rKg_1 class_(rrBw_1 var1, rKg_1 var2) {
      return new rKg_1(this.class_, Math.min(1024, var2.class_() * 4), var1);
   }

   public rKg_1 class_(rrBw_1 var1, rKg_1 var2, rKg_1 var3) {
      return new rKg_1(this.class_, Math.min(1024, Math.max(var2.class_(), var3.class_()) * 4), var1);
   }

   @Override
   public void class_(long var1, long var3) {
      long var5 = this.protected_;
      var5 = rpW_2.class_(var5, var1);
      var5 = rpW_2.class_(var5, var3);
      var5 = rpW_2.class_(var5, var1);
      var5 = rpW_2.class_(var5, var3);
      this.throws_ = var5;
   }

   private static long break_(long var0, long var2) {
      long var4 = rpW_2.class_(var2, var2);
      var4 = rpW_2.class_(var4, var2);
      var4 = rpW_2.class_(var4, var2);
      long var6 = rpW_2.class_(var0, var4);
      var6 = rpW_2.class_(var6, var4);
      return rpW_2.class_(var6, var4);
   }

   public rKg_1 break_(rrBw_1 var1) {
      return new rKg_1(this.class_, this.break_, var1);
   }
}
