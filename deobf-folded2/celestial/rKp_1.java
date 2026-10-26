package celestial;

import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import java.util.Random;

public class rKp_1 implements rKA<rKg_1> {
   private final Long2IntLinkedOpenHashMap id_class;
   private final int id_break;
   private final rKy_1 id_byte;
   private final long id_protected;
   private long id_throws;

   public rKp_1(int var1, long var2, long var4) {
      this.id_protected = id_break(var2, var4);
      this.id_byte = new rKy_1(new Random(var2));
      this.id_class = new Long2IntLinkedOpenHashMap(16, 0.25F);
      this.id_class.defaultReturnValue(Integer.MIN_VALUE);
      this.id_break = var1;
   }

   @Override
   public rKy_1 id_class() {
      return this.id_byte;
   }

   @Override
   public int id_class(int var1) {
      int var2 = (int)Math.floorMod(this.id_throws >> 24, (long)var1);
      this.id_throws = rpW_2.id_class(this.id_throws, this.id_protected);
      return var2;
   }

   public rKg_1 id_class(rrBw_1 var1, rKg_1 var2) {
      return new rKg_1(this.id_class, Math.min(1024, var2.id_class() * 4), var1);
   }

   public rKg_1 id_class(rrBw_1 var1, rKg_1 var2, rKg_1 var3) {
      return new rKg_1(this.id_class, Math.min(1024, Math.max(var2.id_class(), var3.id_class()) * 4), var1);
   }

   @Override
   public void id_class(long var1, long var3) {
      long var5 = this.id_protected;
      var5 = rpW_2.id_class(var5, var1);
      var5 = rpW_2.id_class(var5, var3);
      var5 = rpW_2.id_class(var5, var1);
      var5 = rpW_2.id_class(var5, var3);
      this.id_throws = var5;
   }

   private static long id_break(long var0, long var2) {
      long var4 = rpW_2.id_class(var2, var2);
      var4 = rpW_2.id_class(var4, var2);
      var4 = rpW_2.id_class(var4, var2);
      long var6 = rpW_2.id_class(var0, var4);
      var6 = rpW_2.id_class(var6, var4);
      return rpW_2.id_class(var6, var4);
   }

   public rKg_1 id_break(rrBw_1 var1) {
      return new rKg_1(this.id_class, this.id_break, var1);
   }
}
