package celestial;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;

class rvB_2 {
   private final ArgumentBuilder<gR_2, ?> id_class;
   private final byte id_break;
   private final int id_byte;
   private final int[] id_protected;
   CommandNode<gR_2> id_throws;

   rvB_2(ArgumentBuilder<gR_2, ?> var1, byte var2, int var3, int[] var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   public boolean id_class(rvB_2[] var1) {
      if (this.id_throws == null) {
         if (this.id_class == null) {
            this.id_throws = new RootCommandNode();
         } else {
            if ((this.id_break & 8) != 0) {
               if (var1[this.id_byte].id_throws == null) {
                  return false;
               }

               this.id_class.redirect(var1[this.id_byte].id_throws);
            }

            if ((this.id_break & 4) != 0) {
               this.id_class.executes(var0 -> 0);
            }

            this.id_throws = this.id_class.build();
         }
      }

      for (int var5 : this.id_protected) {
         if (var1[var5].id_throws == null) {
            return false;
         }
      }

      for (int var10 : this.id_protected) {
         CommandNode var6 = var1[var10].id_throws;
         if (!(var6 instanceof RootCommandNode)) {
            this.id_throws.addChild(var6);
         }
      }

      return true;
   }
}
