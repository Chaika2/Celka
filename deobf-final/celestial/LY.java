package celestial;

import java.util.Collections;
import java.util.List;

public class LY extends Lo_1 {
   private final rgP_2 break_;
   private final int byte_;

   public LY(LR var1, rgP_2 var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = ((cm_3)var1.native_.class_[15]).class_(this.break_);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      ((cm_3)this.class_.native_.class_[15])
         .byte_(var1, this.break_, (float)(((vm_3)this.class_.native_.class_[73]).package_ / 2 - this.byte_ / 2), (float)(var3 + var6 - 9 - 1), 16777215);
   }

   @Override
   public boolean break_(boolean var1) {
      return false;
   }

   @Override
   public List<? extends cC_2> x_() {
      return Collections.emptyList();
   }
}
