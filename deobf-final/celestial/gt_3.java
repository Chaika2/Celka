package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.List;

public class gt_3 {
   private final gj_3[] class_;
   final rqO_2 break_;

   public gt_3(rqO_2 var1, gj_3[] var2) {
      this.break_ = var1;
      this.class_ = var2;
   }

   public static gt_3 class_(rqO_2 var0, CommandDispatcher<gy_3> var1, gy_3 var2, List<String> var3) {
      ArrayList var4 = Lists.newArrayListWithCapacity(var3.size());

      for (int var5 = 0; var5 < var3.size(); var5++) {
         int var6 = var5 + 1;
         String var7 = ((String)var3.get(var5)).trim();
         StringReader var8 = new StringReader(var7);
         if (var8.canRead() && var8.peek() != '#') {
            if (var8.peek() == '/') {
               var8.skip();
               if (var8.peek() == '/') {
                  throw new IllegalArgumentException(
                     "Unknown or invalid command '" + var7 + "' on line " + var6 + " (if you intended to make a comment, use '#' not '//')"
                  );
               }

               String var11 = var8.readUnquotedString();
               throw new IllegalArgumentException(
                  "Unknown or invalid command '" + var7 + "' on line " + var6 + " (did you mean '" + var11 + "'? Do not use a preceding forwards slash.)"
               );
            }

            try {
               ParseResults var9 = var1.parse(var8, var2);
               if (var9.getReader().canRead()) {
                  throw gp_3.class_(var9);
               }

               var4.add(new gI_2(var9));
            } catch (CommandSyntaxException var10) {
               throw new IllegalArgumentException("Whilst parsing command on line " + var6 + ": " + var10.getMessage());
            }
         }
      }

      return new gt_3(var0, var4.toArray(new gj_3[0]));
   }

   public rqO_2 class_() {
      return this.break_;
   }

   public gj_3[] break_() {
      return this.class_;
   }
}
