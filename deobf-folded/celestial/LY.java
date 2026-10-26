package celestial;

import java.util.Collections;
import java.util.List;

public class LY extends Lo_1 {
   private final rgP_2 id_break;
   private final int id_byte;

   public LY(LR var1, rgP_2 var2) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = ((cm_3)var1.id_native.id_class[15]).id_class(this.id_break);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      ((cm_3)this.id_class.id_native.id_class[15])
         .id_byte(
            var1,
            this.id_break,
            (float)(((vm_3)this.id_class.id_native.id_class[73]).id_package / 2 - this.id_byte / 2),
            (float)(var3 + var6 - 9 - 1),
            16777215
         );
   }

   @Override
   public boolean id_break(boolean var1) {
      return false;
   }

   @Override
   public List<? extends cC_2> x_() {
      return Collections.emptyList();
   }
}
