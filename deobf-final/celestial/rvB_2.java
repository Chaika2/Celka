package celestial;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;

class rvB_2 {
   private final ArgumentBuilder<gR_2, ?> class_;
   private final byte break_;
   private final int byte_;
   private final int[] protected_;
   CommandNode<gR_2> throws_;

   rvB_2(ArgumentBuilder<gR_2, ?> var1, byte var2, int var3, int[] var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   public boolean class_(rvB_2[] var1) {
      if (this.throws_ == null) {
         if (this.class_ == null) {
            this.throws_ = new RootCommandNode();
         } else {
            if ((this.break_ & 8) != 0) {
               if (var1[this.byte_].throws_ == null) {
                  return false;
               }

               this.class_.redirect(var1[this.byte_].throws_);
            }

            if ((this.break_ & 4) != 0) {
               this.class_.executes(var0 -> 0);
            }

            this.throws_ = this.class_.build();
         }
      }

      for (int var5 : this.protected_) {
         if (var1[var5].throws_ == null) {
            return false;
         }
      }

      for (int var10 : this.protected_) {
         CommandNode var6 = var1[var10].throws_;
         if (!(var6 instanceof RootCommandNode)) {
            this.throws_.addChild(var6);
         }
      }

      return true;
   }
}
