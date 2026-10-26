package celestial;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.util.List;

public class rvO_2 implements ruS_2<At_1> {
   private int id_class;
   private final List<Pair<rXQ, rdn_3>> id_break;

   public List<Pair<rXQ, rdn_3>> id_byte() {
      return this.id_break;
   }

   public rvO_2() {
      this.id_break = Lists.newArrayList();
   }

   public rvO_2(int var1, List<Pair<rXQ, rdn_3>> var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      rXQ[] var2 = rXQ.values();

      byte var3;
      do {
         var3 = var1.readByte();
         rXQ var4 = var2[var3 & 127];
         rdn_3 var5 = var1.id_extends();
         this.id_break.add(Pair.of(var4, var5));
      } while ((var3 & -128) != 0);
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      int var2 = this.id_break.size();

      for (int var3 = 0; var3 < var2; var3++) {
         Pair var4 = this.id_break.get(var3);
         rXQ var5 = (rXQ)var4.getFirst();
         boolean var6 = var3 != var2 - 1;
         int var7 = var5.ordinal();
         var1.writeByte(var6 ? var7 | -128 : var7);
         var1.id_class((rdn_3)var4.getSecond());
      }
   }

   public int id_break() {
      return this.id_class;
   }
}
