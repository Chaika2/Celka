package celestial;

public class vn_3 extends vL_2 {
   private final QY class_ = QY.instanceof_();

   @Override
   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      int var11 = var3 + var6 / 2 - 4;
      ((cm_3)this.class_.class_[15])
         .byte_(
            var1,
            vF_2.finally_,
            (float)(((vm_3)this.class_.class_[73]).package_ / 2 - ((cm_3)this.class_.class_[15]).class_(vF_2.finally_) / 2),
            (float)var11,
            16777215
         );

      String var12 = switch ((int)(rqR_2.break_() / 300L % 4L)) {
         default -> "O o o";
         case 1, 3 -> "o O o";
         case 2 -> "o o O";
      };
      ((cm_3)this.class_.class_[15])
         .break_(
            var1, var12, (float)(((vm_3)this.class_.class_[73]).package_ / 2 - ((cm_3)this.class_.class_[15]).break_(var12) / 2), (float)(var11 + 9), 8421504
         );
   }
}
