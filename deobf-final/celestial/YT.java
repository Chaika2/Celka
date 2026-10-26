package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YT implements ArgumentType<UUID> {
   public static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("argument.uuid.invalid"));
   private static final Collection<String> break_ = Arrays.asList("dd12be42-52a9-4a91-a8a1-11c01849e498");
   private static final Pattern byte_ = Pattern.compile("^([-A-Fa-f0-9]+)");

   public UUID class_(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.getRemaining();
      Matcher var3 = byte_.matcher(var2);
      if (var3.find()) {
         String var4 = var3.group(1);

         try {
            UUID var5 = UUID.fromString(var4);
            var1.setCursor(var1.getCursor() + var4.length());
            return var5;
         } catch (IllegalArgumentException var6) {
         }
      }

      throw class_.create();
   }

   public static UUID class_(CommandContext<gy_3> var0, String var1) {
      return (UUID)var0.getArgument(var1, UUID.class);
   }

   public static YT class_() {
      return new YT();
   }

   public Collection<String> getExamples() {
      return break_;
   }
}
