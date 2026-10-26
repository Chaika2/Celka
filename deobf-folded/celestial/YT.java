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
   public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("argument.uuid.invalid"));
   private static final Collection<String> id_break = Arrays.asList("dd12be42-52a9-4a91-a8a1-11c01849e498");
   private static final Pattern id_byte = Pattern.compile("^([-A-Fa-f0-9]+)");

   public UUID id_class(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.getRemaining();
      Matcher var3 = id_byte.matcher(var2);
      if (var3.find()) {
         String var4 = var3.group(1);

         try {
            UUID var5 = UUID.fromString(var4);
            var1.setCursor(var1.getCursor() + var4.length());
            return var5;
         } catch (IllegalArgumentException var6) {
         }
      }

      throw id_class.create();
   }

   public static UUID id_class(CommandContext<gy_3> var0, String var1) {
      return (UUID)var0.getArgument(var1, UUID.class);
   }

   public static YT id_class() {
      return new YT();
   }

   public Collection<String> getExamples() {
      return id_break;
   }
}
