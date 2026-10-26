package celestial;

class vw_3 extends Lg_1<vw_3> {
   private final aI_2<?> id_break;
   private final rgP_2 id_byte;
   private final rgP_2 id_protected;
   private final boolean id_throws;
   private final rgP_2 id_case;
   private final boolean id_catch;

   public vw_3(aI_2<?> var1, aI_2 var2) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var2.id_implements();
      int var3 = var1.id_class.id_finally.id_class(rlB_2.id_catch.id_break(var2));
      if (var3 == 0) {
         this.id_protected = new rgn_3("stat_type.minecraft.killed.none", this.id_byte);
         this.id_throws = false;
      } else {
         this.id_protected = new rgn_3("stat_type.minecraft.killed", var3, this.id_byte);
         this.id_throws = true;
      }

      int var4 = var1.id_class.id_finally.id_class(rlB_2.id_private.id_break(var2));
      if (var4 == 0) {
         this.id_case = new rgn_3("stat_type.minecraft.killed_by.none", this.id_byte);
         this.id_catch = false;
      } else {
         this.id_case = new rgn_3("stat_type.minecraft.killed_by", this.id_byte, var4);
         this.id_catch = true;
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      ch_3.id_break(var1, this.id_class.id_class.id_super, this.id_byte, var4 + 2, var3 + 1, 16777215);
      ch_3.id_break(var1, this.id_class.id_class.id_super, this.id_protected, var4 + 2 + 10, var3 + 1 + 9, this.id_throws ? 9474192 : 6316128);
      ch_3.id_break(var1, this.id_class.id_class.id_super, this.id_case, var4 + 2 + 10, var3 + 1 + 18, this.id_catch ? 9474192 : 6316128);
   }
}
