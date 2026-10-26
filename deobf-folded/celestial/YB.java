package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;

public class YB {
   private final String id_class;
   private final YS[] id_break;

   public YB(String var1, YS[] var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public rgP_2 id_class(gy_3 var1, boolean var2) throws CommandSyntaxException {
      if (this.id_break.length != 0 && var2) {
         rgN_2 var3 = new rgN_2(this.id_class.substring(0, this.id_break[0].id_class()));
         int var4 = this.id_break[0].id_class();

         for (YS var8 : this.id_break) {
            rgP_2 var9 = var8.id_class(var1);
            if (var4 < var8.id_class()) {
               var3.id_break(this.id_class.substring(var4, var8.id_class()));
            }

            if (var9 != null) {
               var3.id_class(var9);
            }

            var4 = var8.id_break();
         }

         if (var4 < this.id_class.length()) {
            var3.id_break(this.id_class.substring(var4, this.id_class.length()));
         }

         return var3;
      } else {
         return new rgN_2(this.id_class);
      }
   }

   public static YB id_class(StringReader var0, boolean var1) throws CommandSyntaxException {
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
                     var6 = var7.id_super();
                     break;
                  } catch (CommandSyntaxException var8) {
                     if (var8.getType() != RC.id_protected && var8.getType() != RC.id_break) {
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
