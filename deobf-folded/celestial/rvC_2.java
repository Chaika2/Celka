package celestial;

import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.io.IOException;
import java.util.function.BiConsumer;

public class rvC_2 implements ruS_2<At_1> {
   private rjh_3 id_class;
   private short[] id_break;
   private xc_3[] id_byte;
   private boolean id_protected;

   public rvC_2() {
   }

   public rvC_2(rjh_3 var1, ShortSet var2, roQ_2 var3, boolean var4) {
      this.id_class = var1;
      this.id_protected = var4;
      this.id_class(var2.size());
      int var5 = 0;

      for (ShortIterator var6 = var2.iterator(); var6.hasNext(); var5++) {
         short var7 = (Short)var6.next();
         this.id_break[var5] = var7;
         this.id_byte[var5] = var3.id_class(rjh_3.id_class(var7), rjh_3.id_break(var7), rjh_3.id_byte(var7));
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   public void id_class(BiConsumer<rfH_2, xc_3> var1) {
      rfw_3 var2 = new rfw_3();

      for (int var3 = 0; var3 < this.id_break.length; var3++) {
         short var4 = this.id_break[var3];
         var2.id_class(this.id_class.id_protected(var4), this.id_class.id_throws(var4), this.id_class.id_case(var4));
         var1.accept(var2, this.id_byte[var3]);
      }
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = rjh_3.id_class(var1.readLong());
      this.id_protected = var1.readBoolean();
      int var2 = var1.id_case();
      this.id_class(var2);

      for (int var3 = 0; var3 < this.id_break.length; var3++) {
         long var4 = var1.id_catch();
         this.id_break[var3] = (short)((int)(var4 & 4095L));
         this.id_byte[var3] = xd_3.id_char.id_class((int)(var4 >>> 12));
      }
   }

   private void id_class(int var1) {
      this.id_break = new short[var1];
      this.id_byte = new xc_3[var1];
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeLong(this.id_class.id_continue());
      var1.writeBoolean(this.id_protected);
      var1.id_protected(this.id_break.length);

      for (int var2 = 0; var2 < this.id_break.length; var2++) {
         var1.id_class((long)(xd_3.id_finally(this.id_byte[var2]) << 12 | this.id_break[var2]));
      }
   }

   public boolean id_break() {
      return this.id_protected;
   }
}
