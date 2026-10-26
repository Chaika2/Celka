package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public enum rgF_2 {
   BLACK("BLACK", '0', 0, 0),
   DARK_BLUE("DARK_BLUE", '1', 1, 170),
   DARK_GREEN("DARK_GREEN", '2', 2, 43520),
   DARK_AQUA("DARK_AQUA", '3', 3, 43690),
   DARK_RED("DARK_RED", '4', 4, 11141120),
   DARK_PURPLE("DARK_PURPLE", '5', 5, 11141290),
   GOLD("GOLD", '6', 6, 16755200),
   GRAY("GRAY", '7', 7, 11184810),
   DARK_GRAY("DARK_GRAY", '8', 8, 5592405),
   BLUE("BLUE", '9', 9, 5592575),
   GREEN("GREEN", 'a', 10, 5635925),
   AQUA("AQUA", 'b', 11, 5636095),
   RED("RED", 'c', 12, 16733525),
   LIGHT_PURPLE("LIGHT_PURPLE", 'd', 13, 16733695),
   YELLOW("YELLOW", 'e', 14, 16777045),
   WHITE("WHITE", 'f', 15, 16777215),
   OBFUSCATED("OBFUSCATED", 'k', true),
   BOLD("BOLD", 'l', true),
   STRIKETHROUGH("STRIKETHROUGH", 'm', true),
   UNDERLINE("UNDERLINE", 'n', true),
   ITALIC("ITALIC", 'o', true),
   RESET("RESET", 'r', -1, (Integer)null);

   private static final Map<String, rgF_2> NAME_MAPPING = Arrays.stream(values()).collect(Collectors.toMap(var0 -> byte_(var0.name), var0 -> (rgF_2)var0));
   private static final Pattern FORMATTING_CODE_PATTERN = Pattern.compile("(?i)§[0-9A-FK-OR]");
   private final String name;
   private final char formattingCode;
   private final boolean fancyStyling;
   private final String controlString;
   private final int colorIndex;
   private final Integer color;

   private static String byte_(String var0) {
      return var0.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
   }

   public boolean byte_() {
      return !this.fancyStyling && this != RESET;
   }

   private rgF_2(String var3, char var4, boolean var5, int var6, Integer var7) {
      this.name = var3;
      this.formattingCode = var4;
      this.fancyStyling = var5;
      this.colorIndex = var6;
      this.color = var7;
      this.controlString = "§" + var4;
   }

   private rgF_2(String var3, char var4, boolean var5) {
      this(var3, var4, var5, -1, (Integer)null);
   }

   private rgF_2(String var3, char var4, int var5, Integer var6) {
      this(var3, var4, false, var5, var6);
   }

   @Override
   public String toString() {
      return this.controlString;
   }

   public static String class_(String var0) {
      return var0 == null ? null : FORMATTING_CODE_PATTERN.matcher(var0).replaceAll("");
   }

   public static Collection<String> class_(boolean var0, boolean var1) {
      ArrayList var2 = Lists.newArrayList();

      for (rgF_2 var6 : values()) {
         if ((!var6.byte_() || var0) && (!var6.break_() || var1)) {
            var2.add(var6.throws_());
         }
      }

      return var2;
   }

   public static rgF_2 class_(char var0) {
      char var1 = Character.toString(var0).toLowerCase(Locale.ROOT).charAt(0);

      for (rgF_2 var5 : values()) {
         if (var5.formattingCode == var1) {
            return var5;
         }
      }

      return null;
   }

   public int class_() {
      return this.colorIndex;
   }

   public static rgF_2 class_(int var0) {
      if (var0 < 0) {
         return RESET;
      } else {
         for (rgF_2 var4 : values()) {
            if (var4.class_() == var0) {
               return var4;
            }
         }

         return null;
      }
   }

   public boolean break_() {
      return this.fancyStyling;
   }

   public static rgF_2 break_(String var0) {
      return var0 == null ? null : NAME_MAPPING.get(byte_(var0));
   }

   public String throws_() {
      return this.name().toLowerCase(Locale.ROOT);
   }

   public Integer protected_() {
      return this.color;
   }
}
