package celestial;

import java.util.ArrayList;
import java.util.Arrays;

public class rrXY implements rrXg_1 {
   private rrXC[] id_class;
   private rrXC[] id_break;
   private rrXC[] id_byte;
   private int id_protected = Integer.MAX_VALUE;
   private static final rrXC[] id_throws = new rrXC[0];

   public rrXC[] id_byte() {
      return this.id_byte;
   }

   public rrXY id_byte(rrXC... var1) {
      return new rrXY(this.id_class, this.id_break, var1);
   }

   public rrXY() {
      this((rrXC[])null, (rrXC[])null, (rrXC[])null);
   }

   public rrXY(rrXC[] var1, rrXC[] var2, rrXC[] var3) {
      this(var1, var2, var3, Integer.MAX_VALUE);
   }

   public rrXY(rrXC[] var1, rrXC[] var2, rrXC[] var3, int var4) {
      this.id_class = id_protected(var1);
      this.id_break = id_protected(var2);
      this.id_byte = id_protected(var3);
      this.id_protected = var4;
   }

   public rrXY id_class(rrXC... var1) {
      return new rrXY(var1, this.id_break, this.id_byte);
   }

   @Override
   public rrXC[] id_class(rrXt_1[] var1) {
      int var2 = this.id_class.length + this.id_byte.length;
      int var3 = var1.length - var2;
      int var4 = 0;

      for (int var5 = 0; var5 + this.id_break.length <= var3 && var2 + var5 + this.id_break.length <= this.id_protected; var5 += this.id_break.length) {
         var4++;
      }

      ArrayList var7 = new ArrayList();
      var7.addAll(Arrays.asList(this.id_class));

      for (int var6 = 0; var6 < var4; var6++) {
         var7.addAll(Arrays.asList(this.id_break));
      }

      var7.addAll(Arrays.asList(this.id_byte));
      return var7.toArray(new rrXC[var7.size()]);
   }

   public rrXC[] id_class() {
      return this.id_class;
   }

   public rrXY id_class(int var1) {
      return new rrXY(this.id_class, this.id_break, this.id_byte, var1);
   }

   public rrXY id_break(rrXC... var1) {
      return new rrXY(this.id_class, var1, this.id_byte);
   }

   public rrXC[] id_break() {
      return this.id_break;
   }

   private static rrXC[] id_protected(rrXC[] var0) {
      return var0 == null ? id_throws : var0;
   }

   public int id_protected() {
      return this.id_class == null ? 0 : this.id_class.length;
   }
}
