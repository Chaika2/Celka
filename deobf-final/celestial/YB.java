package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;

public class YB {
   private final String class_;
   private final YS[] break_;

   public YB(String var1, YS[] var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public rgP_2 class_(gy_3 var1, boolean var2) throws CommandSyntaxException {
      if (this.break_.length != 0 && var2) {
         rgN_2 var3 = new rgN_2(this.class_.substring(0, this.break_[0].class_()));
         int var4 = this.break_[0].class_();

         for (YS var8 : this.break_) {
            rgP_2 var9 = var8.class_(var1);
            if (var4 < var8.class_()) {
               var3.break_(this.class_.substring(var4, var8.class_()));
            }

            if (var9 != null) {
               var3.class_(var9);
            }

            var4 = var8.break_();
         }

         if (var4 < this.class_.length()) {
            var3.break_(this.class_.substring(var4, this.class_.length()));
         }

         return var3;
      } else {
         return new rgN_2(this.class_);
      }
   }

   public static YB class_(StringReader var0, boolean var1) throws CommandSyntaxException {
      String var2 = var0.getString().substring(var0.getCursor(), var0.getTotalLength());
      if (!var1) {
         var0.setCursor(var0.getTotalLength());
         return new YB(var2, new YS[0]);
      } else {
         ArrayList var3 = Lists.newArrayList();
         int var4 = var0.getCursor();

         while (true) {
            int var5;
            Rn_1 var6;
            while (true) {
               if (!var0.canRead()) {
                  return new YB(var2, var3.toArray(new YS[var3.size()]));
               }

               if (var0.peek() == '@') {
                  var5 = var0.getCursor();

                  try {
                     RC var7 = new RC(var0);
                     var6 = var7.super_();
                     break;
                  } catch (CommandSyntaxException var8) {
                     if (var8.getType() != RC.protected_ && var8.getType() != RC.break_) {
                        throw var8;
                     }

                     var0.setCursor(var5 + 1);
                  }
               } else {
                  var0.skip();
               }
            }

            var3.add(new YS(var5 - var4, var0.getCursor() - var4, var6));
         }
      }
   }
}
