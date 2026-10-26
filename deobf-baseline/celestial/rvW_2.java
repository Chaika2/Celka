package celestial;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class rvW_2 implements ruS_2<At_1> {
   private int id_class;
   private final List<rvz_3> id_break = Lists.newArrayList();

   public List<rvz_3> id_byte() {
      return this.id_break;
   }

   public rvW_2() {
   }

   public rvW_2(int var1, Collection<ic_3> var2) {
      this.id_class = var1;

      for (ic_3 var4 : var2) {
         this.id_break.add(new rvz_3(this, (double)var4.id_class(), var4.id_break(), var4.id_byte()));
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      int var2 = var1.readInt();

      for (int var3 = 0; var3 < var2; var3++) {
         rqO_2 var4 = var1.id_volatile();
         iJ_2 var5 = rVL.O.id_class(var4);
         double var6 = var1.readDouble();
         ArrayList var8 = Lists.newArrayList();
         int var9 = var1.id_case();

         for (int var10 = 0; var10 < var9; var10++) {
            UUID var11 = var1.id_private();
            var8.add(new ix_3(var11, "Unknown synced attribute modifier", var1.readDouble(), id_3.id_class(var1.readByte())));
         }

         this.id_break.add(new rvz_3(this, (double)var5, var6, var8));
      }
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.writeInt(this.id_break.size());

      for (rvz_3 var3 : this.id_break) {
         var1.id_class(rVL.O.id_break(var3.id_class()));
         var1.writeDouble(var3.id_break());
         var1.id_protected(var3.id_byte().size());

         for (ix_3 var5 : var3.id_byte()) {
            var1.id_class(var5.id_class());
            var1.writeDouble(var5.id_protected());
            var1.writeByte(var5.id_byte().id_class());
         }
      }
   }

   public int id_break() {
      return this.id_class;
   }
}
